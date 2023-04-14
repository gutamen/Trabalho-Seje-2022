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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import letras.*;

/**
 *
 * @author macedo
 */
public class ctrl extends Application {
        @Override public void start(Stage stage) {
        //falseStart(stage);
        trueStart(stage);
    }
        
    private void trueStart(Stage stage){
        
        Group root = new Group();
        //Group other = new Group();
        Scene scene = new Scene(root, 1024, 768, Color.WHITE);
        //scene.setFill(Color.rgb(0, 0, 0, 0));


        caractere b = new caractere("b");
        final Canvas canvas1 = new Canvas(300, 300);
        final Canvas canvas2 = new Canvas(300, 300);
        final Canvas canvas3 = new Canvas(300, 300);
        final Canvas canvas4 = new Canvas(300, 300);
        
        canvas1.setLayoutX(20);
        canvas1.setLayoutY(250);
        canvas2.setLayoutX(340);
        canvas2.setLayoutY(250);
        canvas3.setLayoutX(20);
        canvas3.setLayoutY(500);
        canvas4.setLayoutX(340);
        canvas4.setLayoutY(500);
        
        GraphicsContext gc1 = canvas1.getGraphicsContext2D();
        GraphicsContext gc2 = canvas2.getGraphicsContext2D();
        GraphicsContext gc3 = canvas3.getGraphicsContext2D();
        GraphicsContext gc4 = canvas4.getGraphicsContext2D();
        
        desenhaFiguraPorAresta(gc1,b.arestas);
        desenhaFiguraPorAresta(gc2,b.arestas);
        desenhaFiguraPorAresta(gc3,b.arestas);
        desenhaFiguraPorAresta(gc4,b.arestas);
        
        root.getChildren().add(canvas1);
        root.getChildren().add(canvas2);
        root.getChildren().add(canvas3);
        root.getChildren().add(canvas4);
        
        ctrlVRP2SRU(b);
   
        stage.setScene(scene);
       
        stage.show();
        
        /*try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            Logger.getLogger(CG.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        //root.getChildren().set(0, (Node) ma);
        
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
            
            
            xpoints[0]=30*(arestas.get(i).getInicio().getX()+5);
            ypoints[0]=30*((arestas.get(i).getInicio().getY()*-1)+5);
           
            xpoints[1]=30*(arestas.get(i).getFim().getX()+5);
            ypoints[1]=30*((arestas.get(i).getFim().getY()*-1)+5);
            gc.strokePolyline(xpoints, ypoints, 2);
            
        }
        System.out.println(Arrays.toString(xpoints));
        System.out.println(Arrays.toString(ypoints));
        
        
        gc.restore();
        
    }

    private void ctrlVRP2SRU(caractere pts){
        vrp vrp = new vrp(0, 0, -20);
        
        double[][] matrixProj = {{1, 0, 0, 0},
                                 {0, 1, 0, 0},
                                 {0, 0, 0, 0},
                                 {0, 0, 0, 1}};
        
        double[][] matrixTransModel = {{1, 0, 0, 0},
                                       {0, 1, 0, 0},
                                       {0, 0, 1, 20},
                                       {0, 0, 0, 1}};
        
        double[][] PxM = mulM1M2(matrixProj, matrixTransModel);
        
        double[][] result = genMTransModel(pts);
        
        result = mulM1M2(matrixTransModel, result);
        System.out.println("\n");
        writMat(result);
    }
    
    public double[][] genMTransModel(caractere pts){
        double[][] matrixTransModel = new double[4][pts.vertices.size()];
        
        for(int i = 0; i < pts.vertices.size(); i++){
            matrixTransModel[0][i] = pts.vertices.get(i).getX();
            matrixTransModel[1][i] = pts.vertices.get(i).getY();
            matrixTransModel[2][i] = pts.vertices.get(i).getZ();
            matrixTransModel[3][i] = 1;
        }
        
        writMat(matrixTransModel);
        
        return matrixTransModel;
    }
    
    public static double[][] writMat(double[][] matrizR){
        for(int i = 0; i < matrizR.length; i++){
            for(int k = 0; k < matrizR[0].length; k++){
                System.out.print((Double.toString(matrizR[i][k])));
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
