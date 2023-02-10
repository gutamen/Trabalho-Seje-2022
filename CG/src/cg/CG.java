/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cg;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*public class CG extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        primaryStage.setTitle("Hello Worldi");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}*/


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class CG extends Application {

    @Override public void start(Stage stage) {
        
        Group root = new Group();
        Scene scene = new Scene(root, 500, 400);
        scene.setFill(Color.LIGHTGRAY);

        Circle circle = new Circle(60, 40, 30, Color.GREEN);
        Line line = new Line();
        line.setStartX(0.0f);
        line.setStartY(200.0f);
        line.setEndX(200.0f);
        line.setEndY(200.0f);

        letra_B b = new letra_B();
        
        Text text = new Text(10, 90, "JavaFX Scene");
        text.setFill(Color.DARKRED);
        
        Font font = new Font(20);
        text.setFont(font);
        
        Polyline polyline = new Polyline();
        char k = 'A';
        for(int i = 0 ; i < b.arestas.size(); i++)
        {
            polyline.getPoints().addAll(new Double[]{
                50*(b.arestas.get(i).getInicio().getX() + 3), 50*(b.arestas.get(i).getInicio().getY() + 3),
                50*(b.arestas.get(i).getFim().getX() + 3), 50*(b.arestas.get(i).getFim().getY() + 3)
                });
        }
        
        //root.getChildren().add(line);
        //root.getChildren().add(circle);
        root.getChildren().add(polyline);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}