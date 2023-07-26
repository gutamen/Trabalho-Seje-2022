/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import estrutura.vertice;
import java.util.ArrayList;
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
                    break;
                }
            }

            if(controle.selectedChar != -1){
                System.out.println(controle.chars.get(controle.selectedChar).letra + " selecionada");
                controle.mouseApertado = true;
            }
            else{
                System.out.println("não apertou em nada");
            }
        });   
        canvasFrente.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            controle.mouseApertado = false;
            if("Pintor".equals(controle.choice.getValue().toString())){
                controle.painter(controle.refactChars4, canvasPerspectiva);
            }
        });
        canvasFrente.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(controle.selectedChar != -1){
                if(controle.mouseApertado){
                    if((nowLocalX <= canvasFrente.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvasFrente.getHeight() && nowLocalY >= 0))
                    {
                        if(controle.botaoLetra.isSelected() && controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            caractere mudanssa = controle.refactChars1.get(controle.selectedChar);                       
                            caractere mudanssa1 = controle.refactChars2.get(controle.selectedChar);  
                            caractere mudanssa2 = controle.refactChars3.get(controle.selectedChar);

                            for(int k = 0; k < mudanssa.vertices.size(); k++){
                                mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                            }

                            caractere universo = controle.chars.get(controle.selectedChar);
                            controle.invertChar(mudanssa, controle.ct1,universo);
                            caractere perspectiva = universo.copia();
                            controle.refactChars4.set(controle.selectedChar, perspectiva);
                            
                            // Necessário ARRUMAR o INVERT CHAR TODOS ERRADOS PARA FUNCIONAR
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, 4);
                            //controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, 4);

                            if(controle.setFaceOcult.isSelected()){
                                controle.faceTestVisibilit(controle.refactCharsAll, controle.chars, ctrl.VRPFrente, ctrl.VRPTopo, ctrl.VRPLado, controle.VRPPerspectiva);
                            }


                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            for(int k = 0; k < controle.refactChars1.size(); k++){
                                controle.desenhaFiguraPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1.get(k));
                                controle.desenhaFiguraPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2.get(k));
                                controle.desenhaFiguraPorArestaLateral(canvasLado.getGraphicsContext2D(), controle.refactChars3.get(k));
                                controle.desenhaFiguraPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4.get(k));
                            }
                        }
                        
                        if(controle.botaoTodaString.isSelected() && controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            caractere mudanssa = controle.refactChars1.get(controle.selectedChar);                       
                            caractere mudanssa1 = controle.refactChars2.get(controle.selectedChar);  
                            caractere mudanssa2 = controle.refactChars3.get(controle.selectedChar);  

                            
                            Runnable makeRefact1 = () -> {
                                for(int l = 0; l < controle.refactChars1.size(); l++){
                                    caractere alterado = controle.refactChars1.get(l);                         
                                    for(int k = 0; k < alterado.vertices.size(); k++){
                                       alterado.vertices.get(k).ponto = alterado.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                    }
                                }
                            };
                            
                            Runnable makeRefact2 = () -> {
                                for(int l = 0; l < controle.refactChars1.size(); l++){
                                    caractere alterado = controle.refactChars1.get(l);                         
                                    for(int k = 0; k < alterado.vertices.size(); k++){
                                       alterado.vertices.get(k).ponto = alterado.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                    }
                                }
                            };
                            
                            Runnable makeRefact3 = () -> {
                                for(int l = 0; l < controle.refactChars1.size(); l++){
                                    caractere alterado = controle.refactChars1.get(l);                         
                                    for(int k = 0; k < alterado.vertices.size(); k++){
                                       alterado.vertices.get(k).ponto = alterado.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                    }
                                }
                            };
                            
                            
                            for(int k = 0; k < mudanssa.vertices.size(); k++){
                                mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                            }

                            caractere universo = controle.chars.get(controle.selectedChar);
                            caractere perspectiva = controle.refactChars4.get(controle.selectedChar);
                            controle.invertChar(mudanssa, controle.ct1,universo);
                            controle.copiaVertices(perspectiva,universo);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, 4);

                            if(controle.setFaceOcult.isSelected()){
                                controle.faceTestVisibilit(controle.refactCharsAll, controle.chars, ctrl.VRPFrente, ctrl.VRPTopo, ctrl.VRPLado, controle.VRPPerspectiva);
                            }


                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            for(int k = 0; k < controle.refactChars1.size(); k++){
                                controle.desenhaFiguraPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1.get(k));
                                controle.desenhaFiguraPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2.get(k));
                                controle.desenhaFiguraPorArestaLateral(canvasLado.getGraphicsContext2D(), controle.refactChars3.get(k));
                                controle.desenhaFiguraPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4.get(k));
                            }
                        }                        
                        
                        
                        
                        
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
                    break;
                }
            }

            if(controle.selectedChar != -1){
                System.out.println(controle.chars.get(controle.selectedChar).letra + " selecionada");
                controle.mouseApertado = true;
            }
            else{
                System.out.println("não apertou em nada");
            }
        });   
        canvasTopo.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            controle.mouseApertado = false;
            if("Pintor".equals(controle.choice.getValue().toString())){
                controle.painter(controle.refactChars4, canvasPerspectiva);
            }
        });
        canvasTopo.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(controle.selectedChar != -1){
                if(controle.mouseApertado){
                    if((nowLocalX <= canvasTopo.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvasTopo.getHeight() && nowLocalY >= 0))
                    {
                        if(controle.botaoLetra.isSelected() && controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            caractere mudanssa = controle.refactChars1.get(controle.selectedChar);
                            caractere mudanssa1 = controle.refactChars2.get(controle.selectedChar);
                            caractere mudanssa2 = controle.refactChars3.get(controle.selectedChar);

                            for(int k = 0; k < mudanssa.vertices.size(); k++){
                                mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(controle.localX, 0, controle.localY);
                                mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(controle.localX, 0, controle.localY);
                                mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(controle.localX, 0, controle.localY);
                            }
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            caractere perspectiva = controle.refactChars4.get(controle.selectedChar);
                            controle.invertChar(mudanssa, controle.ct2,universo);
                            controle.copiaVertices(perspectiva,universo);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, 4);

                            if(controle.setFaceOcult.isSelected()){
                                controle.faceTestVisibilit(controle.refactCharsAll, controle.chars, ctrl.VRPFrente, ctrl.VRPTopo, ctrl.VRPLado, controle.VRPPerspectiva);
                            }

                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            for(int k = 0; k < controle.refactChars1.size(); k++){
                                controle.desenhaFiguraPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1.get(k));
                                controle.desenhaFiguraPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2.get(k));
                                controle.desenhaFiguraPorArestaLateral(canvasLado.getGraphicsContext2D(), controle.refactChars3.get(k));
                                controle.desenhaFiguraPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4.get(k));
                            }
                        }
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
                    break;
                }
            }

            if(controle.selectedChar != -1){
                System.out.println(controle.chars.get(controle.selectedChar).letra + " selecionada");
                controle.mouseApertado = true;
            }
            else{
                System.out.println("não apertou em nada");
            }
        });
        
        canvasLado.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            controle.mouseApertado = false;
            if("Pintor".equals(controle.choice.getValue().toString())){
                controle.painter(controle.refactChars4, canvasPerspectiva);
            }
        });
        canvasLado.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(controle.selectedChar != -1){
                if(controle.mouseApertado){
                    if((nowLocalX <= canvasLado.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvasLado.getHeight() && nowLocalY >= 0))
                    {
                        
                        if(controle.botaoLetra.isSelected() && controle.botaoTranslacao.isSelected()){
                            controle.localX = controle.localX - ((long) event.getX());
                            controle.localX *= -1;
                            controle.localY = controle.localY - ((long) event.getY());
                            controle.localY *= -1;
                            
                            caractere mudanssa = controle.refactChars1.get(controle.selectedChar);
                            caractere mudanssa1 = controle.refactChars2.get(controle.selectedChar);
                            caractere mudanssa2 = controle.refactChars3.get(controle.selectedChar);
                            
                            for(int k = 0; k < mudanssa.vertices.size(); k++){
                                mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(0, controle.localY, controle.localX);
                                mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(0, controle.localY, controle.localX);
                                mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(0, controle.localY, controle.localX);
                            }
                            
                            caractere universo = controle.chars.get(controle.selectedChar);
                            caractere perspectiva = controle.refactChars4.get(controle.selectedChar);
                            controle.invertChar(mudanssa, controle.ct3,universo);
                            controle.copiaVertices(perspectiva,universo);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, controle.VRPPerspectiva, controle.PPerspectiva, ctrl.viewUP, 4);

                            if(controle.setFaceOcult.isSelected()){
                                controle.faceTestVisibilit(controle.refactCharsAll, controle.chars, ctrl.VRPFrente, ctrl.VRPTopo, ctrl.VRPLado, controle.VRPPerspectiva);
                            }

                            canvasFrente.getGraphicsContext2D().clearRect(0, 0, canvasFrente.getWidth(), canvasFrente.getHeight());
                            canvasTopo.getGraphicsContext2D().clearRect(0, 0, canvasTopo.getWidth(), canvasTopo.getHeight());
                            canvasLado.getGraphicsContext2D().clearRect(0, 0, canvasLado.getWidth(), canvasLado.getHeight());
                            canvasPerspectiva.getGraphicsContext2D().clearRect(0, 0, canvasPerspectiva.getWidth(), canvasPerspectiva.getHeight());
                            for(int k = 0; k < controle.refactChars1.size(); k++){
                                controle.desenhaFiguraPorAresta(canvasFrente.getGraphicsContext2D(), controle.refactChars1.get(k));
                                controle.desenhaFiguraPorArestaTopo(canvasTopo.getGraphicsContext2D(), controle.refactChars2.get(k));
                                controle.desenhaFiguraPorArestaLateral(canvasLado.getGraphicsContext2D(), controle.refactChars3.get(k));
                                controle.desenhaFiguraPorAresta(canvasPerspectiva.getGraphicsContext2D(), controle.refactChars4.get(k));
                            }
                        }
                        
                    }
                    
                    
                    controle.localX = nowLocalX;
                    controle.localY = nowLocalY;
                }
            }
        });
        
    }
    
}
