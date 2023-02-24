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
        arestas.add(new aresta("A_B", vertices.get(0), vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("B_C", vertices.get(1), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("C_D", vertices.get(2), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("D_E", vertices.get(3), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("H_A", vertices.get(7), vertices.get(0), null, null, null, null, null, null));
        
        // Arestas do centro da frente da letra
        arestas.add(new aresta("I_L", vertices.get(8), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        
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
        arestas.add(new aresta("IT_LT", vertices.get(20), vertices.get(23), null, null, null, null, null, null));
        arestas.add(new aresta("LT_KT", vertices.get(23), vertices.get(22), null, null, null, null, null, null));
        arestas.add(new aresta("KT_JT", vertices.get(22), vertices.get(21), null, null, null, null, null, null));
        arestas.add(new aresta("JT_IT", vertices.get(21), vertices.get(20), null, null, null, null, null, null));
        
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
        arestas.add(new aresta("ligacao_G_I", vertices.get(6), vertices.get(8), null, null, null, null, null, null));
        
        // Adicionando areta para vértice
        vertices.get(encontraVertice("A")).setArestaVertice(arestas.get(encontraAresta("A_B")));
        vertices.get(encontraVertice("B")).setArestaVertice(arestas.get(encontraAresta("B_C")));
        vertices.get(encontraVertice("C")).setArestaVertice(arestas.get(encontraAresta("C_D")));
        vertices.get(encontraVertice("D")).setArestaVertice(arestas.get(encontraAresta("D_E")));
        vertices.get(encontraVertice("E")).setArestaVertice(arestas.get(encontraAresta("E_F")));
        vertices.get(encontraVertice("F")).setArestaVertice(arestas.get(encontraAresta("F_G")));
        vertices.get(encontraVertice("G")).setArestaVertice(arestas.get(encontraAresta("G_H")));
        vertices.get(encontraVertice("H")).setArestaVertice(arestas.get(encontraAresta("H_A")));
        vertices.get(encontraVertice("I")).setArestaVertice(arestas.get(encontraAresta("I_L")));
        vertices.get(encontraVertice("J")).setArestaVertice(arestas.get(encontraAresta("L_K")));
        vertices.get(encontraVertice("K")).setArestaVertice(arestas.get(encontraAresta("K_J")));
        vertices.get(encontraVertice("L")).setArestaVertice(arestas.get(encontraAresta("J_I")));
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
        faces.add(new face("frente"             , arestas.get(encontraAresta("A_B"))));
        faces.add(new face("tras"               , arestas.get(encontraAresta("AT_BT"))));
        faces.add(new face("topo"               , arestas.get(encontraAresta("B_C"))));
        faces.add(new face("esquerda"           , arestas.get(encontraAresta("A_B"))));
        faces.add(new face("direita"            , arestas.get(encontraAresta("C_D"))));
        faces.add(new face("baixoEsquerda"      , arestas.get(encontraAresta("H_A"))));
        faces.add(new face("baixoDireita"       , arestas.get(encontraAresta("D_E"))));
        faces.add(new face("centroBaixoEsquerda", arestas.get(encontraAresta("G_H"))));
        faces.add(new face("centroBaixoDireita" , arestas.get(encontraAresta("E_F"))));
        faces.add(new face("centroBaixoMeio"    , arestas.get(encontraAresta("F_G"))));
        faces.add(new face("centroAltoEsquerda" , arestas.get(encontraAresta("J_I"))));
        faces.add(new face("centroAltoDireita"  , arestas.get(encontraAresta("L_K"))));
        faces.add(new face("centroAltoTopo"     , arestas.get(encontraAresta("K_J"))));
        faces.add(new face("centroAltoBase"     , arestas.get(encontraAresta("I_L"))));
        
        // Colocar faces nas arestas
        arestas.get(encontraAresta("A_B")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("esquerda")));
        arestas.get(encontraAresta("B_C")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("topo")));
        arestas.get(encontraAresta("C_D")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("direita")));
        arestas.get(encontraAresta("D_E")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("baixoDireita")));
        arestas.get(encontraAresta("E_F")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("centroBaixoDireita")));
        arestas.get(encontraAresta("F_G")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("centroBaixoMeio")));
        arestas.get(encontraAresta("G_H")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("centroBaixoEsquerda")));
        arestas.get(encontraAresta("H_A")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("baixoEsquerda")));
        arestas.get(encontraAresta("I_L")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("centroAltoBase")));
        arestas.get(encontraAresta("L_K")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("centroAltoDireita")));
        arestas.get(encontraAresta("K_J")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("centroAltoTopo")));
        arestas.get(encontraAresta("J_I")).setFaces(faces.get(encontraFace("frente")), faces.get(encontraFace("centroAltoEsquerda")));
        
        arestas.get(encontraAresta("AT_BT")).setFaces(faces.get(encontraFace("esquerda")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("BT_CT")).setFaces(faces.get(encontraFace("topo")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("CT_DT")).setFaces(faces.get(encontraFace("direita")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("DT_ET")).setFaces(faces.get(encontraFace("baixoDireita")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("ET_FT")).setFaces(faces.get(encontraFace("centroBaixoDireita")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("FT_GT")).setFaces(faces.get(encontraFace("centroBaixoMeio")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("GT_HT")).setFaces(faces.get(encontraFace("centroBaixoEsquerda")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("HT_AT")).setFaces(faces.get(encontraFace("baixoEsquerda")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("IT_LT")).setFaces(faces.get(encontraFace("centroAltoBase")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("LT_KT")).setFaces(faces.get(encontraFace("centroAltoDireita")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("KT_JT")).setFaces(faces.get(encontraFace("centroAltoTopo")), faces.get(encontraFace("tras")));
        arestas.get(encontraAresta("JT_IT")).setFaces(faces.get(encontraFace("centroAltoEsquerda")), faces.get(encontraFace("tras")));
        
        arestas.get(encontraAresta("A_AT")).setFaces(faces.get(encontraFace("esquerda")), faces.get(encontraFace("baixoEsquerda")));
        arestas.get(encontraAresta("B_BT")).setFaces(faces.get(encontraFace("topo")), faces.get(encontraFace("esquerda")));
        arestas.get(encontraAresta("C_CT")).setFaces(faces.get(encontraFace("direita")), faces.get(encontraFace("topo")));
        arestas.get(encontraAresta("D_DT")).setFaces(faces.get(encontraFace("baixoDireita")), faces.get(encontraFace("direita")));
        arestas.get(encontraAresta("E_ET")).setFaces(faces.get(encontraFace("centroBaixoDireita")), faces.get(encontraFace("baixoDireita")));
        arestas.get(encontraAresta("F_FT")).setFaces(faces.get(encontraFace("centroBaixoMeio")), faces.get(encontraFace("centroBaixoDireita")));
        arestas.get(encontraAresta("G_GT")).setFaces(faces.get(encontraFace("centroBaixoEsquerda")), faces.get(encontraFace("centroBaixoMeio")));
        arestas.get(encontraAresta("H_HT")).setFaces(faces.get(encontraFace("baixoEsquerda")), faces.get(encontraFace("centroBaixoEsquerda")));
        arestas.get(encontraAresta("I_IT")).setFaces(faces.get(encontraFace("centroAltoBase")), faces.get(encontraFace("centroAltoEsquerda")));
        arestas.get(encontraAresta("J_JT")).setFaces(faces.get(encontraFace("centroAltoEsquerda")), faces.get(encontraFace("centroAltoTopo")));
        arestas.get(encontraAresta("K_KT")).setFaces(faces.get(encontraFace("centroAltoTopo")), faces.get(encontraFace("centroAltoDireita")));
        arestas.get(encontraAresta("L_LT")).setFaces(faces.get(encontraFace("centroAltoDireita")), faces.get(encontraFace("centroAltoBase")));
        
        
        
        
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
