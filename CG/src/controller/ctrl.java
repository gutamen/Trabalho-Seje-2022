/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import estrutura.aresta;
import estrutura.vertice;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import letras.*;
import java.util.Scanner;
import javafx.event.EventType;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;



/**
 *
 * @author macedo
 */
public class ctrl extends Application {
    int selectedChar;
    long localX, localY;
    
    
    @Override public void start(Stage stage) {
        //falseStart(stage);
        trueStart(stage);
        
        
    }
        
    public static Scanner read = new Scanner(System.in);
    public static double offSet;
    
    private void trueStart(Stage stage){
        String readed = read.nextLine();
        readed = readed.toLowerCase();
        
        ArrayList<caractere> chars = new ArrayList<caractere>();
        
        for(int i = 0; i < readed.length(); i++){
            chars.add(new caractere(readed.substring(i, i+1)));
            for(int j = chars.get(i).vertices.size()/2; j < chars.get(i).vertices.size(); j++){
                chars.get(i).vertices.get(j).setZ(2);
            }
            for(int j = 0; j < chars.get(i).vertices.size()/2; j++){
                chars.get(i).vertices.get(j).setZ(1);
            }
        }
        
        tela2String(chars.size(), chars);
        
        Group root = new Group();
        Scene scene = new Scene(root, 1920, 1080, Color.WHITE);
        
        ctrlCam ct1 = new ctrlCam();
        ctrlCam ct2 = new ctrlCam();
        ctrlCam ct3 = new ctrlCam();
        ctrlCam ct4 = new ctrlCam();
        
        final Canvas canvas1 = new Canvas(600, 600);
        final Canvas canvas2 = new Canvas(600, 600);
        final Canvas canvas3 = new Canvas(600, 600);
        final Canvas canvas4 = new Canvas(600, 600);

        canvas1.setLayoutX(0);
        canvas1.setLayoutY(0);
        canvas2.setLayoutY(200);
        canvas3.setLayoutY(400);
        canvas4.setLayoutY(500);
        canvas4.setLayoutX(500);
        
        GraphicsContext gc1 = canvas1.getGraphicsContext2D();
        GraphicsContext gc2 = canvas2.getGraphicsContext2D();
        GraphicsContext gc3 = canvas3.getGraphicsContext2D();
        GraphicsContext gc4 = canvas4.getGraphicsContext2D();
        
        
        //Button bt = new Button("jeugue");
        //root.getChildren().add(bt);
        
        
        
        //root.setAutoSizeChildren(false);
        
        ArrayList<caractere> refactChars1 = new ArrayList<caractere>();
        ArrayList<caractere> refactChars2 = new ArrayList<caractere>();
        
        
        for(int i = 0; i < readed.length(); i++){
            refactChars1.add(new caractere(readed.substring(i, i+1)));
            refactChars2.add(new caractere(readed.substring(i, i+1)));
            for(int j = refactChars1.get(i).vertices.size()/2; j < refactChars1.get(i).vertices.size(); j++){
                refactChars1.get(i).vertices.get(j).setZ(50);
                refactChars2.get(i).vertices.get(j).setZ(2);
            }
            for(int j = 0; j < refactChars1.get(i).vertices.size()/2; j++){
                refactChars1.get(i).vertices.get(j).setZ(1);
                refactChars2.get(i).vertices.get(j).setZ(1);
            }
        }
        
        tela2String(chars.size(), refactChars1);
        tela2String(chars.size(), refactChars2);
       
        //VRP, P, Y, booelan projecao
        System.out.println("0...");
        ctrlVRP2SRU(ct1, refactChars1, gc1, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), false);
        System.out.println("1...");
        ctrlVRP2SRU(ct4, refactChars2, gc2, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), true);
        
        for(int i = 0; i < refactChars1.size(); i++){
            desenhaFiguraPorAresta(gc1, refactChars1.get(i).arestas);
            desenhaFiguraPorArestaTopo(gc2, refactChars1.get(i).arestas);
            desenhaFiguraPorArestaLateral(gc3, refactChars1.get(i).arestas);
            desenhaFiguraPorAresta(gc4, refactChars2.get(i).arestas);
        }
        
        canvas1.addEventHandler(MouseEvent.MOUSE_PRESSED, (event)->{
            localX = (long) event.getX();
            localY = (long) event.getY();
            selectedChar = -1;
            
            
            for(int i = 0; i < refactChars1.size(); i++){
                ArrayList<vertice> vertices = refactChars1.get(i).vertices;
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
                
                
                if((localX >= minX && localX <= maxX) && (localY >= minY && localY <= maxY)){
                    selectedChar = i;
                    break;
                }
                
                
            }
            
            if(selectedChar != -1){
                System.out.println(chars.get(selectedChar).letra + " selecionada");
            }
            else{
                System.out.println("não apertou em nada");
            }
            
        });
        
        canvas1.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            if(selectedChar != -1){
                if((event.getX() <= canvas1.getHeight() && event.getX() >= 0) && (event.getY() <= canvas1.getWidth() && event.getY() >= 0))
                {
                    localX -= (long) event.getX();
                    localX *= -1;
                    localY -= (long) event.getY();
                    localY *= -1;
                    caractere mudanssa = refactChars1.get(selectedChar);
                    
                    for(int k = 0; k < mudanssa.vertices.size(); k++){
                        mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(localX, localY, 0);
                        
                    }
                    
                    canvas1.getGraphicsContext2D().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
                    canvas2.getGraphicsContext2D().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
                    canvas3.getGraphicsContext2D().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
                    for(int k = 0; k < refactChars1.size(); k++){
                        desenhaFiguraPorAresta(canvas1.getGraphicsContext2D(), refactChars1.get(k).arestas);
                        desenhaFiguraPorArestaTopo(canvas2.getGraphicsContext2D(), refactChars1.get(k).arestas);
                        desenhaFiguraPorArestaLateral(canvas3.getGraphicsContext2D(), refactChars1.get(k).arestas);
                    }
                    
                    
                }
                
            }
        
        });
        
        
        
        root.getChildren().add(canvas1);
        root.getChildren().add(canvas2);
        root.getChildren().add(canvas3);
        root.getChildren().add(canvas4);
        
        stage.setScene(scene);
        
        stage.show();
        
        /*stage.addEventHandler(KeyEvent.KEY_PRESSED,  (event) -> {
            System.out.println("Key pressed: " + event.toString());

            switch(event.getCode().getCode()) {
                case 27 : { // 27 = ESC key
                    stage.close();
                    break;
                }
                case 10 : { // 10 = Return
                    stage.setWidth( stage.getWidth() * 2);
                }
                default:  {
                    System.out.println("Unrecognized key");
                }
            }
            
           
           
            
        });*/

        
        
        
        
    }
        
    private void refact(caractere pts, ctrlCam ct){
        for(int i = 0; i < pts.vertices.size(); i++){
            pts.vertices.get(i).setVertice(ct.getNmPPLxMT()[0][i], ct.getNmPPLxMT()[1][i], ct.getNmPPLxMT()[2][i]);
        }
    }
    
    private void tela2String(int sizeChar, ArrayList<caractere> arrsc){
        sizeChar *= -2;
        sizeChar += 2;
        for(int i = 0; i < arrsc.size(); i++){
            if(arrsc.size() > 1){
                for(int j = 0; j < arrsc.get(i).vertices.size(); j++){
                    arrsc.get(i).vertices.get(j).setX(arrsc.get(i).vertices.get(j).getX()+sizeChar);
                }
            }
            sizeChar += 4;
        }
    }
    
    private double maxminX(caractere pts){
        double min = Integer.MIN_VALUE;
        double max = Integer.MAX_VALUE;
        for(int i = 0; i < pts.vertices.size(); i++){
            if(min > pts.vertices.get(i).getX()){
                min = pts.vertices.get(i).getX();
            }
            if(max < pts.vertices.get(i).getX()){
                max = pts.vertices.get(i).getX();
            }
        }
        return max-min;
    }
    
    private void desenhaFiguraPorAresta(GraphicsContext gc, ArrayList<aresta> arestas) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        
        for(int i = 0; arestas.size() > i; i++){
            
            
            xpoints[0]=(arestas.get(i).getInicio().getX());
            ypoints[0]=((arestas.get(i).getInicio().getY()));
           
            xpoints[1]=(arestas.get(i).getFim().getX());
            ypoints[1]=((arestas.get(i).getFim().getY()));
            gc.strokePolyline(xpoints, ypoints, 2);
            
        }
        System.out.println(Arrays.toString(xpoints));
        System.out.println(Arrays.toString(ypoints));
        
        
        gc.restore();
        
    }
    
    private void desenhaFiguraPorArestaTopo(GraphicsContext gc, ArrayList<aresta> arestas) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        
        for(int i = 0; arestas.size() > i; i++){
            
            
            xpoints[0]=(arestas.get(i).getInicio().getX());
            ypoints[0]=((arestas.get(i).getInicio().getZ()));
           
            xpoints[1]=(arestas.get(i).getFim().getX());
            ypoints[1]=((arestas.get(i).getFim().getZ()));
            gc.strokePolyline(xpoints, ypoints, 2);
            
        }
        System.out.println(Arrays.toString(xpoints));
        System.out.println(Arrays.toString(ypoints));
        
        
        gc.restore();
        
    }
    
    private void desenhaFiguraPorArestaLateral(GraphicsContext gc, ArrayList<aresta> arestas) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        
        for(int i = 0; arestas.size() > i; i++){
            
            
            xpoints[0]=(arestas.get(i).getInicio().getZ());
            ypoints[0]=((arestas.get(i).getInicio().getY()));
           
            xpoints[1]=(arestas.get(i).getFim().getZ());
            ypoints[1]=((arestas.get(i).getFim().getY()));
            gc.strokePolyline(xpoints, ypoints, 2);
            
        }
        System.out.println(Arrays.toString(xpoints));
        System.out.println(Arrays.toString(ypoints));
        
        
        gc.restore();
        
    }

    private void ctrlVRP2SRU(ctrlCam ct, ArrayList<caractere> refactChars, GraphicsContext gc, Point3D VRP, Point3D P, Point3D Y, boolean projecao){
        ct.setVRP(VRP.getX(), VRP.getY(), VRP.getZ());
        ct.setP(P.getX(), P.getY(), P.getZ());
        ct.setYc(Y.getX(), Y.getY(), Y.getZ());
        ct.setDp(21);
        ct.setViewport(0, 0, 80*refactChars.size(), 200);
        ct.setWindow(-2*refactChars.size()-2, -2-1, 2*refactChars.size()+2, 2+1);
        
        if(!projecao){
            for(int i = 0; i < refactChars.size(); i++){
                ct.setPPLxMT(ct.getPipeline_SRU2SRTNormal(), getMatPts(refactChars.get(i)));
                refact(refactChars.get(i), ct);
            }
        }else{
            for(int i = 0; i < refactChars.size(); i++){
                ct.setPPLxMT(ct.getPipeline_SRU2SRT(), getMatPts(refactChars.get(i)));
                refact(refactChars.get(i), ct);
            }
        }
        
        
        /*System.out.println("N = "+ct.getNzao());
        System.out.println("n = "+ct.getNzin());
        System.out.println("V = "+ct.getVzao());
        System.out.println("v = "+ct.getVzin());
        System.out.println("u = "+ct.getUzin());
        System.out.println("YN = "+ct.getYN());
        
        System.out.println("VRP_PP");
        writMat(ct.getVRP_PP());
        System.out.println("\n");
        System.out.println("VRP_SRC");
        writMat(ct.getVRP_SRC());
        System.out.println("\n");
        System.out.println("VP_PP");
        writMat(ct.getVP_PP());
        System.out.println("\n");
        System.out.println("VP_SRC");
        writMat(ct.getVP_SRC());
        System.out.println("\n");
        System.out.println("Matri R");
        writMat(ct.getR());
        System.out.println("\n");
        System.out.println("Matriz T");
        writMat(ct.getT());
        System.out.println("\n");
        System.out.println("Matriz M(SRU,SRT)");
        writMat(ct.getM_SRU2SRC());
        System.out.println("\n");
        System.out.println("Matriz Proj");
        writMat(ct.getMProj());
        System.out.println("\n");
        System.out.println("Matriz Jp");
        writMat(ct.getMJp());
        System.out.println("\n");
        System.out.println("Matriz Pipeline (SRU,SRT)");
        writMat(ct.getPipeline_SRU2SRT());
        
        
        System.out.println("PPLxMT");
        writMat(ct.getPPLxMT());
        System.out.println("NmPPLxMT");
        writMat(ct.getNmPPLxMT());*/
    }
    
    public double[][] getMatPts(caractere pts){
        double[][] verticesDaLetra = new double[4][pts.vertices.size()];
        
        for(int i = 0; i < pts.vertices.size(); i++){
            verticesDaLetra[0][i] = pts.vertices.get(i).getX();
            verticesDaLetra[1][i] = pts.vertices.get(i).getY();
            verticesDaLetra[2][i] = pts.vertices.get(i).getZ();
            verticesDaLetra[3][i] = 1;
        }
        
        return verticesDaLetra;
    }
    
    public static double[][] writMat(double[][] matrizR){
        for(int i = 0; i < matrizR.length; i++){
            for(int k = 0; k < matrizR[0].length; k++){
                System.out.print((Double.toString(matrizR[i][k]))+" | ");
            }
            System.out.println("");
        }

        return matrizR;
    }
    
    public int encontraVertice(String S, ArrayList<vertice> vertices){
        for(int i=0; i < vertices.size(); i++){
            if(vertices.get(i).getNomeVertice().equals(S))
                return i;
        }
        return -1;
    }
    
    public static double[][] mulM1M2(double[][] matriz, double[][] matriz1){
        double[][] matrizR = new double[matriz.length][matriz1[0].length];
        for(int i = 0; i < matriz.length; i++){
            for(int k = 0; k < matriz1[0].length; k++){
                for(int l = 0; l < matriz1.length; l++){
                    matrizR[i][k] += (matriz[i][l])*(matriz1[l][k]);
                }
            }
        }
        return matrizR;
    }
}
