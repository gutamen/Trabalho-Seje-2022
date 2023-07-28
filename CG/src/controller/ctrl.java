/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import estrutura.aresta;
import estrutura.face;
import estrutura.fakeHash;
import estrutura.vertice;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;



/**
 *
 * @author macedo
 */
public class ctrl extends Application {
    int selectedChar;
    long localX, localY;
    boolean mouseApertado;
    boolean carregado = false;
    Button btConfirm;
    Button save;
    Button load;        
    CheckBox setFaceOcult;
    ChoiceBox choice;
    TextArea txConfirmString;
    Spinner<Integer> setZ;
    Text txZ;
    TextArea ka;
    TextArea kd;
    TextArea ks;
    TextArea n;
    Text txka;
    Text txkd;
    Text txks; 
    Text txn;
    Text txChar;
    Spinner<String> getChar;
    SpinnerValueFactory<String> strChar;
    Button next;
    Button prev;
    TextArea choiceChar;
    int nn;
    
    iluminacao ilum;
    
    ToggleGroup selecaoComando; 
    RadioButton botaoTranslacao;
    RadioButton botaoRotacao;
    RadioButton botaoEscala;
    
    ToggleGroup selecaoString;
    RadioButton botaoTodaString;
    RadioButton botaoLetra;
    
    ArrayList<caractere> carregamento   = new ArrayList<>();
    ArrayList<caractere> chars          = new ArrayList<>();
    ArrayList<caractere> refactChars1   = new ArrayList<>();
    ArrayList<caractere> refactChars2   = new ArrayList<>();
    ArrayList<caractere> refactChars3   = new ArrayList<>();
    ArrayList<caractere> refactChars4   = new ArrayList<>();
    ArrayList<ArrayList<caractere>> refactCharsAll;
    
    final static Point3D viewUP = new Point3D(0,1,0);
        
    final static Point3D VRPFrente      = new Point3D(0, 0, 19);
    final static Point3D VRPTopo        = new Point3D(0, 19, 0);
    final static Point3D VRPLado        = new Point3D(19, 0, 0);
    
    final static Point3D PFrente        = new Point3D(0, 0, -2);
    final static Point3D PTopo          = new Point3D(0, -2, 0);
    final static Point3D PLado          = new Point3D(-2, 0, 0);
    Point3D PPerspectiva                = new Point3D(0, 0, -2);
    
    Point3D VRPPerspectiva = new Point3D(0, 0, -19);
    
    final static double dPNormal = 21;
    double dPPerspectiva = 21;
    
    ctrlCam ct1;
    ctrlCam ct2;
    ctrlCam ct3;
    ctrlCam ct4;
    
    Point3D lugarLuz = new Point3D(0,0,19);
    int[] Il;
    int[] Ila;
    
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
        choice.getItems().addAll("WireFrame", "Pintor", "Constante", "Phong");
        txConfirmString = new TextArea();
        //escala para 1 para 0.2
        setZ = new Spinner(1, 50, 1);
        txZ = new Text("profundidade Z");
        txka = new Text("ka");
        txkd = new Text("kd");
        txks = new Text("ks");
        txn = new Text("n");
        ka = new TextArea();
        ks = new TextArea();
        kd = new TextArea();
        n = new TextArea();
        txChar = new Text("CHAR");
        next = new Button("NXT");
        prev = new Button("PRV");
        choiceChar = new TextArea();
        
        txZ.setLayoutX(765);
        txZ.setLayoutY(115);
        
        txka.setLayoutX(700);
        txka.setLayoutY(568);
        
        txkd.setLayoutX(700);
        txkd.setLayoutY(596);
        
        txks.setLayoutX(700);
        txks.setLayoutY(626);
        
        txn.setLayoutX(704);
        txn.setLayoutY(650);
        
        txChar.setLayoutX(820);
        txChar.setLayoutY(548);
        
        choiceChar.setMinSize(0, 0);
        choiceChar.setMaxSize(44, 28);
        choiceChar.setLayoutX(818);
        choiceChar.setLayoutY(574);
        
        next.setMinSize(0, 0);
        next.setMaxSize(70, 28);
        next.setLayoutX(818);
        next.setLayoutY(550);
        
        prev.setMinSize(0, 0);
        prev.setMaxSize(70, 28);
        prev.setLayoutX(818);
        prev.setLayoutY(602);
        
        
        ka.setLayoutX(724);
        ka.setLayoutY(550);
        ka.setMinSize(0, 0);
        ka.setMaxSize(70, 28);
        
        ks.setLayoutX(724);
        ks.setLayoutY(578);
        ks.setMinSize(0, 0);
        ks.setMaxSize(70, 28);
        
        kd.setLayoutX(724);
        kd.setLayoutY(606);
        kd.setMinSize(0, 0);
        kd.setMaxSize(70, 28);
        
        n.setLayoutX(724);
        n.setLayoutY(634);
        n.setMinSize(0, 0);
        n.setMaxSize(70, 28);
        
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
        
        selecaoComando  = new ToggleGroup();
        botaoTranslacao = new RadioButton("Translation");
        botaoTranslacao.setSelected(true);
        botaoTranslacao.setToggleGroup(selecaoComando);
        botaoRotacao    = new RadioButton("Rotation");
        botaoRotacao.setToggleGroup(selecaoComando);
        botaoEscala     = new RadioButton("Escala");
        botaoEscala.setToggleGroup(selecaoComando);
        
        selecaoString   = new ToggleGroup();
        botaoTodaString = new RadioButton("String");
        botaoTodaString.setToggleGroup(selecaoString);
        botaoLetra      = new RadioButton("Letter");
        botaoLetra.setSelected(true);
        botaoLetra.setToggleGroup(selecaoString);
        
        botaoTranslacao.setLayoutX(720);
        botaoTranslacao.setLayoutY(230);
        
        botaoRotacao.setLayoutX(720);
        botaoRotacao.setLayoutY(250);
        
        botaoEscala.setLayoutX(720);
        botaoEscala.setLayoutY(270);
        
        botaoTodaString.setLayoutX(720);
        botaoTodaString.setLayoutY(320);
        
        botaoLetra.setLayoutX(720);
        botaoLetra.setLayoutY(340);
        
        
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
        root.getChildren().add(botaoTranslacao);
        root.getChildren().add(botaoRotacao);
        root.getChildren().add(botaoEscala);
        root.getChildren().add(botaoTodaString);
        root.getChildren().add(botaoLetra);
        root.getChildren().add(ka);
        root.getChildren().add(kd);
        root.getChildren().add(ks);
        root.getChildren().add(n);
        root.getChildren().add(txka);
        root.getChildren().add(txkd);
        root.getChildren().add(txks);
        root.getChildren().add(txn);
        root.getChildren().add(txChar);
        root.getChildren().add(next);
        root.getChildren().add(prev);
        root.getChildren().add(choiceChar);

        nn = 0;
        
        choice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evento) {
                if("WireFrame".equals(choice.getValue().toString())){
                    setFaceOcult.setSelected(false);
                    setFaceOcult.setDisable(false);
                }else if("Pintor".equals(choice.getValue().toString())){
                    setFaceOcult.setSelected(false);
                    setFaceOcult.setDisable(true);
                }else if("Constante".equals(choice.getValue().toString())){
                    setFaceOcult.setSelected(true);
                    setFaceOcult.setDisable(true);
                }else if("Phong".equals(choice.getValue().toString())){
                    setFaceOcult.setSelected(true);
                    setFaceOcult.setDisable(true);
                } 
                else{
                    setFaceOcult.setSelected(false);
                    setFaceOcult.setDisable(false);
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
            root.getChildren().add(botaoTranslacao);
            root.getChildren().add(botaoRotacao);
            root.getChildren().add(botaoEscala);
            root.getChildren().add(botaoTodaString);
            root.getChildren().add(botaoLetra);
            root.getChildren().add(ka);
            root.getChildren().add(kd);
            root.getChildren().add(ks);
            root.getChildren().add(n);
            root.getChildren().add(txka);
            root.getChildren().add(txkd);
            root.getChildren().add(txks);
            root.getChildren().add(txn);
            root.getChildren().add(txChar);
            root.getChildren().add(next);
            root.getChildren().add(prev);
            
            nn=0;
            choiceChar.setText(txConfirmString.getText().subSequence(nn, nn+1).toString().toUpperCase());
            root.getChildren().add(choiceChar);
            
            
            trueStart(stage, root, txConfirmString.getText(), scene, choice.getValue().toString(), setFaceOcult.selectedProperty().get(), setZ.getValue()*(-0.2));
        });
        
        
    
        load.setOnAction((ActionEvent evento) -> {
            System.out.println("load");
            
            root.getChildren().clear();
            root.getChildren().add(txConfirmString);
            root.getChildren().add(btConfirm);
            root.getChildren().add(save);
            root.getChildren().add(load);
            root.getChildren().add(setZ);
            root.getChildren().add(setFaceOcult);
            root.getChildren().add(choice);
            root.getChildren().add(txZ);
            root.getChildren().add(botaoTranslacao);
            root.getChildren().add(botaoRotacao);
            root.getChildren().add(botaoEscala);
            root.getChildren().add(botaoTodaString);
            root.getChildren().add(botaoLetra);
            root.getChildren().add(ka);
            root.getChildren().add(kd);
            root.getChildren().add(ks);
            root.getChildren().add(n);
            root.getChildren().add(txka);
            root.getChildren().add(txkd);
            root.getChildren().add(txks);
            root.getChildren().add(txn);
            root.getChildren().add(getChar);
            root.getChildren().add(txChar);
            root.getChildren().add(next);
            root.getChildren().add(prev);
            root.getChildren().add(choiceChar);


            carregado = true;
            carregamento = controleArquivo.carregaArquivo(stage);
            
            System.out.println(carregamento.size());
            trueStart(stage, root, txConfirmString.getText(), scene, choice.getValue().toString(), setFaceOcult.selectedProperty().get(), setZ.getValue()*(-0.2));
        });
    
        save.setOnAction((ActionEvent evento) -> {
            System.out.println("save");
            
            controleArquivo.salvaArquivo(chars, stage);
            
        });
    
        next.setOnAction((ActionEvent evento) -> {
            nn++;
            choiceChar.setText(txConfirmString.getText().subSequence(nn, nn+1).toString().toUpperCase());
            
        });
        
        prev.setOnAction((ActionEvent evento) -> {    
            nn--;
            choiceChar.setText(txConfirmString.getText().subSequence(nn, nn+1).toString().toUpperCase());
        });    
    }
    
    private void trueStart(Stage stage, Group root, String readed, Scene scene, String metodChoice, Boolean faceOcult, Double scaleZ){
       
        readed = readed.toLowerCase();
        
        
        chars = new ArrayList<>();
        
        
        
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
        
        
        
        tela2String(chars.size(), chars);
        
        //Group root = new Group();
        //Scene scene = new Scene(root, 1920, 1080, Color.WHITE);
        
        ct1 = new ctrlCam();
        ct2 = new ctrlCam();
        ct3 = new ctrlCam();
        ct4 = new ctrlCam();
        
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
        
        refactChars1 = new ArrayList<caractere>();
        refactChars2 = new ArrayList<caractere>();
        refactChars3 = new ArrayList<caractere>();
        refactChars4 = new ArrayList<caractere>();
        
        
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
        
        if(carregado){
            System.out.println("cy");
            chars = carregamento;
            carregado = false;
            refactChars1.clear();
            refactChars2.clear();
            refactChars3.clear();
            refactChars4.clear();
                    
            for(int i = 0; i < chars.size(); i++){
                refactChars1.add(chars.get(i).copia());
                refactChars2.add(chars.get(i).copia());
                refactChars3.add(chars.get(i).copia());
                refactChars4.add(chars.get(i).copia());
            }
        }
        
        
        refactCharsAll = new  ArrayList<>();
        refactCharsAll.add(refactChars1);
        refactCharsAll.add(refactChars2);
        refactCharsAll.add(refactChars3);
        refactCharsAll.add(refactChars4);
        
        // Função teste de visibilidade de face
        if(faceOcult){
            faceTestVisibilit(refactCharsAll, chars, VRPFrente, VRPTopo, VRPLado, VRPPerspectiva);
        }
        
        ilum = new iluminacao();
        ilum.normVertFace(refactChars1.get(0).faces, "A");
        //ilum.normVertFace(refactChars1.get(1).faces, "A");
        
        // VRP, P, Y, booelan projecao
        ctrlVRP2SRU(ct1, refactChars1, VRPFrente       , PFrente       , viewUP, dPNormal       , 1);
        ctrlVRP2SRU(ct2, refactChars2, VRPTopo         , PTopo         , viewUP, dPNormal       , 2);
        ctrlVRP2SRU(ct3, refactChars3, VRPLado         , PLado         , viewUP, dPNormal       , 3);
        ctrlVRP2SRU(ct4, refactChars4, VRPPerspectiva  , PPerspectiva  , viewUP, dPPerspectiva  , 4);
        
        int[] sIl = {200, 120, 150}; 
        int[] sIla = {80, 100, 0};
        
        Il = sIl; 
        Ila = sIla;
        
        //ilum.iluminacaoConstante(canvas4, refactChars4, chars, new Point3D(-2, 2, 30), Il, Ila, VRPPerspectiva);
        
        
        if("Pintor".equals(metodChoice)){
            painter(refactChars4, canvas4);
        }else if("Phong".equals(metodChoice)){
            ilum.iluminacaoPhong(canvas4, refactChars4, chars, lugarLuz, Il, Ila, VRPPerspectiva);
        }else if("Constante".equals(metodChoice)){
            ilum.iluminacaoConstante(canvas4, refactChars4, chars, lugarLuz, Il, Ila, VRPPerspectiva);
        }
        
        
        
        for(int i = 0; i < refactChars1.size(); i++){
            System.out.println(refactChars1.get(i).letra);
            desenhaFiguraPorAresta(gc1, refactChars1.get(i));
            desenhaFiguraPorArestaTopo(gc2, refactChars2.get(i));
            desenhaFiguraPorArestaLateral(gc3, refactChars3.get(i));
            
            if("WireFrame".equals(metodChoice)){
                desenhaFiguraPorAresta(gc4, refactChars4.get(i));
            }
        }
        
        
        controleEventoCanvas.insereComportamento(canvas1, canvas2, canvas3, canvas4, this);
        
        
        
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
        
    public void painter(ArrayList<caractere> refactChars, Canvas canvas4){
        ArrayList<fakeHash> arrayListHash = new ArrayList<fakeHash>();
        double zTest = Double.MAX_VALUE;
        fakeHash listHash;
        for(int g = 0; g < refactChars.size(); g++){//qts de chars dentro do refactChars, size = qts string de entrada
            for(int y = 0; y < refactChars.get(g).vertices.size(); y++){
                if(zTest > refactChars.get(g).vertices.get(y).getZ()){
                    zTest = refactChars.get(g).vertices.get(y).getZ();
                }
            }
            listHash = new fakeHash(refactChars.get(g), zTest);
            arrayListHash.add(listHash);
            zTest = Double.MAX_VALUE;
        }
//        System.out.println("under");
//        for(int u = 0; u < arrayListHash.size(); u++){
//            System.out.println(arrayListHash.get(u).chars.letra);
//            
//            System.out.println(arrayListHash.get(u).val);
//        }
        
        quickSort(arrayListHash, 0, arrayListHash.size()-1);
        
//        System.out.println("after +++++");
//        for(int uu = 0; uu < arrayListHash.size(); uu++){
//            System.out.println(arrayListHash.get(uu).chars.letra);
//            System.out.println(arrayListHash.get(uu).val);
//        }
        
        ArrayList<fakeHash> listFace = new ArrayList<fakeHash>();
        zTest = Double.MAX_VALUE;
        
        GraphicsContext poly = canvas4.getGraphicsContext2D();

        poly.clearRect(0, 0, canvas4.getWidth(), canvas4.getHeight());
        
        for(int g = 0; g < arrayListHash.size(); g++){
            for(int j = 0; j < arrayListHash.get(g).chars.faces.size(); j ++){
                if(arrayListHash.get(g).chars.faces.get(j).isVisivel()){
                    aresta k = arrayListHash.get(g).chars.faces.get(j).getArestaFace();
                    int o = 0;

                    boolean rigth = false;
                    for(aresta p = new aresta("null"); !k.getNomeAresta().equals(p.getNomeAresta()); o++){//andando nas arestas da face
                        if(o < 1){
                            p = k;
                        }

                        if(rigth){
                            if(zTest > p.getFim().ponto.getZ()){
                                zTest = p.getFim().ponto.getZ();
                            }
                        }else{
                            if(zTest > p.getInicio().ponto.getZ()){
                                zTest = p.getInicio().ponto.getZ();
                            } 
                        }

                        if(p.getDireita().getNomeFace().equals(arrayListHash.get(g).chars.faces.get(j).getNomeFace())){
                            p = p.getArestaDireitaSuc();
                            rigth = true;
                        }else{
                            p = p.getArestaEsquerdaSuc();
                            rigth = false;
                        }
                    }
                    listHash = new fakeHash(arrayListHash.get(g).chars, arrayListHash.get(g).chars.faces.get(j), zTest);

//                    System.out.println("face ="+arrayListHash.get(g).chars.faces.get(j).getNomeFace()+" and ="
//                    +zTest);
//                    System.out.println("j = "+j);
                    listFace.add(listHash);
                    zTest = Double.MAX_VALUE;
                }
            }
            quickSort(listFace, 0, listFace.size()-1);
            
//            System.out.println("=============================");
//            System.out.println("size ="+listFace.size());
//            for(int j = 0; j < listFace.size(); j ++){
//                System.out.println("face ="+listFace.get(j).face.getNomeFace()+" and ="
//                +listFace.get(j).val+" char = "+listFace.get(j).chars.letra);
//            }
//            System.out.println("+++++++++++++++++++++++++++++++++++");
//            
            for(int j = 0; j < listFace.size(); j ++){
                ArrayList<vertice> faceVertice = new ArrayList<vertice>();
                aresta k = listFace.get(j).face.getArestaFace();
                int o = 0;

                boolean rigth = false;
                for(aresta p = new aresta("null"); !k.getNomeAresta().equals(p.getNomeAresta()); o++){
                    if(o < 1){
                        p = k;
                    }

                    if(rigth){
                        faceVertice.add(p.getFim());
                    }else{ 
                        faceVertice.add(p.getInicio());
                    }

                    if(p.getDireita().getNomeFace().equals(listFace.get(j).face.getNomeFace())){
                        p = p.getArestaDireitaSuc();
                        rigth = true;
                    }else{
                        p = p.getArestaEsquerdaSuc();
                        rigth = false;
                    }
                }
//                System.out.println("---------------------------------");
                double[] x = new double[faceVertice.size()];
                double[] y = new double[faceVertice.size()];
                for(int q = 0; q < faceVertice.toArray().length; q++){
                    x[q] = faceVertice.get(q).getX();
                    y[q] = faceVertice.get(q).getY();
                }
                poly.setFill(Color.BLACK);
                poly.fillPolygon(x, y, faceVertice.size());
                if(listFace.get(j).face.temBuraco()){
                    face buraco = listFace.get(j).face;
                    
                    
                    for(int teste = 0; teste < buraco.quantosBuracos; teste++){
                        ArrayList<Double> xis = new ArrayList();
                        ArrayList<Double> yis = new ArrayList();
                        aresta doBuraco = new aresta("null");
                        boolean inicializa = true;
                        
                        for(;!doBuraco.equals(buraco.arestaBuraco()[teste]); ){
                            if(inicializa){
                                inicializa = false;
                                doBuraco = buraco.arestaBuraco()[teste];
                            }                          
                            xis.add(doBuraco.getInicio().getX());
                            yis.add(doBuraco.getInicio().getY());
                            doBuraco = doBuraco.getArestaEsquerdaSuc();
                        }
                        
                        double[] xs = new double[xis.size()];
                        double[] ys = new double[yis.size()];
                        for(int realoca = 0; realoca < xis.size(); realoca++){
                            xs[realoca] = xis.get(realoca);
                            ys[realoca] = yis.get(realoca);
                        }
                        poly.setFill(Color.WHITE);
                        poly.fillPolygon(xs, ys, xis.size());
                        
                    }
                    
                }
            }
            listFace.clear();
        }
        poly.restore();
    }
    
    public void quickSort(ArrayList<fakeHash> arrayListHash, int init, int last){
        if(init < last){
            int posPivo = split(arrayListHash, init, last);
            quickSort(arrayListHash, init, posPivo - 1);
            quickSort(arrayListHash, posPivo + 1, last);
        }
    }
    
    public int split(ArrayList<fakeHash> arrayListHash, int init, int last){
        fakeHash pivo = arrayListHash.get(init);
        int i = init + 1;
        int f = last;
        while(i <= f){
            if(arrayListHash.get(i).val <= pivo.val){
                i++;
            }else if(pivo.val < arrayListHash.get(f).val){
                f--;
            }else{
                fakeHash swap = arrayListHash.get(i);
                arrayListHash.set(i, arrayListHash.get(f));
                arrayListHash.set(f, swap);
                i++;
                f--;
            }
        }
        arrayListHash.set(init, arrayListHash.get(f));
        arrayListHash.set(f, pivo);
        return f;
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
    
    public void faceTestVisibilit(ArrayList<ArrayList<caractere>> refactChars, ArrayList<caractere> chars, Point3D vrp1, Point3D vrp2, Point3D vrp3, Point3D vrp4){
        ArrayList<vertice> vertList;
        
        for(int i = 0; i < chars.size(); i++){
            for(int j = 0; j < chars.get(i).faces.size(); j ++){
                aresta k = chars.get(i).faces.get(j).getArestaFace();
                int o = 0;
                
                /*if(true){*/
//                    System.out.println("j = "+j);
                    boolean rigth = false;
                    /*for(aresta p = new aresta("null"); !k.getNomeAresta().equals(p.getNomeAresta()); o++){
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
                    }*/
                    vertList = chars.get(i).faces.get(j).verticesFace();
//                    System.out.println(" entro aqui");
                    
                    allInOne(refactChars, vertList, vrp1, vrp2, vrp3, vrp4, i, j, "notinterna");
                /*}else{
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
//        for(int l = 0; l < vertList.size(); l++){
//            System.out.println(vertList.get(l).ponto);
//        }

        double xc, yc, zc;
//        System.out.println("vertice tam = "+vertList.size());
        xc = (makeCentroid(vertList, "min").getX()+makeCentroid(vertList, "max").getX())/2;
        yc = (makeCentroid(vertList, "min").getY()+makeCentroid(vertList, "max").getY())/2;
        zc = (makeCentroid(vertList, "min").getZ()+makeCentroid(vertList, "max").getZ())/2;
        
//        System.out.println("xc = "+xc);
//        System.out.println("yc = "+yc);
//        System.out.println("zc = "+zc);
//        
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

        Point3D vect1 = vertList.get(1).ponto.subtract(vertList.get(0).ponto);
        Point3D vect2 = vertList.get(vertList.size()-1).ponto.subtract(vertList.get(0).ponto);

//        System.out.println("vect1 = "+vect1);
//        System.out.println("vect2 = "+vect2);
        /*
        i   j  k  
        u1 u2 u3  
        v1 v2 v3
        */
        Point3D vectN = null;
        /*
        if("notinterna".equals(type)){
            vectN = vectN = vect1.crossProduct(vect2);
        }else if("interna".contains(type)){
            vectN = vectN = vect2.crossProduct(vect1); 
        }*/
        vectN = vect1.crossProduct(vect2);
        
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

        ArrayList<Double> norms = new ArrayList();
        norms.add(normOxnormN1);
        norms.add(normOxnormN2);
        norms.add(normOxnormN3);
        norms.add(normOxnormN4);

        System.out.println("j = "+j);
        System.out.println("i = "+i);
        System.out.println("centr = "+centroidFace);

        for(int fg = 0; fg < refactChars.size(); fg++){
            System.out.println("norms = "+norms.get(fg));
            if(norms.get(fg) > 0){
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
    
    public void desenhaFiguraPorAresta(GraphicsContext gc, caractere cart) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        for(int k = 0; k < cart.faces.size(); k++){
            if(cart.faces.get(k).isVisivel()){
                boolean aux = true;
                aresta j = new aresta("null");
                for(aresta i = cart.faces.get(k).getArestaFace(); !i.equals(j);){
                    if(aux){
                        j = i;
                        aux = false;
                    }
                    if(j.getDireita().equals(cart.faces.get(k))){
                        j = j.getArestaDireitaSuc();
                    }else{
                        j = j.getArestaEsquerdaSuc();
                    }
                    xpoints[0]=(j.getInicio().getX());
                    ypoints[0]=((j.getInicio().getY()));

                    xpoints[1]=(j.getFim().getX());
                    ypoints[1]=((j.getFim().getY()));
                    gc.strokePolyline(xpoints, ypoints, 2);
                    
                    if(cart.faces.get(k).temBuraco()){
                        for(int inter = 0; inter < cart.arestasInternas.size(); inter++){
                            if(cart.arestasInternas.get(inter).getEsquerda().equals(cart.faces.get(k))){                                
                                xpoints[0]=(cart.arestasInternas.get(inter).getInicio().getX());
                                ypoints[0]=((cart.arestasInternas.get(inter).getInicio().getY()));
                                
                                xpoints[1]=(cart.arestasInternas.get(inter).getFim().getX());
                                ypoints[1]=((cart.arestasInternas.get(inter).getFim().getY()));
                                gc.strokePolyline(xpoints, ypoints, 2);
                            }
                        }
                    }
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
    
    public void desenhaFiguraPorArestaTopo(GraphicsContext gc, caractere cart) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        for(int k = 0; k < cart.faces.size(); k++){
            if(cart.faces.get(k).isVisivel()){
                boolean aux = true;
                aresta j = new aresta("null");
                for(aresta i = cart.faces.get(k).getArestaFace(); !i.equals(j);){
                    if(aux){
                        j = i;
                        aux = false;
                    }
                    if(j.getDireita().equals(cart.faces.get(k))){
                        j = j.getArestaDireitaSuc();
                    }else{
                        j = j.getArestaEsquerdaSuc();
                    }
                    xpoints[0]=(j.getInicio().getX());
                    ypoints[0]=((j.getInicio().getZ()));

                    xpoints[1]=(j.getFim().getX());
                    ypoints[1]=((j.getFim().getZ()));
                    gc.strokePolyline(xpoints, ypoints, 2);
                    
                    if(cart.faces.get(k).temBuraco()){
                        for(int inter = 0; inter < cart.arestasInternas.size(); inter++){
                            if(cart.arestasInternas.get(inter).getEsquerda().equals(cart.faces.get(k))){                                
                                xpoints[0]=(cart.arestasInternas.get(inter).getInicio().getX());
                                ypoints[0]=((cart.arestasInternas.get(inter).getInicio().getZ()));
                                
                                xpoints[1]=(cart.arestasInternas.get(inter).getFim().getX());
                                ypoints[1]=((cart.arestasInternas.get(inter).getFim().getZ()));
                                gc.strokePolyline(xpoints, ypoints, 2);
                            }
                        }
                    }
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
    
    public void desenhaFiguraPorArestaLateral(GraphicsContext gc, caractere cart) {    
        double[] xpoints = new double[2];
        double[] ypoints = new double[2];
       
        for(int k = 0; k < cart.faces.size(); k++){
            if(cart.faces.get(k).isVisivel()){
                boolean aux = true;
                aresta j = new aresta("null");
                for(aresta i = cart.faces.get(k).getArestaFace(); !i.equals(j);){
                    if(aux){
                        j = i;
                        aux = false;
                    }
                    if(j.getDireita().equals(cart.faces.get(k))){
                        j = j.getArestaDireitaSuc();
                    }else{
                        j = j.getArestaEsquerdaSuc();
                    }
                    xpoints[0]=(j.getInicio().getZ());
                    ypoints[0]=((j.getInicio().getY()));

                    xpoints[1]=(j.getFim().getZ());
                    ypoints[1]=((j.getFim().getY()));
                    gc.strokePolyline(xpoints, ypoints, 2);
                    
                    if(cart.faces.get(k).temBuraco()){
                        for(int inter = 0; inter < cart.arestasInternas.size(); inter++){
                            if(cart.arestasInternas.get(inter).getEsquerda().equals(cart.faces.get(k))){                                
                                xpoints[0]=(cart.arestasInternas.get(inter).getInicio().getZ());
                                ypoints[0]=((cart.arestasInternas.get(inter).getInicio().getY()));
                                
                                xpoints[1]=(cart.arestasInternas.get(inter).getFim().getZ());
                                ypoints[1]=((cart.arestasInternas.get(inter).getFim().getY()));
                                gc.strokePolyline(xpoints, ypoints, 2);
                            }
                        }
                    }
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

    private void ctrlVRP2SRU(ctrlCam ct, ArrayList<caractere> refactChars, Point3D VRP, Point3D P, Point3D Y, double dP, int projecao){
        ct.setVRP(VRP.getX(), VRP.getY(), VRP.getZ());
        ct.setP(P.getX(), P.getY(), P.getZ());
        ct.setYc(Y.getX(), Y.getY(), Y.getZ());
        ct.setDp(dP);
        ct.setViewport(0, 0, 80*refactChars.size(), 199);
        ct.setWindow(-2*refactChars.size()-2, -2-1, 2*refactChars.size()+2, 2+1);
        
        
        
        if(projecao == 1){
            for(int i = 0; i < refactChars.size(); i++){
                
                ct.setPPLxMT(ct.getPipeline_SRU2SRTNormal(), getMatPts(refactChars.get(i)));
                refact(refactChars.get(i), ct);          
                
            }
        }else if(projecao == 2){
            for(int i = 0; i < refactChars.size(); i++){
                ct.setPPLxMT(ct.getPipeline_SRU2SRTNormalTop(), getMatPts(refactChars.get(i)));
                refact(refactChars.get(i), ct);
            }
        }else if(projecao == 3){
            for(int i = 0; i < refactChars.size(); i++){
                ct.setPPLxMT(ct.getPipeline_SRU2SRTNormalSide(), getMatPts(refactChars.get(i)));
                refact(refactChars.get(i), ct);
            }
        }else if(projecao == 4){
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
    
    public void ctrlVRP2SRUParaUmCaractere(caractere modificado, ctrlCam ct, ArrayList<caractere> refactChars, Point3D VRP, Point3D P, Point3D Y, int projecao){
        ct.setVRP(VRP.getX(), VRP.getY(), VRP.getZ());
        ct.setP(P.getX(), P.getY(), P.getZ());
        ct.setYc(Y.getX(), Y.getY(), Y.getZ());
        ct.setDp(21);
        ct.setViewport(0, 0, 80*refactChars.size(), 199);
        ct.setWindow(-2*refactChars.size()-2, -2-1, 2*refactChars.size()+2, 2+1);
        
        if(projecao == 1){
            ct.setPPLxMT(ct.getPipeline_SRU2SRTNormal(), getMatPts(modificado));
            refact(modificado, ct);
        }else if(projecao == 2){
            ct.setPPLxMT(ct.getPipeline_SRU2SRTNormalTop(), getMatPts(modificado));
            refact(modificado, ct);
        }else if(projecao == 3){
            ct.setPPLxMT(ct.getPipeline_SRU2SRTNormalSide(), getMatPts(modificado));
            refact(modificado, ct);
        }else if(projecao == 4){
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
    
    public double[][] writMat(double[][] matrizR){
        for(int i = 0; i < matrizR.length; i++){
            for(int k = 0; k < matrizR[0].length; k++){
                System.out.print((Double.toString(matrizR[i][k]))+" | ");
            }
            System.out.println("");
        }

        return matrizR;
    }
    
    public void invertChar(caractere charParaConta, ctrlCam camera, caractere charParaInverter, int sentido){
        double[][] matPts = getMatPts(charParaConta);
        
        switch(sentido){
            case 1 -> matPts = mulM1M2(camera.matrizInversa(camera.getMJp()),matPts);
            case 2 -> matPts = mulM1M2(camera.matrizInversa(camera.getMJpTop()),matPts);
            case 3 -> matPts = mulM1M2(camera.matrizInversa(camera.getMJpSide()),matPts);
        }
        
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
    
    
    
    
}

