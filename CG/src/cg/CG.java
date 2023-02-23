/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cg;






import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import letras.*;


public class CG extends Application {

    @Override public void start(Stage stage) {
        
        Group root = new Group();
        //Group other = new Group();
        Scene scene = new Scene(root, 500, 400);
        scene.setFill(Color.rgb(255, 255, 255, 0));

        //Circle circle = new Circle(60, 40, 30, Color.GREEN);
        

        letraA b = new letraA();
        
        //System.out.println(b.arestas.get(0).toString());
        //System.out.println(b.vertices.get(0).getArestaVertice().toString());
        //Text text = new Text(10, 90, "JavaFX Scene");
        //text.setFill(Color.DARKRED);
        
        //Font font = new Font(20);
        //text.setFont(font);
        
        /*Polyline polyline = new Polyline();
        for(int i = 0 ; i < 10; i++)
        {
            polyline.getPoints().addAll(new Double[]{
                50*(b.arestas.get(i).getInicio().getX() + 3), 50*(b.arestas.get(i).getInicio().getY() + 3),
                50*(b.arestas.get(i).getFim().getX() + 3), 50*(b.arestas.get(i).getFim().getY() + 3)
                });
        }*/
        
        /*Polyline teste = new Polyline();
        for(int i = 10 ; i < 14; i++)
        {
            teste.getPoints().addAll(new Double[]{
                50*(b.arestas.get(i).getInicio().getX() + 3), 50*(b.arestas.get(i).getInicio().getY() + 3),
                50*(b.arestas.get(i).getFim().getX() + 3), 50*(b.arestas.get(i).getFim().getY() + 3)
                });
        }*/
        
        
        
        
                
        
        for(int i = 0 ; i < b.arestas.size(); i++)
        {
                root.getChildren().add(new Line( 50*(b.arestas.get(i).getInicio().getX() + 3), 50*(b.arestas.get(i).getInicio().getY()*-1 + 3) 
                        , 50*(b.arestas.get(i).getFim().getX() + 3), 50*(b.arestas.get(i).getFim().getY()*-1 + 3)));
                
                
        }
        
        
        //System.out.println(b.encontraVertice("B"));
        
        //polyline.setFill(Color.BLANCHEDALMOND);
        //teste.setFill(Color.WHITE);
        //other.getChildren().add(text);
        Line teste = (Line) root.getChildren().get(0);
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
}