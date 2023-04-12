package letras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gustavo
 */


import cg.face;
import estrutura.aresta;
import estrutura.vertice;
import java.util.ArrayList;
import javafx.scene.shape.Shape;


/**
 *
 * @author Gustavo
 */
public final class letraA extends Shape{
    public ArrayList<vertice> vertices; 
    public ArrayList<aresta> arestas;
    public ArrayList<face> faces;
    

    public letraA() {
        vertices    = new ArrayList<>();
        arestas     = new ArrayList<>();
        faces       = new ArrayList<>();
        
        // Vértices da frente da letra
        vertices.add(new vertice("A", -2    	, -2	, 0.25, null));
        vertices.add(new vertice("B", -0.5  	, 2.0	, 0.25, null));
        vertices.add(new vertice("C", 0.5   	, 2	    , 0.25, null));
        vertices.add(new vertice("D", 2     	, -2	, 0.25, null));
        vertices.add(new vertice("E", 1.5   	, -2.0	, 0.25, null));
        vertices.add(new vertice("F", 0.9375	, -0.5	, 0.25, null));
        vertices.add(new vertice("G", -0.9375 	, -0.5	, 0.25, null));
        vertices.add(new vertice("H", -1.5    	, -2	, 0.25, null));
        vertices.add(new vertice("I", -0.75   	, 0	    , 0.25, null));
        vertices.add(new vertice("J", -0.25   	, 1.5	, 0.25, null));   
        vertices.add(new vertice("K", 0.25  	, 1.5	, 0.25, null));
        vertices.add(new vertice("L", 0.75  	, 0	    , 0.25, null));
        
        // Vértices das costas da letra
        vertices.add(new vertice("AT", -2       , -2    , -0.25, null));
        vertices.add(new vertice("BT", -0.5     , 2.0   , -0.25, null));
        vertices.add(new vertice("CT", 0.5      , 2     , -0.25, null));
        vertices.add(new vertice("DT", 2        , -2    , -0.25, null));
        vertices.add(new vertice("ET", 1.5      , -2.0  , -0.25, null));
        vertices.add(new vertice("FT", 0.9375   , -0.5  , -0.25, null));
        vertices.add(new vertice("GT", -0.9375  , -0.5  , -0.25, null));
        vertices.add(new vertice("HT", -1.5     , -2    , -0.25, null));
        vertices.add(new vertice("IT", -0.75    , 0     , -0.25, null));
        vertices.add(new vertice("JT", -0.25    , 1.5   , -0.25, null));   
        vertices.add(new vertice("KT", 0.25     , 1.5   , -0.25, null));
        vertices.add(new vertice("LT", 0.75     , 0     , -0.25, null));
        
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
        
        // Aresta para ser invisível
        //arestas.add(new aresta("ligacao_G_I", vertices.get(6), vertices.get(8), null, null, null, null, null, null));
        
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
        faces.add(new face("B_C_CT_BT"                  , arestas.get(encontraAresta("BT_CT"))));
        faces.add(new face("A_B_BT_AT"                  , arestas.get(encontraAresta("B_A"))));
        faces.add(new face("C_D_DT_CT"                  , arestas.get(encontraAresta("D_C"))));
        faces.add(new face("H_A_AT_HT"                  , arestas.get(encontraAresta("A_H"))));
        faces.add(new face("D_E_ET_DT"                  , arestas.get(encontraAresta("E_D"))));
        faces.add(new face("G_H_HT_GT"                  , arestas.get(encontraAresta("H_G"))));
        faces.add(new face("E_F_FT_ET"                  , arestas.get(encontraAresta("F_E"))));
        faces.add(new face("F_G_GT_FT"                  , arestas.get(encontraAresta("G_F"))));
        faces.add(new face("J_I_IT_JT"                  , arestas.get(encontraAresta("I_J"))));
        faces.add(new face("L_K_KT_LT"                  , arestas.get(encontraAresta("K_L"))));
        faces.add(new face("K_J_JT_KT"                  , arestas.get(encontraAresta("J_K"))));
        faces.add(new face("I_L_LT_IT"                  , arestas.get(encontraAresta("L_I"))));
        
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
        
        arestas.get(encontraAresta("I_IT")).setArestasDireita(arestas.get(encontraAresta("AT_BT")), arestas.get(encontraAresta("B_A")));
        arestas.get(encontraAresta("I_IT")).setArestasEsquerda(arestas.get(encontraAresta("A_H")), arestas.get(encontraAresta("HT_AT")));
        
        
    }
    
    public int encontraVertice(String S){
        for(int i=0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getNomeVertice().equals(S))
                return i;
        }
        return -1;
    }
    
    public int encontraAresta(String S){
        for(int i=0; i < this.arestas.size(); i++){
            if(this.arestas.get(i).getNomeAresta().equals(S))
                return i;
        }
        return -1;
    }
    
    public int encontraFace(String S){
        for(int i=0; i < this.faces.size(); i++){
            if(this.faces.get(i).getNomeFace().equals(S))
                return i;
        }
        return -1;
    }
}
