/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cg;






import estrutura.aresta;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import letras.*;


public class CG extends Application {

    @Override public void start(Stage stage) {
        
        Group root = new Group();
        //Group other = new Group();
        Scene scene = new Scene(root, 500, 400);
        scene.setFill(Color.rgb(255, 255, 255, 0));

        letraA b = new letraA();
        Canvas canvas = new Canvas(300,300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        desenhaFiguraPorAresta(gc,b.arestas);
        
        root.getChildren().add(canvas);
        
        
        
        
        System.out.println(b.arestas.size());
        

        
                
        
        /*for(int i = 0 ; i < b.arestas.size(); i++)
        {
                root.getChildren().add(new Line( 50*(b.arestas.get(i).getInicio().getX() + 3), 50*(b.arestas.get(i).getInicio().getY()*-1 + 3) 
                        , 50*(b.arestas.get(i).getFim().getX() + 3), 50*(b.arestas.get(i).getFim().getY()*-1 + 3)));
                
                
        }*/
        
        //root.getChildren().add(b);
        
        //System.out.println(b.encontraVertice("B"));
        
        //polyline.setFill(Color.BLANCHEDALMOND);
        //teste.setFill(Color.WHITE);
        //other.getChildren().add(text);
        //Line teste = (Line) root.getChildren().get(0);
        //b.arestas.get(0).getInicio().setX(10);
        //teste.setStartX(10);
        //root.getChildren().add(line);
        //root.getChildren().add(circle);
        //root.getChildren().add(polyline);
        //root.getChildren().add(teste);
        
        stage.setScene(scene);
       
        stage.show();
        
        
        
    }

    public static void main(String[] args) {
        Application.launch(args);
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
}