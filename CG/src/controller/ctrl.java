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

/**
 *
 * @author macedo
 */
public class ctrl extends Application {
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
            //System.out.println(chars.get(i).letra);
        }
        
        tela2String(chars.size(), chars);
        
        Group root = new Group();
        Scene scene = new Scene(root, 1920, 1080, Color.WHITE);
        
        ctrlCam ct = new ctrlCam();
        
        final Canvas canvas1 = new Canvas(600, 600);
        //final Canvas canvas2 = new Canvas(300, 300);
        //final Canvas canvas3 = new Canvas(300, 300);
        //final Canvas canvas4 = new Canvas(300, 300);

        canvas1.setLayoutX(0);
        canvas1.setLayoutY(0);
        //canvas2.setLayoutX(340);
        //canvas2.setLayoutY(250);
        //canvas3.setLayoutX(20);
        //canvas3.setLayoutY(500);
        //canvas4.setLayoutX(340);
        //canvas4.setLayoutY(500);
        
        GraphicsContext gc1 = canvas1.getGraphicsContext2D();
        //GraphicsContext gc2 = canvas2.getGraphicsContext2D();
        //GraphicsContext gc3 = canvas3.getGraphicsContext2D();
        //raphicsContext gc4 = canvas4.getGraphicsContext2D();
           
        root.getChildren().add(canvas1);
        //root.getChildren().add(canvas2);
        //root.getChildren().add(canvas3);
        //root.getChildren().add(canvas4);
        
        root.setAutoSizeChildren(false);
        canvas1.resizeRelocate(0, 0, 0, 0);
        
        ArrayList<caractere> refactChars = new ArrayList<caractere>();
        for(int i = 0; i < readed.length(); i++){
            refactChars.add(new caractere(readed.substring(i, i+1)));
        }
        
        tela2String(chars.size(), refactChars);
        
        for(int i = 0; i < refactChars.size(); i++){
            refact(refactChars.get(i), ctrlVRP2SRU(chars.get(i), chars.size()*1.3));
            desenhaFiguraPorAresta(gc1, refactChars.get(i).arestas);
        }
        
        //desenhaFiguraPorAresta(gc3,bRefact.arestas);
        //desenhaFiguraPorAresta(gc4,bRefact.arestas);
        
        //writMat(getMatPts(aRefact));
        
        stage.setScene(scene);
       
        stage.show();
        
        /*try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(CG.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        //root.getChildren().set(0, (Node) ma);
        
    }
        
    private void refact(caractere pts, ctrlCam ct){
        for(int i = 0; i < pts.vertices.size(); i++){
            pts.vertices.get(i).setVertice(ct.getNmPPLxMT()[0][i], ct.getNmPPLxMT()[1][i], ct.getNmPPLxMT()[2][i]);
        }
    }
    
    private void tela2String(int sizeChar, ArrayList<caractere> arrsc){
        sizeChar *= -4;
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
    
    private void falseStart(Stage stage){
        
        Group root = new Group();
        //Group other = new Group();
        Scene scene = new Scene(root, 500, 400);
        scene.setFill(Color.rgb(255, 255, 255, 0));

        letraA b = new letraA();
        Canvas canvas = new Canvas(300,300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        
        
        desenhaFiguraPorAresta(gc,b.arestas);
        
        root.getChildren().add(canvas);
        
        stage.setScene(scene);
       
        stage.show();
        
        /*try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(CG.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        Canvas ma = new Canvas();
        
        //root.getChildren().set(0, (Node) ma);
        
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

    private ctrlCam ctrlVRP2SRU(caractere pts, double sizeChars){
        ctrlCam ct = new ctrlCam();
        ct.setVRP(0, 0, 19);
        ct.setP(0, 0, -1);
        ct.setYc(0, 1, 0);
        ct.setDp(20);
        ct.setViewport(0, 0, 400, 250);
        ct.setWindow(-4*sizeChars, -4*sizeChars, 4*sizeChars, 4*sizeChars);
        ct.setPPLxMT(ct.getPipeline_SRU2SRT(), getMatPts(pts));
        /*
        System.out.println("N = "+ct.getNzao());
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
        writMat(ct.getNmPPLxMT());
        */
        return ct;
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
