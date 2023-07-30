/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import estrutura.vertice;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.geometry.Point3D;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import letras.caractere;

/**
 *
 * @author gustavo
 */
public class controleEventoCanvas {
    
    public static void insereComportamento(Canvas canvasFrente, Canvas canvasTopo, Canvas canvasLado, Canvas canvasPerspectiva, ctrl controle){
        canvasFrente.addEventHandler(MouseEvent.MOUSE_PRESSED, e->{
            controle.localX = (long) e.getX();
            controle.localY = (long) e.getY();
            controle.selectedChar = -1;
            
            if(controle.botaoLetra.isSelected()){
                for(int i = 0; i < controle.refactChars1.size(); i++){
                    ArrayList<vertice> vertices = controle.refactChars1.get(i).vertices;
                    long maxX = Long.MIN_VALUE;
                    long minX = Long.MAX_VALUE;
                    long maxY = Long.MIN_VALUE;
                    long minY = Long.MAX_VALUE;
                    for(int j = 0; j < vertices.size(); j++)
                    {
                        Point3D verticeAtual = vertices.get(j).ponto;
                        if( (long) verticeAtual.getX() < minX) minX =(long) verticeAtual.getX();
                        if( (long) verticeAtual.getX() > maxX) maxX =(long) verticeAtual.getX();
                        if( (long) verticeAtual.getY() < minY) minY =(long) verticeAtual.getY();
                        if( (long) verticeAtual.getY() > maxY) maxY =(long) verticeAtual.getY();        
                    }
                    if((controle.localX >= minX && controle.localX <= maxX) && (controle.localY >= minY && controle.localY <= maxY)){
                        controle.selectedChar = i;
                        controle.selecao = controle.chars.get(i);
                        
                        break;
                    }
                }

                if(controle.selectedChar != -1)
                {
                    controle.mouseApertado = true;
                }
                
            }else if(controle.botaoTodaString.isSelected()){
                controle.mouseApertado = true;
            }
            
        });
        
        canvasFrente.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            controle.mouseApertado = false;
            controle.iluminacaoCaractereSelecionado();
            
            if(null != controle.escolheMetodo.getValue().toString())
            switch (controle.escolheMetodo.getValue().toString()) {
                case "Pintor" -> controle.painter(controle.refactChars4, canvasPerspectiva);
                case "Phong" -> iluminacao.iluminacaoPhong(canvasPerspectiva, controle.refactChars4, controle.chars, controle.lugarLuz, controle.Il, controle.Ila, controle.VRPPerspectiva);
                case "Constante" -> iluminacao.iluminacaoConstante(canvasPerspectiva, controle.refactChars4, controle.chars, controle.lugarLuz, controle.Il, controle.Ila, controle.VRPPerspectiva);
                default -> {}
            }
            
            
            
            
        });
        
        canvasFrente.addEventHandler(MouseEvent.ANY, (var event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(controle.mouseApertado){
                if(controle.selectedChar != -1){
                    if((nowLocalX <= canvasFrente.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvasFrente.getHeight() && nowLocalY >= 0))
                    {
                        if(controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            caractere alterado = controle.refactChars1.get(controle.selectedChar);
                            
                            
                            
                            alterado.translada(new Point3D(controle.localX, controle.localY,0));
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            controle.invertChar(alterado, controle.ct1,universo, 1);
                            
                            caractere topo = universo.copia();
                            caractere lado = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars2.set(controle.selectedChar, topo);
                            controle.refactChars3.set(controle.selectedChar, lado);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            
                            
                            controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                            controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);

                            if(controle.setFaceOcult.isSelected()){
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }


////                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
////                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
////                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
////                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
//                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                            
                        }else if(controle.botaoRotacao.isSelected()){
                            
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            
                            universo.rotacaoFrente(controle.localX*0.05, controle.localY*0.02);
                            
                            
                            
                            caractere frente = universo.copia();
                            caractere topo = universo.copia();
                            caractere lado = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars1.set(controle.selectedChar, frente);
                            controle.refactChars2.set(controle.selectedChar, topo);
                            controle.refactChars3.set(controle.selectedChar, lado);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            
                            controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                            controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                            controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                            

                            if(controle.setFaceOcult.isSelected()){
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }


////                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
////                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
////                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
////                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
//                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                        
                        }else if(controle.botaoEscala.isSelected()){
                            controle.localY = controle.localY - ((long) event.getY());
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            
                            universo.escala(controle.localY*0.05);
                            
                            
                            
                            caractere frente = universo.copia();
                            caractere topo = universo.copia();
                            caractere lado = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars1.set(controle.selectedChar, frente);
                            controle.refactChars2.set(controle.selectedChar, topo);
                            controle.refactChars3.set(controle.selectedChar, lado);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            
                            controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                            controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                            controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                            

                            if(controle.setFaceOcult.isSelected()){
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }


////                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
////                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
////                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
////                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                            
                        }
                        
                                                
                        
                        
                        
                        
                    }
                    controle.localX = nowLocalX;
                    controle.localY = nowLocalY;
                    
                }else if(controle.botaoTodaString.isSelected()){
                    
                    if(controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            for(int i = 0; i < controle.refactChars1.size(); i++){
                                caractere alterado = controle.refactChars1.get(i);
                                alterado.translada(new Point3D(controle.localX, controle.localY, 0));
                                
                                caractere universo = controle.chars.get(i);
                                controle.invertChar(alterado, controle.ct1,universo, 1);
                                
                            }
                            
                            

                            
                            Runnable refazTopo = () -> {
                                for(int l = 0; l < controle.refactChars2.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere topo = universo.copia();
                                    controle.refactChars2.set(l, topo);
                                    controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                                    
                                }
////                                canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                
                                
                                ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                                
                            };
                            
                            Runnable refazLado = () -> {
                                for(int l = 0; l < controle.refactChars3.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere lado = universo.copia();
                                    controle.refactChars3.set(l, lado);
                                    controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                                    
                                }
////                                canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                
                                
                                ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                                
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere perspectiva = universo.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
////                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                
                                
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            Platform.runLater(refazTopo);
                            Platform.runLater(refazLado);
                            Platform.runLater(refazPerspectiva);

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                            
                            if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            
                        }else if(controle.botaoRotacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            Point3D centro = caractere.centroArrayListcaractere(controle.chars);
                            
                            for(int i = 0; i < controle.chars.size(); i++){
                                caractere universo = controle.chars.get(i);
                            
                                universo.rotacaoFrenteString(controle.localX*0.05, controle.localY*0.02, centro);
                                
                            }
                            
                            
                            
                            for(int l = 0; l < controle.refactChars1.size(); l++){
                                caractere universo = controle.chars.get(l);                       
                                caractere frente = universo.copia();
                                controle.refactChars1.set(l, frente);
                                controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);

                            }
                               
                            
                            Runnable refazTopo = () -> {
                                for(int l = 0; l < controle.refactChars2.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere topo = universo.copia();
                                    controle.refactChars2.set(l, topo);
                                    controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                                    
                                }
//                                canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                
                                
                                ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                                
                            };
                            
                            Runnable refazLado = () -> {
                                for(int l = 0; l < controle.refactChars3.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere lado = universo.copia();
                                    controle.refactChars3.set(l, lado);
                                    controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                                    
                                }
//                                canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                
                                
                                ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                                
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere perspectiva = universo.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
//                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                
                                
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            Platform.runLater(refazTopo);
                            Platform.runLater(refazLado);
                            Platform.runLater(refazPerspectiva);

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                            
                            if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            
                            
                        }else if(controle.botaoEscala.isSelected()){
                            controle.localY = controle.localY - ((long) event.getY());
                            
                            Point3D centro = caractere.centroArrayListcaractere(controle.chars);
                            
                            for(int i = 0; i < controle.chars.size(); i++){
                                caractere universo = controle.chars.get(i);
                            
                                universo.escalaString(controle.localY*0.02, centro);
                                
                            }
                            
                            
                            
                            for(int l = 0; l < controle.refactChars1.size(); l++){
                                caractere universo = controle.chars.get(l);                       
                                caractere frente = universo.copia();
                                controle.refactChars1.set(l, frente);
                                controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);

                            }
                            
                            
                            
                            Runnable refazTopo = () -> {
                                for(int l = 0; l < controle.refactChars2.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere topo = universo.copia();
                                    controle.refactChars2.set(l, topo);
                                    controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                                    
                                }
//                                canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                
                                
                                ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                                
                            };
                            
                            Runnable refazLado = () -> {
                                for(int l = 0; l < controle.refactChars3.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere lado = universo.copia();
                                    controle.refactChars3.set(l, lado);
                                    controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                                    
                                }
//                                canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                
                                
                                ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                                
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere perspectiva = universo.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
//                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                
                                
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            Platform.runLater(refazTopo);
                            Platform.runLater(refazLado);
                            Platform.runLater(refazPerspectiva);

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                            
                            if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            
                            
                        }
                    
                    
                   controle.localX = nowLocalX;
                   controle.localY = nowLocalY; 
                }
                
                
            }
        });
        
        canvasTopo.addEventHandler(MouseEvent.MOUSE_PRESSED, e->{
            controle.localX = (long) e.getX();
            controle.localY = (long) e.getY();
            controle.selectedChar = -1;
            
            if(controle.botaoLetra.isSelected()){
                for(int i = 0; i < controle.refactChars2.size(); i++){
                    ArrayList<vertice> vertices = controle.refactChars2.get(i).vertices;
                    long maxX = Long.MIN_VALUE;
                    long minX = Long.MAX_VALUE;
                    long maxY = Long.MIN_VALUE;
                    long minY = Long.MAX_VALUE;
                    for(int j = 0; j < vertices.size(); j++)
                    {
                        Point3D verticeAtual = vertices.get(j).ponto;
                        if( (long) verticeAtual.getX() < minX) minX =(long) verticeAtual.getX();
                        if( (long) verticeAtual.getX() > maxX) maxX =(long) verticeAtual.getX();
                        if( (long) verticeAtual.getZ() < minY) minY =(long) verticeAtual.getZ();
                        if( (long) verticeAtual.getZ() > maxY) maxY =(long) verticeAtual.getZ();        
                    }
                    if((controle.localX >= minX && controle.localX <= maxX) && (controle.localY >= minY && controle.localY <= maxY)){
                        controle.selectedChar = i;
                        controle.selecao = controle.chars.get(i);
                        
                        break;
                    }
                }

                if(controle.selectedChar != -1){
                    controle.mouseApertado = true;
                }
            }else if(controle.botaoTodaString.isSelected()){
                controle.mouseApertado = true;
            }
            
        });   
        canvasTopo.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            controle.mouseApertado = false;
            controle.iluminacaoCaractereSelecionado();
            
            if(null != controle.escolheMetodo.getValue().toString())
            switch (controle.escolheMetodo.getValue().toString()) {
                case "Pintor" -> controle.painter(controle.refactChars4, canvasPerspectiva);
                case "Phong" -> iluminacao.iluminacaoPhong(canvasPerspectiva, controle.refactChars4, controle.chars, controle.lugarLuz, controle.Il, controle.Ila, controle.VRPPerspectiva);
                case "Constante" -> iluminacao.iluminacaoConstante(canvasPerspectiva, controle.refactChars4, controle.chars, controle.lugarLuz, controle.Il, controle.Ila, controle.VRPPerspectiva);
                default -> {}
            }
            
            
        });
        
        canvasTopo.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(controle.mouseApertado){
                if(controle.selectedChar != -1){
                    if((nowLocalX <= canvasTopo.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvasTopo.getHeight() && nowLocalY >= 0))
                    {
                        if(controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            caractere alterado = controle.refactChars2.get(controle.selectedChar);
                            
                            alterado.translada(new Point3D(controle.localX, 0,controle.localY));
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            controle.invertChar(alterado, controle.ct1,universo, 2);
                            
                            caractere frente = universo.copia();
                            caractere lado = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars1.set(controle.selectedChar, frente);
                            controle.refactChars3.set(controle.selectedChar, lado);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            
                            
                            controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                            controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                            

                            if(controle.setFaceOcult.isSelected()){
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
//                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
//                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
//                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                            
                        }else if(controle.botaoRotacao.isSelected()){
                            
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            
                            universo.rotacaoTopo(controle.localX*0.05, controle.localY*0.02);
                            
                            
                            
                            caractere frente = universo.copia();
                            caractere topo = universo.copia();
                            caractere lado = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars1.set(controle.selectedChar, frente);
                            controle.refactChars2.set(controle.selectedChar, topo);
                            controle.refactChars3.set(controle.selectedChar, lado);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            
                            controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                            controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                            controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                            

                            if(controle.setFaceOcult.isSelected()){
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
//                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
//                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
//                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                        
                        }else if(controle.botaoEscala.isSelected()){
                            controle.localY = controle.localY - ((long) event.getY());
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            
                            universo.escala(controle.localY*0.05);
                            
                            
                            
                            caractere frente = universo.copia();
                            caractere topo = universo.copia();
                            caractere lado = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars1.set(controle.selectedChar, frente);
                            controle.refactChars2.set(controle.selectedChar, topo);
                            controle.refactChars3.set(controle.selectedChar, lado);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            
                            controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                            controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                            controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                            

                            if(controle.setFaceOcult.isSelected()){
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
//                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
//                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
//                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                            
                        }
                        
                    }
                    controle.localX = nowLocalX;
                    controle.localY = nowLocalY;
                }else if(controle.botaoTodaString.isSelected()){
                    
                    if(controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            for(int i = 0; i < controle.refactChars2.size(); i++){
                                caractere alterado = controle.refactChars2.get(i);
                                alterado.translada(new Point3D(controle.localX, 0, controle.localY));
                                
                                caractere universo = controle.chars.get(i);
                                controle.invertChar(alterado, controle.ct2,universo, 2);
                                
                            }
                            
                            

                            
                            Runnable refazFrente = () -> {
                                
                                for(int l = 0; l < controle.refactChars1.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere frente = universo.copia();
                                    controle.refactChars1.set(l, frente);
                                    controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                                    
                                }
//                                canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                                
                                
                            };
                            
                            Runnable refazLado = () -> {
                                for(int l = 0; l < controle.refactChars3.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere lado = universo.copia();
                                    controle.refactChars3.set(l, lado);
                                    controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                                    
                                }
//                                canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                                
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere perspectiva = universo.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
//                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            
                            
                            Platform.runLater(refazFrente);
                            Platform.runLater(refazLado);
                            Platform.runLater(refazPerspectiva);

//                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                            if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            
                            
                            
                            
                            
                            
                                
                                
                                
                                
                                
                                
                            
                        }else if(controle.botaoRotacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            Point3D centro = caractere.centroArrayListcaractere(controle.chars);
                            
                            for(int i = 0; i < controle.chars.size(); i++){
                                caractere universo = controle.chars.get(i);
                            
                                universo.rotacaoTopoString(controle.localX*0.05, controle.localY*0.02, centro);
                                
                            }
                            
                            


                            
                            Runnable refazFrente = () -> {
                                
                                for(int l = 0; l < controle.refactChars1.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere frente = universo.copia();
                                    controle.refactChars1.set(l, frente);
                                    controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                                    
                                }
//                                canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                                
                                
                            };
                            
                            Runnable refazLado = () -> {
                                for(int l = 0; l < controle.refactChars3.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere lado = universo.copia();
                                    controle.refactChars3.set(l, lado);
                                    controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                                    
                                }
//                                canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                                
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere perspectiva = universo.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
//                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            Runnable refazTopo = () -> {
                                for(int l = 0; l < controle.refactChars2.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere topo = universo.copia();
                                    controle.refactChars2.set(l, topo);
                                    controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                                    
                                }
//                                canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                
                                
                                ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                                
                            };
                            
                            Platform.runLater(refazFrente);
                            Platform.runLater(refazTopo);
                            Platform.runLater(refazLado);
                            Platform.runLater(refazPerspectiva);

                            
                            
                            
                            
                            
                        }else if(controle.botaoEscala.isSelected()){
                            controle.localY = controle.localY - ((long) event.getY());
                            
                            Point3D centro = caractere.centroArrayListcaractere(controle.chars);
                            
                            for(int i = 0; i < controle.chars.size(); i++){
                                caractere universo = controle.chars.get(i);
                            
                                universo.escalaString(controle.localY*0.02, centro);
                                
                            }
                            
                            
                            
                            for(int l = 0; l < controle.refactChars1.size(); l++){
                                caractere universo = controle.chars.get(l);                       
                                caractere frente = universo.copia();
                                controle.refactChars1.set(l, frente);
                                controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);

                            }
//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());

                            if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            
                            

                            
                            
                            
                            Runnable refazLado = () -> {
                                for(int l = 0; l < controle.refactChars3.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere lado = universo.copia();
                                    controle.refactChars3.set(l, lado);
                                    controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                                    
                                }
//                                canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                                ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                                
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere perspectiva = universo.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
//                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            Runnable refazTopo = () -> {
                                for(int l = 0; l < controle.refactChars2.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere topo = universo.copia();
                                    controle.refactChars2.set(l, topo);
                                    controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                                    
                                }
//                                canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                
                                
                                ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                                
                            };
                            
                            
                            Platform.runLater(refazTopo);
                            Platform.runLater(refazLado);
                            Platform.runLater(refazPerspectiva);
                            
                        }
                    
                    
                   controle.localX = nowLocalX;
                   controle.localY = nowLocalY; 
                }
            }
        });
        
        
        
        
        
        
        
        
        
        canvasLado.addEventHandler(MouseEvent.MOUSE_PRESSED, e->{
            controle.localX = (long) e.getX();
            controle.localY = (long) e.getY();
            controle.selectedChar = -1;
            
            if(controle.botaoLetra.isSelected()){
                for(int i = 0; i < controle.refactChars3.size(); i++){
                    ArrayList<vertice> vertices = controle.refactChars3.get(i).vertices;
                    long maxX = Long.MIN_VALUE;
                    long minX = Long.MAX_VALUE;
                    long maxY = Long.MIN_VALUE;
                    long minY = Long.MAX_VALUE;
                    for(int j = 0; j < vertices.size(); j++)
                    {
                        Point3D verticeAtual = vertices.get(j).ponto;
                        if( (long) verticeAtual.getZ() < minX) minX =(long) verticeAtual.getZ();
                        if( (long) verticeAtual.getZ() > maxX) maxX =(long) verticeAtual.getZ();
                        if( (long) verticeAtual.getY() < minY) minY =(long) verticeAtual.getY();
                        if( (long) verticeAtual.getY() > maxY) maxY =(long) verticeAtual.getY();        
                    }
                    if((controle.localX >= minX && controle.localX <= maxX) && (controle.localY >= minY && controle.localY <= maxY)){
                        controle.selectedChar = i;
                        controle.selecao = controle.chars.get(i);
                        
                        break;
                    }
                }

                if(controle.selectedChar != -1){
                    controle.mouseApertado = true;
                }
            }else if(controle.botaoTodaString.isSelected()){
                controle.mouseApertado = true;
            }
            
            
        });
        
        
        
        canvasLado.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            controle.mouseApertado = false;
            controle.iluminacaoCaractereSelecionado();
            
            if(null != controle.escolheMetodo.getValue().toString())
            switch (controle.escolheMetodo.getValue().toString()) {
                case "Pintor" -> controle.painter(controle.refactChars4, canvasPerspectiva);
                case "Phong" -> iluminacao.iluminacaoPhong(canvasPerspectiva, controle.refactChars4, controle.chars, controle.lugarLuz, controle.Il, controle.Ila, controle.VRPPerspectiva);
                case "Constante" -> iluminacao.iluminacaoConstante(canvasPerspectiva, controle.refactChars4, controle.chars, controle.lugarLuz, controle.Il, controle.Ila, controle.VRPPerspectiva);
                default -> {}
            }
            
        });
        
        
        
        
        canvasLado.addEventHandler(MouseEvent.ANY, (var event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(controle.mouseApertado){
                if(controle.selectedChar != -1){
                    if((nowLocalX <= canvasLado.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvasLado.getHeight() && nowLocalY >= 0))
                    {
                        
                        if(controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            caractere alterado = controle.refactChars3.get(controle.selectedChar);
                            
                            alterado.translada(new Point3D(0, controle.localY,controle.localX));
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            controle.invertChar(alterado, controle.ct3,universo, 3);
                            
                            caractere frente = universo.copia();
                            caractere topo = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars1.set(controle.selectedChar, frente);
                            controle.refactChars2.set(controle.selectedChar, topo);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                            controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                            

                            if(controle.setFaceOcult.isSelected()){                               
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);                   
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
//                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
//                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
//                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                            
                        }else if(controle.botaoRotacao.isSelected()){
                            
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            
                            universo.rotacaoLateral(controle.localX*0.05, controle.localY*0.02);
                            
                            
                            
                            caractere frente = universo.copia();
                            caractere topo = universo.copia();
                            caractere lado = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars1.set(controle.selectedChar, frente);
                            controle.refactChars2.set(controle.selectedChar, topo);
                            controle.refactChars3.set(controle.selectedChar, lado);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            
                            controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                            controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                            controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                            

                            if(controle.setFaceOcult.isSelected()){                               
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);                   
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
//                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
//                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
//                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                            
                        
                        }else if(controle.botaoEscala.isSelected()){
                            controle.localY = controle.localY - ((long) event.getY());
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            
                            universo.escala(controle.localY*0.05);
                            
                            
                            
                            caractere frente = universo.copia();
                            caractere topo = universo.copia();
                            caractere lado = universo.copia();
                            caractere perspectiva = universo.copia();
                            controle.refactChars1.set(controle.selectedChar, frente);
                            controle.refactChars2.set(controle.selectedChar, topo);
                            controle.refactChars3.set(controle.selectedChar, lado);
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            
                            controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                            controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                            controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                            

                            if(controle.setFaceOcult.isSelected()){                               
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);                   
                                ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                            }

//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
//                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
//                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
//                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                            
                            
                        }
                        
                        
                        
                        
                        
                    }
                    
                    
                    controle.localX = nowLocalX;
                    controle.localY = nowLocalY;
                }else if(controle.botaoTodaString.isSelected()){
                    
                    if(controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            for(int i = 0; i < controle.refactChars3.size(); i++){
                                caractere alterado = controle.refactChars3.get(i);
                                alterado.translada(new Point3D(0, controle.localY, controle.localX));
                                
                                caractere universo = controle.chars.get(i);
                                controle.invertChar(alterado, controle.ct3,universo, 3);
                                
                            }
                            
                            

                            
                            Runnable refazFrente = () -> {
                                
                                for(int l = 0; l < controle.refactChars1.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere frente = universo.copia();
                                    controle.refactChars1.set(l, frente);
                                    controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);
                                    
                                }
//                                canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                            
                                ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                                
                                
                            };
                            
                            Runnable refazTopo = () -> {
                                for(int l = 0; l < controle.refactChars2.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere topo = universo.copia();
                                    controle.refactChars2.set(l, topo);
                                    controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                                    
                                }
//                                canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                
                                ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                                
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo = controle.chars.get(l);                       
                                    caractere perspectiva = universo.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
//                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            
                            
                            Platform.runLater(refazFrente);
                            Platform.runLater(refazTopo);
                            Platform.runLater(refazPerspectiva);

//                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                            if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                            ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                            
                            
                               
                                
                                
                                
                                
                                
                            
                        }else if(controle.botaoRotacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            Point3D centro = caractere.centroArrayListcaractere(controle.chars);
                            
                            for(int i = 0; i < controle.chars.size(); i++){
                                caractere universo = controle.chars.get(i);
                            
                                universo.rotacaoLateralString(controle.localX*0.05, controle.localY*0.02, centro);
                                
                            }
                            
                            
                            
                            for(int l = 0; l < controle.refactChars1.size(); l++){
                                caractere universo = controle.chars.get(l);                       
                                caractere frente = universo.copia();
                                controle.refactChars1.set(l, frente);
                                controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);

                            }
//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());

                            if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            
                            

                            
                            Runnable refazTopo = () -> {
                                for(int l = 0; l < controle.refactChars2.size(); l++){
                                    caractere universo1 = controle.chars.get(l);                       
                                    caractere topo = universo1.copia();
                                    controle.refactChars2.set(l, topo);
                                    controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                                    
                                }
//                                canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                                
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                
                                ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                                
                            };
                            
                            Runnable refazLado = () -> {
                                for(int l = 0; l < controle.refactChars3.size(); l++){
                                    caractere universo2 = controle.chars.get(l);                       
                                    caractere lado = universo2.copia();
                                    controle.refactChars3.set(l, lado);
                                    controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                                    
                                }
//                                canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                                
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                            
                                
                                ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                               
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo3 = controle.chars.get(l);                       
                                    caractere perspectiva = universo3.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
//                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            
                            
                            Platform.runLater(refazTopo);
                            Platform.runLater(refazLado);
                            Platform.runLater(refazPerspectiva);
                            
                            

                            
                            
                            
                            
                        }else if(controle.botaoEscala.isSelected()){
                            controle.localY = controle.localY - ((long) event.getY());
                            
                            Point3D centro = caractere.centroArrayListcaractere(controle.chars);
                            
                            for(int i = 0; i < controle.chars.size(); i++){
                                caractere universo = controle.chars.get(i);
                            
                                universo.escalaString(controle.localY*0.02, centro);
                                
                            }
                            
                            for(int l = 0; l < controle.refactChars1.size(); l++){
                                caractere universo = controle.chars.get(l);                       
                                caractere frente = universo.copia();
                                controle.refactChars1.set(l, frente);
                                controle.ctrlVRP2SRUParaUmCaractere(frente, controle.ct1, controle.refactChars1, ctrl.VRPFrente, ctrl.PFrente, ctrl.viewUP, ctrl.dPNormal, 1);

                            }
//                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());

                            if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars1, ctrl.VRPFrente);
                            
                            ctrl.desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1);
                            
                            

                            
                            Runnable refazTopo = () -> {
                                for(int l = 0; l < controle.refactChars2.size(); l++){
                                    caractere universo1 = controle.chars.get(l);                       
                                    caractere topo = universo1.copia();
                                    controle.refactChars2.set(l, topo);
                                    controle.ctrlVRP2SRUParaUmCaractere(topo, controle.ct2, controle.refactChars2, ctrl.VRPTopo, ctrl.PTopo, ctrl.viewUP, ctrl.dPNormal, 2);
                                    
                                }
//                                canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                                
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars2, ctrl.VRPTopo);
                                
                                ctrl.desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2);
                                
                            };
                            
                            Runnable refazLado = () -> {
                                for(int l = 0; l < controle.refactChars3.size(); l++){
                                    caractere universo2 = controle.chars.get(l);                       
                                    caractere lado = universo2.copia();
                                    controle.refactChars3.set(l, lado);
                                    controle.ctrlVRP2SRUParaUmCaractere(lado, controle.ct3, controle.refactChars3, ctrl.VRPLado, ctrl.PLado, ctrl.viewUP, ctrl.dPNormal, 3);
                                    
                                }
//                                canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                                
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars3, ctrl.VRPLado);
                            
                                
                                ctrl.desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), controle.refactChars3);
                               
                            };
                            
                            Runnable refazPerspectiva = () -> {
                                for(int l = 0; l < controle.refactChars4.size(); l++){
                                    caractere universo3 = controle.chars.get(l);                       
                                    caractere perspectiva = universo3.copia();
                                    controle.refactChars4.set(l, perspectiva);
                                    controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, controle.dPPerspectiva, 4);
                                    
                                }
//                                canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                                
                                if(controle.setFaceOcult.isSelected()) ctrl.testeVisibilidade(controle.chars, controle.refactChars4, controle.VRPPerspectiva);
                                
                                ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4);
                                
                            };
                            
                            
                            
                            Platform.runLater(refazTopo);
                            Platform.runLater(refazLado);
                            Platform.runLater(refazPerspectiva);
                            
                            
                        }
                    
                    
                   controle.localX = nowLocalX;
                   controle.localY = nowLocalY; 
                }
            }
        });
        
    }
    
}
