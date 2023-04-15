/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letras;

import estrutura.face;
import estrutura.aresta;
import estrutura.vertice;
import java.util.ArrayList;

/**
 *
 * @author gustavo
 */
public class caractere {
    public ArrayList<vertice>   vertices; 
    public ArrayList<aresta>    arestas;
    public ArrayList<face>      faces;
    public char                 letra;
    
    public caractere(String caractereDefinido){
        this.vertices   = new ArrayList<>();
        this.arestas    = new ArrayList<>();
        this.faces      = new ArrayList<>();
        this.letra      = caractereDefinido.charAt(0);
        
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
        arestas.add(new aresta("K_L", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("J_K", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("L_I", vertices.get(11), vertices.get(8), null, null, null, null, null, null));
        
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
        arestas.add(new aresta("KT_JT", vertices.get(22), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("LT_KT", vertices.get(23), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("IT_LT", vertices.get(20), vertices.get(23), null, null, null, null, null, null));
        
        // Arestas que ligam a frente e costas da letra
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
        arestas.add(new aresta("K_KT", vertices.get(10), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("L_LT", vertices.get(11), vertices.get(23), null, null, null, null, null, null));
        
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
        vertices.get(encontraVertice("IT")).setArestaVertice(arestas.get(encontraAresta("I_IT")));
        vertices.get(encontraVertice("JT")).setArestaVertice(arestas.get(encontraAresta("J_JT")));
        vertices.get(encontraVertice("KT")).setArestaVertice(arestas.get(encontraAresta("K_KT")));
        vertices.get(encontraVertice("LT")).setArestaVertice(arestas.get(encontraAresta("L_LT")));
        
        // Criação das faces
        faces.add(new face("A_H_G_F_E_D_C_B"            , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT"    , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("B_C_CT_BT"                  , arestas.get(encontraAresta("C_CT"))));
        faces.add(new face("A_B_BT_AT"                  , arestas.get(encontraAresta("B_BT"))));
        faces.add(new face("C_D_DT_CT"                  , arestas.get(encontraAresta("D_DT"))));
        faces.add(new face("H_A_AT_HT"                  , arestas.get(encontraAresta("A_AT"))));
        faces.add(new face("D_E_ET_DT"                  , arestas.get(encontraAresta("E_ET"))));
        faces.add(new face("G_H_HT_GT"                  , arestas.get(encontraAresta("H_HT"))));
        faces.add(new face("E_F_FT_ET"                  , arestas.get(encontraAresta("F_FT"))));
        faces.add(new face("F_G_GT_FT"                  , arestas.get(encontraAresta("G_GT"))));
        faces.add(new face("J_I_IT_JT"                  , arestas.get(encontraAresta("I_IT"))));
        faces.add(new face("L_K_KT_LT"                  , arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("K_J_JT_KT"                  , arestas.get(encontraAresta("J_JT"))));
        faces.add(new face("I_L_LT_IT"                  , arestas.get(encontraAresta("L_LT"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("H_A_AT_HT")));
        arestas.get(encontraAresta("I_J")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("J_I_IT_JT")));
        arestas.get(encontraAresta("J_K")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("K_J_JT_KT")));
        arestas.get(encontraAresta("K_L")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("L_K_KT_LT")));
        arestas.get(encontraAresta("L_I")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("I_L_LT_IT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("J_I_IT_JT")));
        arestas.get(encontraAresta("KT_JT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("K_J_JT_KT")));
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("L_K_KT_LT")));
        arestas.get(encontraAresta("IT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("I_L_LT_IT")));
        
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("A_B_BT_AT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("H_A_AT_HT")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("J_I_IT_JT")), faces.get(encontraFace("I_L_LT_IT")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("K_J_JT_KT")), faces.get(encontraFace("J_I_IT_JT")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("L_K_KT_LT")), faces.get(encontraFace("K_J_JT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("I_L_LT_IT")), faces.get(encontraFace("L_K_KT_LT")));
        
        
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
        
        
        arestas.get(encontraAresta("I_J")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("I_IT")));
        arestas.get(encontraAresta("I_J")).setArestasEsquerda(arestas.get(encontraAresta("L_I")), arestas.get(encontraAresta("J_K")));
        
        arestas.get(encontraAresta("J_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("J_JT")));
        arestas.get(encontraAresta("J_K")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("K_L")));
        
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("K_KT")));
        arestas.get(encontraAresta("K_L")).setArestasEsquerda(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("L_I")));
        
        arestas.get(encontraAresta("L_I")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("L_LT")));
        arestas.get(encontraAresta("L_I")).setArestasEsquerda(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("I_J")));
        
        arestas.get(encontraAresta("JT_IT")).setArestasDireita(arestas.get(encontraAresta("I_IT")), arestas.get(encontraAresta("J_JT")));
        arestas.get(encontraAresta("JT_IT")).setArestasEsquerda(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("IT_LT")));
        
        arestas.get(encontraAresta("KT_JT")).setArestasDireita(arestas.get(encontraAresta("J_JT")), arestas.get(encontraAresta("K_KT")));
        arestas.get(encontraAresta("KT_JT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")), arestas.get(encontraAresta("L_LT")));
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("IT_LT")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("IT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")), arestas.get(encontraAresta("I_IT")));
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
        
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("IT_LT")), arestas.get(encontraAresta("L_I")));
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("I_J")), arestas.get(encontraAresta("JT_IT")));
        
        arestas.get(encontraAresta("J_JT")).setArestasDireita(arestas.get(encontraAresta("JT_IT")), arestas.get(encontraAresta("I_J")));
        arestas.get(encontraAresta("J_JT")).setArestasEsquerda(arestas.get(encontraAresta("J_K")), arestas.get(encontraAresta("KT_JT")));
        
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_JT")), arestas.get(encontraAresta("J_K")));
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_L")), arestas.get(encontraAresta("LT_KT")));
        
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_KT")), arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_I")), arestas.get(encontraAresta("IT_LT")));
        
    }
    
    private void createB(){
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
        arestas.add( new aresta("L_M", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add( new aresta("M_N", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add( new aresta("N_K", vertices.get(13), vertices.get(10), null, null, null, null, null, null));
        
        // Arestas quadrado alto
        arestas.add( new aresta("O_P", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add( new aresta("P_Q", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add( new aresta("Q_R", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add( new aresta("R_O", vertices.get(17), vertices.get(14), null, null, null, null, null, null));
        
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
        arestas.add( new aresta("MT_LT", vertices.get(30), vertices.get(29), null, null, null, null, null, null));
        arestas.add( new aresta("NT_MT", vertices.get(31), vertices.get(30), null, null, null, null, null, null));
        arestas.add( new aresta("KT_NT", vertices.get(28), vertices.get(31), null, null, null, null, null, null));
        
        // Arestas Quadrado alto
        arestas.add( new aresta("PT_OT", vertices.get(33), vertices.get(32), null, null, null, null, null, null));
        arestas.add( new aresta("QT_PT", vertices.get(34), vertices.get(33), null, null, null, null, null, null));
        arestas.add( new aresta("RT_QT", vertices.get(35), vertices.get(34), null, null, null, null, null, null));
        arestas.add( new aresta("OT_RT", vertices.get(32), vertices.get(35), null, null, null, null, null, null));
        
        // Arestas ligação frente-verso
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
        arestas.add( new aresta("K_KT", vertices.get(10), vertices.get(28), null, null, null, null, null, null));
        arestas.add( new aresta("L_LT", vertices.get(11), vertices.get(29), null, null, null, null, null, null));
        arestas.add( new aresta("M_MT", vertices.get(12), vertices.get(30), null, null, null, null, null, null));
        arestas.add( new aresta("N_NT", vertices.get(13), vertices.get(31), null, null, null, null, null, null));
        arestas.add( new aresta("O_OT", vertices.get(14), vertices.get(32), null, null, null, null, null, null));
        arestas.add( new aresta("P_PT", vertices.get(15), vertices.get(33), null, null, null, null, null, null));
        arestas.add( new aresta("Q_QT", vertices.get(16), vertices.get(34), null, null, null, null, null, null));
        arestas.add( new aresta("R_RT", vertices.get(17), vertices.get(35), null, null, null, null, null, null));
        
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
        faces.add(new face("A_J_I_H_G_F_E_D_C_B"            ,arestas.get(encontraAresta("A_J"))));
        faces.add(new face("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT"  ,arestas.get(encontraAresta("AT_BT"))));
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
        faces.add(new face("L_K_KT_LT"                      ,arestas.get(encontraAresta("K_KT"))));
        faces.add(new face("M_L_LT_MT"                      ,arestas.get(encontraAresta("L_LT"))));
        faces.add(new face("N_M_MT_NT"                      ,arestas.get(encontraAresta("M_MT"))));
        faces.add(new face("K_N_NT_KT"                      ,arestas.get(encontraAresta("N_NT"))));
        faces.add(new face("P_O_OT_PT"                      ,arestas.get(encontraAresta("O_OT"))));
        faces.add(new face("Q_P_PT_QT"                      ,arestas.get(encontraAresta("P_PT"))));
        faces.add(new face("R_Q_QT_RT"                      ,arestas.get(encontraAresta("Q_QT"))));
        faces.add(new face("O_R_RT_OT"                      ,arestas.get(encontraAresta("R_RT"))));
   
        // Colocar faces nas arestas
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("I_H")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("H_I_IT_HT")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("I_J_JT_IT")));
        arestas.get(encontraAresta("A_J")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("J_A_AT_JT")));
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
        arestas.get(encontraAresta("K_L")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("L_K_KT_LT")));
        arestas.get(encontraAresta("L_M")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("M_L_LT_MT")));
        arestas.get(encontraAresta("M_N")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("N_M_MT_NT")));
        arestas.get(encontraAresta("N_K")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("K_N_NT_KT")));
        arestas.get(encontraAresta("O_P")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("P_O_OT_PT")));
        arestas.get(encontraAresta("P_Q")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("Q_P_PT_QT")));
        arestas.get(encontraAresta("Q_R")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("R_Q_QT_RT")));
        arestas.get(encontraAresta("R_O")).setFaces(faces.get(encontraFace("A_J_I_H_G_F_E_D_C_B")), faces.get(encontraFace("O_R_RT_OT")));
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("L_K_KT_LT")));
        arestas.get(encontraAresta("MT_LT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("M_L_LT_MT")));
        arestas.get(encontraAresta("NT_MT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("N_M_MT_NT")));
        arestas.get(encontraAresta("KT_NT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("K_N_NT_KT")));
        arestas.get(encontraAresta("PT_OT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("P_O_OT_PT")));
        arestas.get(encontraAresta("QT_PT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("Q_P_PT_QT")));
        arestas.get(encontraAresta("RT_QT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("R_Q_QT_RT")));
        arestas.get(encontraAresta("OT_RT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT_IT_JT")), faces.get(encontraFace("O_R_RT_OT")));
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
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("L_K_KT_LT")), faces.get(encontraFace("K_N_NT_KT")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("M_L_LT_MT")), faces.get(encontraFace("L_K_KT_LT")));
        arestas.get(encontraAresta("M_MT")).setFaces(faces.get(encontraFace("N_M_MT_NT")), faces.get(encontraFace("M_L_LT_MT")));
        arestas.get(encontraAresta("N_NT")).setFaces(faces.get(encontraFace("K_N_NT_KT")), faces.get(encontraFace("N_M_MT_NT")));
        arestas.get(encontraAresta("O_OT")).setFaces(faces.get(encontraFace("P_O_OT_PT")), faces.get(encontraFace("O_R_RT_OT")));
        arestas.get(encontraAresta("P_PT")).setFaces(faces.get(encontraFace("Q_P_PT_QT")), faces.get(encontraFace("P_O_OT_PT")));
        arestas.get(encontraAresta("Q_QT")).setFaces(faces.get(encontraFace("R_Q_QT_RT")), faces.get(encontraFace("Q_P_PT_QT")));
        arestas.get(encontraAresta("R_RT")).setFaces(faces.get(encontraFace("O_R_RT_OT")), faces.get(encontraFace("R_Q_QT_RT")));
        //arestas.get(encontraAresta("")).setFaces(faces.get(encontraFace("")), faces.get(encontraFace("")));
        
        //Unir arestas
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
        arestas.get(encontraAresta("K_L")).setArestasDireita(arestas.get(encontraAresta("L_LT")),arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("L_M")).setArestasEsquerda(arestas.get(encontraAresta("K_L")),arestas.get(encontraAresta("M_N")));
        arestas.get(encontraAresta("L_M")).setArestasDireita(arestas.get(encontraAresta("M_MT")),arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("M_N")).setArestasEsquerda(arestas.get(encontraAresta("L_M")),arestas.get(encontraAresta("N_K")));
        arestas.get(encontraAresta("M_N")).setArestasDireita(arestas.get(encontraAresta("N_NT")),arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("N_K")).setArestasEsquerda(arestas.get(encontraAresta("M_N")),arestas.get(encontraAresta("K_L")));
        arestas.get(encontraAresta("N_K")).setArestasDireita(arestas.get(encontraAresta("K_KT")),arestas.get(encontraAresta("N_NT")));
        
        arestas.get(encontraAresta("O_P")).setArestasEsquerda(arestas.get(encontraAresta("R_O")),arestas.get(encontraAresta("P_Q")));
        arestas.get(encontraAresta("O_P")).setArestasDireita(arestas.get(encontraAresta("P_PT")),arestas.get(encontraAresta("O_OT")));
        
        arestas.get(encontraAresta("P_Q")).setArestasEsquerda(arestas.get(encontraAresta("O_P")),arestas.get(encontraAresta("Q_R")));
        arestas.get(encontraAresta("P_Q")).setArestasDireita(arestas.get(encontraAresta("Q_QT")),arestas.get(encontraAresta("P_PT")));
        
        arestas.get(encontraAresta("Q_R")).setArestasEsquerda(arestas.get(encontraAresta("P_Q")),arestas.get(encontraAresta("R_O")));
        arestas.get(encontraAresta("Q_R")).setArestasDireita(arestas.get(encontraAresta("R_RT")),arestas.get(encontraAresta("Q_QT")));
        
        arestas.get(encontraAresta("R_O")).setArestasEsquerda(arestas.get(encontraAresta("Q_R")),arestas.get(encontraAresta("O_P")));
        arestas.get(encontraAresta("R_O")).setArestasDireita(arestas.get(encontraAresta("O_OT")),arestas.get(encontraAresta("R_RT")));
        
        arestas.get(encontraAresta("LT_KT")).setArestasEsquerda(arestas.get(encontraAresta("MT_LT")),arestas.get(encontraAresta("KT_NT")));
        arestas.get(encontraAresta("LT_KT")).setArestasDireita(arestas.get(encontraAresta("K_KT")),arestas.get(encontraAresta("L_LT")));
        
        arestas.get(encontraAresta("MT_LT")).setArestasEsquerda(arestas.get(encontraAresta("NT_MT")),arestas.get(encontraAresta("LT_KT")));
        arestas.get(encontraAresta("MT_LT")).setArestasDireita(arestas.get(encontraAresta("L_LT")),arestas.get(encontraAresta("M_MT")));
        
        arestas.get(encontraAresta("NT_MT")).setArestasEsquerda(arestas.get(encontraAresta("KT_NT")),arestas.get(encontraAresta("MT_LT")));
        arestas.get(encontraAresta("NT_MT")).setArestasDireita(arestas.get(encontraAresta("M_MT")),arestas.get(encontraAresta("N_NT")));
        
        arestas.get(encontraAresta("KT_NT")).setArestasEsquerda(arestas.get(encontraAresta("LT_KT")),arestas.get(encontraAresta("NT_MT")));
        arestas.get(encontraAresta("KT_NT")).setArestasDireita(arestas.get(encontraAresta("N_NT")),arestas.get(encontraAresta("K_KT")));
        
        arestas.get(encontraAresta("PT_OT")).setArestasEsquerda(arestas.get(encontraAresta("QT_PT")),arestas.get(encontraAresta("OT_RT")));
        arestas.get(encontraAresta("PT_OT")).setArestasDireita(arestas.get(encontraAresta("O_OT")),arestas.get(encontraAresta("P_PT")));
        
        arestas.get(encontraAresta("QT_PT")).setArestasEsquerda(arestas.get(encontraAresta("RT_QT")),arestas.get(encontraAresta("PT_OT")));
        arestas.get(encontraAresta("QT_PT")).setArestasDireita(arestas.get(encontraAresta("P_PT")),arestas.get(encontraAresta("Q_QT")));
        
        arestas.get(encontraAresta("RT_QT")).setArestasEsquerda(arestas.get(encontraAresta("OT_RT")),arestas.get(encontraAresta("QT_PT")));
        arestas.get(encontraAresta("RT_QT")).setArestasDireita(arestas.get(encontraAresta("Q_QT")),arestas.get(encontraAresta("R_RT")));
        
        arestas.get(encontraAresta("OT_RT")).setArestasEsquerda(arestas.get(encontraAresta("PT_OT")),arestas.get(encontraAresta("RT_QT")));
        arestas.get(encontraAresta("OT_RT")).setArestasDireita(arestas.get(encontraAresta("R_RT")),arestas.get(encontraAresta("O_OT")));
        
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
        
        arestas.get(encontraAresta("K_KT")).setArestasEsquerda(arestas.get(encontraAresta("K_L")),arestas.get(encontraAresta("LT_KT")));
        arestas.get(encontraAresta("K_KT")).setArestasDireita(arestas.get(encontraAresta("KT_NT")),arestas.get(encontraAresta("N_K")));
        
        arestas.get(encontraAresta("L_LT")).setArestasEsquerda(arestas.get(encontraAresta("L_M")),arestas.get(encontraAresta("MT_LT")));
        arestas.get(encontraAresta("L_LT")).setArestasDireita(arestas.get(encontraAresta("LT_KT")),arestas.get(encontraAresta("K_L")));
        
        arestas.get(encontraAresta("M_MT")).setArestasEsquerda(arestas.get(encontraAresta("M_N")),arestas.get(encontraAresta("NT_MT")));
        arestas.get(encontraAresta("M_MT")).setArestasDireita(arestas.get(encontraAresta("MT_LT")),arestas.get(encontraAresta("L_M")));
        
        arestas.get(encontraAresta("N_NT")).setArestasEsquerda(arestas.get(encontraAresta("N_K")),arestas.get(encontraAresta("KT_NT")));
        arestas.get(encontraAresta("N_NT")).setArestasDireita(arestas.get(encontraAresta("NT_MT")),arestas.get(encontraAresta("M_N")));
        
        arestas.get(encontraAresta("O_OT")).setArestasEsquerda(arestas.get(encontraAresta("O_P")),arestas.get(encontraAresta("PT_OT")));
        arestas.get(encontraAresta("O_OT")).setArestasDireita(arestas.get(encontraAresta("OT_RT")),arestas.get(encontraAresta("R_O")));
        
        arestas.get(encontraAresta("P_PT")).setArestasEsquerda(arestas.get(encontraAresta("P_Q")),arestas.get(encontraAresta("QT_PT")));
        arestas.get(encontraAresta("P_PT")).setArestasDireita(arestas.get(encontraAresta("PT_OT")),arestas.get(encontraAresta("O_P")));
        
        arestas.get(encontraAresta("Q_QT")).setArestasEsquerda(arestas.get(encontraAresta("Q_R")),arestas.get(encontraAresta("RT_QT")));
        arestas.get(encontraAresta("Q_QT")).setArestasDireita(arestas.get(encontraAresta("QT_PT")),arestas.get(encontraAresta("P_Q")));
        
        arestas.get(encontraAresta("R_RT")).setArestasEsquerda(arestas.get(encontraAresta("R_O")),arestas.get(encontraAresta("OT_RT")));
        arestas.get(encontraAresta("R_RT")).setArestasDireita(arestas.get(encontraAresta("RT_QT")),arestas.get(encontraAresta("Q_R")));
        
        //arestas.get(encontraAresta("")).setArestasEsquerda(arestas.get(encontraAresta("")),arestas.get(encontraAresta("")));
        //arestas.get(encontraAresta("")).setArestasDireita(arestas.get(encontraAresta("")),arestas.get(encontraAresta("")));
        
        
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
        faces.add(new face("A_H_G_F_E_D_C_B"        , arestas.get(encontraAresta("B_A"))));
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
        arestas.get(encontraAresta("B_A")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("C_B")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("D_C")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("E_D")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("F_E")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("G_F")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("H_G")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("A_H")).setFaces(faces.get(encontraFace("A_H_G_F_E_D_C_B")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("B_C_CT_BT")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("D_E_ET_DT")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("E_F_FT_ET")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("F_G_GT_FT")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("G_H_HT_GT")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")), faces.get(encontraFace("H_A_AT_HT")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("A_B_BT_AT")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("B_C_CT_BT")), faces.get(encontraFace("C_D_DT_CT")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("C_D_DT_CT")), faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("D_E_ET_DT")), faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("E_F_FT_ET")), faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("F_G_GT_FT")), faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("G_H_HT_GT")), faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("H_A_AT_HT")), faces.get(encontraFace("AT_BT_CT_DT_ET_FT_GT_HT")));
        
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
        
    }
    
    private void createD(){
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
        
        //Arestas da frente da letra
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("A_F", vertices.get(0), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("H_I", vertices.get(7), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestas.add(new aresta("J_K", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("L_G", vertices.get(11), vertices.get(6), null, null, null, null, null, null)); 
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
        arestas.add(new aresta("BT_AT", vertices.get(13),vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("CT_BT", vertices.get(14), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("DT_CT", vertices.get(15), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("ET_DT", vertices.get(16), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("FT_ET", vertices.get(17), vertices.get(16), null, null, null, null, null, null));
        arestas.add(new aresta("GT_FT", vertices.get(18), vertices.get(17), null, null, null, null, null, null));
        arestas.add(new aresta("HT_GT", vertices.get(19), vertices.get(18), null, null, null, null, null, null));
        arestas.add(new aresta("IT_HT", vertices.get(20), vertices.get(19), null, null, null, null, null, null));
        arestas.add(new aresta("JT_IT", vertices.get(21), vertices.get(20), null, null, null, null, null, null));      
        arestas.add(new aresta("KT_JT", vertices.get(22), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("LT_KT", vertices.get(23), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("AT_LT", vertices.get(12), vertices.get(23), null, null, null, null, null, null));
        
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
        /*faces.add(new face("A_L_K_I_H_G_F_E_D_C_B"              , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("AT_LT_KT_IT_HT_GT_FT_ET_DT_CT_BT"   , arestas.get(encontraAresta("BT_AT"))));
        faces.add(new face("A_B_BT_AT"                          , arestas.get(encontraAresta("C_B"))));
        faces.add(new face("B_C_CT_BT"                          , arestas.get(encontraAresta("A_H"))));
        faces.add(new face("C_D_DT_CT"                          , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("D_E_ET_DT"                          , arestas.get(encontraAresta("D_C"))));
        faces.add(new face("E_F_FT_ET"                          , arestas.get(encontraAresta("H_G"))));   
        faces.add(new face("F_G_GT_FT"                          , arestas.get(encontraAresta("E_D"))));
        faces.add(new face("G_H_HT_GT"                          , arestas.get(encontraAresta("F_E"))));
        faces.add(new face("H_I_IT_HT"                          , arestas.get(encontraAresta("G_F"))));
        faces.add(new face("I_J_JT_IT"                          , arestas.get(encontraAresta("G_F"))));
        faces.add(new face("J_K_KT_JT"                          , arestas.get(encontraAresta("G_F"))));
        faces.add(new face("K_L_LT_KT"                          , arestas.get(encontraAresta("G_F"))));
        faces.add(new face("L_A_AT_LT"                          , arestas.get(encontraAresta("G_F"))));*/
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
    }
    
    private void createO(){
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
        vertices.add(new vertice("ET", -1, -1, 0, null));
        vertices.add(new vertice("FT", -1, 1, 0, null));
        vertices.add(new vertice("GT", 1, 1, 0, null));
        vertices.add(new vertice("HT", 1, -1, 0, null));
        
        // Arestas da frente fora
        arestas.add(new aresta("A_D", vertices.get(0), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        
        // Arestas da frente dentro
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("H_E", vertices.get(7), vertices.get(4), null, null, null, null, null, null));
    }
    
    private void createP(){
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
        arestas.add(new aresta("H_I", vertices.get(7),  vertices.get(8), null, null, null, null, null, null));      
        arestas.add(new aresta("I_J", vertices.get(8),  vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("J_G", vertices.get(9), vertices.get(6), null, null, null, null, null, null));
    }
    
    private void createQ(){
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
        arestas.add(new aresta("J_K", vertices.get(9),  vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("L_M", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("M_N", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("N_O", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("O_P", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("P_I", vertices.get(15), vertices.get(8), null, null, null, null, null, null));
    }
    
    private void createR(){
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
        arestas.add(new aresta("L_M", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("M_N", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("N_K", vertices.get(13), vertices.get(10), null, null, null, null, null, null));
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
        
        // Arestas de frente da letra
        arestas.add(new aresta("A_H", vertices.get(0), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("E_D", vertices.get(4), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("F_E", vertices.get(5), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("G_F", vertices.get(6), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("H_G", vertices.get(7), vertices.get(6), null, null, null, null, null, null));  
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
        vertices.add(new vertice("BT", -2, -1, 0.0, null));
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
    }
    
    private void create0(){
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
        
        // Arestas da frente do número
        arestas.add(new aresta("A_D", vertices.get(0), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("B_A", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_B", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_C", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        
        // Arestas de trás do número
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("H_E", vertices.get(7), vertices.get(4), null, null, null, null, null, null));
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
    }
    
    private void create4(){
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
        arestas.add(new aresta("H_I", vertices.get(7), vertices.get(8), null, null, null, null, null, null));
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestas.add(new aresta("J_G", vertices.get(9), vertices.get(6), null, null, null, null, null, null));
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
    }
    
    private void create6(){
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
        arestas.add(new aresta("J_K", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("L_I", vertices.get(11), vertices.get(8), null, null, null, null, null, null));
        
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
    }
    
    private void create8(){
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
        arestas.add(new aresta("B_B", vertices.get(1), vertices.get(0), null, null, null, null, null, null));
        arestas.add(new aresta("C_C", vertices.get(2), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("D_A", vertices.get(3), vertices.get(2), null, null, null, null, null, null));
        
        // Arestas da frente do número dentro
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("H_E", vertices.get(7), vertices.get(4), null, null, null, null, null, null));  
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestas.add(new aresta("J_K", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("L_I", vertices.get(11), vertices.get(8), null, null, null, null, null, null));
    }
    
    private void create9(){
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
        arestas.add(new aresta("H_I", vertices.get(7), vertices.get(8), null, null, null, null, null, null));  
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestas.add(new aresta("J_G", vertices.get(9), vertices.get(6), null, null, null, null, null, null));
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
    
}
