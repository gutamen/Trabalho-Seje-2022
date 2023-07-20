/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import estrutura.aresta;
import estrutura.vertice;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;



/**
 *
 * @author macedo
 */
public class ctrl extends Application {
    int selectedChar;
    long localX, localY;
    boolean mouseApertado;
    Button btConfirm;
    Button save;
    Button load;        
    CheckBox setFaceOcult;
    ChoiceBox choice;
    TextArea txConfirmString;
    Spinner<Integer> setZ;
    Text txZ;
    
    public static Scanner read = new Scanner(System.in);
    public static double offSet;
    
    @Override public void start(Stage stage) {
        //falseStart(stage);
        Group root = new Group();
        Scene scene = new Scene(root, 880, 800, Color.WHITE);
        intFace(stage, root, scene);
        
    }
    
    public void intFace(Stage stage, Group root, Scene scene){        
        
        btConfirm = new Button("OK");
        save = new Button("SAVE");
        load = new Button("LOAD");
        setFaceOcult = new CheckBox("Ocutacao de face");
        choice = new ChoiceBox();
        choice.setValue("WireFrame");
        choice.getItems().addAll("WireFrame", "Pintor", "Guro", "Phong");
        txConfirmString = new TextArea();
        //escala para 1 para 0.2
        setZ = new Spinner(1, 50, 1);
        txZ = new Text("profundidade Z");
        
        txZ.setLayoutX(765);
        txZ.setLayoutY(115);
        
        setFaceOcult.setMinSize(0, 0);
        setFaceOcult.setMaxSize(200, 50);
        setFaceOcult.setLayoutX(720);
        setFaceOcult.setLayoutY(150);
        
        choice.setMinSize(0, 0);
        choice.setMaxSize(100, 50);
        choice.setLayoutX(720);
        choice.setLayoutY(190);
        
        txConfirmString.setLayoutX(660);
        txConfirmString.setLayoutY(40);
        txConfirmString.setMinSize(0, 0);
        txConfirmString.setMaxSize(200, 28);
        
        btConfirm.setMinSize(0, 0);
        btConfirm.setMaxSize(200, 30);
        btConfirm.setLayoutX(760);
        btConfirm.setLayoutY(460);
        
        
        setZ.setMinSize(0, 0);
        setZ.setMaxSize(60, 50);
        setZ.setLayoutX(700);
        setZ.setLayoutY(100);
        
        save.setMinSize(0, 0);
        save.setMaxSize(200, 30);
        save.setLayoutX(780);
        save.setLayoutY(500);
       
        load.setMinSize(0, 0);
        load.setMaxSize(200, 30);
        load.setLayoutX(720);
        load.setLayoutY(500);
        
        //trueStart(stage, root, ta.getText(), scene);
        stage.setScene(scene);
        stage.show();
        
        root.getChildren().add(txConfirmString);
        root.getChildren().add(btConfirm);
        root.getChildren().add(save);
        root.getChildren().add(load);
        root.getChildren().add(setZ);
        root.getChildren().add(setFaceOcult);
        root.getChildren().add(choice);
        root.getChildren().add(txZ);
        
        
        choice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evento) {
                if(!"WireFrame".equals(choice.getValue().toString())){
                    setFaceOcult.setSelected(true);
                    setFaceOcult.setDisable(true);
                }else{
                    setFaceOcult.setSelected(false);
                    setFaceOcult.setDisable(false);;
                }
            }
        });
        
        btConfirm.setOnAction((ActionEvent evento) -> {
            root.getChildren().clear();
            root.getChildren().add(txConfirmString);
            root.getChildren().add(btConfirm);
            root.getChildren().add(save);
            root.getChildren().add(load);
            root.getChildren().add(setZ);
            root.getChildren().add(setFaceOcult);
            root.getChildren().add(choice);
            root.getChildren().add(txZ);
            trueStart(stage, root, txConfirmString.getText(), scene, choice.getValue().toString(), setFaceOcult.selectedProperty().get(), setZ.getValue()*(-0.2));
        });
        
        save.setOnAction((ActionEvent evento) -> {
            System.out.println("save");
        });
    
        load.setOnAction((ActionEvent evento) -> {
            System.out.println("load");
        });
    
    }
    
    private void trueStart(Stage stage, Group root, String readed, Scene scene, String metodChoice, Boolean faceOcult, Double scaleZ){
        //String readed = read.nextLine();
        readed = readed.toLowerCase();
        
        ArrayList<caractere> chars = new ArrayList<caractere>();
        
        
        //gambiarra para o Z aparecer
        for(int i = 0; i < readed.length(); i++){
            chars.add(new caractere(readed.substring(i, i+1)));
            for(int j = chars.get(i).vertices.size()/2; j < chars.get(i).vertices.size(); j++){
                chars.get(i).vertices.get(j).setZ(scaleZ);
            }
            for(int j = 0; j < chars.get(i).vertices.size()/2; j++){
                chars.get(i).vertices.get(j).setZ(1);
            }
        }
        
        salvaString(chars);
        
        tela2String(chars.size(), chars);
        
        //Group root = new Group();
        //Scene scene = new Scene(root, 1920, 1080, Color.WHITE);
        
        ctrlCam ct1 = new ctrlCam();
        ctrlCam ct2 = new ctrlCam();
        ctrlCam ct3 = new ctrlCam();
        ctrlCam ct4 = new ctrlCam();
        
        final Canvas canvas1 = new Canvas(600, 200);
        final Canvas canvas2 = new Canvas(600, 200);
        final Canvas canvas3 = new Canvas(600, 200);
        final Canvas canvas4 = new Canvas(600, 200);

        canvas1.setLayoutX(0);
        canvas1.setLayoutY(0);
        canvas2.setLayoutY(200);
        canvas3.setLayoutY(400);
        canvas4.setLayoutY(600);
        //canvas4.setLayoutX(500);
        
        GraphicsContext gc1 = canvas1.getGraphicsContext2D();
        GraphicsContext gc2 = canvas2.getGraphicsContext2D();
        GraphicsContext gc3 = canvas3.getGraphicsContext2D();
        GraphicsContext gc4 = canvas4.getGraphicsContext2D();
        
        
        //Button bt = new Button("jeugue");
        //root.getChildren().add(bt);
        
        
        
        //root.setAutoSizeChildren(false);
        
        ArrayList<caractere> refactChars1 = new ArrayList<caractere>();
        ArrayList<caractere> refactChars2 = new ArrayList<caractere>();
        ArrayList<caractere> refactChars3 = new ArrayList<caractere>();
        ArrayList<caractere> refactChars4 = new ArrayList<caractere>();
        
        
        for(int i = 0; i < readed.length(); i++){
            refactChars1.add(new caractere(readed.substring(i, i+1)));
            refactChars2.add(new caractere(readed.substring(i, i+1)));
            refactChars3.add(new caractere(readed.substring(i, i+1)));
            refactChars4.add(new caractere(readed.substring(i, i+1)));
            
            for(int j = refactChars1.get(i).vertices.size()/2; j < refactChars1.get(i).vertices.size(); j++){
                refactChars1.get(i).vertices.get(j).setZ(scaleZ);
                refactChars2.get(i).vertices.get(j).setZ(scaleZ);
                refactChars3.get(i).vertices.get(j).setZ(scaleZ);
                refactChars4.get(i).vertices.get(j).setZ(scaleZ);
            }
            for(int j = 0; j < refactChars1.get(i).vertices.size()/2; j++){
                refactChars1.get(i).vertices.get(j).setZ(1);
                refactChars2.get(i).vertices.get(j).setZ(1);
                refactChars3.get(i).vertices.get(j).setZ(1);
                refactChars4.get(i).vertices.get(j).setZ(1);
            }
        }
        
        tela2String(chars.size(), refactChars1);
        tela2String(chars.size(), refactChars2);
        tela2String(chars.size(), refactChars3);
        tela2String(chars.size(), refactChars4);
        
        ArrayList<ArrayList<caractere>> refactCharsAll = new  ArrayList<ArrayList<caractere>>();
        refactCharsAll.add(refactChars1);
        refactCharsAll.add(refactChars2);
        refactCharsAll.add(refactChars3);
        refactCharsAll.add(refactChars4);
        //função teste de visibilidade de face
        if(faceOcult){
            faceTestVisibilit(refactCharsAll, chars, new Point3D(0, 0, 19), new Point3D(0, 19, 0), new Point3D(19, 0, 0), new Point3D(0, 0, 19));
        }
        
        //VRP, P, Y, booelan projecao
        System.out.println("0...");
        ctrlVRP2SRU(ct1, refactChars1, gc1, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), false);
        System.out.println("1...");
        ctrlVRP2SRU(ct2, refactChars2, gc2, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), false);
        System.out.println("2...");
        ctrlVRP2SRU(ct3, refactChars3, gc3, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), false);
        System.out.println("3...");
        ctrlVRP2SRU(ct4, refactChars4, gc4, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), true);
        
        
        /*System.out.println("Matriz Jp");
        writMat(ct1.getMJp());
        System.out.println("\n");
        writMat(ct1.matrizInversa(ct1.getMJp()));
        System.out.println("\n");*/
        
        
        for(int i = 0; i < refactChars1.size(); i++){
            desenhaFiguraPorAresta(gc1, refactChars1.get(i));
            desenhaFiguraPorArestaTopo(gc2, refactChars2.get(i));
            desenhaFiguraPorArestaLateral(gc3, refactChars3.get(i));
            desenhaFiguraPorAresta(gc4, refactChars4.get(i));
        }
        
        //carniça do martini
        canvas1.addEventHandler(MouseEvent.MOUSE_PRESSED, e->{
            localX = (long) e.getX();
            localY = (long) e.getY();
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
                mouseApertado = true;
            }
            else{
                System.out.println("não apertou em nada");
            }
        });   
        canvas1.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            mouseApertado = false;
        });
        canvas1.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(selectedChar != -1){
                if(mouseApertado){
                    if((nowLocalX <= canvas1.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvas1.getHeight() && nowLocalY >= 0))
                    {
                        localX = localX - ((long) event.getX());
                        localX *= -1;
                        localY = localY - ((long) event.getY());
                        localY *= -1;
                        caractere mudanssa = refactChars1.get(selectedChar);                       
                        caractere mudanssa1 = refactChars2.get(selectedChar);  
                        caractere mudanssa2 = refactChars3.get(selectedChar);  
                        
                        //writMat(getMatPts(universo));
                        
                        for(int k = 0; k < mudanssa.vertices.size(); k++){
                            mudanssa.vertices.get(k).ponto = mudanssa.vertices.get(k).ponto.add(localX, localY, 0);
                            mudanssa1.vertices.get(k).ponto = mudanssa1.vertices.get(k).ponto.add(localX, localY, 0);
                            mudanssa2.vertices.get(k).ponto = mudanssa2.vertices.get(k).ponto.add(localX, localY, 0);
                        }
                        
                        caractere universo = chars.get(selectedChar);
                        caractere perspectiva = refactChars4.get(selectedChar);
                        invertChar(mudanssa, ct1,universo);
                        copiaVertices(perspectiva,universo);
                        ctrlVRP2SRUParaUmCaractere(perspectiva, ct4, refactChars4, gc2, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), true);
                        
                        
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
                    localX = nowLocalX;
                    localY = nowLocalY;
                    nowLocalX = (long) event.getX();
                    nowLocalY = (long) event.getY();
                }
            }
        });
        
        canvas2.addEventHandler(MouseEvent.MOUSE_PRESSED, e->{
            localX = (long) e.getX();
            localY = (long) e.getY();
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
        canvas2.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            mouseApertado = false;
        });
        canvas2.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(selectedChar != -1){
                if(mouseApertado){
                    if((nowLocalX <= canvas2.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvas2.getHeight() && nowLocalY >= 0))
                    {
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
                        invertChar(mudanssa, ct1,universo);
                        copiaVertices(perspectiva,universo);
                        ctrlVRP2SRUParaUmCaractere(perspectiva, ct4, refactChars4, gc4, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), true);
                        
                        
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
                    localX = nowLocalX;
                    localY = nowLocalY;
                    nowLocalX = (long) event.getX();
                    nowLocalY = (long) event.getY();
                }
            }
        });
        
        
        canvas3.addEventHandler(MouseEvent.MOUSE_PRESSED, e->{
            localX = (long) e.getX();
            localY = (long) e.getY();
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
        canvas3.addEventHandler(MouseEvent.MOUSE_RELEASED, (event)->{
            mouseApertado = false;
        });
        canvas3.addEventHandler(MouseEvent.ANY, (event)->{
            long nowLocalX = (long) event.getX();
            long nowLocalY = (long) event.getY();
            if(selectedChar != -1){
                if(mouseApertado){
                    if((nowLocalX <= canvas3.getWidth() && nowLocalX >= 0) && (nowLocalY <= canvas3.getHeight() && nowLocalY >= 0))
                    {
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
                        invertChar(mudanssa, ct1,universo);
                        copiaVertices(perspectiva,universo);
                        ctrlVRP2SRUParaUmCaractere(perspectiva, ct4, refactChars4, gc2, new Point3D(0, 0, 19), new Point3D(0, 0, -2), new Point3D(0, 1, 0), true);
                        
                        
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
                    localX = nowLocalX;
                    localY = nowLocalY;
                    nowLocalX = (long) event.getX();
                    nowLocalY = (long) event.getY();
                }
            }
        });
        
        
        
        root.getChildren().add(canvas1);
        root.getChildren().add(canvas2);
        root.getChildren().add(canvas3);
        root.getChildren().add(canvas4);
        
      
        
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
        
    
    public Point3D makeCentroid(ArrayList<vertice> entry, String opc){
        double minX, minY, minZ;
        double maxX, maxY, maxZ;
        minX = entry.get(0).ponto.getX();
        minY = entry.get(0).ponto.getY();
        minZ = entry.get(0).ponto.getZ();
        maxX = entry.get(0).ponto.getX();
        maxY = entry.get(0).ponto.getY();
        maxZ = entry.get(0).ponto.getZ();
            
        for(int i = 1; i < entry.size(); i++){
            if(minX > entry.get(i).getX()){
                minX = entry.get(i).getX();
            }
            if(maxX < entry.get(i).getX()){
                maxX = entry.get(i).getX();    
            }
            if(minY > entry.get(i).getY()){
                minY = entry.get(i).getY();
            }
            if(maxY < entry.get(i).getY()){
                maxY = entry.get(i).getY();    
            }
            if(minZ > entry.get(i).getZ()){
                minZ = entry.get(i).getZ();
            }
            if(maxZ < entry.get(i).getZ()){
                maxZ = entry.get(i).getZ();    
            }
        }
        if(opc.equals("min")){
            return new Point3D(minX, minY, minZ);
        }else if(opc.equals("max")){
            return new Point3D(maxX, maxY, maxZ);
        }
        return null;
    }
    
    private void faceTestVisibilit(ArrayList<ArrayList<caractere>> refactChars, ArrayList<caractere> chars, Point3D vrp1, Point3D vrp2, Point3D vrp3, Point3D vrp4){
        ArrayList<vertice> vertList = new ArrayList<vertice>();
        
        for(int i = 0; i < chars.size(); i++){
            for(int j = 0; j < chars.get(i).faces.size(); j ++){
                aresta k = chars.get(i).faces.get(j).getArestaFace();
                int o = 0;
                
                if(true){
                    System.out.println("j = "+j);
                    boolean rigth = false;
                    for(aresta p = new aresta("null");
                        !k.getNomeAresta().equals(p.getNomeAresta()); o++){
                        if(o < 1){
                            p = k;
                        }
                        
                        if(rigth){
                            vertList.add(p.getFim());
                        }else{
                            vertList.add(p.getInicio());    
                        }
                        
                        System.out.println(p.getNomeAresta());
                        System.out.println(chars.get(i).faces.get(j).getNomeFace());
                        if(p.getDireita().getNomeFace().equals(chars.get(i).faces.get(j).getNomeFace())){
                            p = p.getArestaDireitaSuc();
                            rigth = true;
                        }else{
                            p = p.getArestaEsquerdaSuc();
                            rigth = false;
                        }
                    }
                    
                    System.out.println(" entro aqui");
                    allInOne(refactChars, vertList, vrp1, vrp2, vrp3, vrp4, i, j, "notinterna");
                }/*else{
                    for(aresta p = chars.get(i).faces.get(j).getArestaFace().getArestaDireitaSuc();
                        !k.getInicio().getNomeVertice().equals(p.getInicio().getNomeVertice()); o++){
                        if(o >= 1){
                            p = p.getArestaDireitaSuc();
                        }
                        vertList.add(p.getInicio());
                    }
                    System.out.println("entro aqui outro");
                    allInOne(refactChars, vertList, vrp1, vrp2, vrp3, vrp4, i, j, "interna");
                }*/
                
            }
        }
    }
    
    private void allInOne(ArrayList<ArrayList<caractere>> refactChars, ArrayList<vertice> vertList, Point3D vrp1, Point3D vrp2, Point3D vrp3, Point3D vrp4, int i, int j, String type){
        for(int l = 0; l < vertList.size(); l++){
            System.out.println(vertList.get(l).ponto);
        }

        double xc, yc, zc;
        System.out.println("vertice tam = "+vertList.size());
        xc = (makeCentroid(vertList, "min").getX()+makeCentroid(vertList, "max").getX())/2;
        yc = (makeCentroid(vertList, "min").getY()+makeCentroid(vertList, "max").getY())/2;
        zc = (makeCentroid(vertList, "min").getZ()+makeCentroid(vertList, "max").getZ())/2;
        
        System.out.println("xc = "+xc);
        System.out.println("yc = "+yc);
        System.out.println("zc = "+zc);
        
        Point3D centroidFace = new Point3D(xc, yc, zc);
        
        double dVRPtoFaceView1 = Math.sqrt(Math.pow(vrp1.getX()-centroidFace.getX(), 2)+
                                           Math.pow(vrp1.getY()-centroidFace.getY(), 2)+
                                           Math.pow(vrp1.getZ()-centroidFace.getZ(), 2));

        double dVRPtoFaceView2 = Math.sqrt(Math.pow(vrp2.getX()-centroidFace.getX(), 2)+
                                           Math.pow(vrp2.getY()-centroidFace.getY(), 2)+
                                           Math.pow(vrp2.getZ()-centroidFace.getZ(), 2));

        double dVRPtoFaceView3 = Math.sqrt(Math.pow(vrp3.getX()-centroidFace.getX(), 2)+
                                           Math.pow(vrp3.getY()-centroidFace.getY(), 2)+
                                           Math.pow(vrp3.getZ()-centroidFace.getZ(), 2));


        double dVRPtoFaceView4 = Math.sqrt(Math.pow(vrp4.getX()-centroidFace.getX(), 2)+
                                           Math.pow(vrp4.getY()-centroidFace.getY(), 2)+
                                           Math.pow(vrp4.getZ()-centroidFace.getZ(), 2));

        Point3D vectO1 = vrp1.subtract(centroidFace);
        Point3D vectO2 = vrp2.subtract(centroidFace);
        Point3D vectO3 = vrp3.subtract(centroidFace);
        Point3D vectO4 = vrp4.subtract(centroidFace);

        Point3D vectOnormal1 = vectO1.normalize();
        Point3D vectOnormal2 = vectO2.normalize();
        Point3D vectOnormal3 = vectO3.normalize();
        Point3D vectOnormal4 = vectO4.normalize();

        Point3D vect1 = vertList.get(0).ponto.subtract(vertList.get(1).ponto);
        Point3D vect2 = vertList.get(0).ponto.subtract(vertList.get(vertList.size()-1).ponto);

        System.out.println("vect1 = "+vect1);
        System.out.println("vect2 = "+vect2);
        /*
        i   j  k  
        u1 u2 u3  
        v1 v2 v3
        */
        Point3D vectN = null;
        if("notinterna".equals(type)){
            vectN = vectN = vect1.crossProduct(vect2);
        }else if("interna".contains(type)){
            vectN = vectN = vect2.crossProduct(vect1); 
        }
        
        System.out.println("vectN = "+vectN);
        
        Point3D normN = vectN.normalize();

        System.out.println("normN = "+normN);

        double normOxnormN1 = vectOnormal1.dotProduct(normN);
        double normOxnormN2 = vectOnormal2.dotProduct(normN);
        double normOxnormN3 = vectOnormal3.dotProduct(normN);
        double normOxnormN4 = vectOnormal4.dotProduct(normN);
        
        System.out.println("normOxnormN1 = "+normOxnormN1);
        System.out.println("normOxnormN2 = "+normOxnormN2);
        System.out.println("normOxnormN3 = "+normOxnormN3);
        System.out.println("normOxnormN4 = "+normOxnormN4);

        ArrayList norms = new ArrayList();
        norms.add(normOxnormN1);
        norms.add(normOxnormN2);
        norms.add(normOxnormN3);
        norms.add(normOxnormN4);

        System.out.println("j = "+j);
        System.out.println("i = "+i);
        System.out.println("centr = "+centroidFace);

        for(int fg = 0; fg < refactChars.size(); fg++){
            System.out.println("norms = "+(double)norms.get(fg));
            if((double)norms.get(fg) > 0){
                refactChars.get(fg).get(i).faces.get(j).setVisivel(true);
                System.out.println("visivel");
            }else{
                refactChars.get(fg).get(i).faces.get(j).setVisivel(false);
                System.out.println("off vizbl ---------");
            }
        }



        /*
        System.out.println("minX = "+makeCentroid(vertList, "min").getX());
        System.out.println("maxX = "+makeCentroid(vertList, "max").getX());

        System.out.println("minY = "+makeCentroid(vertList, "min").getY());
        System.out.println("maxY = "+makeCentroid(vertList, "max").getY());

        System.out.println("minZ = "+makeCentroid(vertList, "min").getZ());
        System.out.println("maxZ = "+makeCentroid(vertList, "max").getZ());
        */

        vertList.clear();
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
    
    private void desenhaFiguraPorAresta(GraphicsContext gc, caractere cart) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        for(int k = 0; k < cart.faces.size(); k++){
            if(cart.faces.get(k).isVisivel()){
                boolean aux = true;
                aresta j = new aresta("null");
                for(aresta i = cart.faces.get(k).getArestaFace(); !i.getNomeAresta().equals(j.getNomeAresta());){
                    System.out.println(j.getNomeAresta());
                    if(aux){
                        j = i;
                        aux = false;
                    }
                    if(j.getDireita().getNomeFace().equals(cart.faces.get(k).getNomeFace())){
                        j = j.getArestaDireitaSuc();
                    }else{
                        j = j.getArestaEsquerdaSuc();
                    }
                    xpoints[0]=(j.getInicio().getX());
                    ypoints[0]=((j.getInicio().getY()));

                    xpoints[1]=(j.getFim().getX());
                    ypoints[1]=((j.getFim().getY()));
                    gc.strokePolyline(xpoints, ypoints, 2);
                }
                
                /*
                for(int h = 0; h < cart.arestas.size(); h++){
                    if(cart.arestas.get(h).getEsquerda().equals(cart.faces.get(k).getNomeFace())){
                        xpoints[0]=(cart.arestas.get(h).getInicio().getX());
                        ypoints[0]=((cart.arestas.get(h).getInicio().getY()));

                        xpoints[1]=(cart.arestas.get(h).getFim().getX());
                        ypoints[1]=((cart.arestas.get(h).getFim().getY()));
                        gc.strokePolyline(xpoints, ypoints, 2);
                    }
                }*/
            }
        }
        //System.out.println(Arrays.toString(xpoints));
        //System.out.println(Arrays.toString(ypoints));
        
        
        gc.restore();
        
    }
    
    private void desenhaFiguraPorArestaTopo(GraphicsContext gc, caractere cart) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        for(int k = 0; k < cart.faces.size(); k++){
            if(cart.faces.get(k).isVisivel()){
                for(int i = 0; i < cart.arestas.size(); i++){
                    xpoints[0]=(cart.arestas.get(i).getInicio().getX());
                    ypoints[0]=((cart.arestas.get(i).getInicio().getZ()));

                    xpoints[1]=(cart.arestas.get(i).getFim().getX());
                    ypoints[1]=((cart.arestas.get(i).getFim().getZ()));
                    gc.strokePolyline(xpoints, ypoints, 2);
                }
            }
        }
        //System.out.println(Arrays.toString(xpoints));
        //System.out.println(Arrays.toString(ypoints));
        
        
        gc.restore();
        
    }
    
    private void desenhaFiguraPorArestaLateral(GraphicsContext gc, caractere cart) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        for(int k = 0; k < cart.faces.size(); k++){
            if(cart.faces.get(k).isVisivel()){
                for(int i = 0; i < cart.arestas.size(); i++){
                    xpoints[0]=(cart.arestas.get(i).getInicio().getZ());
                    ypoints[0]=((cart.arestas.get(i).getInicio().getY()));

                    xpoints[1]=(cart.arestas.get(i).getFim().getZ());
                    ypoints[1]=((cart.arestas.get(i).getFim().getY()));
                    gc.strokePolyline(xpoints, ypoints, 2);
                }
            }
        }
        //System.out.println(Arrays.toString(xpoints));
        //System.out.println(Arrays.toString(ypoints));
        
        
        gc.restore();
        
    }

    private void ctrlVRP2SRU(ctrlCam ct, ArrayList<caractere> refactChars, GraphicsContext gc, Point3D VRP, Point3D P, Point3D Y, boolean projecao){
        ct.setVRP(VRP.getX(), VRP.getY(), VRP.getZ());
        ct.setP(P.getX(), P.getY(), P.getZ());
        ct.setYc(Y.getX(), Y.getY(), Y.getZ());
        ct.setDp(21);
        ct.setViewport(0, 0, 80*refactChars.size(), 199);
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
    
    private void ctrlVRP2SRUParaUmCaractere(caractere modificado, ctrlCam ct, ArrayList<caractere> refactChars, GraphicsContext gc, Point3D VRP, Point3D P, Point3D Y, boolean projecao){
        ct.setVRP(VRP.getX(), VRP.getY(), VRP.getZ());
        ct.setP(P.getX(), P.getY(), P.getZ());
        ct.setYc(Y.getX(), Y.getY(), Y.getZ());
        ct.setDp(21);
        ct.setViewport(0, 0, 80*refactChars.size(), 199);
        ct.setWindow(-2*refactChars.size()-2, -2-1, 2*refactChars.size()+2, 2+1);
        
        if(!projecao){
            ct.setPPLxMT(ct.getPipeline_SRU2SRTNormal(), getMatPts(modificado));
            refact(modificado, ct);
        }else{
            ct.setPPLxMT(ct.getPipeline_SRU2SRT(), getMatPts(modificado));
            refact(modificado, ct);
        }
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
    
    public void invertChar(caractere charParaConta, ctrlCam camera, caractere charParaInverter){
        double[][] matPts = getMatPts(charParaConta);
        
        matPts = mulM1M2(camera.matrizInversa(camera.getMJp()),matPts);
        
        for(int i = 0; i < charParaInverter.vertices.size(); i++){
            charParaInverter.vertices.get(i).setVertice(matPts[0][i], matPts[1][i], matPts[2][i]);
        }
    }
    
    public void copiaVertices(caractere receptor, caractere doador){
        for(int i = 0; i < receptor.vertices.size(); i++){
            receptor.vertices.get(i).setVertice(doador.vertices.get(i).getX(), doador.vertices.get(i).getY(), doador.vertices.get(i).getZ());
        }
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
    
    public void salvaString(ArrayList<caractere> caracteres){
        try {
            File arquivo = new File("cu.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
            
            FileWriter escritor = new FileWriter(arquivo);
            
            for(int i = 0; i < caracteres.size(); i++){
                escritor.write(i + "\n" + caracteres.get(i).letra + "\n");
                for(int k = 0; k < caracteres.get(i).vertices.size(); k++){
                    escritor.write(caracteres.get(i).vertices.get(k).ponto.toString() + "\n");
                }
                escritor.write("\n");
            }           
            escritor.close();
            System.out.println("Dados salvos no arquivo com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }
    }
    
    
}

