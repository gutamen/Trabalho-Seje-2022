/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import estrutura.aresta;
import estrutura.face;
import estrutura.fakeHash;
import estrutura.vertice;
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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DialogPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.StageStyle;



/**
 *
 * @author macedo
 */
public class ctrl extends Application {
    
    // Universo
    int Umax = 0, Umin = 0, Vmax = 0, Vmin = 0, larguraCaractere = 80;
    
    
    // controle de tela
    int selectedChar;
    caractere selecao;
    long localX, localY;
    boolean mouseApertado;
    
    
    boolean carregado = false;
    
    Button btConfirm;
    Button save;
    Button load;  
    Button mudancaLuz;
    
    CheckBox setFaceOcult;
    CheckBox projecaoParalela;
    ChoiceBox escolheMetodo;
    
    Spinner<Integer> setZ;
    Text txZ;
    
    TextArea txConfirmString;
    
    
    TextArea caractereSelecionado;
    
    Text textoKa;
    Spinner<Double> taxaKaR;
    Spinner<Double> taxaKaG;
    Spinner<Double> taxaKaB;
    
    Text textoKd;
    Spinner<Double> taxaKdR;
    Spinner<Double> taxaKdG;
    Spinner<Double> taxaKdB;
    
    Text textoKs;
    Spinner<Double> taxaKsR;
    Spinner<Double> taxaKsG;
    Spinner<Double> taxaKsB;
    
    Text textoCoeficienteRefracao;
    Spinner<Double> coeficienteRefracao;
    
    Button confirmaLuz;
    
    
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
    Point3D viewUPPerspectiva = new Point3D(0,1,0);
        
    final static Point3D VRPFrente      = new Point3D(0, 0, 19);
    final static Point3D VRPTopo        = new Point3D(0, 19, 0);
    final static Point3D VRPLado        = new Point3D(19, 0, 0);
    
    final static Point3D PFrente        = new Point3D(0, 0, -2);
    final static Point3D PTopo          = new Point3D(0, -2, 0);
    final static Point3D PLado          = new Point3D(-2, 0, 0);
    Point3D PPerspectiva                = new Point3D(0, 0, -2);
    
    Point3D VRPPerspectiva = new Point3D(0, 0, 19);
    
    
    final static double dPNormal = 21;
    double dPPerspectiva = 21;
    
    ctrlCam ct1;
    ctrlCam ct2;
    ctrlCam ct3;
    ctrlCam ct4;
    
    Canvas canvasFrente = new Canvas(600, 200);
    Canvas canvasTopo = new Canvas(600, 200);
    Canvas canvasLado = new Canvas(600, 200);
    Canvas canvasPerspectiva = new Canvas(600, 200);

    
    Point3D lugarLuz = new Point3D(0,0,19);
    int[] Il = {160, 160,160};
    int[] Ila = {50, 50, 50};
    

    
    @Override public void start(Stage stage) {
        //falseStart(stage);  
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.setFullScreen(false);
        //stage.initModality(Modality.WINDOW_MODAL);
        Group root = new Group();
        Scene scene = new Scene(root, 900, 800, Color.WHITE);
        
        
        intFace(stage, root, scene);
        
    }
    
    public void intFace(Stage stage, Group root, Scene scene){
        
        btConfirm = new Button("Ok");
        save = new Button("Save");
        load = new Button("Load");
        setFaceOcult = new CheckBox("Face Concealment");
        escolheMetodo = new ChoiceBox();
        escolheMetodo.setValue("WireFrame");
        escolheMetodo.getItems().addAll("WireFrame", "Pintor", "Constante", "Phong");
        txConfirmString = new TextArea();
        
        //escala para 1 para 0.2
        
        setZ = new Spinner(1, 50, 1);
        txZ = new Text("profundidade Z");
        
        canvasFrente.setLayoutY(0);
        canvasTopo.setLayoutY(200);
        canvasLado.setLayoutY(400);
        canvasPerspectiva.setLayoutY(600);
        
        txZ.setLayoutX(765);
        txZ.setLayoutY(115);
        
        projecaoParalela = new CheckBox("Parallel Projection");
        projecaoParalela.setMinSize(0, 0);
        projecaoParalela.setMaxSize(200, 50);
        projecaoParalela.setLayoutX(720);
        projecaoParalela.setLayoutY(400);
        
        caractereSelecionado = new TextArea("Selected Char == NULL");
        caractereSelecionado.setLayoutX(695);
        caractereSelecionado.setLayoutY(700);
        caractereSelecionado.setMinSize(0, 0);
        caractereSelecionado.setMaxSize(188, 25);
        
        textoCoeficienteRefracao = new Text("n");
        textoCoeficienteRefracao.setLayoutX(695);
        textoCoeficienteRefracao.setLayoutY(680);
        
        coeficienteRefracao = new Spinner(0, 10, 1, 0.01);
        coeficienteRefracao.setLayoutX(714);
        coeficienteRefracao.setLayoutY(664);
        coeficienteRefracao.setMinSize(0, 0);
        coeficienteRefracao.setMaxSize(62, 28);
        coeficienteRefracao.setDisable(true);
        
        textoKa = new Text("Ka");
        textoKa.setLayoutX(695);
        textoKa.setLayoutY(598);
        
        taxaKaR = new Spinner(0, 1, 0, 0.01);
        taxaKaG = new Spinner(0, 1, 0, 0.01);
        taxaKaB = new Spinner(0, 1, 0, 0.01);
        taxaKaR.setLayoutX(714);
        taxaKaR.setLayoutY(580);
        taxaKaR.setMinSize(0, 0);
        taxaKaR.setMaxSize(62, 28);
        taxaKaG.setLayoutX(776);
        taxaKaG.setLayoutY(580);
        taxaKaG.setMinSize(0, 0);
        taxaKaG.setMaxSize(62, 28);
        taxaKaB.setLayoutX(838);
        taxaKaB.setLayoutY(580);
        taxaKaB.setMinSize(0, 0);
        taxaKaB.setMaxSize(62, 28);
        taxaKaR.setDisable(true);
        taxaKaG.setDisable(true);
        taxaKaB.setDisable(true);
        
        textoKd = new Text("Kd");
        textoKd.setLayoutX(695);
        textoKd.setLayoutY(626);
        
        taxaKdR = new Spinner(0, 1, 0, 0.01);
        taxaKdG = new Spinner(0, 1, 0, 0.01);
        taxaKdB = new Spinner(0, 1, 0, 0.01);
        taxaKdR.setLayoutX(714);
        taxaKdR.setLayoutY(608);
        taxaKdR.setMinSize(0, 0);
        taxaKdR.setMaxSize(62, 28);
        taxaKdG.setLayoutX(776);
        taxaKdG.setLayoutY(608);
        taxaKdG.setMinSize(0, 0);
        taxaKdG.setMaxSize(62, 28);
        taxaKdB.setLayoutX(838);
        taxaKdB.setLayoutY(608);
        taxaKdB.setMinSize(0, 0);
        taxaKdB.setMaxSize(62, 28);
        taxaKdR.setDisable(true);
        taxaKdG.setDisable(true);
        taxaKdB.setDisable(true);
        
        textoKs = new Text("Ks");
        textoKs.setLayoutX(695);
        textoKs.setLayoutY(656);
        
        taxaKsR = new Spinner(0, 1, 0, 0.01);
        taxaKsG = new Spinner(0, 1, 0, 0.01);
        taxaKsB = new Spinner(0, 1, 0, 0.01);
        taxaKsR.setLayoutX(714);
        taxaKsR.setLayoutY(636);
        taxaKsR.setMinSize(0, 0);
        taxaKsR.setMaxSize(62, 28);
        taxaKsG.setLayoutX(776);
        taxaKsG.setLayoutY(636);
        taxaKsG.setMinSize(0, 0);
        taxaKsG.setMaxSize(62, 28);
        taxaKsB.setLayoutX(838);
        taxaKsB.setLayoutY(636);
        taxaKsB.setMinSize(0, 0);
        taxaKsB.setMaxSize(62, 28);
        taxaKsR.setDisable(true);
        taxaKsG.setDisable(true);
        taxaKsB.setDisable(true);
        
        confirmaLuz = new Button("Light Update");
        confirmaLuz.setLayoutX(800);
        confirmaLuz.setLayoutY(664);
        
        setFaceOcult.setMinSize(0, 0);
        setFaceOcult.setMaxSize(200, 50);
        setFaceOcult.setLayoutX(720);
        setFaceOcult.setLayoutY(150);
        
        escolheMetodo.setMinSize(0, 0);
        escolheMetodo.setMaxSize(100, 50);
        escolheMetodo.setLayoutX(720);
        escolheMetodo.setLayoutY(190);
        
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
        botaoEscala     = new RadioButton("Scale");
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
        
        mudancaLuz = new Button("Change of View");
        mudancaLuz.setLayoutX(695);
        mudancaLuz.setLayoutY(750);
        
        stage.setScene(scene);
        stage.show();
        
        root.getChildren().add(txConfirmString);
        root.getChildren().add(btConfirm);
        root.getChildren().add(save);
        root.getChildren().add(load);
        root.getChildren().add(setZ);
        root.getChildren().add(setFaceOcult);
        root.getChildren().add(escolheMetodo);
        root.getChildren().add(txZ);
        root.getChildren().add(botaoTranslacao);
        root.getChildren().add(botaoRotacao);
        root.getChildren().add(botaoEscala);
        root.getChildren().add(botaoTodaString);
        root.getChildren().add(botaoLetra);
        
        root.getChildren().add(projecaoParalela);
        
        root.getChildren().add(caractereSelecionado);
        
        root.getChildren().add(textoKa);
        root.getChildren().add(taxaKaR);
        root.getChildren().add(taxaKaG);
        root.getChildren().add(taxaKaB);
        
        root.getChildren().add(textoKd);
        root.getChildren().add(taxaKdR);
        root.getChildren().add(taxaKdG);
        root.getChildren().add(taxaKdB);
        
        root.getChildren().add(textoKs);
        root.getChildren().add(taxaKsR);
        root.getChildren().add(taxaKsG);
        root.getChildren().add(taxaKsB);
        
        root.getChildren().add(textoCoeficienteRefracao);
        root.getChildren().add(coeficienteRefracao);
        
        root.getChildren().add(confirmaLuz);
        
        root.getChildren().add(mudancaLuz);
        
        root.getChildren().add(canvasFrente);
        root.getChildren().add(canvasTopo);
        root.getChildren().add(canvasLado);
        root.getChildren().add(canvasPerspectiva);

        
        
        escolheMetodo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evento) {
                if(null == escolheMetodo.getValue().toString()){
                    setFaceOcult.setSelected(false);
                    setFaceOcult.setDisable(false);
                }else switch (escolheMetodo.getValue().toString()) {
                    case "WireFrame" -> {
                        setFaceOcult.setSelected(false);
                        setFaceOcult.setDisable(false);
                        if(!refactChars4.isEmpty()){ 
                            for(int i = 0; i < refactChars1.size(); i++){
                                for(int j = 0; j < refactChars1.get(i).faces.size(); j++){
                                    refactChars1.get(i).faces.get(j).setVisivel(true);
                                    refactChars2.get(i).faces.get(j).setVisivel(true);
                                    refactChars3.get(i).faces.get(j).setVisivel(true);
                                    refactChars4.get(i).faces.get(j).setVisivel(true);
                                    chars.get(i).faces.get(j).setVisivel(true);
                                }
                            }    
                            desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), refactChars1);
                            desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), refactChars3);
                            desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), refactChars2);
                            desenhaStringPorAresta( canvasPerspectiva.getGraphicsContext2D(), refactChars4);
                        }
                        
                    }
                    case "Pintor" -> {
                        setFaceOcult.setSelected(false);
                        setFaceOcult.setDisable(true);
                    }
                    case "Constante" -> {
                        setFaceOcult.setSelected(true);
                        setFaceOcult.setDisable(true);
                        if(setFaceOcult.isSelected()){
                            testeVisibilidade(chars, refactChars1, ctrl.VRPFrente);
                            testeVisibilidade(chars, refactChars2, ctrl.VRPTopo);
                            testeVisibilidade(chars, refactChars3, ctrl.VRPLado);
                            testeVisibilidade(chars, refactChars4, VRPPerspectiva);
                        }
                        if(!refactChars4.isEmpty()){
                            iluminacao.iluminacaoConstante(canvasPerspectiva, refactChars4, chars, lugarLuz, Il, Ila, viewUP);
                            desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), refactChars1);
                            desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), refactChars3);
                            desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), refactChars2);
                        }
                    }
                    case "Phong" -> {
                        setFaceOcult.setSelected(true);
                        setFaceOcult.setDisable(true);
                        if(setFaceOcult.isSelected()){
                            testeVisibilidade(chars, refactChars1, ctrl.VRPFrente);
                            testeVisibilidade(chars, refactChars2, ctrl.VRPTopo);
                            testeVisibilidade(chars, refactChars3, ctrl.VRPLado);
                            testeVisibilidade(chars, refactChars4, VRPPerspectiva);
                        }
                        if(!refactChars4.isEmpty()){
                            iluminacao.iluminacaoPhong(canvasPerspectiva, refactChars4, chars, lugarLuz, Il, Ila, viewUP);
                            desenhaStringPorAresta(canvasFrente.getGraphicsContext2D(), refactChars1);
                            desenhaStringPorArestaLado(canvasLado.getGraphicsContext2D(), refactChars3);
                            desenhaStringPorArestaTopo(canvasTopo.getGraphicsContext2D(), refactChars2);
                        }
                    }
                    default -> {
                        setFaceOcult.setSelected(false);
                        setFaceOcult.setDisable(false);
                    }
                }
            }
        });
        
        btConfirm.setOnAction((ActionEvent evento) -> {
            trueStart(txConfirmString.getText(), setFaceOcult.selectedProperty().get(), setZ.getValue()*(-0.2));
        });
        
        mudancaLuz.setOnAction((ActionEvent evento) -> {
            Alert alteracao = new Alert(Alert.AlertType.CONFIRMATION);
            Group editores = new Group();
            
            Text labelVRP = new Text("VRP (X, Y, Z)");
            Spinner<Double> XVRP = new Spinner(-100,100,0,0.1);
            Spinner<Double> YVRP = new Spinner(-100,100,0, 0.1);
            Spinner<Double> ZVRP = new Spinner(-100,100,0,0.1);
            XVRP.setLayoutY(5);
            YVRP.setLayoutY(5);
            YVRP.setLayoutX(63);
            ZVRP.setLayoutY(5);
            ZVRP.setLayoutX(125);
            XVRP.setMaxSize(62, 5);
            YVRP.setMaxSize(62, 5);
            ZVRP.setMaxSize(62, 5);
            XVRP.getValueFactory().setValue(VRPPerspectiva.getX());
            YVRP.getValueFactory().setValue(VRPPerspectiva.getY());
            ZVRP.getValueFactory().setValue(VRPPerspectiva.getZ());
            
            Text labelL = new Text("L   (X, Y, Z)");
            labelL.setLayoutX(200);
            Spinner<Double> XL = new Spinner(-100,100,0,0.1);
            Spinner<Double> YL = new Spinner(-100,100,0,0.1);
            Spinner<Double> ZL = new Spinner(-100,100,0,0.1);
            XL.setLayoutX(200);
            XL.setLayoutY(5);
            YL.setLayoutX(263);
            YL.setLayoutY(5);
            ZL.setLayoutX(325);
            ZL.setLayoutY(5);
            XL.setMaxSize(62, 5);
            YL.setMaxSize(62, 5);
            ZL.setMaxSize(62, 5);
            XL.getValueFactory().setValue(lugarLuz.getX());
            YL.getValueFactory().setValue(lugarLuz.getY());
            ZL.getValueFactory().setValue(lugarLuz.getZ());

            Text labelILa = new Text("Ambient Light (R, G, B)");
            labelILa.setLayoutY(42);
            Spinner<Integer> ILaR = new Spinner(0,255,0,1);
            Spinner<Integer> ILaG = new Spinner(0,255,0,1);
            Spinner<Integer> ILaB = new Spinner(0,255,0,1);
            ILaR.setLayoutY(47);
            ILaG.setLayoutX(63);
            ILaG.setLayoutY(47);
            ILaB.setLayoutX(125);
            ILaB.setLayoutY(47);
            ILaR.setMaxSize(62, 5);
            ILaG.setMaxSize(62, 5);
            ILaB.setMaxSize(62, 5);
            ILaR.getValueFactory().setValue(Ila[0]);
            ILaG.getValueFactory().setValue(Ila[1]);
            ILaB.getValueFactory().setValue(Ila[2]);
            
            Text labelIL = new Text("Light (R, G, B)");
            labelIL.setLayoutX(200);
            labelIL.setLayoutY(42);
            Spinner<Integer> ILR = new Spinner(0,255,0,1);
            Spinner<Integer> ILG = new Spinner(0,255,0,1);
            Spinner<Integer> ILB = new Spinner(0,255,0,1);
            ILR.setLayoutY(47);
            ILR.setLayoutX(200);
            ILG.setLayoutX(263);
            ILG.setLayoutY(47);
            ILB.setLayoutX(325);
            ILB.setLayoutY(47);
            ILR.setMaxSize(62, 5);
            ILG.setMaxSize(62, 5);
            ILB.setMaxSize(62, 5);
            ILR.getValueFactory().setValue(Il[0]);
            ILG.getValueFactory().setValue(Il[1]);
            ILB.getValueFactory().setValue(Il[2]);
            
            Text labelView = new Text("View Up (X, Y, Z)");
            labelView.setLayoutY(84);
            Spinner<Double> XView = new Spinner(-100,100,0,0.1);
            Spinner<Double> YView = new Spinner(-100,100,0, 0.1);
            Spinner<Double> ZView = new Spinner(-100,100,0,0.1);
            XView.setLayoutY(89);
            YView.setLayoutX(63);
            YView.setLayoutY(89);
            ZView.setLayoutX(125);
            ZView.setLayoutY(89);
            XView.setMaxSize(62, 5);
            YView.setMaxSize(62, 5);
            ZView.setMaxSize(62, 5);
            XView.getValueFactory().setValue(viewUPPerspectiva.getX());
            YView.getValueFactory().setValue(viewUPPerspectiva.getY());
            ZView.getValueFactory().setValue(viewUPPerspectiva.getZ());
            
            Text labelU = new Text("U Min   Max");
            labelU.setLayoutY(126);
            Spinner<Integer> UminS = new Spinner(-100,0,0,1);
            Spinner<Integer> UmaxS = new Spinner(0,100,0,1);
            UminS.setLayoutY(131);
            UminS.setLayoutX(63);
            UmaxS.setLayoutY(131);
            UminS.setMaxSize(62, 5);
            UmaxS.setMaxSize(62, 5);
            UminS.getValueFactory().setValue(Umin);
            UmaxS.getValueFactory().setValue(Umax);
            
            Text labelV = new Text("V Min   Max");
            labelV.setLayoutX(140);
            labelV.setLayoutY(126);
            Spinner<Integer> VminS = new Spinner(-100,0,0,1);
            Spinner<Integer> VmaxS = new Spinner(0,100,0,1);
            VminS.setLayoutX(140);
            VminS.setLayoutY(131);
            VmaxS.setLayoutY(131);
            VmaxS.setLayoutX(203);
            VminS.setMaxSize(62, 5);
            VmaxS.setMaxSize(62, 5);
            VminS.getValueFactory().setValue(Vmin);
            VmaxS.getValueFactory().setValue(Vmax);
            
            Text labeldP = new Text("DP");
            labeldP.setLayoutY(168);
            Spinner<Double> dP = new Spinner(0.,300,0,1);
            dP.getValueFactory().setValue(dPPerspectiva);
            dP.setLayoutY(173);
            dP.setMaxSize(62, 5);
            
            Text labelLargura = new Text("Char Width");
            labelLargura.setLayoutY(168);
            labelLargura.setLayoutX(80);
            Spinner<Integer> largura = new Spinner(0,200,0,1);
            largura.setMaxSize(62, 5);
            largura.setLayoutY(173);
            largura.setLayoutX(80);
            largura.getValueFactory().setValue(larguraCaractere);
            
             
            editores.getChildren().add(labelVRP);
            editores.getChildren().add(XVRP);
            editores.getChildren().add(YVRP);
            editores.getChildren().add(ZVRP);
            
            editores.getChildren().add(labelL);
            editores.getChildren().add(XL);
            editores.getChildren().add(YL);
            editores.getChildren().add(ZL);
            
            editores.getChildren().add(labelILa);
            editores.getChildren().add(ILaR);
            editores.getChildren().add(ILaG);
            editores.getChildren().add(ILaB);
            
            editores.getChildren().add(labelIL);
            editores.getChildren().add(ILR);
            editores.getChildren().add(ILG);
            editores.getChildren().add(ILB);
            
            editores.getChildren().add(labelView);
            editores.getChildren().add(XView);
            editores.getChildren().add(YView);
            editores.getChildren().add(ZView);
            
            editores.getChildren().add(labelU);
            editores.getChildren().add(UminS);
            editores.getChildren().add(UmaxS);
            
            editores.getChildren().add(labelV);
            editores.getChildren().add(VminS);
            editores.getChildren().add(VmaxS);
            
            editores.getChildren().add(labeldP);
            editores.getChildren().add(dP);
            
            editores.getChildren().add(labelLargura);
            editores.getChildren().add(largura);
            
            DialogPane painel = new DialogPane();
            painel.setContent(editores);
            alteracao.setDialogPane(painel);
            
            alteracao.getButtonTypes().clear();
            alteracao.getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

            ButtonType resultado = alteracao.showAndWait().orElse(ButtonType.CANCEL);
            if(resultado == ButtonType.OK){
                VRPPerspectiva = new Point3D(XVRP.getValue(), YVRP.getValue(), ZVRP.getValue());
                lugarLuz = new Point3D(XL.getValue(), YL.getValue(), ZL.getValue());
                
                Ila[0] = ILaR.getValue();
                Ila[1] = ILaG.getValue();
                Ila[2] = ILaB.getValue();
                
                Il[0] = ILR.getValue();
                Il[1] = ILG.getValue();
                Il[2] = ILB.getValue();
                
                viewUPPerspectiva = new Point3D(XView.getValue(), YView.getValue(), ZView.getValue());
                
                Umin = UminS.getValue();
                Umax = UmaxS.getValue();
                
                Vmin = VminS.getValue();
                Vmax = VmaxS.getValue();
                
                larguraCaractere = largura.getValue();
                
                dPPerspectiva = dP.getValue();
                
                if(!refactChars4.isEmpty()){
                    for(int i = 0; i < refactChars4.size(); i++){
                        refactChars4.set(i, chars.get(i).copia());
                    }
                    
                    ctrlVRP2SRU(ct4, refactChars4, VRPPerspectiva  , PPerspectiva  , viewUPPerspectiva, dPPerspectiva  , 4);
                    if(null != escolheMetodo.getValue().toString())
                        switch (escolheMetodo.getValue().toString()) {
                            case "Pintor" -> painter(refactChars4, canvasPerspectiva);
                            case "Phong" -> iluminacao.iluminacaoPhong(canvasPerspectiva, refactChars4, chars, lugarLuz, Il, Ila, VRPPerspectiva);
                            case "Constante" -> iluminacao.iluminacaoConstante(canvasPerspectiva, refactChars4, chars, lugarLuz, Il, Ila, VRPPerspectiva);
                            case "WireFrame" -> ctrl.desenhaStringPorAresta(canvasPerspectiva.getGraphicsContext2D(), refactChars4);
                            default -> {}
                    }
                }
                
            }
            
        });
        
        confirmaLuz.setOnAction((ActionEvent evento) ->{
            if(selectedChar > -1 && selecao != null){
                
                selecao.alteraKa(new Point3D(taxaKaR.getValue(), taxaKaG.getValue(), taxaKaB.getValue()));
                selecao.alteraKd(new Point3D(taxaKdR.getValue(), taxaKdG.getValue(), taxaKdB.getValue()));
                selecao.alteraKs(new Point3D(taxaKsR.getValue(), taxaKsG.getValue(), taxaKsB.getValue()));
                selecao.n = coeficienteRefracao.getValue();
                
                refactChars1.get(selectedChar).alteraKa(new Point3D(taxaKaR.getValue(), taxaKaG.getValue(), taxaKaB.getValue()));
                refactChars1.get(selectedChar).alteraKd(new Point3D(taxaKdR.getValue(), taxaKdG.getValue(), taxaKdB.getValue()));
                refactChars1.get(selectedChar).alteraKs(new Point3D(taxaKsR.getValue(), taxaKsG.getValue(), taxaKsB.getValue()));
                refactChars1.get(selectedChar).n = coeficienteRefracao.getValue();
                
                refactChars2.get(selectedChar).alteraKa(new Point3D(taxaKaR.getValue(), taxaKaG.getValue(), taxaKaB.getValue()));
                refactChars2.get(selectedChar).alteraKd(new Point3D(taxaKdR.getValue(), taxaKdG.getValue(), taxaKdB.getValue()));
                refactChars2.get(selectedChar).alteraKs(new Point3D(taxaKsR.getValue(), taxaKsG.getValue(), taxaKsB.getValue()));
                refactChars2.get(selectedChar).n = coeficienteRefracao.getValue();
                
                refactChars3.get(selectedChar).alteraKa(new Point3D(taxaKaR.getValue(), taxaKaG.getValue(), taxaKaB.getValue()));
                refactChars3.get(selectedChar).alteraKd(new Point3D(taxaKdR.getValue(), taxaKdG.getValue(), taxaKdB.getValue()));
                refactChars3.get(selectedChar).alteraKs(new Point3D(taxaKsR.getValue(), taxaKsG.getValue(), taxaKsB.getValue()));
                refactChars3.get(selectedChar).n = coeficienteRefracao.getValue();
                
                refactChars4.get(selectedChar).alteraKa(new Point3D(taxaKaR.getValue(), taxaKaG.getValue(), taxaKaB.getValue()));
                refactChars4.get(selectedChar).alteraKd(new Point3D(taxaKdR.getValue(), taxaKdG.getValue(), taxaKdB.getValue()));
                refactChars4.get(selectedChar).alteraKs(new Point3D(taxaKsR.getValue(), taxaKsG.getValue(), taxaKsB.getValue()));
                refactChars4.get(selectedChar).n = coeficienteRefracao.getValue();
                
            }
            
            if(escolheMetodo.getValue().toString().equals("Constante")){
                iluminacao.iluminacaoConstante(canvasPerspectiva, refactChars4, chars, lugarLuz, Il, Ila, viewUP);
            }else if(escolheMetodo.getValue().toString().equals("Phong")){
                iluminacao.iluminacaoPhong(canvasPerspectiva, refactChars4, chars, lugarLuz, Il, Ila, viewUP);
            }
            
        });
    
        load.setOnAction((ActionEvent evento) -> {
            carregado = true;
            carregamento = controleArquivo.carregaArquivo(stage);
            trueStart(txConfirmString.getText(), setFaceOcult.selectedProperty().get(), setZ.getValue()*(-0.2));
        });
    
        save.setOnAction((ActionEvent evento) -> {
            controleArquivo.salvaArquivo(chars, stage);
        });
    
        
        
           
    }
    
    public void iluminacaoCaractereSelecionado(){
        if(this.selectedChar > -1){
            this.caractereSelecionado.setText("Selected Char == " + String.valueOf(this.selecao.letra).toUpperCase());
            
            this.taxaKaR.setDisable(false);
            this.taxaKaG.setDisable(false);
            this.taxaKaB.setDisable(false);
            this.taxaKdR.setDisable(false);
            this.taxaKdG.setDisable(false);
            this.taxaKdB.setDisable(false);
            this.taxaKsR.setDisable(false);
            this.taxaKsG.setDisable(false);
            this.taxaKsB.setDisable(false);
            this.coeficienteRefracao.setDisable(false);
            
            this.taxaKaR.getValueFactory().setValue(this.selecao.Ka.getX());
            this.taxaKaG.getValueFactory().setValue(this.selecao.Ka.getY());
            this.taxaKaB.getValueFactory().setValue(this.selecao.Ka.getZ());

            this.taxaKdR.getValueFactory().setValue(this.selecao.Kd.getX());
            this.taxaKdG.getValueFactory().setValue(this.selecao.Kd.getY());
            this.taxaKdB.getValueFactory().setValue(this.selecao.Kd.getZ());

            this.taxaKsR.getValueFactory().setValue(this.selecao.Ks.getX());
            this.taxaKsG.getValueFactory().setValue(this.selecao.Ks.getY());
            this.taxaKsB.getValueFactory().setValue(this.selecao.Ks.getZ());

            this.coeficienteRefracao.getValueFactory().setValue(this.selecao.n);
        }else{
            
            this.caractereSelecionado.setText("Selected Char == NULL");
            
            this.taxaKaR.setDisable(true);
            this.taxaKaG.setDisable(true);
            this.taxaKaB.setDisable(true);
            this.taxaKdR.setDisable(true);
            this.taxaKdG.setDisable(true);
            this.taxaKdB.setDisable(true);
            this.taxaKsR.setDisable(true);
            this.taxaKsG.setDisable(true);
            this.taxaKsB.setDisable(true);
            this.coeficienteRefracao.setDisable(true);
        }
    }
    
    // Tentando matar essa desgraça
    private void trueStart(String readed, Boolean faceOcult, Double scaleZ){
       
        readed = readed.toLowerCase();
        
//        caractere teste = new caractere("8");
//        
//        for(int i = 0; i < teste.faces.size(); i++){
//            System.out.println(teste.faces.get(i).getNomeFace());
//            for(int j = 0; j < teste.faces.get(i).verticesFaceComBuraco().size();j++){
//                System.out.println(teste.faces.get(i).verticesFaceComBuraco().get(j).getNomeVertice());
//            }
//            System.out.println("");
//        }
//        
        chars = new ArrayList<>();
        
        
        
        
        //Colocar a profundidade na string
        for(int i = 0; i < readed.length(); i++){
            chars.add(new caractere(readed.substring(i, i+1)));
            for(int j = chars.get(i).vertices.size()/2; j < chars.get(i).vertices.size(); j++){
                chars.get(i).vertices.get(j).setZ(scaleZ);
            }
        }
        
        tela2String(chars.size(), chars);
        
        ct1 = new ctrlCam();
        ct2 = new ctrlCam();
        ct3 = new ctrlCam();
        ct4 = new ctrlCam();
        
        
        
        
        GraphicsContext gc1 = canvasFrente.getGraphicsContext2D();
        GraphicsContext gc2 = canvasTopo.getGraphicsContext2D();
        GraphicsContext gc3 = canvasLado.getGraphicsContext2D();
        GraphicsContext gc4 = canvasPerspectiva.getGraphicsContext2D();
        
        
        
        if(carregado){
            chars = carregamento;
            carregado = false;
            refactChars1 = new ArrayList<>();
            refactChars2 = new ArrayList<>();
            refactChars3 = new ArrayList<>();
            refactChars4 = new ArrayList<>();
                    
            for(int i = 0; i < chars.size(); i++){
                refactChars1.add(chars.get(i).copia());
                refactChars2.add(chars.get(i).copia());
                refactChars3.add(chars.get(i).copia());
                refactChars4.add(chars.get(i).copia());
            }
        }else{
            refactChars1 = new ArrayList<>();
            refactChars2 = new ArrayList<>();
            refactChars3 = new ArrayList<>();
            refactChars4 = new ArrayList<>();
            
            for(int i = 0; i < chars.size(); i++){
                refactChars1.add(chars.get(i).copia());
                refactChars2.add(chars.get(i).copia());
                refactChars3.add(chars.get(i).copia());
                refactChars4.add(chars.get(i).copia());
            }
        }
      
        
        
        Umin = chars.size()*-2-2;
        Umax = 2+chars.size()*2;
        Vmin = -3;
        Vmax = 3;
        
        
        refactCharsAll = new  ArrayList<>();
        refactCharsAll.add(refactChars1);
        refactCharsAll.add(refactChars2);
        refactCharsAll.add(refactChars3);
        refactCharsAll.add(refactChars4);
        
        
        // Função teste de visibilidade de face
        if(faceOcult){
            testeVisibilidade(chars, refactChars1, ctrl.VRPFrente);
            testeVisibilidade(chars, refactChars2, ctrl.VRPTopo);
            testeVisibilidade(chars, refactChars3, ctrl.VRPLado);
            testeVisibilidade(chars, refactChars4, VRPPerspectiva);
            ctrl.testeVisibilidade(chars, chars, VRPPerspectiva);
        }
        
        
        
        
        // VRP, P, Y, booelan projecao
        ctrlVRP2SRU(ct1, refactChars1, VRPFrente       , PFrente       , viewUP, dPNormal       , 1);
        ctrlVRP2SRU(ct2, refactChars2, VRPTopo         , PTopo         , viewUP, dPNormal       , 2);
        ctrlVRP2SRU(ct3, refactChars3, VRPLado         , PLado         , viewUP, dPNormal       , 3);
        ctrlVRP2SRU(ct4, refactChars4, VRPPerspectiva  , PPerspectiva  , viewUP, dPPerspectiva  , 4);
        
//        int[] sIl = {200, 120, 150}; 
//        int[] sIla = {80, 100, 0};
        
//        Il = sIl; 
//        Ila = sIla;
        
        
        
        
        if(null != escolheMetodo.getValue().toString())
            switch (escolheMetodo.getValue().toString()) {
                case "Pintor" -> painter(refactChars4, canvasPerspectiva);
                case "Phong" -> iluminacao.iluminacaoPhong(canvasPerspectiva, refactChars4, chars, lugarLuz, Il, Ila, VRPPerspectiva);
                case "Constante" -> iluminacao.iluminacaoConstante(canvasPerspectiva, refactChars4, chars, lugarLuz, Il, Ila, VRPPerspectiva);
                case "WireFrame" -> ctrl.desenhaStringPorAresta(gc4, refactChars4);
                default -> {}
        }
        
        desenhaStringPorAresta(gc1, refactChars1);
        desenhaStringPorArestaTopo(gc2, refactChars2);
        desenhaStringPorArestaLado(gc3, refactChars3);
        
 
        controleEventoCanvas.insereComportamento(canvasFrente, canvasTopo, canvasLado, canvasPerspectiva, this);
        
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
    
    public static void testeVisibilidade(ArrayList<caractere> universo, ArrayList<caractere> stringModificada, Point3D VRP){
        for(int i = 0; i < universo.size(); i++){
            for (int j = 0; j < universo.get(i).faces.size(); j++) {
                face faceAtual = universo.get(i).faces.get(j);
                Point3D pontoParaTeste = faceAtual.getArestaFace().getFim().ponto;
                
                Point3D O = VRP.subtract(pontoParaTeste).normalize();
                
                double resultaVisibilidade = O.dotProduct(faceAtual.normalFace());
                
                if(resultaVisibilidade > 0){
                    stringModificada.get(i).faces.get(j).setVisivel(true);
                }else{
                    stringModificada.get(i).faces.get(j).setVisivel(false);
                }
                
            }
        }
        
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
    
    private static void tela2String(int sizeChar, ArrayList<caractere> arrsc){
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
    
    
    public static void desenhaStringPorAresta(GraphicsContext gc, ArrayList<caractere> caracteres){
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        for(int i = 0; i < caracteres.size(); i++) desenhaFiguraPorAresta( gc, caracteres.get(i));
    }
    
    public static void desenhaStringPorArestaTopo(GraphicsContext gc, ArrayList<caractere> caracteres){
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        for(int i = 0; i < caracteres.size(); i++) desenhaFiguraPorArestaTopo( gc, caracteres.get(i));
    }
    
    public static void desenhaStringPorArestaLado(GraphicsContext gc, ArrayList<caractere> caracteres){
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        for(int i = 0; i < caracteres.size(); i++) desenhaFiguraPorArestaLado( gc, caracteres.get(i));
    }
    
    
    public static void desenhaFiguraPorAresta(GraphicsContext gc, caractere cart) {    
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
            }
        }
        
        
        gc.restore();
        
    }
    
    public static void desenhaFiguraPorArestaTopo(GraphicsContext gc, caractere cart) {    
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
            }
        }
        gc.restore();
    }
    
    public static void desenhaFiguraPorArestaLado(GraphicsContext gc, caractere cart) {    
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

    public void ctrlVRP2SRU(ctrlCam ct, ArrayList<caractere> refactChars, Point3D VRP, Point3D P, Point3D Y, double dP, int projecao){
        ct.setVRP(VRP.getX(), VRP.getY(), VRP.getZ());
        ct.setP(P.getX(), P.getY(), P.getZ());
        ct.setYc(Y.getX(), Y.getY(), Y.getZ());
        ct.setDp(dP);
        ct.setViewport(0, 0, larguraCaractere*refactChars.size(), 199);
        ct.setWindow(Umin, Vmin, Umax, Vmax);

        
        
        
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
    
    public void ctrlVRP2SRUParaUmCaractere(caractere modificado, ctrlCam ct, ArrayList<caractere> refactChars, Point3D VRP, Point3D P, Point3D Y, double dP, int projecao){
        ct.setVRP(VRP.getX(), VRP.getY(), VRP.getZ());
        ct.setP(P.getX(), P.getY(), P.getZ());
        ct.setYc(Y.getX(), Y.getY(), Y.getZ());
        ct.setDp(dP);
        ct.setViewport(0, 0, larguraCaractere*refactChars.size(), 199);
        ct.setWindow(Umin, Vmin, Umax, Vmax);
        
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

