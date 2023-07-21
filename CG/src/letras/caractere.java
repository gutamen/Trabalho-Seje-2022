/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letras;

import estrutura.face;
import estrutura.aresta;
import estrutura.vertice;
import java.util.ArrayList;
import javafx.geometry.Point3D;

/**
 *
 * @author gustavo
 */
public class caractere {
    public ArrayList<vertice>   vertices; 
    public ArrayList<aresta>    arestas;
    public ArrayList<aresta>    arestasInternas;
    public ArrayList<face>      faces;
    public char                 letra;
    public Point3D Ka = new Point3D(1, 1 ,1);
    public Point3D Kd = new Point3D(1, 1 ,1);
    public Point3D Ks = new Point3D(1, 1 ,1);
    public double n = 1;
    
    public void alteraKa(Point3D novoCoeficiente){
        this.Ka= Point3D.ZERO.add(novoCoeficiente);
    }
    
    public void alteraKd(Point3D novoCoeficiente){
        this.Kd= Point3D.ZERO.add(novoCoeficiente);
    }
    
    public void alteraKs(Point3D novoCoeficiente){
        this.Ks= Point3D.ZERO.add(novoCoeficiente);
    }
    
    public Point3D coeficienteKa(){
        return this.Ka;
    }
    
    public Point3D coeficienteKd(){
        return this.Kd;
    }
    
    public Point3D coeficienteKs(){
        return this.Ks;
    }
    
    public caractere(String caractereDefinido){
        this.vertices           = new ArrayList<>();
        this.arestas            = new ArrayList<>();        
        this.faces              = new ArrayList<>();
        this.letra              = caractereDefinido.charAt(0);
        
        switch(letra){
            case 'a' -> this.createA();
            case 'b' -> this.createB();
            case 'c' -> this.createC();
            case 'd' -> this.createD();
            case 'e' -> this.createE();
            case 'f' -> this.createF();
            case 'g' -> this.createG();
            case 'h' -> this.createH();
            case 'i' -> this.createI();
            case 'j' -> this.createJ();
            case 'k' -> this.createK();
            case 'l' -> this.createL();
            case 'm' -> this.createM();
            case 'n' -> this.createN();
            case 'o' -> this.createO();
            case 'p' -> this.createP();
            case 'q' -> this.createQ();
            case 'r' -> this.createR();
            case 's' -> this.createS();
            case 't' -> this.createT();
            case 'u' -> this.createU();
            case 'v' -> this.createV();
            case 'w' -> this.createW();
            case 'x' -> this.createX();
            case 'y' -> this.createY();
            case 'z' -> this.createZ();
            case '0' -> this.create0();
            case '1' -> this.create1();
            case '2' -> this.create2();
            case '3' -> this.create3();
            case '4' -> this.create4();
            case '5' -> this.create5();
            case '6' -> this.create6();
            case '7' -> this.create7();
            case '8' -> this.create8();
            case '9' -> this.create9();            
        }
                       
                       
        
    }
    
    private void createA(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2    	, -2	, 0, null));
        vertices.add(new vertice("B", -0.5  	, 2.0	, 0, null));
        vertices.add(new vertice("C", 0.5   	, 2	    , 0, null));
        vertices.add(new vertice("D", 2     	, -2	, 0, null));
        vertices.add(new vertice("E", 1.5   	, -2.0	, 0, null));
        vertices.add(new vertice("F", 0.9375	, -0.5	, 0, null));
        vertices.add(new vertice("G", -0.9375 	, -0.5	, 0, null));
        vertices.add(new vertice("H", -1.5    	, -2	, 0, null));
        vertices.add(new vertice("I", -0.75   	, 0	    , 0, null));
        vertices.add(new vertice("J", -0.25   	, 1.5	, 0, null));   
        vertices.add(new vertice("K", 0.25  	, 1.5	, 0, null));
        vertices.add(new vertice("L", 0.75  	, 0	    , 0, null));
        
        // Vértices das costas da letra
        vertices.add(new vertice("AT", -2       , -2    , 0, null));
        vertices.add(new vertice("BT", -0.5     , 2.0   , 0, null));
        vertices.add(new vertice("CT", 0.5      , 2     , 0, null));
        vertices.add(new vertice("DT", 2        , -2    , 0, null));
        vertices.add(new vertice("ET", 1.5      , -2.0  , 0, null));
        vertices.add(new vertice("FT", 0.9375   , -0.5  , 0, null));
        vertices.add(new vertice("GT", -0.9375  , -0.5  , 0, null));
        vertices.add(new vertice("HT", -1.5     , -2    , 0, null));
        vertices.add(new vertice("IT", -0.75    , 0     , 0, null));
        vertices.add(new vertice("JT", -0.25    , 1.5   , 0, null));   
        vertices.add(new vertice("KT", 0.25     , 1.5   , 0, null));
        vertices.add(new vertice("LT", 0.75     , 0     , 0, null));
        
        // Arestas da borda da frente
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("A_H", vertices.get(0), vertices.get(7), null, null, null, null, null, null));
        
        // Arestas do centro da frente da letra        
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("K_L", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("J_K", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("L_I", vertices.get(11), vertices.get(8), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas das costas da letra
        arestas.add(new aresta("AT_BT", vertices.get(12),vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_AT", vertices.get(19), vertices.get(12), null, null, null, null, null, null));
        
        // Arestas do centro da traseira da letra
        arestas.add(new aresta("JT_IT", vertices.get(21), vertices.get(20), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_JT", vertices.get(22), vertices.get(21), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_KT", vertices.get(23), vertices.get(22), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_LT", vertices.get(20), vertices.get(23), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam a frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(19), null, null, null, null, null, null));
        
        // Arestas que ligam a frente e trás da invertidas
        arestas.add(new aresta("IT_I", vertices.get(20), vertices.get(8), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_J", vertices.get(21), vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_K", vertices.get(22), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_L", vertices.get(23), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Adicionando aresta para vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("A_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_J")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("L_I")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("K_L")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("J_K")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_I")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_J")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("KT_K")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("LT_L")));
        
        // Criação das faces
        faces.add(new face("B_A_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A")), false, true));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT"    , arestas.get(encontraAresta("AT_BT")), false, true));
        faces.add(new face("B_C_CT_BT"                  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("A_B_BT_AT"                  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("C_D_DT_CT"                  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("H_A_AT_HT"                  , arestas.get(encontraAresta("A_AT"))));
        faces.add(new face("D_E_ET_DT"                  , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("G_H_HT_GT"                  , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("E_F_FT_ET"                  , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                  , arestas.get(encontraAresta("G_GT"))));
        
        faces.add(new face("I_J_JT_IT"                  , arestas.get(encontraAresta("JT_IT")), true));
        faces.add(new face("K_L_LT_KT"                  , arestas.get(encontraAresta("LT_KT")), true));
        faces.add(new face("J_K_KT_JT"                  , arestas.get(encontraAresta("KT_JT")), true));
        faces.add(new face("L_I_IT_LT"                  , arestas.get(encontraAresta("IT_LT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("H_A_AT_HT")));
        arestas.get(encontraAresta("I_J")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_K")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_L")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_I")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("L_I_IT_LT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("IT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("L_I_IT_LT")));
        
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_A_AT_HT")));
        arestas.get(encontraAresta("IT_I")).setFaces(faces.get(encontraFace("L_I_IT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_J")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_K")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_L")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_I_IT_LT")));
        
        
        //Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("A_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_H")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_AT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("HT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("H_HT")));
        
        
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("IT_I")));
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("L_I")), arestas.get(encontraAresta("J_K")));
        
        arestas.get(encontraAresta("J_K")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("JT_J")));
        arestas.get(encontraAresta("J_K")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("K_L")));
        
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("KT_K")));
        arestas.get(encontraAresta("K_L")).setArestasEsquerda(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("L_I")));
        
        arestas.get(encontraAresta("L_I")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("LT_L")));
        arestas.get(encontraAresta("L_I")).setArestasEsquerda(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("I_J")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("JT_J")));
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("IT_LT")));
        
        arestas.get(encontraAresta("KT_JT")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("KT_K")));
        arestas.get(encontraAresta("KT_JT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("LT_L")));
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_LT")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("IT_LT")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("IT_I")));
        arestas.get(encontraAresta("IT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("LT_KT")));
        
        
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("HT_AT")));
        
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("A_H")));
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        
        arestas.get(encontraAresta("IT_I")).setArestasEsquerda(arestas.get(encontraAresta("IT_LT")), arestas.get(encontraAresta("L_I")));
        arestas.get(encontraAresta("IT_I")).setArestasDireita(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("JT_J")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("JT_J")).setArestasDireita(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("KT_K")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("J_K")));
        arestas.get(encontraAresta("KT_K")).setArestasDireita(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("LT_KT")));
        
        arestas.get(encontraAresta("LT_L")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("LT_L")).setArestasDireita(arestas.get(encontraAresta("L_I")), arestas.get(encontraAresta("IT_LT")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
        
    }
    
    private void createB(){
        this.arestasInternas = new ArrayList<>();
        // Vértices frente da letra
        vertices.add( new vertice("A", -2.0, -2.0, 0, null));
        vertices.add( new vertice("B", -2.0, 2.0, 0, null));
        vertices.add( new vertice("C", 1, 2.0, 0, null));
        vertices.add( new vertice("D", 1.5, 1.5, 0, null));
        vertices.add( new vertice("E", 1.5, .75, 0, null));
        vertices.add( new vertice("F", 1, 0.2, 0, null));
        vertices.add( new vertice("G", 1, -0.2, 0, null));
        vertices.add( new vertice("H", 1.5, -.75, 0, null));
        vertices.add( new vertice("I", 1.5, -1.5, 0, null));
        vertices.add( new vertice("J", 1, -2, 0, null));
        vertices.add( new vertice("K", -1.25, -1.5, 0, null));
        vertices.add( new vertice("L", -1.25, -.5, 0, null));
        vertices.add( new vertice("M", .5, -.5, 0, null));
        vertices.add( new vertice("N", .5, -1.5, 0, null));
        vertices.add( new vertice("O", -1.25, .5, 0, null));
        vertices.add( new vertice("P", -1.25, 1.5, 0, null));
        vertices.add( new vertice("Q", .5, 1.5, 0, null));
        vertices.add( new vertice("R", .5, .5, 0, null));
        
        // Vértices de trás da letra
        vertices.add( new vertice("AT", -2.0, -2.0, 0, null));
        vertices.add( new vertice("BT", -2.0, 2.0, 0, null));
        vertices.add( new vertice("CT", 1, 2.0, 0, null));
        vertices.add( new vertice("DT", 1.5, 1.5, 0, null));
        vertices.add( new vertice("ET", 1.5, .75, 0, null));
        vertices.add( new vertice("FT", 1, 0.2, 0, null));
        vertices.add( new vertice("GT", 1, -0.2, 0, null));
        vertices.add( new vertice("HT", 1.5, -.75, 0, null));
        vertices.add( new vertice("IT", 1.5, -1.5, 0, null));
        vertices.add( new vertice("JT", 1, -2, 0, null));
        vertices.add( new vertice("KT", -1.25, -1.5, 0, null));
        vertices.add( new vertice("LT", -1.25, -.5, 0, null));
        vertices.add( new vertice("MT", .5, -.5, 0, null));
        vertices.add( new vertice("NT", .5, -1.5, 0, null));
        vertices.add( new vertice("OT", -1.25, .5, 0, null));
        vertices.add( new vertice("PT", -1.25, 1.5, 0, null));
        vertices.add( new vertice("QT", .5, 1.5, 0, null));
        vertices.add( new vertice("RT", .5, .5, 0, null));
        
        // Arestas da frente da letra
        arestas.add( new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add( new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add( new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add( new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add( new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add( new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add( new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add( new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));
        arestas.add( new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        arestas.add( new aresta("A_J", vertices.get(0), vertices.get(9), null, null, null, null, null, null));
        
        // Arestas quadrado baixo
        arestas.add( new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("L_M", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("M_N", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("N_K", vertices.get(13), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas quadrado alto
        arestas.add( new aresta("O_P", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("P_Q", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("Q_R", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("R_O", vertices.get(17), vertices.get(14), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de trás da letra
        arestas.add( new aresta("AT_BT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add( new aresta("BT_CT", vertices.get(19), vertices.get(20), null, null, null, null, null, null));
        arestas.add( new aresta("CT_DT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));
        arestas.add( new aresta("DT_ET", vertices.get(21), vertices.get(22), null, null, null, null, null, null));
        arestas.add( new aresta("ET_FT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));
        arestas.add( new aresta("FT_GT", vertices.get(23), vertices.get(24), null, null, null, null, null, null));
        arestas.add( new aresta("GT_HT", vertices.get(24), vertices.get(25), null, null, null, null, null, null));
        arestas.add( new aresta("HT_IT", vertices.get(25), vertices.get(26), null, null, null, null, null, null));
        arestas.add( new aresta("IT_JT", vertices.get(26), vertices.get(27), null, null, null, null, null, null));
        arestas.add( new aresta("JT_AT", vertices.get(27), vertices.get(18), null, null, null, null, null, null));
        
        // Arestas quadrado baixo de trás
        arestas.add( new aresta("LT_KT", vertices.get(29), vertices.get(28), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("MT_LT", vertices.get(30), vertices.get(29), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("NT_MT", vertices.get(31), vertices.get(30), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("KT_NT", vertices.get(28), vertices.get(31), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas Quadrado alto
        arestas.add( new aresta("PT_OT", vertices.get(33), vertices.get(32), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("QT_PT", vertices.get(34), vertices.get(33), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("RT_QT", vertices.get(35), vertices.get(34), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("OT_RT", vertices.get(32), vertices.get(35), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás da letra
        arestas.add( new aresta("A_AT", vertices.get(0), vertices.get(18), null, null, null, null, null, null));
        arestas.add( new aresta("B_BT", vertices.get(1), vertices.get(19), null, null, null, null, null, null));
        arestas.add( new aresta("C_CT", vertices.get(2), vertices.get(20), null, null, null, null, null, null));
        arestas.add( new aresta("D_DT", vertices.get(3), vertices.get(21), null, null, null, null, null, null));
        arestas.add( new aresta("A_AT", vertices.get(0), vertices.get(18), null, null, null, null, null, null));
        arestas.add( new aresta("E_ET", vertices.get(4), vertices.get(22), null, null, null, null, null, null));
        arestas.add( new aresta("F_FT", vertices.get(5), vertices.get(23), null, null, null, null, null, null));
        arestas.add( new aresta("G_GT", vertices.get(6), vertices.get(24), null, null, null, null, null, null));
        arestas.add( new aresta("H_HT", vertices.get(7), vertices.get(25), null, null, null, null, null, null));
        arestas.add( new aresta("I_IT", vertices.get(8), vertices.get(26), null, null, null, null, null, null));
        arestas.add( new aresta("J_JT", vertices.get(9), vertices.get(27), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra inversas
        arestas.add( new aresta("KT_K", vertices.get(28), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("LT_L", vertices.get(29), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("MT_M", vertices.get(30), vertices.get(12), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("NT_N", vertices.get(31), vertices.get(13), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("OT_O", vertices.get(32), vertices.get(14), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("PT_P", vertices.get(33), vertices.get(15), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("QT_Q", vertices.get(34), vertices.get(16), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add( new aresta("RT_R", vertices.get(35), vertices.get(17), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Colocando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("A_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("K_L")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("L_M")));
        vertices.get(encontraVertice("M")).setArestaVertice(arestas.get(encontraAresta("M_N")));
        vertices.get(encontraVertice("N")).setArestaVertice(arestas.get(encontraAresta("N_K")));
        vertices.get(encontraVertice("O")).setArestaVertice(arestas.get(encontraAresta("O_P")));
        vertices.get(encontraVertice("P")).setArestaVertice(arestas.get(encontraAresta("P_Q")));
        vertices.get(encontraVertice("Q")).setArestaVertice(arestas.get(encontraAresta("Q_R")));
        vertices.get(encontraVertice("R")).setArestaVertice(arestas.get(encontraAresta("R_O")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("AT_BT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("BT_CT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("CT_DT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("DT_ET")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("ET_FT")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("FT_GT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("GT_HT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("HT_IT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_JT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_AT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("LT_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("MT_LT")));
        vertices.get(encontraVertice("MT")).setArestaVertice(arestas.get(encontraAresta("NT_MT")));
        vertices.get(encontraVertice("NT")).setArestaVertice(arestas.get(encontraAresta("KT_NT")));
        vertices.get(encontraVertice("OT")).setArestaVertice(arestas.get(encontraAresta("PT_OT")));
        vertices.get(encontraVertice("PT")).setArestaVertice(arestas.get(encontraAresta("QT_PT")));
        vertices.get(encontraVertice("QT")).setArestaVertice(arestas.get(encontraAresta("RT_QT")));
        vertices.get(encontraVertice("RT")).setArestaVertice(arestas.get(encontraAresta("OT_RT")));
        
        // Criar faces
        faces.add(new face("B_A_J_I_H_G_F_E_D_C"            ,arestas.get(encontraAresta("A_J")), false, true));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT"  ,arestas.get(encontraAresta("AT_BT")), false, true));
        faces.add(new face("A_B_BT_AT"                      ,arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                      ,arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                      ,arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                      ,arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                      ,arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                      ,arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                      ,arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                      ,arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                      ,arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_A_AT_JT"                      ,arestas.get(encontraAresta("A_AT"))));
        
        faces.add(new face("K_L_LT_KT"                      ,arestas.get(encontraAresta("LT_KT")), true));
        faces.add(new face("L_M_MT_LT"                      ,arestas.get(encontraAresta("MT_LT")), true));
        faces.add(new face("M_N_NT_MT"                      ,arestas.get(encontraAresta("NT_MT")), true));
        faces.add(new face("N_K_KT_NT"                      ,arestas.get(encontraAresta("KT_NT")), true));
        faces.add(new face("O_P_PT_OT"                      ,arestas.get(encontraAresta("PT_OT")), true));
        faces.add(new face("P_Q_QT_PT"                      ,arestas.get(encontraAresta("QT_PT")), true));
        faces.add(new face("Q_R_RT_QT"                      ,arestas.get(encontraAresta("RT_QT")), true));
        faces.add(new face("R_O_OT_RT"                      ,arestas.get(encontraAresta("OT_RT")), true));
   
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("A_J")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_A_AT_JT")));
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("J_A_AT_JT")));
        arestas.get(encontraAresta("K_L")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_M")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("M_N")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("N_K")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("N_K_KT_NT")));
        arestas.get(encontraAresta("O_P")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("O_P_PT_OT")));
        arestas.get(encontraAresta("P_Q")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("P_Q_QT_PT")));
        arestas.get(encontraAresta("Q_R")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("Q_R_RT_QT")));
        arestas.get(encontraAresta("R_O")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("R_O_OT_RT")));
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("MT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("NT_MT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("KT_NT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("N_K_KT_NT")));
        arestas.get(encontraAresta("PT_OT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("O_P_PT_OT")));
        arestas.get(encontraAresta("QT_PT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("P_Q_QT_PT")));
        arestas.get(encontraAresta("RT_QT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("Q_R_RT_QT")));
        arestas.get(encontraAresta("OT_RT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("R_O_OT_RT")));
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("J_A_AT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_A_AT_JT")));        
        
        arestas.get(encontraAresta("KT_K")).setFaces(faces.get(encontraFace("N_K_KT_NT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_L")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("MT_M")).setFaces(faces.get(encontraFace("L_M_MT_LT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("NT_N")).setFaces(faces.get(encontraFace("M_N_NT_MT")), faces.get(encontraFace("N_K_KT_NT")));
        arestas.get(encontraAresta("OT_O")).setFaces(faces.get(encontraFace("R_O_OT_RT")), faces.get(encontraFace("O_P_PT_OT")));
        arestas.get(encontraAresta("PT_P")).setFaces(faces.get(encontraFace("O_P_PT_OT")), faces.get(encontraFace("P_Q_QT_PT")));
        arestas.get(encontraAresta("QT_Q")).setFaces(faces.get(encontraFace("P_Q_QT_PT")), faces.get(encontraFace("Q_R_RT_QT")));
        arestas.get(encontraAresta("RT_R")).setFaces(faces.get(encontraFace("Q_R_RT_QT")), faces.get(encontraFace("R_O_OT_RT")));
        
        //Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")),arestas.get(encontraAresta("A_J")));
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")),arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")),arestas.get(encontraAresta("B_A")));
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")),arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")),arestas.get(encontraAresta("C_B")));
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")),arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")),arestas.get(encontraAresta("D_C")));
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")),arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")),arestas.get(encontraAresta("E_D")));
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")),arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")),arestas.get(encontraAresta("F_E")));
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")),arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")),arestas.get(encontraAresta("G_F")));
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")),arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")),arestas.get(encontraAresta("H_G")));
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")),arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("A_J")),arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")),arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_J")).setArestasEsquerda(arestas.get(encontraAresta("B_A")),arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("A_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")),arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("JT_AT")),arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")),arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")),arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")),arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")),arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")),arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")),arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")),arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")),arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")),arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")),arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")),arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")),arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")),arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")),arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")),arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")),arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")),arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_AT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")),arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("JT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")),arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_L")).setArestasEsquerda(arestas.get(encontraAresta("N_K")),arestas.get(encontraAresta("L_M")));
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("LT_L")),arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("L_M")).setArestasEsquerda(arestas.get(encontraAresta("K_L")),arestas.get(encontraAresta("M_N")));
        arestas.get(encontraAresta("L_M")).setArestasDireita(arestas.get(encontraAresta("MT_M")),arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("M_N")).setArestasEsquerda(arestas.get(encontraAresta("L_M")),arestas.get(encontraAresta("N_K")));
        arestas.get(encontraAresta("M_N")).setArestasDireita(arestas.get(encontraAresta("NT_N")),arestas.get(encontraAresta("MT_M")));
        
        arestas.get(encontraAresta("N_K")).setArestasEsquerda(arestas.get(encontraAresta("M_N")),arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("N_K")).setArestasDireita(arestas.get(encontraAresta("KT_K")),arestas.get(encontraAresta("NT_N")));
        
        arestas.get(encontraAresta("O_P")).setArestasEsquerda(arestas.get(encontraAresta("R_O")),arestas.get(encontraAresta("P_Q")));
        arestas.get(encontraAresta("O_P")).setArestasDireita(arestas.get(encontraAresta("PT_P")),arestas.get(encontraAresta("OT_O")));
        
        arestas.get(encontraAresta("P_Q")).setArestasEsquerda(arestas.get(encontraAresta("O_P")),arestas.get(encontraAresta("Q_R")));
        arestas.get(encontraAresta("P_Q")).setArestasDireita(arestas.get(encontraAresta("QT_Q")),arestas.get(encontraAresta("PT_P")));
        
        arestas.get(encontraAresta("Q_R")).setArestasEsquerda(arestas.get(encontraAresta("P_Q")),arestas.get(encontraAresta("R_O")));
        arestas.get(encontraAresta("Q_R")).setArestasDireita(arestas.get(encontraAresta("RT_R")),arestas.get(encontraAresta("QT_Q")));
        
        arestas.get(encontraAresta("R_O")).setArestasEsquerda(arestas.get(encontraAresta("Q_R")),arestas.get(encontraAresta("O_P")));
        arestas.get(encontraAresta("R_O")).setArestasDireita(arestas.get(encontraAresta("OT_O")),arestas.get(encontraAresta("RT_R")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("MT_LT")),arestas.get(encontraAresta("KT_NT")));
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("KT_K")),arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("MT_LT")).setArestasEsquerda(arestas.get(encontraAresta("NT_MT")),arestas.get(encontraAresta("LT_KT")));
        arestas.get(encontraAresta("MT_LT")).setArestasDireita(arestas.get(encontraAresta("LT_L")),arestas.get(encontraAresta("MT_M")));
        
        arestas.get(encontraAresta("NT_MT")).setArestasEsquerda(arestas.get(encontraAresta("KT_NT")),arestas.get(encontraAresta("MT_LT")));
        arestas.get(encontraAresta("NT_MT")).setArestasDireita(arestas.get(encontraAresta("MT_M")),arestas.get(encontraAresta("NT_N")));
        
        arestas.get(encontraAresta("KT_NT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")),arestas.get(encontraAresta("NT_MT")));
        arestas.get(encontraAresta("KT_NT")).setArestasDireita(arestas.get(encontraAresta("NT_N")),arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("PT_OT")).setArestasEsquerda(arestas.get(encontraAresta("QT_PT")),arestas.get(encontraAresta("OT_RT")));
        arestas.get(encontraAresta("PT_OT")).setArestasDireita(arestas.get(encontraAresta("OT_O")),arestas.get(encontraAresta("PT_P")));
        
        arestas.get(encontraAresta("QT_PT")).setArestasEsquerda(arestas.get(encontraAresta("RT_QT")),arestas.get(encontraAresta("PT_OT")));
        arestas.get(encontraAresta("QT_PT")).setArestasDireita(arestas.get(encontraAresta("PT_P")),arestas.get(encontraAresta("QT_Q")));
        
        arestas.get(encontraAresta("RT_QT")).setArestasEsquerda(arestas.get(encontraAresta("OT_RT")),arestas.get(encontraAresta("QT_PT")));
        arestas.get(encontraAresta("RT_QT")).setArestasDireita(arestas.get(encontraAresta("QT_Q")),arestas.get(encontraAresta("RT_R")));
        
        arestas.get(encontraAresta("OT_RT")).setArestasEsquerda(arestas.get(encontraAresta("PT_OT")),arestas.get(encontraAresta("RT_QT")));
        arestas.get(encontraAresta("OT_RT")).setArestasDireita(arestas.get(encontraAresta("RT_R")),arestas.get(encontraAresta("OT_O")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_J")),arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")),arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")),arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")),arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")),arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")),arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")),arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")),arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")),arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")),arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")),arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")),arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")),arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")),arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")),arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")),arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")),arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")),arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")),arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_AT")),arestas.get(encontraAresta("A_J")));
        
        arestas.get(encontraAresta("KT_K")).setArestasDireita(arestas.get(encontraAresta("K_L")),arestas.get(encontraAresta("LT_KT")));
        arestas.get(encontraAresta("KT_K")).setArestasEsquerda(arestas.get(encontraAresta("KT_NT")),arestas.get(encontraAresta("N_K")));
        
        arestas.get(encontraAresta("LT_L")).setArestasDireita(arestas.get(encontraAresta("L_M")),arestas.get(encontraAresta("MT_LT")));
        arestas.get(encontraAresta("LT_L")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")),arestas.get(encontraAresta("K_L")));
        
        arestas.get(encontraAresta("MT_M")).setArestasDireita(arestas.get(encontraAresta("M_N")),arestas.get(encontraAresta("NT_MT")));
        arestas.get(encontraAresta("MT_M")).setArestasEsquerda(arestas.get(encontraAresta("MT_LT")),arestas.get(encontraAresta("L_M")));
        
        arestas.get(encontraAresta("NT_N")).setArestasDireita(arestas.get(encontraAresta("N_K")),arestas.get(encontraAresta("KT_NT")));
        arestas.get(encontraAresta("NT_N")).setArestasEsquerda(arestas.get(encontraAresta("NT_MT")),arestas.get(encontraAresta("M_N")));
        
        arestas.get(encontraAresta("OT_O")).setArestasDireita(arestas.get(encontraAresta("O_P")),arestas.get(encontraAresta("PT_OT")));
        arestas.get(encontraAresta("OT_O")).setArestasEsquerda(arestas.get(encontraAresta("OT_RT")),arestas.get(encontraAresta("R_O")));
        
        arestas.get(encontraAresta("PT_P")).setArestasDireita(arestas.get(encontraAresta("P_Q")),arestas.get(encontraAresta("QT_PT")));
        arestas.get(encontraAresta("PT_P")).setArestasEsquerda(arestas.get(encontraAresta("PT_OT")),arestas.get(encontraAresta("O_P")));
        
        arestas.get(encontraAresta("QT_Q")).setArestasDireita(arestas.get(encontraAresta("Q_R")),arestas.get(encontraAresta("RT_QT")));
        arestas.get(encontraAresta("QT_Q")).setArestasEsquerda(arestas.get(encontraAresta("QT_PT")),arestas.get(encontraAresta("P_Q")));
        
        arestas.get(encontraAresta("RT_R")).setArestasDireita(arestas.get(encontraAresta("R_O")),arestas.get(encontraAresta("OT_RT")));
        arestas.get(encontraAresta("RT_R")).setArestasEsquerda(arestas.get(encontraAresta("RT_QT")),arestas.get(encontraAresta("Q_R")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
        
    }
    
    private void createC(){
       
        //Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, 1, 0, null));
        vertices.add(new vertice("E", -1, 1, 0, null));
        vertices.add(new vertice("F", -1, -1, 0, null));
        vertices.add(new vertice("G", 2, -1, 0, null));
        vertices.add(new vertice("H", 2, -2, 0, null));
        
        //Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, 1, 0, null));
        vertices.add(new vertice("ET", -1, 1, 0, null));
        vertices.add(new vertice("FT", -1, -1, 0, null));
        vertices.add(new vertice("GT", 2, -1, 0, null));
        vertices.add(new vertice("HT", 2, -2, 0, null));
        
        //Arestas da frente da letra
        arestas.add(new aresta("B_A", vertices.get(1),vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("A_H", vertices.get(0), vertices.get(7), null, null, null, null, null, null));
       
        //Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(8),vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("HT_AT", vertices.get(15), vertices.get(8), null, null, null, null, null, null));
        
        //Arestas para ligar frente e trás
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(15), null, null, null, null, null, null));
        
        
        //Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("A_H")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        
        // Criação das faces
        faces.add(new face("B_A_H_G_F_E_D_C"        , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT", arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("B_C_CT_BT"              , arestas.get(encontraAresta("C_B"))));
        faces.add(new face("H_A_AT_HT"              , arestas.get(encontraAresta("A_H"))));
        faces.add(new face("A_B_BT_AT"              , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("C_D_DT_CT"              , arestas.get(encontraAresta("D_C"))));
        faces.add(new face("G_H_HT_GT"              , arestas.get(encontraAresta("H_G"))));   
        faces.add(new face("D_E_ET_DT"              , arestas.get(encontraAresta("E_D"))));
        faces.add(new face("E_F_FT_ET"              , arestas.get(encontraAresta("F_E"))));
        faces.add(new face("F_G_GT_FT"              , arestas.get(encontraAresta("G_F"))));

        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_A_AT_HT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("A_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_H")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_AT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("HT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("A_H")));
        
        
    }
    
    private void createD(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2.0, 0.0, null));
        vertices.add(new vertice("C", 1, 2, 0, null));
        vertices.add(new vertice("D", 2, 1, 0, null));
        vertices.add(new vertice("E", 2, -1, 0, null));
        vertices.add(new vertice("F", 1, -2, 0, null));
        vertices.add(new vertice("G", -1, -1, 0, null));
        vertices.add(new vertice("H", -1, 1, 0, null));
        vertices.add(new vertice("I", 0.5, 1, 0, null));
        vertices.add(new vertice("J", 1, .5, 0, null));   
        vertices.add(new vertice("K", 1, -.5, 0, null));
        vertices.add(new vertice("L", .5, -1, 0, null));
        
        // Vértices das costas da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2.0, 0.0, null));
        vertices.add(new vertice("CT", 1, 2, 0, null));
        vertices.add(new vertice("DT", 2, 1, 0, null));
        vertices.add(new vertice("ET", 2, -1, 0, null));
        vertices.add(new vertice("FT", 1, -2, 0, null));
        vertices.add(new vertice("GT", -1, -1, 0, null));
        vertices.add(new vertice("HT", -1, 1, 0, null));
        vertices.add(new vertice("IT", 0.5, 1, 0, null));
        vertices.add(new vertice("JT", 1, .5, 0, null));   
        vertices.add(new vertice("KT", 1, -.5, 0, null));
        vertices.add(new vertice("LT", .5, -1, 0, null));
        
        //Arestas da frente da letra fora
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("A_F", vertices.get(0), vertices.get(5), null, null, null, null, null, null));
        
        // Arestas da frente da letra dentro
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("H_I", vertices.get(7), vertices.get(8), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("J_K", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("L_G", vertices.get(11), vertices.get(6), null, null, null, null, null, null)); 
        arestasInternas.add(arestas.get(arestas.size()-1));
    
        //Arestas de trás da letra fora
        arestas.add(new aresta("AT_BT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_AT", vertices.get(17), vertices.get(12), null, null, null, null, null, null));
        
        // Arestas de trás da letra dentro
        arestas.add(new aresta("HT_GT", vertices.get(19), vertices.get(18), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_HT", vertices.get(20), vertices.get(19), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_IT", vertices.get(21), vertices.get(20), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_JT", vertices.get(22), vertices.get(21), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_KT", vertices.get(23), vertices.get(22), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_LT", vertices.get(18), vertices.get(23), null, null, null, null, null, null)); 
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de ligação com a parte de trás 
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(12), null, null, null, null, null, null)); 
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(13), null, null, null, null, null, null)); 
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(14), null, null, null, null, null, null)); 
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(15), null, null, null, null, null, null)); 
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(16), null, null, null, null, null, null)); 
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(17), null, null, null, null, null, null)); 
        
        // Arestas que ligam frente e trás invertidas
        arestas.add(new aresta("GT_G", vertices.get(18), vertices.get(6), null, null, null, null, null, null)); 
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_H", vertices.get(19), vertices.get(7), null, null, null, null, null, null)); 
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_I", vertices.get(20), vertices.get(8), null, null, null, null, null, null)); 
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_J", vertices.get(21), vertices.get(9), null, null, null, null, null, null)); 
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_K", vertices.get(22), vertices.get(10), null, null, null, null, null, null)); 
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_L", vertices.get(23), vertices.get(11), null, null, null, null, null, null)); 
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        
        //Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("A_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("G_H")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("H_I")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_J")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("J_K")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("K_L")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("L_G")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("GT_G")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("HT_H")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_I")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_J")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("KT_K")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("LT_L")));
        
        // Criação das faces
        faces.add(new face("B_A_F_E_D_C"        , arestas.get(encontraAresta("B_A")),false , true));
        faces.add(new face("AT_BT_CT_DT_ET_FT"  , arestas.get(encontraAresta("AT_BT")),false , true));
        faces.add(new face("A_B_BT_AT"          , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"          , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"          , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"          , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"          , arestas.get(encontraAresta("F_FT"))));   
        faces.add(new face("F_A_AT_FT"          , arestas.get(encontraAresta("A_AT"))));   
        
        // Faces Internas
        faces.add(new face("G_H_HT_GT"          , arestas.get(encontraAresta("HT_GT")), true));
        faces.add(new face("H_I_IT_HT"          , arestas.get(encontraAresta("IT_HT")), true));
        faces.add(new face("I_J_JT_IT"          , arestas.get(encontraAresta("JT_IT")), true));
        faces.add(new face("J_K_KT_JT"          , arestas.get(encontraAresta("KT_JT")), true));
        faces.add(new face("K_L_LT_KT"          , arestas.get(encontraAresta("LT_KT")), true));
        faces.add(new face("L_G_GT_LT"          , arestas.get(encontraAresta("GT_LT")), true));
        
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("A_F")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("G_H")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_I")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_J")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_K")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_L")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_G")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("L_G_GT_LT")));
        
        arestas.get(encontraAresta("GT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("L_G_GT_LT")));
        arestas.get(encontraAresta("HT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("IT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("K_L_LT_KT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("F_A_AT_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("GT_G")).setFacesInvertido(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("L_G_GT_LT")));
        arestas.get(encontraAresta("HT_H")).setFacesInvertido(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("IT_I")).setFacesInvertido(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("JT_J")).setFacesInvertido(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_K")).setFacesInvertido(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_L")).setFacesInvertido(faces.get(encontraFace("L_G_GT_LT")), faces.get(encontraFace("K_L_LT_KT")));
       
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_F")));
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
      
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("E_D")));
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("A_F")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("F_E")));
        arestas.get(encontraAresta("A_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_AT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("FT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("G_H")).setArestasEsquerda(arestas.get(encontraAresta("L_G")), arestas.get(encontraAresta("H_I")));
        arestas.get(encontraAresta("G_H")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("GT_G")));
        
        arestas.get(encontraAresta("H_I")).setArestasEsquerda(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("H_I")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("HT_H")));
        
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("H_I")), arestas.get(encontraAresta("J_K")));
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("IT_I")));
       
        arestas.get(encontraAresta("J_K")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("J_K")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("JT_J")));
        
        arestas.get(encontraAresta("K_L")).setArestasEsquerda(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("L_G")));
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("L_G")).setArestasEsquerda(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("G_H")));
        arestas.get(encontraAresta("L_G")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("HT_GT")).setArestasEsquerda(arestas.get(encontraAresta("IT_HT")), arestas.get(encontraAresta("GT_LT")));
        arestas.get(encontraAresta("HT_GT")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("HT_H")));
        
        arestas.get(encontraAresta("IT_HT")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("IT_HT")));
        arestas.get(encontraAresta("IT_HT")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("IT_I")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("IT_HT")));
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("JT_J")));
       
        arestas.get(encontraAresta("KT_JT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("JT_IT")));
        arestas.get(encontraAresta("KT_JT")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("GT_LT")), arestas.get(encontraAresta("KT_JT")));
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("GT_LT")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("LT_KT")));
        arestas.get(encontraAresta("GT_LT")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("GT_G")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("GT_G")).setArestasEsquerda(arestas.get(encontraAresta("GT_LT")), arestas.get(encontraAresta("L_G")));
        arestas.get(encontraAresta("GT_G")).setArestasDireita(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("HT_GT")));
        
        arestas.get(encontraAresta("HT_H")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("G_H")));
        arestas.get(encontraAresta("HT_H")).setArestasDireita(arestas.get(encontraAresta("H_I")), arestas.get(encontraAresta("IT_HT")));
        
        arestas.get(encontraAresta("IT_I")).setArestasEsquerda(arestas.get(encontraAresta("IT_HT")), arestas.get(encontraAresta("H_I")));
        arestas.get(encontraAresta("IT_I")).setArestasDireita(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
       
        arestas.get(encontraAresta("JT_J")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("JT_J")).setArestasDireita(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("KT_K")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("J_K")));
        arestas.get(encontraAresta("KT_K")).setArestasDireita(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("LT_KT")));
        
        arestas.get(encontraAresta("LT_L")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("LT_L")).setArestasDireita(arestas.get(encontraAresta("L_G")), arestas.get(encontraAresta("GT_LT")));
        
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
      
    }
    
    private void createE(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2.0, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, 1.2, 0, null));
        vertices.add(new vertice("E", -1.2, 1.2, 0, null));
        vertices.add(new vertice("F", -1.2, 0.4, 0, null));
        vertices.add(new vertice("G", 2, 0.4, 0, null));
        vertices.add(new vertice("H", 2, -.4, 0, null));
        vertices.add(new vertice("I", -1.2, -.4, 0, null));
        vertices.add(new vertice("J", -1.2, -1.2, 0, null));   
        vertices.add(new vertice("K", 2, -1.2, 0, null));
        vertices.add(new vertice("L", 2, -2, 0, null));
        
        // Vértices das costas da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2.0, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, 1.2, 0, null));
        vertices.add(new vertice("ET", -1.2, 1.2, 0, null));
        vertices.add(new vertice("FT", -1.2, 0.4, 0, null));
        vertices.add(new vertice("GT", 2, 0.4, 0, null));
        vertices.add(new vertice("HT", 2, -.4, 0, null));
        vertices.add(new vertice("IT", -1.2, -.4, 0, null));
        vertices.add(new vertice("JT", -1.2, -1.2, 0, null));   
        vertices.add(new vertice("KT", 2, -1.2, 0, null));
        vertices.add(new vertice("LT", 2, -2, 0, null));
        
        //Arestas da frente da letra
        arestas.add(new aresta("B_A", vertices.get(1),vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));      
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("A_L", vertices.get(0), vertices.get(11), null, null, null, null, null, null));
        
        //Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13),vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(19), vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("JT_KT", vertices.get(21), vertices.get(22), null, null, null, null, null, null));      
        arestas.add(new aresta("KT_LT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("LT_AT", vertices.get(23), vertices.get(12), null, null, null, null, null, null));
      
        
        //Arestas que ligam frente e trás
        arestas.add(new aresta("A_AT", vertices.get(0),vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8), vertices.get(20), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(23), null, null, null, null, null, null));
        
        //Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("A_L")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        
        // Criação das faces
        faces.add(new face("B_A_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                              , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                              , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                              , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                              , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                              , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                              , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                              , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                              , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                              , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                              , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                              , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_A_AT_LT"                              , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("A_L")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_A_AT_LT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("L_A_AT_LT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("L_A_AT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_A_AT_LT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_L")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_L")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("A_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_AT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("LT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("A_L")));
        
        
        
    }
    
    private void createF(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2.0, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, 1.2, 0, null));
        vertices.add(new vertice("E", -1.2, 1.2, 0, null));
        vertices.add(new vertice("F", -1.2, 0.4, 0, null));
        vertices.add(new vertice("G", 1.4, 0.4, 0, null));
        vertices.add(new vertice("H", 1.4, -.4, 0, null));
        vertices.add(new vertice("I", -1.2, -.4, 0, null));
        vertices.add(new vertice("J", -1.2, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2.0, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, 1.2, 0, null));
        vertices.add(new vertice("ET", -1.2, 1.2, 0, null));
        vertices.add(new vertice("FT", -1.2, 0.4, 0, null));
        vertices.add(new vertice("GT", 1.4, 0.4, 0, null));
        vertices.add(new vertice("HT", 1.4, -.4, 0, null));
        vertices.add(new vertice("IT", -1.2, -.4, 0, null));
        vertices.add(new vertice("JT", -1.2, -2, 0, null)); 

        // Arestas da frente da letra
        arestas.add(new aresta("A_J", vertices.get(0),vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_AT", vertices.get(19), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8), vertices.get(18), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9), vertices.get(19), null, null, null, null, null, null));
        
        //Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("A_J")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        
        // Criação das faces
        faces.add(new face("B_A_J_I_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT"  , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                      , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                      , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                      , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                      , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                      , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                      , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_A_AT_JT"                      , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("A_J")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("J_A_AT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_A_AT_JT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_J")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_J")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("A_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_AT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("JT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("A_J")));
    }
    
    private void createG(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2.0, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, 1.2, 0, null));
        vertices.add(new vertice("E", -1.2, 1.2, 0, null));
        vertices.add(new vertice("F", -1.2, -1.2, 0, null));
        vertices.add(new vertice("G", 1.2, -1.2, 0, null));
        vertices.add(new vertice("H", 1.2, -.4, 0, null));
        vertices.add(new vertice("I", .6, -.4, 0, null));
        vertices.add(new vertice("J", .6, .4, 0, null));   
        vertices.add(new vertice("K", 2, .4, 0, null));
        vertices.add(new vertice("L", 2, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2.0, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, 1.2, 0, null));
        vertices.add(new vertice("ET", -1.2, 1.2, 0, null));
        vertices.add(new vertice("FT", -1.2, -1.2, 0, null));
        vertices.add(new vertice("GT", 1.2, -1.2, 0, null));
        vertices.add(new vertice("HT", 1.2, -.4, 0, null));
        vertices.add(new vertice("IT", .6, -.4, 0, null));
        vertices.add(new vertice("JT", .6, .4, 0, null));   
        vertices.add(new vertice("KT", 2, .4, 0, null));
        vertices.add(new vertice("LT", 2, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_L", vertices.get(0),vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(19), vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(21), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("LT_AT", vertices.get(23), vertices.get(12), null, null, null, null, null, null));
        
        // Arestas de ligação frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(20), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(23), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("A_L")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        
        // Criação das faces
        faces.add(new face("B_A_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                              , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                              , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                              , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                              , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                              , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                              , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                              , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                              , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                              , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                              , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                              , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_A_AT_LT"                              , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("A_L")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_A_AT_LT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("L_A_AT_LT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("L_A_AT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_A_AT_LT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_L")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_L")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("A_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("A_AT")));
        
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_AT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("LT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("L_LT")));
        
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("A_L")));
        
        
        
    }
    
    private void createH(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2.0, 0.0, null));
        vertices.add(new vertice("C", -1, 2, 0, null));
        vertices.add(new vertice("D", -1, .5, 0, null));
        vertices.add(new vertice("E", 1, .5, 0, null));
        vertices.add(new vertice("F", 1, 2, 0, null));
        vertices.add(new vertice("G", 2, 2, 0, null));
        vertices.add(new vertice("H", 2, -2, 0, null));
        vertices.add(new vertice("I", 1, -2, 0, null));
        vertices.add(new vertice("J", 1, -.5, 0, null));   
        vertices.add(new vertice("K", -1, -.5, 0, null));
        vertices.add(new vertice("L", -1, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2.0, 0.0, null));
        vertices.add(new vertice("CT", -1, 2, 0, null));
        vertices.add(new vertice("DT", -1, .5, 0, null));
        vertices.add(new vertice("ET", 1, .5, 0, null));
        vertices.add(new vertice("FT", 1, 2, 0, null));
        vertices.add(new vertice("GT", 2, 2, 0, null));
        vertices.add(new vertice("HT", 2, -2, 0, null));
        vertices.add(new vertice("IT", 1, -2, 0, null));
        vertices.add(new vertice("JT", 1, -.5, 0, null));   
        vertices.add(new vertice("KT", -1, -.5, 0, null));
        vertices.add(new vertice("LT", -1, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_L", vertices.get(0),vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(12),vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(19), vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(21), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("LT_AT", vertices.get(23), vertices.get(12), null, null, null, null, null, null));
        
        // Arestas de ligação de frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(20), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(23), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("A_L")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        
        // Criação das faces
        faces.add(new face("B_A_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                              , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                              , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                              , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                              , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                              , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                              , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                              , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                              , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                              , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                              , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                              , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_A_AT_LT"                              , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("A_L")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_A_AT_LT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("L_A_AT_LT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("L_A_AT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_A_AT_LT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_L")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_L")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("A_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("A_AT")));
        
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_AT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("LT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("L_LT")));
        
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("A_L")));
        
        
       
    }
    
    private void createI(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -.5, -2, 0, null));
        vertices.add(new vertice("B", -0.5, 2.0, 0.0, null));
        vertices.add(new vertice("C", 0.5, 2, 0, null));
        vertices.add(new vertice("D", .5, -2, 0, null));

        // Vértices de trás da letra
        vertices.add(new vertice("AT", -.5, -2, 0, null));
        vertices.add(new vertice("BT", -0.5, 2.0, 0.0, null));
        vertices.add(new vertice("CT", 0.5, 2, 0, null));
        vertices.add(new vertice("DT", .5, -2, 0, null));

        // Arestas da frente da letra
        arestas.add(new aresta("A_D", vertices.get(0), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("DT_AT", vertices.get(7), vertices.get(4), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(7), null, null, null, null, null, null));
        
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("A_D")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        
        // Criação das faces
        faces.add(new face("B_A_D_C"        , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_A_AT_DT"      , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("A_D")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("D_A_AT_DT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_A_AT_DT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_D")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("A_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("A_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_D")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("DT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_AT")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_AT")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("DT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_D")), arestas.get(encontraAresta("DT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_AT")), arestas.get(encontraAresta("A_D")));
        
        
        
    
        
    }
    
    private void createJ(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -1, -2, 0, null));
        vertices.add(new vertice("B", -2, -1, 0.0, null));
        vertices.add(new vertice("C", -2, 0, 0, null));
        vertices.add(new vertice("D", -1, 0, 0, null));
        vertices.add(new vertice("E", -1, -.5, 0, null));
        vertices.add(new vertice("F", -.5, -1, 0, null));
        vertices.add(new vertice("G", 1, -1, 0, null));
        vertices.add(new vertice("H", 1, 2, 0, null));
        vertices.add(new vertice("I", 2, 2, 0, null));
        vertices.add(new vertice("J", 2, -2, 0, null));   

        // Vértices de trás da letra
        vertices.add(new vertice("AT", -1, -2, 0, null));
        vertices.add(new vertice("BT", -2, -1, 0.0, null));
        vertices.add(new vertice("CT", -2, 0, 0, null));
        vertices.add(new vertice("DT", -1, 0, 0, null));
        vertices.add(new vertice("ET", -1, -.5, 0, null));
        vertices.add(new vertice("FT", -.5, -1, 0, null));
        vertices.add(new vertice("GT", 1, -1, 0, null));
        vertices.add(new vertice("HT", 1, 2, 0, null));
        vertices.add(new vertice("IT", 2, 2, 0, null));
        vertices.add(new vertice("JT", 2, -2, 0, null));  
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_J", vertices.get(0), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_AT", vertices.get(19), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8), vertices.get(18), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9), vertices.get(19), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("A_J")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        
        // Criação das faces
        faces.add(new face("B_A_J_I_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT"  , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                      , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                      , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                      , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                      , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                      , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                      , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_A_AT_JT"                      , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("A_J")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("J_A_AT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_A_AT_JT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_J")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_J")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("A_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_AT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("JT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("J_JT")));
         
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("A_J")));
        
    }
    
    private void createK(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -1.8, -2, 0, null));
        vertices.add(new vertice("B", -1.8, 2.0, 0.0, null));
        vertices.add(new vertice("C", -1, 2, 0, null));
        vertices.add(new vertice("D", -1, 0.8, 0, null));
        vertices.add(new vertice("E", 1.8, 1.8, 0, null));
        vertices.add(new vertice("F", 1.8, 1, 0, null));
        vertices.add(new vertice("G", -.125, .3, 0, null));
        vertices.add(new vertice("H", 1.8, -2, 0, null));
        vertices.add(new vertice("I", .8, -2, 0, null));
        vertices.add(new vertice("J", -0.8, 0.075, 0, null));   
        vertices.add(new vertice("K", -1, 0, 0, null));
        vertices.add(new vertice("L", -1, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -1.8, -2, 0, null));
        vertices.add(new vertice("BT", -1.8, 2.0, 0.0, null));
        vertices.add(new vertice("CT", -1, 2, 0, null));
        vertices.add(new vertice("DT", -1, 0.8, 0, null));
        vertices.add(new vertice("ET", 1.8, 1.8, 0, null));
        vertices.add(new vertice("FT", 1.8, 1, 0, null));
        vertices.add(new vertice("GT", -.125, .3, 0, null));
        vertices.add(new vertice("HT", 1.8, -2, 0, null));
        vertices.add(new vertice("IT", .8, -2, 0, null));
        vertices.add(new vertice("JT", -0.8, 0.075, 0, null));   
        vertices.add(new vertice("KT", -1, 0, 0, null));
        vertices.add(new vertice("LT", -1, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_L", vertices.get(0),  vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1),  vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2),  vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3),  vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4),  vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5),  vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6),  vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7),  vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8),  vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9),  vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(12),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(19),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(20),  vertices.get(21), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(21),  vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(22),  vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("LT_AT", vertices.get(23),  vertices.get(12), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(20), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(23), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("A_L")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        
        // Criação das faces
        faces.add(new face("B_A_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                              , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                              , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                              , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                              , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                              , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                              , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                              , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                              , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                              , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                              , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                              , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_A_AT_LT"                              , arestas.get(encontraAresta("A_AT"))));
       
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("A_L")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_A_AT_LT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("L_A_AT_LT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("L_A_AT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_A_AT_LT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_L")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_L")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("A_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_AT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("LT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("A_L")));
        
        
        
        
    }
    
    private void createL(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", -1, 2, 0, null));
        vertices.add(new vertice("D", -1, -1, 0, null));
        vertices.add(new vertice("E", 2, -1, 0, null));
        vertices.add(new vertice("F", 2, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", -1, 2, 0, null));
        vertices.add(new vertice("DT", -1, -1, 0, null));
        vertices.add(new vertice("ET", 2, -1, 0, null));
        vertices.add(new vertice("FT", 2, -2, 0, null));
  
        // Arestas da frente da letra
        arestas.add(new aresta("A_F", vertices.get(0), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(7), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(8), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("FT_AT", vertices.get(11), vertices.get(6), null, null, null, null, null, null));
        
        // Arestas que frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(11), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("A_F")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        
        // Criação das faces
        faces.add(new face("B_A_F_E_D_C"        , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT"  , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"          , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"          , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"          , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"          , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"          , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_A_AT_FT"          , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("A_F")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("F_A_AT_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_A_AT_FT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("A_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_F")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_AT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("FT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("A_F"))); 
        
       
    }
    
    private void createM(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -1.5, 2, 0.0, null));
        vertices.add(new vertice("C", -0.5, 2, 0, null));
        vertices.add(new vertice("D", 0, -1.5, 0, null));
        vertices.add(new vertice("E", 0.5, 2, 0, null));
        vertices.add(new vertice("F", 1.5, 2, 0, null));
        vertices.add(new vertice("G", 2, -2, 0, null));
        vertices.add(new vertice("H", 1.5, -2, 0, null));
        vertices.add(new vertice("I", 1, 1.5, 0, null));
        vertices.add(new vertice("J", 0.5, -2, 0, null));   
        vertices.add(new vertice("K", -0.5, -2, 0, null));
        vertices.add(new vertice("L", -1, 1.5, 0, null));
        vertices.add(new vertice("M", -1.5, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -1.5, 2, 0.0, null));
        vertices.add(new vertice("CT", -0.5, 2, 0, null));
        vertices.add(new vertice("DT", 0, -1.5, 0, null));
        vertices.add(new vertice("ET", 0.5, 2, 0, null));
        vertices.add(new vertice("FT", 1.5, 2, 0, null));
        vertices.add(new vertice("GT", 2, -2, 0, null));
        vertices.add(new vertice("HT", 1.5, -2, 0, null));
        vertices.add(new vertice("IT", 1, 1.5, 0, null));
        vertices.add(new vertice("JT", 0.5, -2, 0, null));   
        vertices.add(new vertice("KT", -0.5, -2, 0, null));
        vertices.add(new vertice("LT", -1, 1.5, 0, null));
        vertices.add(new vertice("MT", -1.5, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_M", vertices.get(0),  vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1),  vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2),  vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3),  vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4),  vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5),  vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6),  vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7),  vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8),  vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9),  vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("M_L", vertices.get(12), vertices.get(11), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(13),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(14),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(15),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(16),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(17),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(18),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(19),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(20),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(21),  vertices.get(22), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(22),  vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(23), vertices.get(24), null, null, null, null, null, null));
        arestas.add(new aresta("LT_MT", vertices.get(24), vertices.get(25), null, null, null, null, null, null));
        arestas.add(new aresta("MT_AT", vertices.get(25), vertices.get(13), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(21), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(24), null, null, null, null, null, null));
        arestas.add(new aresta("M_MT", vertices.get(12), vertices.get(25), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("M_L")));
        vertices.get(encontraVertice("M")).setArestaVertice(arestas.get(encontraAresta("A_M")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        vertices.get(encontraVertice("MT")).setArestaVertice(arestas.get(encontraAresta("M_MT")));
        
        // Criação das faces
        faces.add(new face("B_A_M_L_K_J_I_H_G_F_E_D_C"              , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT" , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                              , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                              , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                              , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                              , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                              , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                              , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                              , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                              , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                              , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                              , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                              , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_M_MT_LT"                              , arestas.get(encontraAresta("M_MT"))));
        faces.add(new face("M_A_AT_MT"                              , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("M_L")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("A_M")).setFaces(faces.get(encontraFace("B_A_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("M_A_AT_MT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_MT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("MT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT")), faces.get(encontraFace("M_A_AT_MT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("M_A_AT_MT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("M_MT")).setFaces(faces.get(encontraFace("L_M_MT_LT")), faces.get(encontraFace("M_A_AT_MT")));
       
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_M")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("M_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("M_L")).setArestasEsquerda(arestas.get(encontraAresta("A_M")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("M_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("A_M")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("M_L")));
        arestas.get(encontraAresta("A_M")).setArestasDireita(arestas.get(encontraAresta("M_MT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("MT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_MT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_MT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("MT_AT")));
        arestas.get(encontraAresta("LT_MT")).setArestasDireita(arestas.get(encontraAresta("M_MT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("MT_AT")).setArestasEsquerda(arestas.get(encontraAresta("LT_MT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("MT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_M")), arestas.get(encontraAresta("MT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_MT")), arestas.get(encontraAresta("A_M")));
        
        arestas.get(encontraAresta("M_MT")).setArestasEsquerda(arestas.get(encontraAresta("M_L")), arestas.get(encontraAresta("LT_MT")));
        arestas.get(encontraAresta("M_MT")).setArestasDireita(arestas.get(encontraAresta("MT_AT")), arestas.get(encontraAresta("A_M")));
        
        
    }
    
    private void createN(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", -1, 2, 0, null));
        vertices.add(new vertice("D", 1, -0.5, 0, null));
        vertices.add(new vertice("E", 1, 2, 0, null));
        vertices.add(new vertice("F", 2, 2, 0, null));
        vertices.add(new vertice("G", 2, -2, 0, null));
        vertices.add(new vertice("H", 1, -2, 0, null));
        vertices.add(new vertice("I", -1, 0.5, 0, null));
        vertices.add(new vertice("J", -1, -2, 0, null));   
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", -1, 2, 0, null));
        vertices.add(new vertice("DT", 1, -0.5, 0, null));
        vertices.add(new vertice("ET", 1, 2, 0, null));
        vertices.add(new vertice("FT", 2, 2, 0, null));
        vertices.add(new vertice("GT", 2, -2, 0, null));
        vertices.add(new vertice("HT", 1, -2, 0, null));
        vertices.add(new vertice("IT", -1, 0.5, 0, null));
        vertices.add(new vertice("JT", -1, -2, 0, null)); 
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_J", vertices.get(0), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_AT", vertices.get(19), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8), vertices.get(18), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9), vertices.get(19), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("A_J")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        
        // Criação das faces
        faces.add(new face("B_A_J_I_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT"  , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                      , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                      , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                      , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                      , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                      , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                      , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_A_AT_JT"                      , arestas.get(encontraAresta("A_AT"))));
       
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("A_J")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_A_AT_JT")));
       
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("J_A_AT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_A_AT_JT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_J")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_J")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("A_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_AT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("JT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("A_J")));
        
    }
    
    private void createO(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, -2, 0, null));
        vertices.add(new vertice("E", -1.2, -1.2, 0, null));
        vertices.add(new vertice("F", -1.2, 1.2, 0, null));
        vertices.add(new vertice("G", 1.2, 1.2, 0, null));
        vertices.add(new vertice("H", 1.2, -1.2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, -2, 0, null));
        vertices.add(new vertice("ET", -1.2, -1.2, 0, null));
        vertices.add(new vertice("FT", -1.2, 1.2, 0, null));
        vertices.add(new vertice("GT", 1.2, 1.2, 0, null));
        vertices.add(new vertice("HT", 1.2, -1.2, 0, null));
        
        // Arestas da frente fora
        arestas.add(new aresta("A_D", vertices.get(0), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        
        // Arestas da frente dentro
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("H_E", vertices.get(7), vertices.get(4), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de trás fora
        arestas.add(new aresta("AT_BT", vertices.get(8), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("DT_AT", vertices.get(11), vertices.get(8), null, null, null, null, null, null));
        
        // Arestas de trás dentro
        arestas.add(new aresta("FT_ET", vertices.get(13), vertices.get(12), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_FT", vertices.get(14), vertices.get(13), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_GT", vertices.get(15), vertices.get(14), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("ET_HT", vertices.get(12), vertices.get(15), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás 
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(11), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás invertidas
        arestas.add(new aresta("ET_E", vertices.get(12), vertices.get(4), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("FT_F", vertices.get(13), vertices.get(5), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_G", vertices.get(14), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_H", vertices.get(15), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("A_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("E_F")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("F_G")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("G_H")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("H_E")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("ET_E")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("FT_F")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("GT_G")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("HT_H")));
        
        // Criação das faces
        faces.add(new face("B_A_D_C"        , arestas.get(encontraAresta("B_A")),false , true));
        faces.add(new face("AT_BT_CT_DT"    , arestas.get(encontraAresta("AT_BT")),false , true));
        faces.add(new face("A_B_BT_AT"      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_A_AT_DT"      , arestas.get(encontraAresta("A_AT"))));
        
        // Faces Internas
        faces.add(new face("E_F_FT_ET"      , arestas.get(encontraAresta("FT_ET")), true));
        faces.add(new face("F_G_GT_FT"      , arestas.get(encontraAresta("GT_FT")), true));
        faces.add(new face("G_H_HT_GT"      , arestas.get(encontraAresta("HT_GT")), true));
        faces.add(new face("H_E_ET_HT"      , arestas.get(encontraAresta("ET_HT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("A_D")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("E_F")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_G")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_H")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_E")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("H_E_ET_HT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("FT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("GT_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("HT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("ET_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("H_E_ET_HT")));
       
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("D_A_AT_DT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("ET_E")).setFacesInvertido(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("H_E_ET_HT")));
        arestas.get(encontraAresta("FT_F")).setFacesInvertido(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("GT_G")).setFacesInvertido(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("HT_H")).setFacesInvertido(faces.get(encontraFace("H_E_ET_HT")), faces.get(encontraFace("G_H_HT_GT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_D")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("A_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("A_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_D")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("E_F")).setArestasDireita(arestas.get(encontraAresta("FT_F")), arestas.get(encontraAresta("ET_E")));
        arestas.get(encontraAresta("E_F")).setArestasEsquerda(arestas.get(encontraAresta("H_E")), arestas.get(encontraAresta("F_G")));
        
        arestas.get(encontraAresta("F_G")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("FT_F")));
        arestas.get(encontraAresta("F_G")).setArestasEsquerda(arestas.get(encontraAresta("E_F")), arestas.get(encontraAresta("G_H")));
        
        arestas.get(encontraAresta("G_H")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("GT_G")));
        arestas.get(encontraAresta("G_H")).setArestasEsquerda(arestas.get(encontraAresta("F_G")), arestas.get(encontraAresta("H_E")));
        
        arestas.get(encontraAresta("H_E")).setArestasDireita(arestas.get(encontraAresta("ET_E")), arestas.get(encontraAresta("HT_H")));
        arestas.get(encontraAresta("H_E")).setArestasEsquerda(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("E_F")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("DT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_AT")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_AT")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("DT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("FT_ET")).setArestasEsquerda(arestas.get(encontraAresta("ET_HT")), arestas.get(encontraAresta("GT_FT")));
        arestas.get(encontraAresta("FT_ET")).setArestasDireita(arestas.get(encontraAresta("ET_E")), arestas.get(encontraAresta("FT_F")));
        
        arestas.get(encontraAresta("GT_FT")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("FT_ET")));
        arestas.get(encontraAresta("GT_FT")).setArestasDireita(arestas.get(encontraAresta("FT_F")), arestas.get(encontraAresta("GT_G")));
        
        arestas.get(encontraAresta("HT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_HT")), arestas.get(encontraAresta("GT_FT")));
        arestas.get(encontraAresta("HT_GT")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("HT_H")));
        
        arestas.get(encontraAresta("ET_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_ET")), arestas.get(encontraAresta("HT_GT")));
        arestas.get(encontraAresta("ET_HT")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("ET_E")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_D")), arestas.get(encontraAresta("DT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_AT")), arestas.get(encontraAresta("A_D")));
        
        arestas.get(encontraAresta("ET_E")).setArestasEsquerda(arestas.get(encontraAresta("ET_HT")), arestas.get(encontraAresta("H_E")));
        arestas.get(encontraAresta("ET_E")).setArestasDireita(arestas.get(encontraAresta("E_F")), arestas.get(encontraAresta("FT_ET")));
        
        arestas.get(encontraAresta("FT_F")).setArestasEsquerda(arestas.get(encontraAresta("FT_ET")), arestas.get(encontraAresta("E_F")));
        arestas.get(encontraAresta("FT_F")).setArestasDireita(arestas.get(encontraAresta("F_G")), arestas.get(encontraAresta("GT_FT")));
        
        arestas.get(encontraAresta("GT_G")).setArestasEsquerda(arestas.get(encontraAresta("GT_FT")), arestas.get(encontraAresta("F_G")));
        arestas.get(encontraAresta("GT_G")).setArestasDireita(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("HT_GT")));
        
        arestas.get(encontraAresta("HT_H")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("G_H")));
        arestas.get(encontraAresta("HT_H")).setArestasDireita(arestas.get(encontraAresta("H_E")), arestas.get(encontraAresta("ET_HT")));
        
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
    
    }
    
    
    private void createP(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, -0.4, 0, null));
        vertices.add(new vertice("E", -1, -0.4, 0, null));
        vertices.add(new vertice("F", -1, -2, 0, null));
        vertices.add(new vertice("G", -1, 0.4, 0, null));
        vertices.add(new vertice("H", -1, 1.2, 0, null));
        vertices.add(new vertice("I", 1.4, 1.2, 0, null));   
        vertices.add(new vertice("J", 1.4, 0.4, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, -0.4, 0, null));
        vertices.add(new vertice("ET", -1, -0.4, 0, null));
        vertices.add(new vertice("FT", -1, -2, 0, null));
        vertices.add(new vertice("GT", -1, 0.4, 0, null));
        vertices.add(new vertice("HT", -1, 1.2, 0, null));
        vertices.add(new vertice("IT", 1.4, 1.2, 0, null));   
        vertices.add(new vertice("JT", 1.4, 0.4, 0, null));
        
        // Arestas da frente fora
        arestas.add(new aresta("A_F", vertices.get(0), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        
        // Arestas da frente dentro
        arestas.add(new aresta("G_H", vertices.get(6),  vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("H_I", vertices.get(7),  vertices.get(8), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("I_J", vertices.get(8),  vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("J_G", vertices.get(9), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de trás fora
        arestas.add(new aresta("AT_BT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_AT", vertices.get(15), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas de trás dentro
        arestas.add(new aresta("HT_GT", vertices.get(17),  vertices.get(16), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_HT", vertices.get(18),  vertices.get(17), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_IT", vertices.get(19),  vertices.get(18), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_JT", vertices.get(16), vertices.get(19), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(15), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás invertidas
        arestas.add(new aresta("GT_G", vertices.get(16),  vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_H", vertices.get(17),  vertices.get(7), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_I", vertices.get(18),  vertices.get(8), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_J", vertices.get(19),  vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("A_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("G_H")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("H_I")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_J")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("J_G")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("GT_G")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("HT_H")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_I")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_J")));
        
        // Criação das faces
        faces.add(new face("B_A_F_E_D_C"        , arestas.get(encontraAresta("B_A")),false , true));
        faces.add(new face("AT_BT_CT_DT_ET_FT"  , arestas.get(encontraAresta("AT_BT")),false , true));
        faces.add(new face("A_B_BT_AT"          , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"          , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"          , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"          , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"          , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_A_AT_FT"          , arestas.get(encontraAresta("A_AT"))));
        
        // Faces Internas
        faces.add(new face("G_H_HT_GT"          , arestas.get(encontraAresta("HT_GT")), true));
        faces.add(new face("H_I_IT_HT"          , arestas.get(encontraAresta("IT_HT")), true));
        faces.add(new face("I_J_JT_IT"          , arestas.get(encontraAresta("JT_IT")), true));
        faces.add(new face("J_G_GT_JT"          , arestas.get(encontraAresta("GT_JT")), true));
       
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("A_F")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("G_H")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_I")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_J")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_G")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("J_G_GT_JT")));
      
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("HT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("IT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("GT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("J_G_GT_JT")));
       
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("F_A_AT_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("GT_G")).setFacesInvertido(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("J_G_GT_JT")));
        arestas.get(encontraAresta("HT_H")).setFacesInvertido(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("IT_I")).setFacesInvertido(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("JT_J")).setFacesInvertido(faces.get(encontraFace("J_G_GT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("A_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_F")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("G_H")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("GT_G")));
        arestas.get(encontraAresta("G_H")).setArestasEsquerda(arestas.get(encontraAresta("J_G")), arestas.get(encontraAresta("H_I")));
       
        arestas.get(encontraAresta("H_I")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("HT_H")));
        arestas.get(encontraAresta("H_I")).setArestasEsquerda(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("I_J")));
        
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("IT_I")));
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("H_I")), arestas.get(encontraAresta("J_G")));
        
        arestas.get(encontraAresta("J_G")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("JT_J")));
        arestas.get(encontraAresta("J_G")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("G_H")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_AT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("FT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("HT_GT")).setArestasEsquerda(arestas.get(encontraAresta("IT_HT")), arestas.get(encontraAresta("GT_JT")));
        arestas.get(encontraAresta("HT_GT")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("HT_H")));
        
        arestas.get(encontraAresta("IT_HT")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("HT_GT")));
        arestas.get(encontraAresta("IT_HT")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("IT_I")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_JT")), arestas.get(encontraAresta("IT_HT")));
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("JT_J")));
        
        arestas.get(encontraAresta("GT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("JT_IT")));
        arestas.get(encontraAresta("GT_JT")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("GT_G")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("GT_G")).setArestasEsquerda(arestas.get(encontraAresta("GT_JT")), arestas.get(encontraAresta("J_G")));
        arestas.get(encontraAresta("GT_G")).setArestasDireita(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("HT_GT")));
        
        arestas.get(encontraAresta("HT_H")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("G_H")));
        arestas.get(encontraAresta("HT_H")).setArestasDireita(arestas.get(encontraAresta("H_I")), arestas.get(encontraAresta("IT_HT")));
        
        arestas.get(encontraAresta("IT_I")).setArestasEsquerda(arestas.get(encontraAresta("IT_HT")), arestas.get(encontraAresta("H_I")));
        arestas.get(encontraAresta("IT_I")).setArestasDireita(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("JT_J")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("JT_J")).setArestasDireita(arestas.get(encontraAresta("J_G")), arestas.get(encontraAresta("GT_JT")));
      
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
    }
    
    private void createQ(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente da letra
        vertices.add(new vertice("A", -1.8, -1.8, 0, null));
        vertices.add(new vertice("B", -1.8, 1.8, 0.0, null));
        vertices.add(new vertice("C", 1.8, 1.8, 0, null));
        vertices.add(new vertice("D", 1.8, -1.8, 0, null));
        vertices.add(new vertice("E", 1.2, -1.8, 0, null));
        vertices.add(new vertice("F", 1.35, -2, 0, null));
        vertices.add(new vertice("G", 0.9, -2, 0, null));
        vertices.add(new vertice("H", 0.8, -1.8, 0, null));
        vertices.add(new vertice("I", -1, -1, 0, null));
        vertices.add(new vertice("J", -1, 1, 0, null));   
        vertices.add(new vertice("K", 1, 1, 0, null));
        vertices.add(new vertice("L", 1, -1, 0, null));
        vertices.add(new vertice("M", 0.85, -1, 0, null));
        vertices.add(new vertice("N", 0.75, -0.8, 0, null));
        vertices.add(new vertice("O", 0.35, -0.8, 0, null));
        vertices.add(new vertice("P", 0.45, -1, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -1.8, -1.8, 0, null));
        vertices.add(new vertice("BT", -1.8, 1.8, 0.0, null));
        vertices.add(new vertice("CT", 1.8, 1.8, 0, null));
        vertices.add(new vertice("DT", 1.8, -1.8, 0, null));
        vertices.add(new vertice("ET", 1.2, -1.8, 0, null));
        vertices.add(new vertice("FT", 1.35, -2, 0, null));
        vertices.add(new vertice("GT", 0.9, -2, 0, null));
        vertices.add(new vertice("HT", 0.8, -1.8, 0, null));
        vertices.add(new vertice("IT", -1, -1, 0, null));
        vertices.add(new vertice("JT", -1, 1, 0, null));   
        vertices.add(new vertice("KT", 1, 1, 0, null));
        vertices.add(new vertice("LT", 1, -1, 0, null));
        vertices.add(new vertice("MT", 0.85, -1, 0, null));
        vertices.add(new vertice("NT", 0.75, -0.8, 0, null));
        vertices.add(new vertice("OT", 0.35, -0.8, 0, null));
        vertices.add(new vertice("PT", 0.45, -1, 0, null));
        
        // Arestas da frente da letra fora
        arestas.add(new aresta("A_H", vertices.get(0), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        
        // Arestas da frente da letra dentro
        arestas.add(new aresta("I_J", vertices.get(8),  vertices.get(9), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("J_K", vertices.get(9),  vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("L_M", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("M_N", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("N_O", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("O_P", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("P_I", vertices.get(15), vertices.get(8), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de trás da letra fora
        arestas.add(new aresta("AT_BT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(19), vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(21), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("HT_AT", vertices.get(23), vertices.get(16), null, null, null, null, null, null));
        
        // Arestas da trás da letra dentro
        arestas.add(new aresta("JT_IT", vertices.get(25),  vertices.get(24), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_JT", vertices.get(26),  vertices.get(25), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_KT", vertices.get(27), vertices.get(26), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("MT_LT", vertices.get(28), vertices.get(27), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("NT_MT", vertices.get(29), vertices.get(28), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("OT_NT", vertices.get(30), vertices.get(29), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("PT_OT", vertices.get(31), vertices.get(30), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_PT", vertices.get(24), vertices.get(31), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(23), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra invertidas
        arestas.add(new aresta("IT_I", vertices.get(24),  vertices.get(8), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_J", vertices.get(25),  vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_K", vertices.get(26), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_L", vertices.get(27), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("MT_M", vertices.get(28), vertices.get(12), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("NT_N", vertices.get(29), vertices.get(13), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("OT_O", vertices.get(30), vertices.get(14), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("PT_P", vertices.get(31), vertices.get(15), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("A_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_J")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("J_K")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("K_L")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("L_M")));
        vertices.get(encontraVertice("M")).setArestaVertice(arestas.get(encontraAresta("M_N")));
        vertices.get(encontraVertice("N")).setArestaVertice(arestas.get(encontraAresta("N_O")));
        vertices.get(encontraVertice("O")).setArestaVertice(arestas.get(encontraAresta("O_P")));
        vertices.get(encontraVertice("P")).setArestaVertice(arestas.get(encontraAresta("P_I")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_I")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_J")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("KT_K")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("LT_L")));
        vertices.get(encontraVertice("MT")).setArestaVertice(arestas.get(encontraAresta("MT_M")));
        vertices.get(encontraVertice("NT")).setArestaVertice(arestas.get(encontraAresta("NT_N")));
        vertices.get(encontraVertice("OT")).setArestaVertice(arestas.get(encontraAresta("OT_O")));
        vertices.get(encontraVertice("PT")).setArestaVertice(arestas.get(encontraAresta("PT_P")));
        
        // Criação das faces
        faces.add(new face("B_A_H_G_F_E_D_C"         , arestas.get(encontraAresta("B_A")),false , true));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT" , arestas.get(encontraAresta("AT_BT")),false , true));
        faces.add(new face("A_B_BT_AT"               , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"               , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"               , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"               , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"               , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"               , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"               , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_A_AT_HT"               , arestas.get(encontraAresta("A_AT"))));
        
        // Faces Internas
        faces.add(new face("I_J_JT_IT"               , arestas.get(encontraAresta("JT_IT")), true));
        faces.add(new face("J_K_KT_JT"               , arestas.get(encontraAresta("KT_JT")), true));
        faces.add(new face("K_L_LT_KT"               , arestas.get(encontraAresta("LT_KT")), true));
        faces.add(new face("L_M_MT_LT"               , arestas.get(encontraAresta("MT_LT")), true));
        faces.add(new face("M_N_NT_MT"               , arestas.get(encontraAresta("NT_MT")), true));
        faces.add(new face("N_O_OT_NT"               , arestas.get(encontraAresta("OT_NT")), true));
        faces.add(new face("O_P_PT_OT"               , arestas.get(encontraAresta("PT_OT")), true));
        faces.add(new face("P_I_IT_PT"               , arestas.get(encontraAresta("IT_PT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("I_J")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_K")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_L")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_M")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("M_N")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("N_O")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("N_O_OT_NT")));
        arestas.get(encontraAresta("O_P")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("O_P_PT_OT")));
        arestas.get(encontraAresta("P_I")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("P_I_IT_PT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("MT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("NT_MT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("OT_NT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("N_O_OT_NT")));
        arestas.get(encontraAresta("PT_OT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("O_P_PT_OT")));
        arestas.get(encontraAresta("IT_PT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("P_I_IT_PT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("IT_I")).setFacesInvertido(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("P_I_IT_PT")));
        arestas.get(encontraAresta("JT_J")).setFacesInvertido(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_K")).setFacesInvertido(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_L")).setFacesInvertido(faces.get(encontraFace("L_M_MT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("MT_M")).setFacesInvertido(faces.get(encontraFace("M_N_NT_MT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("NT_N")).setFacesInvertido(faces.get(encontraFace("N_O_OT_NT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("OT_O")).setFacesInvertido(faces.get(encontraFace("O_P_PT_OT")), faces.get(encontraFace("N_O_OT_NT")));
        arestas.get(encontraAresta("PT_P")).setFacesInvertido(faces.get(encontraFace("P_I_IT_PT")), faces.get(encontraFace("O_P_PT_OT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("A_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_H")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("P_I")), arestas.get(encontraAresta("J_K")));
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("IT_I")));
        
        arestas.get(encontraAresta("J_K")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("J_K")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("JT_J")));
        
        arestas.get(encontraAresta("K_L")).setArestasEsquerda(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("L_M")));
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("L_M")).setArestasEsquerda(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("M_N")));
        arestas.get(encontraAresta("L_M")).setArestasDireita(arestas.get(encontraAresta("MT_M")), arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("M_N")).setArestasEsquerda(arestas.get(encontraAresta("L_M")), arestas.get(encontraAresta("N_O")));
        arestas.get(encontraAresta("M_N")).setArestasDireita(arestas.get(encontraAresta("NT_N")), arestas.get(encontraAresta("MT_M")));
        
        arestas.get(encontraAresta("N_O")).setArestasEsquerda(arestas.get(encontraAresta("M_N")), arestas.get(encontraAresta("O_P")));
        arestas.get(encontraAresta("N_O")).setArestasDireita(arestas.get(encontraAresta("OT_O")), arestas.get(encontraAresta("NT_N")));
        
        arestas.get(encontraAresta("O_P")).setArestasEsquerda(arestas.get(encontraAresta("N_O")), arestas.get(encontraAresta("P_I")));
        arestas.get(encontraAresta("O_P")).setArestasDireita(arestas.get(encontraAresta("PT_P")), arestas.get(encontraAresta("OT_O")));
        
        arestas.get(encontraAresta("P_I")).setArestasEsquerda(arestas.get(encontraAresta("O_P")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("P_I")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("PT_P")));
        
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_AT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("HT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("IT_PT")));
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("JT_J")));
        
        arestas.get(encontraAresta("KT_JT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("JT_IT")));
        arestas.get(encontraAresta("KT_JT")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("MT_LT")), arestas.get(encontraAresta("KT_JT")));
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("MT_LT")).setArestasEsquerda(arestas.get(encontraAresta("NT_MT")), arestas.get(encontraAresta("LT_KT")));
        arestas.get(encontraAresta("MT_LT")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("MT_M")));
        
        arestas.get(encontraAresta("NT_MT")).setArestasEsquerda(arestas.get(encontraAresta("OT_NT")), arestas.get(encontraAresta("MT_LT")));
        arestas.get(encontraAresta("NT_MT")).setArestasDireita(arestas.get(encontraAresta("MT_M")), arestas.get(encontraAresta("NT_N")));
        
        arestas.get(encontraAresta("OT_NT")).setArestasEsquerda(arestas.get(encontraAresta("PT_OT")), arestas.get(encontraAresta("NT_MT")));
        arestas.get(encontraAresta("OT_NT")).setArestasDireita(arestas.get(encontraAresta("NT_N")), arestas.get(encontraAresta("OT_O")));
        
        arestas.get(encontraAresta("PT_OT")).setArestasEsquerda(arestas.get(encontraAresta("IT_PT")), arestas.get(encontraAresta("OT_NT")));
        arestas.get(encontraAresta("PT_OT")).setArestasDireita(arestas.get(encontraAresta("OT_O")), arestas.get(encontraAresta("PT_P")));
        
        arestas.get(encontraAresta("IT_PT")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("PT_OT")));
        arestas.get(encontraAresta("IT_PT")).setArestasDireita(arestas.get(encontraAresta("PT_P")), arestas.get(encontraAresta("IT_I")));
        
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("IT_I")).setArestasEsquerda(arestas.get(encontraAresta("IT_PT")), arestas.get(encontraAresta("P_I")));
        arestas.get(encontraAresta("IT_I")).setArestasDireita(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("JT_J")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("JT_J")).setArestasDireita(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("KT_K")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("J_K")));
        arestas.get(encontraAresta("KT_K")).setArestasDireita(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("LT_KT")));
        
        arestas.get(encontraAresta("LT_L")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("LT_L")).setArestasDireita(arestas.get(encontraAresta("L_M")), arestas.get(encontraAresta("MT_LT")));
        
        arestas.get(encontraAresta("MT_M")).setArestasEsquerda(arestas.get(encontraAresta("MT_LT")), arestas.get(encontraAresta("L_M")));
        arestas.get(encontraAresta("MT_M")).setArestasDireita(arestas.get(encontraAresta("M_N")), arestas.get(encontraAresta("NT_MT")));
        
        arestas.get(encontraAresta("NT_N")).setArestasEsquerda(arestas.get(encontraAresta("NT_MT")), arestas.get(encontraAresta("M_N")));
        arestas.get(encontraAresta("NT_N")).setArestasDireita(arestas.get(encontraAresta("N_O")), arestas.get(encontraAresta("OT_NT")));
        
        arestas.get(encontraAresta("OT_O")).setArestasEsquerda(arestas.get(encontraAresta("OT_NT")), arestas.get(encontraAresta("N_O")));
        arestas.get(encontraAresta("OT_O")).setArestasDireita(arestas.get(encontraAresta("O_P")), arestas.get(encontraAresta("PT_OT")));
        
        arestas.get(encontraAresta("PT_P")).setArestasEsquerda(arestas.get(encontraAresta("PT_OT")), arestas.get(encontraAresta("O_P")));
        arestas.get(encontraAresta("PT_P")).setArestasDireita(arestas.get(encontraAresta("P_I")), arestas.get(encontraAresta("IT_PT")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
    }
    
    private void createR(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, 0, 0, null));
        vertices.add(new vertice("E", 0.5, 0, 0, null));
        vertices.add(new vertice("F", 1.5, -2, 0, null));
        vertices.add(new vertice("G", 0.5, -2, 0, null));
        vertices.add(new vertice("H", -0.5, 0, 0, null));
        vertices.add(new vertice("I", -1, 0, 0, null));
        vertices.add(new vertice("J", -1, -2, 0, null));   
        vertices.add(new vertice("K", -1, 0.5, 0, null));
        vertices.add(new vertice("L", -1, 1.5, 0, null));
        vertices.add(new vertice("M", 1, 1.5, 0, null));
        vertices.add(new vertice("N", 1, 0.5, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, 0, 0, null));
        vertices.add(new vertice("ET", 0.5, 0, 0, null));
        vertices.add(new vertice("FT", 1.5, -2, 0, null));
        vertices.add(new vertice("GT", 0.5, -2, 0, null));
        vertices.add(new vertice("HT", -0.5, 0, 0, null));
        vertices.add(new vertice("IT", -1, 0, 0, null));
        vertices.add(new vertice("JT", -1, -2, 0, null));   
        vertices.add(new vertice("KT", -1, 0.5, 0, null));
        vertices.add(new vertice("LT", -1, 1.5, 0, null));
        vertices.add(new vertice("MT", 1, 1.5, 0, null));
        vertices.add(new vertice("NT", 1, 0.5, 0, null));
        
        // Arestas da frente da letra fora
        arestas.add(new aresta("A_J", vertices.get(0), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        
        // Arestas da frente da letra dentro
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("L_M", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("M_N", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("N_K", vertices.get(13), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de trás da letra fora
        arestas.add(new aresta("AT_BT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(19), vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(21), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_AT", vertices.get(23), vertices.get(14), null, null, null, null, null, null));
        
        // Arestas de trás da letra dentro
        arestas.add(new aresta("LT_KT", vertices.get(25), vertices.get(24), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("MT_LT", vertices.get(26), vertices.get(25), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("NT_MT", vertices.get(27), vertices.get(26), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_NT", vertices.get(24), vertices.get(27), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás da letra fora
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8), vertices.get(22), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9), vertices.get(23), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra fora invertidas
        arestas.add(new aresta("KT_K", vertices.get(24), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_L", vertices.get(25), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("MT_M", vertices.get(26), vertices.get(12), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("NT_N", vertices.get(27), vertices.get(13), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        //Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("A_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("K_L")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("L_M")));
        vertices.get(encontraVertice("M")).setArestaVertice(arestas.get(encontraAresta("M_N")));
        vertices.get(encontraVertice("N")).setArestaVertice(arestas.get(encontraAresta("N_K")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("KT_K")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("LT_L")));
        vertices.get(encontraVertice("MT")).setArestaVertice(arestas.get(encontraAresta("MT_M")));
        vertices.get(encontraVertice("NT")).setArestaVertice(arestas.get(encontraAresta("NT_N")));
        
        // Criação das faces
        faces.add(new face("B_A_J_I_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A")),false , true));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT"  , arestas.get(encontraAresta("AT_BT")),false , true));
        faces.add(new face("A_B_BT_AT"                      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                      , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                      , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                      , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                      , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                      , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                      , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_A_AT_JT"                      , arestas.get(encontraAresta("A_AT"))));
        
        // Faces Internas
        faces.add(new face("K_L_LT_KT"               , arestas.get(encontraAresta("LT_KT")), true));
        faces.add(new face("L_M_MT_LT"               , arestas.get(encontraAresta("MT_LT")), true));
        faces.add(new face("M_N_NT_MT"               , arestas.get(encontraAresta("NT_MT")), true));
        faces.add(new face("N_K_KT_NT"               , arestas.get(encontraAresta("KT_NT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("A_J")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("K_L")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_M")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("M_N")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("N_K")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("N_K_KT_NT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("MT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("NT_MT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("KT_NT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("N_K_KT_NT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("J_A_AT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("KT_K")).setFacesInvertido(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("N_K_KT_NT")));
        arestas.get(encontraAresta("LT_L")).setFacesInvertido(faces.get(encontraFace("L_M_MT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("MT_M")).setFacesInvertido(faces.get(encontraFace("M_N_NT_MT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("NT_N")).setFacesInvertido(faces.get(encontraFace("N_K_KT_NT")), faces.get(encontraFace("M_N_NT_MT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_J")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_J")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("A_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("K_L")).setArestasEsquerda(arestas.get(encontraAresta("N_K")), arestas.get(encontraAresta("L_M")));
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("L_M")).setArestasEsquerda(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("M_N")));
        arestas.get(encontraAresta("L_M")).setArestasDireita(arestas.get(encontraAresta("MT_M")), arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("M_N")).setArestasEsquerda(arestas.get(encontraAresta("L_M")), arestas.get(encontraAresta("N_K")));
        arestas.get(encontraAresta("M_N")).setArestasDireita(arestas.get(encontraAresta("NT_N")), arestas.get(encontraAresta("MT_M")));
        
        arestas.get(encontraAresta("N_K")).setArestasEsquerda(arestas.get(encontraAresta("M_N")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("N_K")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("NT_N")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_AT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("JT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("MT_LT")), arestas.get(encontraAresta("KT_NT")));
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("MT_LT")).setArestasEsquerda(arestas.get(encontraAresta("NT_MT")), arestas.get(encontraAresta("LT_KT")));
        arestas.get(encontraAresta("MT_LT")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("MT_M")));
        
        arestas.get(encontraAresta("NT_MT")).setArestasEsquerda(arestas.get(encontraAresta("KT_NT")), arestas.get(encontraAresta("MT_LT")));
        arestas.get(encontraAresta("NT_MT")).setArestasDireita(arestas.get(encontraAresta("MT_M")), arestas.get(encontraAresta("NT_N")));
        
        arestas.get(encontraAresta("KT_NT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("NT_MT")));
        arestas.get(encontraAresta("KT_NT")).setArestasDireita(arestas.get(encontraAresta("NT_N")), arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("A_J")));
        
        arestas.get(encontraAresta("KT_K")).setArestasEsquerda(arestas.get(encontraAresta("KT_NT")), arestas.get(encontraAresta("N_K")));
        arestas.get(encontraAresta("KT_K")).setArestasDireita(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("LT_KT")));
        
        arestas.get(encontraAresta("LT_L")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("LT_L")).setArestasDireita(arestas.get(encontraAresta("L_M")), arestas.get(encontraAresta("MT_LT")));
        
        arestas.get(encontraAresta("MT_M")).setArestasEsquerda(arestas.get(encontraAresta("MT_LT")), arestas.get(encontraAresta("L_M")));
        arestas.get(encontraAresta("MT_M")).setArestasDireita(arestas.get(encontraAresta("M_N")), arestas.get(encontraAresta("NT_MT")));
        
        arestas.get(encontraAresta("NT_N")).setArestasEsquerda(arestas.get(encontraAresta("NT_MT")), arestas.get(encontraAresta("M_N")));
        arestas.get(encontraAresta("NT_N")).setArestasDireita(arestas.get(encontraAresta("N_K")), arestas.get(encontraAresta("KT_NT")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
      
    }
    
    private void createS(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, -1, 0.0, null));
        vertices.add(new vertice("C", 1, -1, 0, null));
        vertices.add(new vertice("D", 1, -0.4, 0, null));
        vertices.add(new vertice("E", -2, -0.4, 0, null));
        vertices.add(new vertice("F", -2, 2, 0, null));
        vertices.add(new vertice("G", 2, 2, 0, null));
        vertices.add(new vertice("H", 2, 1.2, 0, null));
        vertices.add(new vertice("I", -1, 1.2, 0, null));
        vertices.add(new vertice("J", -1, 0.4, 0, null));   
        vertices.add(new vertice("K", 2, 0.4, 0, null));
        vertices.add(new vertice("L", 2, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, -1, 0.0, null));
        vertices.add(new vertice("CT", 1, -1, 0, null));
        vertices.add(new vertice("DT", 1, -0.4, 0, null));
        vertices.add(new vertice("ET", -2, -0.4, 0, null));
        vertices.add(new vertice("FT", -2, 2, 0, null));
        vertices.add(new vertice("GT", 2, 2, 0, null));
        vertices.add(new vertice("HT", 2, 1.2, 0, null));
        vertices.add(new vertice("IT", -1, 1.2, 0, null));
        vertices.add(new vertice("JT", -1, 0.4, 0, null));   
        vertices.add(new vertice("KT", 2, 0.4, 0, null));
        vertices.add(new vertice("LT", 2, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_L", vertices.get(0),  vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1),  vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2),  vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3),  vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4),  vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5),  vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6),  vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7),  vertices.get(6), null, null, null, null, null, null));  
        arestas.add(new aresta("I_H", vertices.get(8),  vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9),  vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(12),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(19),  vertices.get(20), null, null, null, null, null, null));  
        arestas.add(new aresta("IT_JT", vertices.get(20),  vertices.get(21), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(21),  vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(22),  vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("LT_AT", vertices.get(23),  vertices.get(12), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(19), null, null, null, null, null, null));  
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(20), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(23), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("A_L")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        
        // Criação das faces
        faces.add(new face("B_A_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                              , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                              , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                              , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                              , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                              , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                              , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                              , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                              , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                              , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                              , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                              , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_A_AT_LT"                              , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("A_L")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_A_AT_LT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("L_A_AT_LT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("L_A_AT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_A_AT_LT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_L")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_L")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("A_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_AT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("LT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("A_L")));
        
        
    }
    
    private void createT(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, 2, 0, null));
        vertices.add(new vertice("B", 2, 2, 0.0, null));
        vertices.add(new vertice("C", 2, 1, 0, null));
        vertices.add(new vertice("D", 0.5, 1, 0, null));
        vertices.add(new vertice("E", 0.5, -2, 0, null));
        vertices.add(new vertice("F", -0.5, -2, 0, null));
        vertices.add(new vertice("G", -0.5, 1, 0, null));
        vertices.add(new vertice("H", -2, 1, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, 2, 0, null));
        vertices.add(new vertice("BT", 2, 2, 0.0, null));
        vertices.add(new vertice("CT", 2, 1, 0, null));
        vertices.add(new vertice("DT", 0.5, 1, 0, null));
        vertices.add(new vertice("ET", 0.5, -2, 0, null));
        vertices.add(new vertice("FT", -0.5, -2, 0, null));
        vertices.add(new vertice("GT", -0.5, 1, 0, null));
        vertices.add(new vertice("HT", -2, 1, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_H", vertices.get(0), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));  
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(8), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("HT_AT", vertices.get(15), vertices.get(8), null, null, null, null, null, null));  
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(15), null, null, null, null, null, null));  
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("A_H")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        
        // Criação das faces
        faces.add(new face("B_A_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                  , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                  , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                  , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                  , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_A_AT_HT"                  , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("H_A_AT_HT")));
       
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_A_AT_HT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("A_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_H")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("H_G")));

        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_AT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("HT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("A_H")));
    }
    
    private void createU(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", -1, 2, 0, null));
        vertices.add(new vertice("D", -1, -1, 0, null));
        vertices.add(new vertice("E", 1, -1, 0, null));
        vertices.add(new vertice("F", 1, 2, 0, null));
        vertices.add(new vertice("G", 2, 2, 0, null));
        vertices.add(new vertice("H", 2, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", -1, 2, 0, null));
        vertices.add(new vertice("DT", -1, -1, 0, null));
        vertices.add(new vertice("ET", 1, -1, 0, null));
        vertices.add(new vertice("FT", 1, 2, 0, null));
        vertices.add(new vertice("GT", 2, 2, 0, null));
        vertices.add(new vertice("HT", 2, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_H", vertices.get(0), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));  
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(8),  vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(9),  vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("HT_AT", vertices.get(15), vertices.get(8), null, null, null, null, null, null));  
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(15), null, null, null, null, null, null));  
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("A_H")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        
        // Criação das faces
        faces.add(new face("B_A_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                  , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                  , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                  , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                  , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_A_AT_HT"                  , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("H_A_AT_HT")));
       
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_A_AT_HT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("A_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_H")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("H_G")));

        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_AT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("HT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("A_H")));
        
        
    }
    
    private void createV(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, 2, 0, null));
        vertices.add(new vertice("B", -1, 2, 0.0, null));
        vertices.add(new vertice("C", -0.25, -1, 0, null));
        vertices.add(new vertice("D", 0.25, -1, 0, null));
        vertices.add(new vertice("E", 1, 2, 0, null));
        vertices.add(new vertice("F", 2, 2, 0, null));
        vertices.add(new vertice("G", 1, -2, 0, null));
        vertices.add(new vertice("H", -1, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, 2, 0, null));
        vertices.add(new vertice("BT", -1, 2, 0.0, null));
        vertices.add(new vertice("CT", -0.25, -1, 0, null));
        vertices.add(new vertice("DT", 0.25, -1, 0, null));
        vertices.add(new vertice("ET", 1, 2, 0, null));
        vertices.add(new vertice("FT", 2, 2, 0, null));
        vertices.add(new vertice("GT", 1, -2, 0, null));
        vertices.add(new vertice("HT", -1, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_H", vertices.get(0), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));  
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(8),  vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(9),  vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("HT_AT", vertices.get(15), vertices.get(8), null, null, null, null, null, null));  
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(15), null, null, null, null, null, null));  
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("A_H")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        
        // Criação das faces
        faces.add(new face("B_A_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                  , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                  , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                  , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                  , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_A_AT_HT"                  , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("H_A_AT_HT")));
       
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_A_AT_HT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("A_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_H")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("H_G")));

        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_AT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("HT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("A_H")));
    }
    
    private void createW(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, 2, 0, null));
        vertices.add(new vertice("B", -1.5, 2, 0.0, null));
        vertices.add(new vertice("C", -1.1, -1.6, 0, null));
        vertices.add(new vertice("D", -0.8, -1.6, 0, null));
        vertices.add(new vertice("E", -0.6, 1.8, 0, null));
        vertices.add(new vertice("F", 0.6, 1.8, 0, null));
        vertices.add(new vertice("G", 0.8, -1.6, 0, null));
        vertices.add(new vertice("H", 1.1, -1.6, 0, null));
        vertices.add(new vertice("I", 1.5, 2, 0, null));
        vertices.add(new vertice("J", 2, 2, 0, null));   
        vertices.add(new vertice("K", 1.5, -2, 0, null));
        vertices.add(new vertice("L", 0.4, -2, 0, null));
        vertices.add(new vertice("M", 0.1, 1.4, 0, null));
        vertices.add(new vertice("N", -0.2, 1.4, 0, null));
        vertices.add(new vertice("O", -0.4, -2, 0, null));
        vertices.add(new vertice("P", -1.5, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, 2, 0, null));
        vertices.add(new vertice("BT", -1.5, 2, 0.0, null));
        vertices.add(new vertice("CT", -1.1, -1.6, 0, null));
        vertices.add(new vertice("DT", -0.8, -1.6, 0, null));
        vertices.add(new vertice("ET", -0.6, 1.8, 0, null));
        vertices.add(new vertice("FT", 0.6, 1.8, 0, null));
        vertices.add(new vertice("GT", 0.8, -1.6, 0, null));
        vertices.add(new vertice("HT", 1.1, -1.6, 0, null));
        vertices.add(new vertice("IT", 1.5, 2, 0, null));
        vertices.add(new vertice("JT", 2, 2, 0, null));   
        vertices.add(new vertice("KT", 1.5, -2, 0, null));
        vertices.add(new vertice("LT", 0.4, -2, 0, null));
        vertices.add(new vertice("MT", 0.1, 1.4, 0, null));
        vertices.add(new vertice("NT", -0.2, 1.4, 0, null));
        vertices.add(new vertice("OT", -0.4, -2, 0, null));
        vertices.add(new vertice("PT", -1.5, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_P", vertices.get(0),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1),  vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2),  vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3),  vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4),  vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5),  vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6),  vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7),  vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8),  vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9),  vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("M_L", vertices.get(12), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("N_M", vertices.get(13), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("O_N", vertices.get(14), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("P_O", vertices.get(15), vertices.get(14), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(16),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(17),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(18),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(19),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(20),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(21),  vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(22),  vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(23),  vertices.get(24), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(24),  vertices.get(25), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(25),  vertices.get(26), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(26),  vertices.get(27), null, null, null, null, null, null));
        arestas.add(new aresta("LT_MT", vertices.get(27),  vertices.get(28), null, null, null, null, null, null));
        arestas.add(new aresta("MT_NT", vertices.get(28),  vertices.get(29), null, null, null, null, null, null));
        arestas.add(new aresta("NT_OT", vertices.get(29),  vertices.get(30), null, null, null, null, null, null));
        arestas.add(new aresta("OT_PT", vertices.get(30),  vertices.get(31), null, null, null, null, null, null));
        arestas.add(new aresta("PT_AT", vertices.get(31),  vertices.get(16), null, null, null, null, null, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(24), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(25), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(26), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(27), null, null, null, null, null, null));
        arestas.add(new aresta("M_MT", vertices.get(12), vertices.get(28), null, null, null, null, null, null));
        arestas.add(new aresta("N_NT", vertices.get(13), vertices.get(29), null, null, null, null, null, null));
        arestas.add(new aresta("O_OT", vertices.get(14), vertices.get(30), null, null, null, null, null, null));
        arestas.add(new aresta("P_PT", vertices.get(15), vertices.get(31), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("M_L")));
        vertices.get(encontraVertice("M")).setArestaVertice(arestas.get(encontraAresta("N_M")));
        vertices.get(encontraVertice("N")).setArestaVertice(arestas.get(encontraAresta("O_N")));
        vertices.get(encontraVertice("O")).setArestaVertice(arestas.get(encontraAresta("P_O")));
        vertices.get(encontraVertice("P")).setArestaVertice(arestas.get(encontraAresta("A_P")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        vertices.get(encontraVertice("MT")).setArestaVertice(arestas.get(encontraAresta("M_MT")));
        vertices.get(encontraVertice("NT")).setArestaVertice(arestas.get(encontraAresta("N_NT")));
        vertices.get(encontraVertice("OT")).setArestaVertice(arestas.get(encontraAresta("O_OT")));
        vertices.get(encontraVertice("PT")).setArestaVertice(arestas.get(encontraAresta("P_PT")));
        
        // Criação das faces
        faces.add(new face("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT"   , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                                      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                                      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                                      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                                      , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                                      , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                                      , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                                      , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                                      , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                                      , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                                      , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                                      , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_M_MT_LT"                                      , arestas.get(encontraAresta("M_MT"))));
        faces.add(new face("M_N_NT_MT"                                      , arestas.get(encontraAresta("N_NT"))));
        faces.add(new face("N_O_OT_NT"                                      , arestas.get(encontraAresta("O_OT"))));
        faces.add(new face("O_P_PT_OT"                                      , arestas.get(encontraAresta("P_PT"))));
        faces.add(new face("P_A_AT_PT"                                      , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("M_L")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("N_M")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("O_N")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("N_O_OT_NT")));
        arestas.get(encontraAresta("P_O")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("O_P_PT_OT")));
        arestas.get(encontraAresta("A_P")).setFaces(faces.get(encontraFace("B_A_P_O_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("P_A_AT_PT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_MT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("MT_NT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("NT_OT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("N_O_OT_NT")));
        arestas.get(encontraAresta("OT_PT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("O_P_PT_OT")));
        arestas.get(encontraAresta("PT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT_OT_PT")), faces.get(encontraFace("P_A_AT_PT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("P_A_AT_PT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("M_MT")).setFaces(faces.get(encontraFace("L_M_MT_LT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("N_NT")).setFaces(faces.get(encontraFace("M_N_NT_MT")), faces.get(encontraFace("N_O_OT_NT")));
        arestas.get(encontraAresta("O_OT")).setFaces(faces.get(encontraFace("N_O_OT_NT")), faces.get(encontraFace("O_P_PT_OT")));
        arestas.get(encontraAresta("P_PT")).setFaces(faces.get(encontraFace("O_P_PT_OT")), faces.get(encontraFace("P_A_AT_PT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_P")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("M_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("M_L")).setArestasEsquerda(arestas.get(encontraAresta("N_M")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("M_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("N_M")).setArestasEsquerda(arestas.get(encontraAresta("O_N")), arestas.get(encontraAresta("M_L")));
        arestas.get(encontraAresta("N_M")).setArestasDireita(arestas.get(encontraAresta("M_MT")), arestas.get(encontraAresta("N_NT")));
        
        arestas.get(encontraAresta("O_N")).setArestasEsquerda(arestas.get(encontraAresta("P_O")), arestas.get(encontraAresta("N_M")));
        arestas.get(encontraAresta("O_N")).setArestasDireita(arestas.get(encontraAresta("N_NT")), arestas.get(encontraAresta("O_OT")));
        
        arestas.get(encontraAresta("P_O")).setArestasEsquerda(arestas.get(encontraAresta("A_P")), arestas.get(encontraAresta("O_N")));
        arestas.get(encontraAresta("P_O")).setArestasDireita(arestas.get(encontraAresta("O_OT")), arestas.get(encontraAresta("P_PT")));
        
        arestas.get(encontraAresta("A_P")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("P_O")));
        arestas.get(encontraAresta("A_P")).setArestasDireita(arestas.get(encontraAresta("P_PT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("PT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_MT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_MT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("MT_NT")));
        arestas.get(encontraAresta("LT_MT")).setArestasDireita(arestas.get(encontraAresta("M_MT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("MT_NT")).setArestasEsquerda(arestas.get(encontraAresta("LT_MT")), arestas.get(encontraAresta("NT_OT")));
        arestas.get(encontraAresta("MT_NT")).setArestasDireita(arestas.get(encontraAresta("N_NT")), arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("NT_OT")).setArestasEsquerda(arestas.get(encontraAresta("MT_NT")), arestas.get(encontraAresta("OT_PT")));
        arestas.get(encontraAresta("NT_OT")).setArestasDireita(arestas.get(encontraAresta("O_OT")), arestas.get(encontraAresta("N_NT")));
        
        arestas.get(encontraAresta("OT_PT")).setArestasEsquerda(arestas.get(encontraAresta("NT_OT")), arestas.get(encontraAresta("PT_AT")));
        arestas.get(encontraAresta("OT_PT")).setArestasDireita(arestas.get(encontraAresta("P_PT")), arestas.get(encontraAresta("O_OT")));
        
        arestas.get(encontraAresta("PT_AT")).setArestasEsquerda(arestas.get(encontraAresta("OT_PT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("PT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("P_PT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_P")), arestas.get(encontraAresta("PT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_MT")), arestas.get(encontraAresta("M_L")));
        
        arestas.get(encontraAresta("M_MT")).setArestasEsquerda(arestas.get(encontraAresta("M_L")), arestas.get(encontraAresta("LT_MT")));
        arestas.get(encontraAresta("M_MT")).setArestasDireita(arestas.get(encontraAresta("MT_NT")), arestas.get(encontraAresta("N_M")));
        
        arestas.get(encontraAresta("N_NT")).setArestasEsquerda(arestas.get(encontraAresta("N_M")), arestas.get(encontraAresta("MT_NT")));
        arestas.get(encontraAresta("N_NT")).setArestasDireita(arestas.get(encontraAresta("NT_OT")), arestas.get(encontraAresta("O_N")));
        
        arestas.get(encontraAresta("O_OT")).setArestasEsquerda(arestas.get(encontraAresta("O_N")), arestas.get(encontraAresta("NT_OT")));
        arestas.get(encontraAresta("O_OT")).setArestasDireita(arestas.get(encontraAresta("OT_PT")), arestas.get(encontraAresta("P_O")));
        
        arestas.get(encontraAresta("P_PT")).setArestasEsquerda(arestas.get(encontraAresta("P_O")), arestas.get(encontraAresta("OT_PT")));
        arestas.get(encontraAresta("P_PT")).setArestasDireita(arestas.get(encontraAresta("PT_AT")), arestas.get(encontraAresta("A_P")));
        
    }
    
    private void createX(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -1.25, 0, 0.0, null));
        vertices.add(new vertice("C", -2, 2, 0, null));
        vertices.add(new vertice("D", -1, 2, 0, null));
        vertices.add(new vertice("E", -0.25, 0.25, 0, null));
        vertices.add(new vertice("F", 0.25, 0.25, 0, null));
        vertices.add(new vertice("G", 1, 2, 0, null));
        vertices.add(new vertice("H", 2, 2, 0, null));
        vertices.add(new vertice("I", 1.25, 0, 0, null));
        vertices.add(new vertice("J", 2, -2, 0, null));   
        vertices.add(new vertice("K", 1, -2, 0, null));
        vertices.add(new vertice("L", 0.25, -0.25, 0, null));
        vertices.add(new vertice("M", -0.25, -0.25, 0, null));
        vertices.add(new vertice("N", -1, -2, 0, null));
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -1.25, 0, 0.0, null));
        vertices.add(new vertice("CT", -2, 2, 0, null));
        vertices.add(new vertice("DT", -1, 2, 0, null));
        vertices.add(new vertice("ET", -0.25, 0.25, 0, null));
        vertices.add(new vertice("FT", 0.25, 0.25, 0, null));
        vertices.add(new vertice("GT", 1, 2, 0, null));
        vertices.add(new vertice("HT", 2, 2, 0, null));
        vertices.add(new vertice("IT", 1.25, 0, 0, null));
        vertices.add(new vertice("JT", 2, -2, 0, null));   
        vertices.add(new vertice("KT", 1, -2, 0, null));
        vertices.add(new vertice("LT", 0.25, -0.25, 0, null));
        vertices.add(new vertice("MT", -0.25, -0.25, 0, null));
        vertices.add(new vertice("NT", -1, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_N", vertices.get(0),vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("M_L", vertices.get(12), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("N_M", vertices.get(13), vertices.get(12), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(19), vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(21), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(23), vertices.get(24), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(24), vertices.get(25), null, null, null, null, null, null));
        arestas.add(new aresta("LT_MT", vertices.get(25), vertices.get(26), null, null, null, null, null, null));
        arestas.add(new aresta("MT_NT", vertices.get(26), vertices.get(27), null, null, null, null, null, null));
        arestas.add(new aresta("NT_AT", vertices.get(27), vertices.get(14), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(22), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(24), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(25), null, null, null, null, null, null));
        arestas.add(new aresta("M_MT", vertices.get(12), vertices.get(26), null, null, null, null, null, null));
        arestas.add(new aresta("N_NT", vertices.get(13), vertices.get(27), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("M_L")));
        vertices.get(encontraVertice("M")).setArestaVertice(arestas.get(encontraAresta("N_M")));
        vertices.get(encontraVertice("N")).setArestaVertice(arestas.get(encontraAresta("A_N")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        vertices.get(encontraVertice("MT")).setArestaVertice(arestas.get(encontraAresta("M_MT")));
        vertices.get(encontraVertice("NT")).setArestaVertice(arestas.get(encontraAresta("N_NT")));
        
        // Criação das faces
        faces.add(new face("B_A_N_M_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("A_N"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT"  , arestas.get(encontraAresta("NT_AT"))));
        faces.add(new face("A_B_BT_AT"                                  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                                  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                                  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                                  , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                                  , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                                  , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                                  , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                                  , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                                  , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                                  , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                                  , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_M_MT_LT"                                  , arestas.get(encontraAresta("M_MT"))));
        faces.add(new face("M_N_NT_MT"                                  , arestas.get(encontraAresta("N_NT"))));
        faces.add(new face("N_A_AT_NT"                                  , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("M_L")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("N_M")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("A_N")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("N_A_AT_NT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_MT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("MT_NT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("NT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("N_A_AT_NT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("N_A_AT_NT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("M_MT")).setFaces(faces.get(encontraFace("L_M_MT_LT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("N_NT")).setFaces(faces.get(encontraFace("M_N_NT_MT")), faces.get(encontraFace("N_A_AT_NT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_N")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("M_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("M_L")).setArestasEsquerda(arestas.get(encontraAresta("N_M")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("M_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("N_M")).setArestasEsquerda(arestas.get(encontraAresta("A_N")), arestas.get(encontraAresta("M_L")));
        arestas.get(encontraAresta("N_M")).setArestasDireita(arestas.get(encontraAresta("M_MT")), arestas.get(encontraAresta("N_NT")));
        
        arestas.get(encontraAresta("A_N")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("N_M")));
        arestas.get(encontraAresta("A_N")).setArestasDireita(arestas.get(encontraAresta("N_NT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("NT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_MT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_MT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("MT_NT")));
        arestas.get(encontraAresta("LT_MT")).setArestasDireita(arestas.get(encontraAresta("M_MT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("MT_NT")).setArestasEsquerda(arestas.get(encontraAresta("LT_MT")), arestas.get(encontraAresta("NT_AT")));
        arestas.get(encontraAresta("MT_NT")).setArestasDireita(arestas.get(encontraAresta("N_NT")), arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("NT_AT")).setArestasEsquerda(arestas.get(encontraAresta("MT_NT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("NT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("N_NT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_N")), arestas.get(encontraAresta("NT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_MT")), arestas.get(encontraAresta("M_L")));
        
        arestas.get(encontraAresta("M_MT")).setArestasEsquerda(arestas.get(encontraAresta("M_L")), arestas.get(encontraAresta("LT_MT")));
        arestas.get(encontraAresta("M_MT")).setArestasDireita(arestas.get(encontraAresta("MT_NT")), arestas.get(encontraAresta("N_M")));
        
        arestas.get(encontraAresta("N_NT")).setArestasEsquerda(arestas.get(encontraAresta("N_M")), arestas.get(encontraAresta("MT_NT")));
        arestas.get(encontraAresta("N_NT")).setArestasDireita(arestas.get(encontraAresta("NT_AT")), arestas.get(encontraAresta("A_N")));
    }
    
    private void createY(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, 2, 0, null));
        vertices.add(new vertice("B", -1, 2, 0.0, null));
        vertices.add(new vertice("C", -0.1, 0.75, 0, null));
        vertices.add(new vertice("D", 0.1, 0.75, 0, null));
        vertices.add(new vertice("E", 1, 2, 0, null));
        vertices.add(new vertice("F", 2, 2, 0, null));
        vertices.add(new vertice("G", 0.5, 0, 0, null));
        vertices.add(new vertice("H", 0.5, -2, 0, null));
        vertices.add(new vertice("I", -0.5, -2, 0, null));
        vertices.add(new vertice("J", -0.5, 0, 0, null));   
        
        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, 2, 0, null));
        vertices.add(new vertice("BT", -1, 2, 0.0, null));
        vertices.add(new vertice("CT", -0.1, 0.75, 0, null));
        vertices.add(new vertice("DT", 0.1, 0.75, 0, null));
        vertices.add(new vertice("ET", 1, 2, 0, null));
        vertices.add(new vertice("FT", 2, 2, 0, null));
        vertices.add(new vertice("GT", 0.5, 0, 0, null));
        vertices.add(new vertice("HT", 0.5, -2, 0, null));
        vertices.add(new vertice("IT", -0.5, -2, 0, null));
        vertices.add(new vertice("JT", -0.5, 0, 0, null));   
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_J", vertices.get(0),vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(10),vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_AT", vertices.get(19), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8), vertices.get(18), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9), vertices.get(19), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("A_J")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        
        // Criação das faces
        faces.add(new face("B_A_J_I_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT"  , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                      , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                      , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                      , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                      , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                      , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                      , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_A_AT_JT"                      , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("A_J")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("J_A_AT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_A_AT_JT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_J")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_J")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("A_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_AT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("JT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("A_J")));
    }
    
    private void createZ(){
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, -0.5, 0, null));
        vertices.add(new vertice("C", 0.5, 1, 0, null));
        vertices.add(new vertice("D", -2, 1, 0, null));
        vertices.add(new vertice("E", -2, 2, 0, null));
        vertices.add(new vertice("F", 2, 2, 0, null));
        vertices.add(new vertice("G", 2, 1, 0, null));
        vertices.add(new vertice("H", -0.5, -1, 0, null));
        vertices.add(new vertice("I", 2, -1, 0, null));
        vertices.add(new vertice("J", 2, -2, 0, null));   

        // Vértices de trás da letra
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, -0.5, 0, null));
        vertices.add(new vertice("CT", 0.5, 1, 0, null));
        vertices.add(new vertice("DT", -2, 1, 0, null));
        vertices.add(new vertice("ET", -2, 2, 0, null));
        vertices.add(new vertice("FT", 2, 2, 0, null));
        vertices.add(new vertice("GT", 2, 1, 0, null));
        vertices.add(new vertice("HT", -0.5, -1, 0, null));
        vertices.add(new vertice("IT", 2, -1, 0, null));
        vertices.add(new vertice("JT", 2, -2, 0, null)); 
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_J", vertices.get(0),vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(10),vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_AT", vertices.get(19), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da letra
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8), vertices.get(18), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9), vertices.get(19), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("A_J")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        
        // Criação das faces
        faces.add(new face("B_A_J_I_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT"  , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                      , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                      , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                      , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                      , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                      , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                      , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_A_AT_JT"                      , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("A_J")).setFaces(faces.get(encontraFace("B_A_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("J_A_AT_JT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("J_A_AT_JT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_A_AT_JT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_J")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_J")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("A_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_AT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("JT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_J")), arestas.get(encontraAresta("JT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_AT")), arestas.get(encontraAresta("A_J")));
    }
    
    private void create0(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, -2, 0, null));
        vertices.add(new vertice("E", -1, -1, 0, null));
        vertices.add(new vertice("F", -1, 1, 0, null));
        vertices.add(new vertice("G", 1, 1, 0, null));
        vertices.add(new vertice("H", 1, -1, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, -2, 0, null));
        vertices.add(new vertice("ET", -1, -1, 0, null));
        vertices.add(new vertice("FT", -1, 1, 0, null));
        vertices.add(new vertice("GT", 1, 1, 0, null));
        vertices.add(new vertice("HT", 1, -1, 0, null));
        
        // Arestas da frente do número fora
        arestas.add(new aresta("A_D", vertices.get(0), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        
        // Arestas da frente do número dentro
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("H_E", vertices.get(7), vertices.get(4), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de trás do número fora
        arestas.add(new aresta("AT_BT", vertices.get(8), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("DT_AT", vertices.get(11), vertices.get(8), null, null, null, null, null, null));
        
        // Arestas de trás do número
        arestas.add(new aresta("FT_ET", vertices.get(13), vertices.get(12), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_FT", vertices.get(14), vertices.get(13), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_GT", vertices.get(15), vertices.get(14), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("ET_HT", vertices.get(12), vertices.get(15), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás do número
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(11), null, null, null, null, null, null));              
        
        // Arestas que ligam frente e trás do número invertidas
        arestas.add(new aresta("ET_E", vertices.get(12), vertices.get(4), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("FT_F", vertices.get(13), vertices.get(5), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_G", vertices.get(14), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_H", vertices.get(15), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("A_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("E_F")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("F_G")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("G_H")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("H_E")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("ET_E")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("FT_F")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("GT_G")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("HT_H")));
        
        // Criação das faces
        faces.add(new face("B_A_D_C"    , arestas.get(encontraAresta("B_A")),false , true));
        faces.add(new face("AT_BT_CT_DT", arestas.get(encontraAresta("AT_BT")),false , true));
        faces.add(new face("A_B_BT_AT"  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_A_AT_DT"  , arestas.get(encontraAresta("A_AT"))));
        
        // Faces Internas
        faces.add(new face("E_F_FT_ET"  , arestas.get(encontraAresta("FT_ET")), true));
        faces.add(new face("F_G_GT_FT"  , arestas.get(encontraAresta("GT_FT")), true));
        faces.add(new face("G_H_HT_GT"  , arestas.get(encontraAresta("HT_GT")), true));
        faces.add(new face("H_E_ET_HT"  , arestas.get(encontraAresta("ET_HT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("A_D")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("E_F")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_G")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_H")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_E")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("H_E_ET_HT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("FT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("GT_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("HT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("ET_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("H_E_ET_HT")));
       
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("D_A_AT_DT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("ET_E")).setFacesInvertido(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("H_E_ET_HT")));
        arestas.get(encontraAresta("FT_F")).setFacesInvertido(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("GT_G")).setFacesInvertido(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("HT_H")).setFacesInvertido(faces.get(encontraFace("H_E_ET_HT")), faces.get(encontraFace("G_H_HT_GT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_D")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("A_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("A_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_D")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("E_F")).setArestasDireita(arestas.get(encontraAresta("FT_F")), arestas.get(encontraAresta("ET_E")));
        arestas.get(encontraAresta("E_F")).setArestasEsquerda(arestas.get(encontraAresta("H_E")), arestas.get(encontraAresta("F_G")));
        
        arestas.get(encontraAresta("F_G")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("FT_F")));
        arestas.get(encontraAresta("F_G")).setArestasEsquerda(arestas.get(encontraAresta("E_F")), arestas.get(encontraAresta("G_H")));
        
        arestas.get(encontraAresta("G_H")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("GT_G")));
        arestas.get(encontraAresta("G_H")).setArestasEsquerda(arestas.get(encontraAresta("F_G")), arestas.get(encontraAresta("H_E")));
        
        arestas.get(encontraAresta("H_E")).setArestasDireita(arestas.get(encontraAresta("ET_E")), arestas.get(encontraAresta("HT_H")));
        arestas.get(encontraAresta("H_E")).setArestasEsquerda(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("E_F")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("DT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_AT")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_AT")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("DT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("FT_ET")).setArestasEsquerda(arestas.get(encontraAresta("ET_HT")), arestas.get(encontraAresta("GT_FT")));
        arestas.get(encontraAresta("FT_ET")).setArestasDireita(arestas.get(encontraAresta("ET_E")), arestas.get(encontraAresta("FT_F")));
        
        arestas.get(encontraAresta("GT_FT")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("FT_ET")));
        arestas.get(encontraAresta("GT_FT")).setArestasDireita(arestas.get(encontraAresta("FT_F")), arestas.get(encontraAresta("GT_G")));
        
        arestas.get(encontraAresta("HT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_HT")), arestas.get(encontraAresta("GT_FT")));
        arestas.get(encontraAresta("HT_GT")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("HT_H")));
        
        arestas.get(encontraAresta("ET_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_ET")), arestas.get(encontraAresta("HT_GT")));
        arestas.get(encontraAresta("ET_HT")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("ET_E")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_D")), arestas.get(encontraAresta("DT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_AT")), arestas.get(encontraAresta("A_D")));
        
        arestas.get(encontraAresta("ET_E")).setArestasEsquerda(arestas.get(encontraAresta("ET_HT")), arestas.get(encontraAresta("H_E")));
        arestas.get(encontraAresta("ET_E")).setArestasDireita(arestas.get(encontraAresta("E_F")), arestas.get(encontraAresta("FT_ET")));
        
        arestas.get(encontraAresta("FT_F")).setArestasEsquerda(arestas.get(encontraAresta("FT_ET")), arestas.get(encontraAresta("E_F")));
        arestas.get(encontraAresta("FT_F")).setArestasDireita(arestas.get(encontraAresta("F_G")), arestas.get(encontraAresta("GT_FT")));
        
        arestas.get(encontraAresta("GT_G")).setArestasEsquerda(arestas.get(encontraAresta("GT_FT")), arestas.get(encontraAresta("F_G")));
        arestas.get(encontraAresta("GT_G")).setArestasDireita(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("HT_GT")));
        
        arestas.get(encontraAresta("HT_H")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("G_H")));
        arestas.get(encontraAresta("HT_H")).setArestasDireita(arestas.get(encontraAresta("H_E")), arestas.get(encontraAresta("ET_HT")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
    }
    
    private void create1(){
        // Vértices da frente do número
        vertices.add(new vertice("A", -.5, -2, 0, null));
        vertices.add(new vertice("B", -0.5, 0.75, 0.0, null));
        vertices.add(new vertice("C", -1, 0.5, 0, null));
        vertices.add(new vertice("D", -1, 1.5, 0, null));
        vertices.add(new vertice("E", 0.5, 2, 0, null));
        vertices.add(new vertice("F", .5, -2, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -.5, -2, 0, null));
        vertices.add(new vertice("BT", -0.5, 0.75, 0.0, null));
        vertices.add(new vertice("CT", -1, 0.5, 0, null));
        vertices.add(new vertice("DT", -1, 1.5, 0, null));
        vertices.add(new vertice("ET", 0.5, 2, 0, null));
        vertices.add(new vertice("FT", .5, -2, 0, null));

        // Arestas da frente do número
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("A_F", vertices.get(0), vertices.get(5), null, null, null, null, null, null));
        
        // Arestas de trás do número
        arestas.add(new aresta("AT_BT", vertices.get(6),  vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(7),  vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(8),  vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(9),  vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("FT_AT", vertices.get(11), vertices.get(6), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás do número
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(11), null, null, null, null, null, null));                                
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("A_F")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        
        // Criação das faces
        faces.add(new face("B_A_F_E_D_C"        , arestas.get(encontraAresta("A_F"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT"  , arestas.get(encontraAresta("FT_AT"))));
        faces.add(new face("A_B_BT_AT"          , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"          , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"          , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"          , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"          , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_A_AT_FT"          , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("A_F")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("F_A_AT_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_A_AT_FT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("A_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_F")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_AT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("FT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("A_F"))); 
        
    }
    
    private void create2(){
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, -0.25, 0.0, null));
        vertices.add(new vertice("C", 0.5, 0.5, 0, null));
        vertices.add(new vertice("D", 0.5, 1, 0, null));
        vertices.add(new vertice("E", -2, 1, 0, null));
        vertices.add(new vertice("F", -2, 1.5, 0, null));
        vertices.add(new vertice("G", -1.5, 2, 0, null));
        vertices.add(new vertice("H", 1.5, 2, 0, null));
        vertices.add(new vertice("I", 2, 1.5, 0, null));
        vertices.add(new vertice("J", 2, 0.5, 0, null));
        vertices.add(new vertice("K", 1.5, 0, 0, null));
        vertices.add(new vertice("L", -1, -1, 0, null));
        vertices.add(new vertice("M",  2, -1, 0, null));
        vertices.add(new vertice("N",  2, -2, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, -0.25, 0.0, null));
        vertices.add(new vertice("CT", 0.5, 0.5, 0, null));
        vertices.add(new vertice("DT", 0.5, 1, 0, null));
        vertices.add(new vertice("ET", -2, 1, 0, null));
        vertices.add(new vertice("FT", -2, 1.5, 0, null));
        vertices.add(new vertice("GT", -1.5, 2, 0, null));
        vertices.add(new vertice("HT", 1.5, 2, 0, null));
        vertices.add(new vertice("IT", 2, 1.5, 0, null));
        vertices.add(new vertice("JT", 2, 0.5, 0, null));
        vertices.add(new vertice("KT", 1.5, 0, 0, null));
        vertices.add(new vertice("LT", -1, -1, 0, null));
        vertices.add(new vertice("MT",  2, -1, 0, null));
        vertices.add(new vertice("NT",  2, -2, 0, null));
        
        // Arestas da frente do número
        arestas.add(new aresta("A_N", vertices.get(0),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1),  vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2),  vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3),  vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4),  vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5),  vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6),  vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7),  vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8),  vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9),  vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("M_L", vertices.get(12), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("N_M", vertices.get(13), vertices.get(12), null, null, null, null, null, null));
        
        // Arestas da frente do número
        arestas.add(new aresta("AT_BT", vertices.get(14),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(15),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(16),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(17),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(18),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(19),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(20),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(21),  vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(22),  vertices.get(23), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(23),  vertices.get(24), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(24),  vertices.get(25), null, null, null, null, null, null));
        arestas.add(new aresta("LT_MT", vertices.get(25),  vertices.get(26), null, null, null, null, null, null));
        arestas.add(new aresta("MT_NT", vertices.get(26),  vertices.get(27), null, null, null, null, null, null));
        arestas.add(new aresta("NT_AT", vertices.get(27),  vertices.get(14), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás do número
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(22), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(24), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(25), null, null, null, null, null, null));
        arestas.add(new aresta("M_MT", vertices.get(12), vertices.get(26), null, null, null, null, null, null));
        arestas.add(new aresta("N_NT", vertices.get(13), vertices.get(27), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("M_L")));
        vertices.get(encontraVertice("M")).setArestaVertice(arestas.get(encontraAresta("N_M")));
        vertices.get(encontraVertice("N")).setArestaVertice(arestas.get(encontraAresta("A_N")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        vertices.get(encontraVertice("MT")).setArestaVertice(arestas.get(encontraAresta("M_MT")));
        vertices.get(encontraVertice("NT")).setArestaVertice(arestas.get(encontraAresta("N_NT")));
        
        // Criação das faces
        faces.add(new face("B_A_N_M_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT"  , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                                  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                                  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                                  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                                  , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                                  , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                                  , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                                  , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                                  , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                                  , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                                  , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                                  , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_M_MT_LT"                                  , arestas.get(encontraAresta("M_MT"))));
        faces.add(new face("M_N_NT_MT"                                  , arestas.get(encontraAresta("N_NT"))));
        faces.add(new face("N_A_AT_NT"                                  , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("M_L")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("N_M")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("A_N")).setFaces(faces.get(encontraFace("B_A_N_M_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("N_A_AT_NT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_MT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("MT_NT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("NT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT_MT_NT")), faces.get(encontraFace("N_A_AT_NT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("N_A_AT_NT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_M_MT_LT")));
        arestas.get(encontraAresta("M_MT")).setFaces(faces.get(encontraFace("L_M_MT_LT")), faces.get(encontraFace("M_N_NT_MT")));
        arestas.get(encontraAresta("N_NT")).setFaces(faces.get(encontraFace("M_N_NT_MT")), faces.get(encontraFace("N_A_AT_NT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_N")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("M_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("M_L")).setArestasEsquerda(arestas.get(encontraAresta("N_M")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("M_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("N_M")).setArestasEsquerda(arestas.get(encontraAresta("A_N")), arestas.get(encontraAresta("M_L")));
        arestas.get(encontraAresta("N_M")).setArestasDireita(arestas.get(encontraAresta("M_MT")), arestas.get(encontraAresta("N_NT")));
        
        arestas.get(encontraAresta("A_N")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("N_M")));
        arestas.get(encontraAresta("A_N")).setArestasDireita(arestas.get(encontraAresta("N_NT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("NT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_MT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_MT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("MT_NT")));
        arestas.get(encontraAresta("LT_MT")).setArestasDireita(arestas.get(encontraAresta("M_MT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("MT_NT")).setArestasEsquerda(arestas.get(encontraAresta("LT_MT")), arestas.get(encontraAresta("NT_AT")));
        arestas.get(encontraAresta("MT_NT")).setArestasDireita(arestas.get(encontraAresta("N_NT")), arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("NT_AT")).setArestasEsquerda(arestas.get(encontraAresta("MT_NT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("NT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("N_NT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_N")), arestas.get(encontraAresta("NT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_MT")), arestas.get(encontraAresta("M_L")));
        
        arestas.get(encontraAresta("M_MT")).setArestasEsquerda(arestas.get(encontraAresta("M_L")), arestas.get(encontraAresta("LT_MT")));
        arestas.get(encontraAresta("M_MT")).setArestasDireita(arestas.get(encontraAresta("MT_NT")), arestas.get(encontraAresta("N_M")));
        
        arestas.get(encontraAresta("N_NT")).setArestasEsquerda(arestas.get(encontraAresta("N_M")), arestas.get(encontraAresta("MT_NT")));
        arestas.get(encontraAresta("N_NT")).setArestasDireita(arestas.get(encontraAresta("NT_AT")), arestas.get(encontraAresta("A_N")));
        
    }
    
    private void create3(){
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, -1.2, 0.0, null));
        vertices.add(new vertice("C", 1.2, -1.2, 0, null));
        vertices.add(new vertice("D", 1.2, -0.4, 0, null));
        vertices.add(new vertice("E", -1.6, -0.4, 0, null));
        vertices.add(new vertice("F", -1.6, 0.4, 0, null));
        vertices.add(new vertice("G", 1.2, 0.4, 0, null));
        vertices.add(new vertice("H", 1.2, 1.2, 0, null));
        vertices.add(new vertice("I", -2, 1.2, 0, null));
        vertices.add(new vertice("J", -2, 2, 0, null));
        vertices.add(new vertice("K",  2, 2, 0, null));
        vertices.add(new vertice("L", 2, -2, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, -1.2, 0.0, null));
        vertices.add(new vertice("CT", 1.2, -1.2, 0, null));
        vertices.add(new vertice("DT", 1.2, -0.4, 0, null));
        vertices.add(new vertice("ET", -1.6, -0.4, 0, null));
        vertices.add(new vertice("FT", -1.6, 0.4, 0, null));
        vertices.add(new vertice("GT", 1.2, 0.4, 0, null));
        vertices.add(new vertice("HT", 1.2, 1.2, 0, null));
        vertices.add(new vertice("IT", -2, 1.2, 0, null));
        vertices.add(new vertice("JT", -2, 2, 0, null));
        vertices.add(new vertice("KT",  2, 2, 0, null));
        vertices.add(new vertice("LT", 2, -2, 0, null));
        
        // Arestas da frente do número
        arestas.add(new aresta("A_L", vertices.get(0),vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("I_H", vertices.get(8), vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas de trás do número
        arestas.add(new aresta("AT_BT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(19), vertices.get(20), null, null, null, null, null, null));
        arestas.add(new aresta("IT_JT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(21), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("LT_AT", vertices.get(23), vertices.get(12), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás do número
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("I_IT", vertices.get(8),  vertices.get(20), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9),  vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(23), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("A_L")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        
        // Criação das faces
        faces.add(new face("B_A_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                              , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                              , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                              , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                              , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                              , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                              , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                              , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                              , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                              , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                              , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                              , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_A_AT_LT"                              , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("A_L")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_A_AT_LT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("L_A_AT_LT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("L_A_AT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_A_AT_LT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_L")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_L")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("A_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_AT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("LT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("A_L")));
        
    }
    
    private void create4(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, -1, 0, null));
        vertices.add(new vertice("B", -2, 0, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, -2, 0, null));
        vertices.add(new vertice("E", 1, -2, 0, null));
        vertices.add(new vertice("F", 1, -1, 0, null));
        vertices.add(new vertice("G", -1, -0.5, 0, null));
        vertices.add(new vertice("H", -1, -0.1, 0, null));
        vertices.add(new vertice("I", 1, 0.8, 0, null));
        vertices.add(new vertice("J", 1, -0.5, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, -1, 0, null));
        vertices.add(new vertice("BT", -2, 0, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, -2, 0, null));
        vertices.add(new vertice("ET", 1, -2, 0, null));
        vertices.add(new vertice("FT", 1, -1, 0, null));
        vertices.add(new vertice("GT", -1, -0.5, 0, null));
        vertices.add(new vertice("HT", -1, -0.1, 0, null));
        vertices.add(new vertice("IT", 1, 0.8, 0, null));
        vertices.add(new vertice("JT", 1, -0.5, 0, null));
        
        // Arestas da frente do número fora
        arestas.add(new aresta("A_F", vertices.get(0),vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        
        // Arestas da frente do número dentro
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("H_I", vertices.get(7), vertices.get(8), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("J_G", vertices.get(9), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas da trás do número fora
        arestas.add(new aresta("AT_BT", vertices.get(10),vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_AT", vertices.get(15), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas de trás do número dentro
        arestas.add(new aresta("HT_GT", vertices.get(17), vertices.get(16), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_HT", vertices.get(18), vertices.get(17), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_IT", vertices.get(19), vertices.get(18), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_JT", vertices.get(16), vertices.get(19), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás do número
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(15), null, null, null, null, null, null));                
        
        // Arestas que ligam frente e trás do número invertidas
        arestas.add(new aresta("GT_G", vertices.get(16), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_H", vertices.get(17), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_I", vertices.get(18), vertices.get(8), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_J", vertices.get(19), vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        //Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("A_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("G_H")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("H_I")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_J")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("J_G")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("GT_G")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("HT_H")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_I")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_J")));
        
        // Criação das faces
        faces.add(new face("B_A_F_E_D_C"        , arestas.get(encontraAresta("B_A")),false , true));
        faces.add(new face("AT_BT_CT_DT_ET_FT"  , arestas.get(encontraAresta("AT_BT")), false, true));
        faces.add(new face("A_B_BT_AT"          , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"          , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"          , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"          , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"          , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_A_AT_FT"          , arestas.get(encontraAresta("A_AT"))));
        
        // Faces Internas
        faces.add(new face("G_H_HT_GT"          , arestas.get(encontraAresta("HT_GT")), true));
        faces.add(new face("H_I_IT_HT"          , arestas.get(encontraAresta("IT_HT")), true));
        faces.add(new face("I_J_JT_IT"          , arestas.get(encontraAresta("JT_IT")), true));
        faces.add(new face("J_G_GT_JT"          , arestas.get(encontraAresta("GT_JT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("A_F")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("G_H")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_I")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_J")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_G")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("J_G_GT_JT")));
      
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("HT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("IT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("GT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("J_G_GT_JT")));
       
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("F_A_AT_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("GT_G")).setFacesInvertido(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("J_G_GT_JT")));
        arestas.get(encontraAresta("HT_H")).setFacesInvertido(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("IT_I")).setFacesInvertido(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("JT_J")).setFacesInvertido(faces.get(encontraFace("J_G_GT_JT")), faces.get(encontraFace("I_J_JT_IT")));
      
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("A_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_F")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("G_H")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("GT_G")));
        arestas.get(encontraAresta("G_H")).setArestasEsquerda(arestas.get(encontraAresta("J_G")), arestas.get(encontraAresta("H_I")));
       
        arestas.get(encontraAresta("H_I")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("HT_H")));
        arestas.get(encontraAresta("H_I")).setArestasEsquerda(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("I_J")));
        
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("IT_I")));
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("H_I")), arestas.get(encontraAresta("J_G")));
        
        arestas.get(encontraAresta("J_G")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("JT_J")));
        arestas.get(encontraAresta("J_G")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("G_H")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_AT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("FT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("HT_GT")).setArestasEsquerda(arestas.get(encontraAresta("IT_HT")), arestas.get(encontraAresta("GT_JT")));
        arestas.get(encontraAresta("HT_GT")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("HT_H")));
        
        arestas.get(encontraAresta("IT_HT")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("HT_GT")));
        arestas.get(encontraAresta("IT_HT")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("IT_I")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_JT")), arestas.get(encontraAresta("IT_HT")));
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("JT_J")));
        
        arestas.get(encontraAresta("GT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("JT_IT")));
        arestas.get(encontraAresta("GT_JT")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("GT_G")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("GT_G")).setArestasEsquerda(arestas.get(encontraAresta("GT_JT")), arestas.get(encontraAresta("J_G")));
        arestas.get(encontraAresta("GT_G")).setArestasDireita(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("HT_GT")));
        
        arestas.get(encontraAresta("HT_H")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("G_H")));
        arestas.get(encontraAresta("HT_H")).setArestasDireita(arestas.get(encontraAresta("H_I")), arestas.get(encontraAresta("IT_HT")));
        
        arestas.get(encontraAresta("IT_I")).setArestasEsquerda(arestas.get(encontraAresta("IT_HT")), arestas.get(encontraAresta("H_I")));
        arestas.get(encontraAresta("IT_I")).setArestasDireita(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("JT_J")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("JT_J")).setArestasDireita(arestas.get(encontraAresta("J_G")), arestas.get(encontraAresta("GT_JT")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
      
    }
    
    private void create5(){
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, -1, 0.0, null));
        vertices.add(new vertice("C", 1, -1, 0, null));
        vertices.add(new vertice("D", 1, -0.6, 0, null));
        vertices.add(new vertice("E", -2, -0.6, 0, null));
        vertices.add(new vertice("F", -2, 2, 0, null));
        vertices.add(new vertice("G", 2, 2, 0, null));
        vertices.add(new vertice("H", 2, 1.2, 0, null));
        vertices.add(new vertice("I", -1, 1.2, 0, null));
        vertices.add(new vertice("J", -1, 0.2, 0, null));   
        vertices.add(new vertice("K", 2, 0.2, 0, null));
        vertices.add(new vertice("L", 2, -2, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, -1, 0.0, null));
        vertices.add(new vertice("CT", 1, -1, 0, null));
        vertices.add(new vertice("DT", 1, -0.6, 0, null));
        vertices.add(new vertice("ET", -2, -0.6, 0, null));
        vertices.add(new vertice("FT", -2, 2, 0, null));
        vertices.add(new vertice("GT", 2, 2, 0, null));
        vertices.add(new vertice("HT", 2, 1.2, 0, null));
        vertices.add(new vertice("IT", -1, 1.2, 0, null));
        vertices.add(new vertice("JT", -1, 0.2, 0, null));   
        vertices.add(new vertice("KT", 2, 0.2, 0, null));
        vertices.add(new vertice("LT", 2, -2, 0, null));
        
        // Arestas da frente da letra
        arestas.add(new aresta("A_L", vertices.get(0),  vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1),  vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2),  vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3),  vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4),  vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5),  vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6),  vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7),  vertices.get(6), null, null, null, null, null, null));  
        arestas.add(new aresta("I_H", vertices.get(8),  vertices.get(7), null, null, null, null, null, null));      
        arestas.add(new aresta("J_I", vertices.get(9),  vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas de trás da letra
        arestas.add(new aresta("AT_BT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_IT", vertices.get(19), vertices.get(20), null, null, null, null, null, null));  
        arestas.add(new aresta("IT_JT", vertices.get(20), vertices.get(21), null, null, null, null, null, null));      
        arestas.add(new aresta("JT_KT", vertices.get(21), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("KT_LT", vertices.get(22), vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("LT_AT", vertices.get(23), vertices.get(12), null, null, null, null, null, null));
        
        // Arestas que ligam frente e trás da número
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7), vertices.get(19), null, null, null, null, null, null));  
        arestas.add(new aresta("I_IT", vertices.get(8), vertices.get(20), null, null, null, null, null, null));      
        arestas.add(new aresta("J_JT", vertices.get(9), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("K_KT", vertices.get(10),vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11),vertices.get(23), null, null, null, null, null, null));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("I_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("J_I")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("A_L")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        
        // Criação das faces
        faces.add(new face("B_A_L_K_J_I_H_G_F_E_D_C"                , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"                              , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                              , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                              , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                              , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                              , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                              , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                              , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_I_IT_HT"                              , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("I_J_JT_IT"                              , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("J_K_KT_JT"                              , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_L_LT_KT"                              , arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("L_A_AT_LT"                              , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("A_L")).setFaces(faces.get(encontraFace("B_A_L_K_J_I_H_G_F_E_D_C")), faces.get(encontraFace("L_A_AT_LT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("IT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("JT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("KT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("LT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT_KT_LT")), faces.get(encontraFace("L_A_AT_LT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("L_A_AT_LT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("L_A_AT_LT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_L")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("I_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_H")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("J_I")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("I_H")));
        arestas.get(encontraAresta("J_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("K_J")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("J_I")));
        arestas.get(encontraAresta("K_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_K")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("K_J")));
        arestas.get(encontraAresta("L_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_L")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("L_K")));
        arestas.get(encontraAresta("A_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("HT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("IT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("IT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        
        arestas.get(encontraAresta("JT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("JT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        
        arestas.get(encontraAresta("KT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("KT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("LT_AT")).setArestasEsquerda(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("LT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_L")), arestas.get(encontraAresta("LT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_IT")), arestas.get(encontraAresta("I_H")));
        
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_H")), arestas.get(encontraAresta("HT_IT")));
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_JT")), arestas.get(encontraAresta("J_I")));
        
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_I")), arestas.get(encontraAresta("IT_JT")));
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_KT")), arestas.get(encontraAresta("K_J")));
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_J")), arestas.get(encontraAresta("JT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_LT")), arestas.get(encontraAresta("L_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_K")), arestas.get(encontraAresta("KT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_AT")), arestas.get(encontraAresta("A_L")));
    }
    
    private void create6(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, 1.2, 0, null));
        vertices.add(new vertice("E", -1, 1.2, 0, null));
        vertices.add(new vertice("F", -1, 0.4, 0, null));
        vertices.add(new vertice("G", 2, 0.4, 0, null));
        vertices.add(new vertice("H", 2, -2, 0, null));
        vertices.add(new vertice("I", -1, -1, 0, null));
        vertices.add(new vertice("J", -1, -0.4, 0, null));   
        vertices.add(new vertice("K", 1, -0.4, 0, null));
        vertices.add(new vertice("L", 1, -1, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, 1.2, 0, null));
        vertices.add(new vertice("ET", -1, 1.2, 0, null));
        vertices.add(new vertice("FT", -1, 0.4, 0, null));
        vertices.add(new vertice("GT", 2, 0.4, 0, null));
        vertices.add(new vertice("HT", 2, -2, 0, null));
        vertices.add(new vertice("IT", -1, -1, 0, null));
        vertices.add(new vertice("JT", -1, -0.4, 0, null));   
        vertices.add(new vertice("KT", 1, -0.4, 0, null));
        vertices.add(new vertice("LT", 1, -1, 0, null));
        
        // Arestas da frente do número fora
        arestas.add(new aresta("A_H", vertices.get(0),vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));  
        
        // Arestas da frente do número dentro
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("J_K", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("L_I", vertices.get(11), vertices.get(8), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de trás do número fora
        arestas.add(new aresta("AT_BT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("FT_GT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("GT_HT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("HT_AT", vertices.get(19), vertices.get(12), null, null, null, null, null, null));  
        
        // Arestas de trás do número dentro
        arestas.add(new aresta("JT_IT", vertices.get(21),  vertices.get(20), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_JT", vertices.get(22),  vertices.get(21), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_KT", vertices.get(23),  vertices.get(22), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_LT", vertices.get(20),  vertices.get(23), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás do número 
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4),  vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5),  vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("G_GT", vertices.get(6),  vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("H_HT", vertices.get(7),  vertices.get(19), null, null, null, null, null, null));                  
        
        // Arestas que ligam frente e trás do número invertidas
        arestas.add(new aresta("IT_I", vertices.get(20),  vertices.get(8), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_J", vertices.get(21),  vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_K", vertices.get(22), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_L", vertices.get(23), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("G_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("H_G")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("A_H")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_J")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("J_K")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("K_L")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("L_I")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("G_GT")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("H_HT")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_I")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_J")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("KT_K")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("LT_L")));
        
        // Criação das faces
        faces.add(new face("B_A_H_G_F_E_D_C"            , arestas.get(encontraAresta("B_A")), false, true));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT"    , arestas.get(encontraAresta("AT_BT")), false , true));
        faces.add(new face("A_B_BT_AT"                  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"                  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"                  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"                  , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"                  , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                  , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("G_H_HT_GT"                  , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("H_A_AT_HT"                  , arestas.get(encontraAresta("A_AT"))));
        
        // Faces Internas
        faces.add(new face("I_J_JT_IT"                  , arestas.get(encontraAresta("JT_IT")), true));
        faces.add(new face("J_K_KT_JT"                  , arestas.get(encontraAresta("KT_JT")), true));
        faces.add(new face("K_L_LT_KT"                  , arestas.get(encontraAresta("LT_KT")), true));
        faces.add(new face("L_I_IT_LT"                  , arestas.get(encontraAresta("IT_LT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("I_J")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_K")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("K_L")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("L_I")).setFaces(faces.get(encontraFace("B_A_H_G_F_E_D_C")), faces.get(encontraFace("L_I_IT_LT")));

        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("IT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("L_I_IT_LT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("IT_I")).setFacesInvertido(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("L_I_IT_LT")));
        arestas.get(encontraAresta("JT_J")).setFacesInvertido(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_K")).setFacesInvertido(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_L")).setFacesInvertido(faces.get(encontraFace("L_I_IT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("G_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("G_GT")));
        arestas.get(encontraAresta("G_F")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("H_G")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("H_HT")));
        arestas.get(encontraAresta("H_G")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("A_H")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_H")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("L_I")), arestas.get(encontraAresta("J_K")));
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("IT_I")));
        
        arestas.get(encontraAresta("J_K")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("J_K")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("JT_J")));
        
        arestas.get(encontraAresta("K_L")).setArestasEsquerda(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("L_I")));
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("L_I")).setArestasEsquerda(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("L_I")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("FT_GT")).setArestasDireita(arestas.get(encontraAresta("G_GT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("GT_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("GT_HT")).setArestasDireita(arestas.get(encontraAresta("H_HT")), arestas.get(encontraAresta("G_GT")));
        
        arestas.get(encontraAresta("HT_AT")).setArestasEsquerda(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("HT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("H_HT")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("IT_LT")));
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("JT_J")));
        
        arestas.get(encontraAresta("KT_JT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("JT_IT")));
        arestas.get(encontraAresta("KT_JT")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("KT_K")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_LT")), arestas.get(encontraAresta("KT_JT")));
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("LT_L")));
        
        arestas.get(encontraAresta("IT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("LT_KT")));
        arestas.get(encontraAresta("IT_LT")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("IT_I")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("HT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_GT")), arestas.get(encontraAresta("G_F")));
        
        arestas.get(encontraAresta("G_GT")).setArestasEsquerda(arestas.get(encontraAresta("G_F")), arestas.get(encontraAresta("FT_GT")));
        arestas.get(encontraAresta("G_GT")).setArestasDireita(arestas.get(encontraAresta("GT_HT")), arestas.get(encontraAresta("H_G")));
        
        arestas.get(encontraAresta("H_HT")).setArestasEsquerda(arestas.get(encontraAresta("H_G")), arestas.get(encontraAresta("GT_HT")));
        arestas.get(encontraAresta("H_HT")).setArestasDireita(arestas.get(encontraAresta("HT_AT")), arestas.get(encontraAresta("A_H")));
        
        arestas.get(encontraAresta("IT_I")).setArestasEsquerda(arestas.get(encontraAresta("IT_LT")), arestas.get(encontraAresta("L_I")));
        arestas.get(encontraAresta("IT_I")).setArestasDireita(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("JT_J")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("JT_J")).setArestasDireita(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("KT_K")).setArestasEsquerda(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("KT_JT")));
        arestas.get(encontraAresta("KT_K")).setArestasDireita(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("LT_KT")));
        
        arestas.get(encontraAresta("LT_L")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("LT_L")).setArestasDireita(arestas.get(encontraAresta("L_I")), arestas.get(encontraAresta("IT_LT")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
        
        
    }
    
    private void create7(){
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, 1, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, -2, 0, null));
        vertices.add(new vertice("E", 1, -2, 0, null));
        vertices.add(new vertice("F", 1, 1, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, 1, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, -2, 0, null));
        vertices.add(new vertice("ET", 1, -2, 0, null));
        vertices.add(new vertice("FT", 1, 1, 0, null));
    
        // Arestas da frente do número
        arestas.add(new aresta("A_F", vertices.get(0),vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));  
        
        // Arestas de trás do número
        arestas.add(new aresta("AT_BT", vertices.get(6),  vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(7),  vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(8),  vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(9),  vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("FT_AT", vertices.get(11), vertices.get(6), null, null, null, null, null, null));  
        
        // Arestas que ligam frente e trás do número
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(11), null, null, null, null, null, null));  
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("A_F")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        
        // Criação das faces
        faces.add(new face("B_A_F_E_D_C"        , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT"  , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("A_B_BT_AT"          , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"          , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"          , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"          , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"          , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_A_AT_FT"          , arestas.get(encontraAresta("A_AT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("A_F")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("F_A_AT_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_A_AT_FT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("A_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_F")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_AT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("FT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("A_F")));
    }
    
    private void create8(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, -2, 0, null));
        vertices.add(new vertice("B", -2,  2, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, -2, 0, null));
        vertices.add(new vertice("E", -1.2, -1.2, 0, null));
        vertices.add(new vertice("F", -1.2, -0.4, 0, null));
        vertices.add(new vertice("G", 1.2, -0.4, 0, null));
        vertices.add(new vertice("H", 1.2, -1.2, 0, null));
        vertices.add(new vertice("I", -1.2, 0.4, 0, null));
        vertices.add(new vertice("J", -1.2, 1.2, 0, null));   
        vertices.add(new vertice("K", 1.2, 1.2, 0, null));
        vertices.add(new vertice("L", 1.2, 0.4, 0, null));
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, -2, 0, null));
        vertices.add(new vertice("BT", -2,  2, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, -2, 0, null));
        vertices.add(new vertice("ET", -1.2, -1.2, 0, null));
        vertices.add(new vertice("FT", -1.2, -0.4, 0, null));
        vertices.add(new vertice("GT", 1.2, -0.4, 0, null));
        vertices.add(new vertice("HT", 1.2, -1.2, 0, null));
        vertices.add(new vertice("IT", -1.2, 0.4, 0, null));
        vertices.add(new vertice("JT", -1.2, 1.2, 0, null));   
        vertices.add(new vertice("KT", 1.2, 1.2, 0, null));
        vertices.add(new vertice("LT", 1.2, 0.4, 0, null));
        
        // Arestas da frente do número fora 
        arestas.add(new aresta("A_D", vertices.get(0),vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        
        // Arestas da frente do número dentro
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("H_E", vertices.get(7), vertices.get(4), null, null, null, null, null, null));  
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("J_K", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("L_I", vertices.get(11), vertices.get(8), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas de trás do número fora 
        arestas.add(new aresta("AT_BT", vertices.get(12), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_AT", vertices.get(15), vertices.get(14), null, null, null, null, null, null));
        
        // Arestas de trás do número dentro
        arestas.add(new aresta("FT_ET", vertices.get(17), vertices.get(16), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_FT", vertices.get(18), vertices.get(17), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_GT", vertices.get(19), vertices.get(18), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("ET_HT", vertices.get(16), vertices.get(19), null, null, null, null, null, null));  
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_IT", vertices.get(21), vertices.get(20), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_JT", vertices.get(22), vertices.get(21), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_KT", vertices.get(23), vertices.get(22), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_LT", vertices.get(20), vertices.get(23), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás do número
        arestas.add(new aresta("A_AT", vertices.get(0),  vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1),  vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2),  vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3),  vertices.get(15), null, null, null, null, null, null));                
        
        // Arestas que ligam frente e trás do número invertidas
        arestas.add(new aresta("ET_E", vertices.get(16),  vertices.get(4), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("FT_F", vertices.get(17),  vertices.get(5), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_G", vertices.get(18),  vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_H", vertices.get(19),  vertices.get(7), null, null, null, null, null, null));        
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_I", vertices.get(20),  vertices.get(8), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_J", vertices.get(21),  vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("KT_K", vertices.get(22), vertices.get(10), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("LT_L", vertices.get(23), vertices.get(11), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("A_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("E_F")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("F_G")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("G_H")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("H_E")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_J")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("J_K")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("K_L")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("L_I")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("ET_E")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("FT_F")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("GT_G")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("HT_H")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_I")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_J")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("KT_K")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("LT_L")));
        
        // Criação das faces
        faces.add(new face("B_A_D_C"        , arestas.get(encontraAresta("B_A")), false, true));
        faces.add(new face("AT_BT_CT_DT"    , arestas.get(encontraAresta("AT_BT")), false, true));
        faces.add(new face("A_B_BT_AT"      , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"      , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"      , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_A_AT_DT"      , arestas.get(encontraAresta("A_AT"))));
        
        // Faces Internas 
        faces.add(new face("E_F_FT_ET"      , arestas.get(encontraAresta("FT_ET")), true));
        faces.add(new face("F_G_GT_FT"      , arestas.get(encontraAresta("GT_FT")), true));
        faces.add(new face("G_H_HT_GT"      , arestas.get(encontraAresta("HT_GT")), true));
        faces.add(new face("H_E_ET_HT"      , arestas.get(encontraAresta("ET_HT")), true));
        faces.add(new face("I_J_JT_IT"      , arestas.get(encontraAresta("JT_IT")), true));
        faces.add(new face("J_K_KT_JT"      , arestas.get(encontraAresta("KT_JT")), true));
        faces.add(new face("K_L_LT_KT"      , arestas.get(encontraAresta("LT_KT")), true));
        faces.add(new face("L_I_IT_LT"      , arestas.get(encontraAresta("IT_LT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("A_D")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("E_F")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_G")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_H")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_E")).setFaces(faces.get(encontraFace("B_A_D_C")), faces.get(encontraFace("H_E_ET_HT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("FT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("GT_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("HT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("ET_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("H_E_ET_HT")));
       
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("D_A_AT_DT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_A_AT_DT")));
        
        arestas.get(encontraAresta("ET_E")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("H_E_ET_HT")));
        arestas.get(encontraAresta("FT_F")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("GT_G")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("HT_H")).setFaces(faces.get(encontraFace("H_E_ET_HT")), faces.get(encontraFace("G_H_HT_GT")));
        
        arestas.get(encontraAresta("JT_IT")).setFacesInvertido(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_JT")).setFacesInvertido(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_KT")).setFacesInvertido(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("K_L_LT_KT")));
        arestas.get(encontraAresta("IT_LT")).setFacesInvertido(faces.get(encontraFace("AT_BT_CT_DT")), faces.get(encontraFace("L_I_IT_LT")));
       
        arestas.get(encontraAresta("IT_I")).setFacesInvertido(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("L_I_IT_LT")));
        arestas.get(encontraAresta("JT_J")).setFacesInvertido(faces.get(encontraFace("J_K_KT_JT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("KT_K")).setFacesInvertido(faces.get(encontraFace("K_L_LT_KT")), faces.get(encontraFace("J_K_KT_JT")));
        arestas.get(encontraAresta("LT_L")).setFacesInvertido(faces.get(encontraFace("L_I_IT_LT")), faces.get(encontraFace("I_J_JT_IT")));
        
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_D")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("A_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("A_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_D")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("E_F")).setArestasDireita(arestas.get(encontraAresta("FT_F")), arestas.get(encontraAresta("ET_E")));
        arestas.get(encontraAresta("E_F")).setArestasEsquerda(arestas.get(encontraAresta("H_E")), arestas.get(encontraAresta("F_G")));
        
        arestas.get(encontraAresta("F_G")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("FT_F")));
        arestas.get(encontraAresta("F_G")).setArestasEsquerda(arestas.get(encontraAresta("E_F")), arestas.get(encontraAresta("G_H")));
        
        arestas.get(encontraAresta("G_H")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("GT_G")));
        arestas.get(encontraAresta("G_H")).setArestasEsquerda(arestas.get(encontraAresta("F_G")), arestas.get(encontraAresta("H_E")));
        
        arestas.get(encontraAresta("H_E")).setArestasDireita(arestas.get(encontraAresta("ET_E")), arestas.get(encontraAresta("HT_H")));
        arestas.get(encontraAresta("H_E")).setArestasEsquerda(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("E_F")));
        
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("IT_I")));
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("L_I")), arestas.get(encontraAresta("J_K")));
        
        arestas.get(encontraAresta("J_K")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("JT_J")));
        arestas.get(encontraAresta("J_K")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("K_L")));
       
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("KT_K")));
        arestas.get(encontraAresta("K_L")).setArestasEsquerda(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("L_I")));
        
        arestas.get(encontraAresta("L_I")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("LT_L")));
        arestas.get(encontraAresta("L_I")).setArestasEsquerda(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("I_J")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("DT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_AT")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_AT")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("DT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("FT_ET")).setArestasEsquerda(arestas.get(encontraAresta("FT_ET")), arestas.get(encontraAresta("ET_HT")));
        arestas.get(encontraAresta("FT_ET")).setArestasDireita(arestas.get(encontraAresta("ET_E")), arestas.get(encontraAresta("FT_F")));
        
        arestas.get(encontraAresta("GT_FT")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("FT_ET")));
        arestas.get(encontraAresta("GT_FT")).setArestasDireita(arestas.get(encontraAresta("FT_F")), arestas.get(encontraAresta("GT_G")));
        
        arestas.get(encontraAresta("HT_GT")).setArestasEsquerda(arestas.get(encontraAresta("ET_HT")), arestas.get(encontraAresta("GT_FT")));
        arestas.get(encontraAresta("HT_GT")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("HT_H")));
        
        arestas.get(encontraAresta("ET_HT")).setArestasEsquerda(arestas.get(encontraAresta("FT_ET")), arestas.get(encontraAresta("HT_GT")));
        arestas.get(encontraAresta("ET_HT")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("ET_E")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("JT_J")));
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("IT_LT")));
        
        arestas.get(encontraAresta("KT_JT")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("KT_K")));
        arestas.get(encontraAresta("KT_JT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("KT_K")), arestas.get(encontraAresta("LT_L")));
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_LT")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("IT_LT")).setArestasDireita(arestas.get(encontraAresta("LT_L")), arestas.get(encontraAresta("IT_I")));
        arestas.get(encontraAresta("IT_LT")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("LT_KT")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_D")), arestas.get(encontraAresta("DT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_AT")), arestas.get(encontraAresta("A_D")));
        
        arestas.get(encontraAresta("ET_E")).setArestasEsquerda(arestas.get(encontraAresta("ET_HT")), arestas.get(encontraAresta("H_E")));
        arestas.get(encontraAresta("ET_E")).setArestasDireita(arestas.get(encontraAresta("E_F")), arestas.get(encontraAresta("FT_ET")));
        
        arestas.get(encontraAresta("FT_F")).setArestasEsquerda(arestas.get(encontraAresta("FT_ET")), arestas.get(encontraAresta("E_F")));
        arestas.get(encontraAresta("FT_F")).setArestasDireita(arestas.get(encontraAresta("F_G")), arestas.get(encontraAresta("GT_FT")));
        
        arestas.get(encontraAresta("GT_G")).setArestasEsquerda(arestas.get(encontraAresta("GT_FT")), arestas.get(encontraAresta("F_G")));
        arestas.get(encontraAresta("GT_G")).setArestasDireita(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("HT_GT")));
        
        arestas.get(encontraAresta("HT_H")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("G_H")));
        arestas.get(encontraAresta("HT_H")).setArestasDireita(arestas.get(encontraAresta("H_E")), arestas.get(encontraAresta("ET_HT")));
        
        arestas.get(encontraAresta("IT_I")).setArestasEsquerda(arestas.get(encontraAresta("IT_LT")), arestas.get(encontraAresta("L_I")));
        arestas.get(encontraAresta("IT_I")).setArestasDireita(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("JT_J")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("JT_J")).setArestasDireita(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("KT_K")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("J_K")));
        arestas.get(encontraAresta("KT_K")).setArestasDireita(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("LT_KT")));
        
        arestas.get(encontraAresta("LT_L")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("LT_L")).setArestasDireita(arestas.get(encontraAresta("L_I")), arestas.get(encontraAresta("IT_LT")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
        
    }
    
    private void create9(){
        this.arestasInternas = new ArrayList<>();
        // Vértices da frente do número
        vertices.add(new vertice("A", -2, -0.4, 0, null));
        vertices.add(new vertice("B", -2, 2, 0.0, null));
        vertices.add(new vertice("C", 2, 2, 0, null));
        vertices.add(new vertice("D", 2, -2, 0, null));
        vertices.add(new vertice("E", 1.2, -2, 0, null));
        vertices.add(new vertice("F", 1.2, -0.4, 0, null));
        vertices.add(new vertice("G", -1.2, 0.4, 0, null));
        vertices.add(new vertice("H", -1.2, 1.2, 0, null));
        vertices.add(new vertice("I", 1.2, 1.2, 0, null));
        vertices.add(new vertice("J", 1.2, 0.4, 0, null));  
        
        // Vértices de trás do número
        vertices.add(new vertice("AT", -2, -0.4, 0, null));
        vertices.add(new vertice("BT", -2, 2, 0.0, null));
        vertices.add(new vertice("CT", 2, 2, 0, null));
        vertices.add(new vertice("DT", 2, -2, 0, null));
        vertices.add(new vertice("ET", 1.2, -2, 0, null));
        vertices.add(new vertice("FT", 1.2, -0.4, 0, null));
        vertices.add(new vertice("GT", -1.2, 0.4, 0, null));
        vertices.add(new vertice("HT", -1.2, 1.2, 0, null));
        vertices.add(new vertice("IT", 1.2, 1.2, 0, null));
        vertices.add(new vertice("JT", 1.2, 0.4, 0, null)); 
      
        // Arestas da frente da letra fora
        arestas.add(new aresta("A_F", vertices.get(0),vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        
        // Arestas da frente da letra dentro
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("H_I", vertices.get(7), vertices.get(8), null, null, null, null, null, null));  
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("J_G", vertices.get(9), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
         // Arestas da frente do número fora
        arestas.add(new aresta("AT_BT", vertices.get(10),vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("BT_CT", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_DT", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_ET", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_FT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_AT", vertices.get(15), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas da frente do número dentro
        arestas.add(new aresta("HT_GT", vertices.get(17), vertices.get(16), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_HT", vertices.get(18), vertices.get(17), null, null, null, null, null, null));  
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_IT", vertices.get(19), vertices.get(18), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("GT_JT", vertices.get(16), vertices.get(19), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Arestas que ligam frente e trás do número
        arestas.add(new aresta("A_AT", vertices.get(0), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("B_BT", vertices.get(1), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("C_CT", vertices.get(2), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("D_DT", vertices.get(3), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("E_ET", vertices.get(4), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("F_FT", vertices.get(5), vertices.get(15), null, null, null, null, null, null));               
        
        // Arestas que ligam frente e trás do número invertidas
        arestas.add(new aresta("GT_G", vertices.get(16), vertices.get(6), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("HT_H", vertices.get(17), vertices.get(7), null, null, null, null, null, null));  
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("IT_I", vertices.get(18), vertices.get(8), null, null, null, null, null, null));      
        arestasInternas.add(arestas.get(arestas.size()-1));
        arestas.add(new aresta("JT_J", vertices.get(19), vertices.get(9), null, null, null, null, null, null));
        arestasInternas.add(arestas.get(arestas.size()-1));
        
        // Adicionando aresta na vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("B_A")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("C_B")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("D_C")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("E_D")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("F_E")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("A_F")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("G_H")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("H_I")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_J")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("J_G")));
        vertices.get(encontraVertice("AT")).setArestaVertice(arestas.get(encontraAresta("A_AT")));
        vertices.get(encontraVertice("BT")).setArestaVertice(arestas.get(encontraAresta("B_BT")));
        vertices.get(encontraVertice("CT")).setArestaVertice(arestas.get(encontraAresta("C_CT")));
        vertices.get(encontraVertice("DT")).setArestaVertice(arestas.get(encontraAresta("D_DT")));
        vertices.get(encontraVertice("ET")).setArestaVertice(arestas.get(encontraAresta("E_ET")));
        vertices.get(encontraVertice("FT")).setArestaVertice(arestas.get(encontraAresta("F_FT")));
        vertices.get(encontraVertice("GT")).setArestaVertice(arestas.get(encontraAresta("GT_G")));
        vertices.get(encontraVertice("HT")).setArestaVertice(arestas.get(encontraAresta("HT_H")));
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("IT_I")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("JT_J")));
        
        // Criação das faces
        faces.add(new face("B_A_F_E_D_C"       , arestas.get(encontraAresta("B_A")), false, true));
        faces.add(new face("AT_BT_CT_DT_ET_FT" , arestas.get(encontraAresta("AT_BT")), false, true));
        faces.add(new face("A_B_BT_AT"         , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("B_C_CT_BT"         , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("C_D_DT_CT"         , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("D_E_ET_DT"         , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("E_F_FT_ET"         , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_A_AT_FT"         , arestas.get(encontraAresta("A_AT"))));
        
        faces.add(new face("G_H_HT_GT"         , arestas.get(encontraAresta("HT_GT")), true));
        faces.add(new face("H_I_IT_HT"         , arestas.get(encontraAresta("IT_HT")), true));
        faces.add(new face("I_J_JT_IT"         , arestas.get(encontraAresta("JT_IT")), true));
        faces.add(new face("J_G_GT_JT"         , arestas.get(encontraAresta("GT_JT")), true));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("A_F")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("G_H")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_I")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("I_J")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("J_G")).setFaces(faces.get(encontraFace("B_A_F_E_D_C")), faces.get(encontraFace("J_G_GT_JT")));
      
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("HT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("IT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("GT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT")), faces.get(encontraFace("J_G_GT_JT")));
       
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("F_A_AT_FT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_A_AT_FT")));
        
        arestas.get(encontraAresta("GT_G")).setFacesInvertido(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("J_G_GT_JT")));
        arestas.get(encontraAresta("HT_H")).setFacesInvertido(faces.get(encontraFace("H_I_IT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("IT_I")).setFacesInvertido(faces.get(encontraFace("I_J_JT_IT")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("JT_J")).setFacesInvertido(faces.get(encontraFace("J_G_GT_JT")), faces.get(encontraFace("I_J_JT_IT")));
      
        // Colocar arestas nas arestas
        arestas.get(encontraAresta("B_A")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("B_BT")));
        arestas.get(encontraAresta("B_A")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("C_B")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("C_CT")));
        arestas.get(encontraAresta("C_B")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("D_C")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("D_DT")));
        arestas.get(encontraAresta("D_C")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("E_D")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("E_ET")));
        arestas.get(encontraAresta("E_D")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("F_E")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("F_FT")));
        arestas.get(encontraAresta("F_E")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("A_F")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("A_AT")));
        arestas.get(encontraAresta("A_F")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("G_H")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("GT_G")));
        arestas.get(encontraAresta("G_H")).setArestasEsquerda(arestas.get(encontraAresta("J_G")), arestas.get(encontraAresta("H_I")));
       
        arestas.get(encontraAresta("H_I")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("HT_H")));
        arestas.get(encontraAresta("H_I")).setArestasEsquerda(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("I_J")));
        
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("IT_I")));
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("H_I")), arestas.get(encontraAresta("J_G")));
        
        arestas.get(encontraAresta("J_G")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("JT_J")));
        arestas.get(encontraAresta("J_G")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("G_H")));
        
        arestas.get(encontraAresta("AT_BT")).setArestasEsquerda(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("AT_BT")).setArestasDireita(arestas.get(encontraAresta("B_BT")), arestas.get(encontraAresta("A_AT")));
        
        arestas.get(encontraAresta("BT_CT")).setArestasEsquerda(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("BT_CT")).setArestasDireita(arestas.get(encontraAresta("C_CT")), arestas.get(encontraAresta("B_BT")));
        
        arestas.get(encontraAresta("CT_DT")).setArestasEsquerda(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("CT_DT")).setArestasDireita(arestas.get(encontraAresta("D_DT")), arestas.get(encontraAresta("C_CT")));
        
        arestas.get(encontraAresta("DT_ET")).setArestasEsquerda(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("DT_ET")).setArestasDireita(arestas.get(encontraAresta("E_ET")), arestas.get(encontraAresta("D_DT")));
        
        arestas.get(encontraAresta("ET_FT")).setArestasEsquerda(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("ET_FT")).setArestasDireita(arestas.get(encontraAresta("F_FT")), arestas.get(encontraAresta("E_ET")));
        
        arestas.get(encontraAresta("FT_AT")).setArestasEsquerda(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("FT_AT")).setArestasDireita(arestas.get(encontraAresta("A_AT")), arestas.get(encontraAresta("F_FT")));
        
        arestas.get(encontraAresta("HT_GT")).setArestasEsquerda(arestas.get(encontraAresta("IT_HT")), arestas.get(encontraAresta("GT_JT")));
        arestas.get(encontraAresta("HT_GT")).setArestasDireita(arestas.get(encontraAresta("GT_G")), arestas.get(encontraAresta("HT_H")));
        
        arestas.get(encontraAresta("IT_HT")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("HT_GT")));
        arestas.get(encontraAresta("IT_HT")).setArestasDireita(arestas.get(encontraAresta("HT_H")), arestas.get(encontraAresta("IT_I")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("GT_JT")), arestas.get(encontraAresta("IT_HT")));
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("IT_I")), arestas.get(encontraAresta("JT_J")));
        
        arestas.get(encontraAresta("GT_JT")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("JT_IT")));
        arestas.get(encontraAresta("GT_JT")).setArestasDireita(arestas.get(encontraAresta("JT_J")), arestas.get(encontraAresta("GT_G")));
        
        arestas.get(encontraAresta("A_AT")).setArestasEsquerda(arestas.get(encontraAresta("A_F")), arestas.get(encontraAresta("FT_AT")));
        arestas.get(encontraAresta("A_AT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        
        arestas.get(encontraAresta("B_BT")).setArestasEsquerda(arestas.get(encontraAresta("B_A")), arestas.get(encontraAresta("AT_BT")));
        arestas.get(encontraAresta("B_BT")).setArestasDireita(arestas.get(encontraAresta("BT_CT")), arestas.get(encontraAresta("C_B")));
        
        arestas.get(encontraAresta("C_CT")).setArestasEsquerda(arestas.get(encontraAresta("C_B")), arestas.get(encontraAresta("BT_CT")));
        arestas.get(encontraAresta("C_CT")).setArestasDireita(arestas.get(encontraAresta("CT_DT")), arestas.get(encontraAresta("D_C")));
        
        arestas.get(encontraAresta("D_DT")).setArestasEsquerda(arestas.get(encontraAresta("D_C")), arestas.get(encontraAresta("CT_DT")));
        arestas.get(encontraAresta("D_DT")).setArestasDireita(arestas.get(encontraAresta("DT_ET")), arestas.get(encontraAresta("E_D")));
        
        arestas.get(encontraAresta("E_ET")).setArestasEsquerda(arestas.get(encontraAresta("E_D")), arestas.get(encontraAresta("DT_ET")));
        arestas.get(encontraAresta("E_ET")).setArestasDireita(arestas.get(encontraAresta("ET_FT")), arestas.get(encontraAresta("F_E")));
        
        arestas.get(encontraAresta("F_FT")).setArestasEsquerda(arestas.get(encontraAresta("F_E")), arestas.get(encontraAresta("ET_FT")));
        arestas.get(encontraAresta("F_FT")).setArestasDireita(arestas.get(encontraAresta("FT_AT")), arestas.get(encontraAresta("A_F")));
        
        arestas.get(encontraAresta("GT_G")).setArestasEsquerda(arestas.get(encontraAresta("GT_JT")), arestas.get(encontraAresta("J_G")));
        arestas.get(encontraAresta("GT_G")).setArestasDireita(arestas.get(encontraAresta("G_H")), arestas.get(encontraAresta("HT_GT")));
        
        arestas.get(encontraAresta("HT_H")).setArestasEsquerda(arestas.get(encontraAresta("HT_GT")), arestas.get(encontraAresta("G_H")));
        arestas.get(encontraAresta("HT_H")).setArestasDireita(arestas.get(encontraAresta("H_I")), arestas.get(encontraAresta("IT_HT")));
        
        arestas.get(encontraAresta("IT_I")).setArestasEsquerda(arestas.get(encontraAresta("IT_HT")), arestas.get(encontraAresta("H_I")));
        arestas.get(encontraAresta("IT_I")).setArestasDireita(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("JT_J")).setArestasEsquerda(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("JT_J")).setArestasDireita(arestas.get(encontraAresta("J_G")), arestas.get(encontraAresta("GT_JT")));
        
        ArrayList<aresta> nova1 = new ArrayList(), nova2 = new ArrayList();
        for(int i = 0; i < arestasInternas.size(); i++){
            
            
            if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(0).getNomeFace())){
                nova1.add(arestasInternas.get(i));
            }else if(arestasInternas.get(i).getEsquerda().getNomeFace().equals(faces.get(1).getNomeFace())){
                nova2.add(arestasInternas.get(i));
            }
        }
        faces.get(0).colocaListaDeArestasInternas(nova1);
        faces.get(1).colocaListaDeArestasInternas(nova1);
      
    }
    
    private int encontraVertice(String S){
        for(int i=0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getNomeVertice().equals(S))
                return i;
        }
        return -1;
    }
    
    private int encontraAresta(String S){
        for(int i=0; i < this.arestas.size(); i++){
            if(this.arestas.get(i).getNomeAresta().equals(S))
                return i;
        }
        return -1;
    }
    
    private int encontraFace(String S){
        for(int i=0; i < this.faces.size(); i++){
            if(this.faces.get(i).getNomeFace().equals(S))
                return i;
        }
        return -1;
    }
    
    
    private caractere copia(){
        caractere novo = new caractere(String.valueOf(this.letra));
        
        for(int i = 0; i < novo.vertices.size(); i++){
            novo.vertices.get(i).ponto = this.vertices.get(i).ponto.add(Point3D.ZERO);
        }
        return novo;    
    }
    
    
}

