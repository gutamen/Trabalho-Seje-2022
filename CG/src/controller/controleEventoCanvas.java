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

                            //writMat(getMatPts(universo));

                            for(int k = 0; k < mudanssa.vertices.size(); k++){
                                mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                                mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(controle.localX, controle.localY, 0);
                            }

                            caractere universo = controle.chars.get(controle.selectedChar);
                            caractere perspectiva = controle.refactChars4.get(controle.selectedChar);
                            controle.invertChar(mudanssa, controle.ct1,universo);
                            controle.copiaVertices(perspectiva,universo);
                            controle.ctrlVRP2SRUParaUmCaractere(perspectiva, controle.ct4, controle.refactChars4, canvasPerspectiva.getGraphicsContext2D(), new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), 4);

                            if(controle.setFaceOcult.isSelected()){
                                controle.faceTestVisibilit(controle.refactCharsAll, controle.chars, new Point3D(0, 0, 19), new Point3D(0, 19, 0), new Point3D(19, 0, 0), new Point3D(0, 0, 19));
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
                        
                        /*if(controle.botaoTodaString.isSelected() && controle.botaoTranslacao.isSelected()){
                            localX = localX - ((long) event.getX());
                            localX *= -1;
                            localY = localY - ((long) event.getY());
                            localY *= -1;
                            caractere mudanssa = refactChars1.get(selectedChar);                       
                            caractere mudanssa1 = refactChars2.get(selectedChar);  
                            caractere mudanssa2 = refactChars3.get(selectedChar);  

                            

                            for(int k = 0; k < mudanssa.vertices.size(); k++){
                                mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(localX, localY, 0);
                                mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(localX, localY, 0);
                                mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(localX, localY, 0);
                            }

                            caractere universo = chars.get(selectedChar);
                            caractere perspectiva = refactChars4.get(selectedChar);
                            invertChar(mudanssa, ct1,universo);
                            copiaVertices(perspectiva,universo);
                            ctrlVRP2SRUParaUmCaractere(perspectiva, ct4, refactChars4, gc2, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), 4);

                            if(faceOcult){
                                faceTestVisibilit(refactCharsAll, chars, new Point3D(0, 0, 19), new Point3D(0, 19, 0), new Point3D(19, 0, 0), new Point3D(0, 0, 19));
                            }


                            canvas1.getGraphicsContext2D().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
                            canvas2.getGraphicsContext2D().clearRect(0, 0, canvas2.getWidth(), canvas2.getHeight());
                            canvas3.getGraphicsContext2D().clearRect(0, 0, canvas3.getWidth(), canvas3.getHeight());
                            canvas4.getGraphicsContext2D().clearRect(0, 0, canvas4.getWidth(), canvas4.getHeight());
                            for(int k = 0; k < refactChars1.size(); k++){
                                desenhaFiguraPorAresta(canvas1.getGraphicsContext2D(), refactChars1.get(k));
                                desenhaFiguraPorArestaTopo(canvas2.getGraphicsContext2D(), refactChars2.get(k));
                                desenhaFiguraPorArestaLateral(canvas3.getGraphicsContext2D(), refactChars3.get(k));
                                desenhaFiguraPorAresta(canvas4.getGraphicsContext2D(), refactChars4.get(k));
                            }
                        }*/
                        
                        
                        
                        
                        
                    }
                    controle.localX = nowLocalX;
                    controle.localY = nowLocalY;
                    nowLocalX = (long) event.getX();
                    nowLocalY = (long) event.getY();
                }
            }
        });
        
        /*canvasTopo.addEventHandler(MouseEvent.MOUSE_PRESSED, e->{
            localX = (long) e.getX();
            localY = (long) e.getY();
            selectedChar = -1;
            for(int i = 0; i < refactChars2.size(); i++){
                ArrayList<vertice> vertices = refactChars2.get(i).vertices;
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
                if((localX >= minX && localX <= maxX) && (localY >= minY && localY <= maxY)){
                    selectedChar = i;
                    break;
                }
            }

            if(selectedChar != -1){
                System.out.println(chars.get(selectedChar).letra + " selecionada");
                mouseApertado = true;
            }
            else{
                System.out.println("não apertou em nada");
            }
        });   
        canvasTopo.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            mouseApertado = false;
            if("Pintor".equals(metodChoice)){
                painter(refactChars4, canvas4);
            }
        });
        canvasTopo.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(selectedChar != -1){
                if(mouseApertado){
                    if((nowLocalX <= canvas2.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvas2.getHeight() && nowLocalY >= 0))
                    {
                        if(botaoLetra.isSelected() && botaoTranslacao.isSelected()){
                            localX = localX - ((long) event.getX());
                            localX *= -1;
                            localY = localY - ((long) event.getY());
                            localY *= -1;
                            caractere mudanssa = refactChars1.get(selectedChar);
                            caractere mudanssa1 = refactChars2.get(selectedChar);
                            caractere mudanssa2 = refactChars3.get(selectedChar);

                            for(int k = 0; k < mudanssa.vertices.size(); k++){
                                mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(localX, 0, localY);
                                mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(localX, 0, localY);
                                mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(localX, 0, localY);

                            }
                            caractere universo = chars.get(selectedChar);
                            caractere perspectiva = refactChars4.get(selectedChar);
                            invertChar(mudanssa, ct2,universo);
                            copiaVertices(perspectiva,universo);
                            ctrlVRP2SRUParaUmCaractere(perspectiva, ct4, refactChars4, gc4, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), 4);

                            if(faceOcult){
                                faceTestVisibilit(refactCharsAll, chars, new Point3D(0, 0, 19), new Point3D(0, 19, 0), new Point3D(19, 0, 0), new Point3D(0, 0, 19));
                            }

                            canvas1.getGraphicsContext2D().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
                            canvas2.getGraphicsContext2D().clearRect(0, 0, canvas2.getWidth(), canvas2.getHeight());
                            canvas3.getGraphicsContext2D().clearRect(0, 0, canvas3.getWidth(), canvas3.getHeight());
                            canvas4.getGraphicsContext2D().clearRect(0, 0, canvas4.getWidth(), canvas4.getHeight());
                            for(int k = 0; k < refactChars1.size(); k++){
                                desenhaFiguraPorAresta(canvas1.getGraphicsContext2D(), refactChars1.get(k));
                                desenhaFiguraPorArestaTopo(canvas2.getGraphicsContext2D(), refactChars2.get(k));
                                desenhaFiguraPorArestaLateral(canvas3.getGraphicsContext2D(), refactChars3.get(k));
                                desenhaFiguraPorAresta(canvas4.getGraphicsContext2D(), refactChars4.get(k));
                            }
                        }
                    }
                    localX = nowLocalX;
                    localY = nowLocalY;
                    nowLocalX = (long) event.getX();
                    nowLocalY = (long) event.getY();
                }
            }
        });
        
        
        canvasLado.addEventHandler(MouseEvent.MOUSE_PRESSED, e->{
            localX = (long) e.getX();
            localY = (long) e.getY();
            selectedChar = -1;
            for(int i = 0; i < refactChars3.size(); i++){
                ArrayList<vertice> vertices = refactChars3.get(i).vertices;
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
                if((localX >= minX && localX <= maxX) && (localY >= minY && localY <= maxY)){
                    selectedChar = i;
                    break;
                }
            }

            if(selectedChar != -1){
                System.out.println(chars.get(selectedChar).letra + " selecionada");
                mouseApertado = true;
            }
            else{
                System.out.println("não apertou em nada");
            }
        });
        
        canvasLado.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            mouseApertado = false;
            if("Pintor".equals(metodChoice)){
                painter(refactChars4, canvas4);
            }
        });
        canvasLado.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(selectedChar != -1){
                if(mouseApertado){
                    if((nowLocalX <= canvas3.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvas3.getHeight() && nowLocalY >= 0))
                    {
                        
                        if(botaoLetra.isSelected() && botaoTranslacao.isSelected()){
                            localX = localX - ((long) event.getX());
                            localX *= -1;
                            localY = localY - ((long) event.getY());
                            localY *= -1;
                            caractere mudanssa = refactChars1.get(selectedChar);
                            caractere mudanssa1 = refactChars2.get(selectedChar);
                            caractere mudanssa2 = refactChars3.get(selectedChar);
                            for(int k = 0; k < mudanssa.vertices.size(); k++){
                                mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(0, localY, localX);
                                mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(0, localY, localX);
                                mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(0, localY, localX);
                            }
                            caractere universo = chars.get(selectedChar);
                            caractere perspectiva = refactChars4.get(selectedChar);
                            invertChar(mudanssa, ct3,universo);
                            copiaVertices(perspectiva,universo);
                            ctrlVRP2SRUParaUmCaractere(perspectiva, ct4, refactChars4, gc2, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), 4);

                            if(faceOcult){
                                faceTestVisibilit(refactCharsAll, chars, new Point3D(0, 0, 19), new Point3D(0, 19, 0), new Point3D(19, 0, 0), new Point3D(0, 0, 19));
                            }

                            canvas1.getGraphicsContext2D().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
                            canvas2.getGraphicsContext2D().clearRect(0, 0, canvas2.getWidth(), canvas2.getHeight());
                            canvas3.getGraphicsContext2D().clearRect(0, 0, canvas3.getWidth(), canvas3.getHeight());
                            canvas4.getGraphicsContext2D().clearRect(0, 0, canvas4.getWidth(), canvas4.getHeight());
                            for(int k = 0; k < refactChars1.size(); k++){
                                desenhaFiguraPorAresta(canvas1.getGraphicsContext2D(), refactChars1.get(k));
                                desenhaFiguraPorArestaTopo(canvas2.getGraphicsContext2D(), refactChars2.get(k));
                                desenhaFiguraPorArestaLateral(canvas3.getGraphicsContext2D(), refactChars3.get(k));
                                desenhaFiguraPorAresta(canvas4.getGraphicsContext2D(), refactChars4.get(k));
                            }
                        }
                        
                    }
                    
                    
                    localX = nowLocalX;
                    localY = nowLocalY;
                    nowLocalX = (long) event.getX();
                    nowLocalY = (long) event.getY();
                }
            }
        });*/
        
    }
    
}
