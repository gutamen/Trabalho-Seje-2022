/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letras;

/**
 *
 * @author gustavo
 */
import estrutura.face;
import estrutura.aresta;
import estrutura.vertice;
import java.util.ArrayList;
import javafx.scene.shape.Shape;


/**
 *
 * @author Gustavo
 */
public final class letraE extends Shape{
    public ArrayList<vertice> vertices; 
    public ArrayList<aresta> arestas;
    public ArrayList<face> faces;

    

    public letraE() {
        vertices    = new ArrayList<>();
        arestas     = new ArrayList<>();
        faces       = new ArrayList<>();
        
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
        faces.add(new face("A_L_K_I_H_G_F_E_D_C_B"              , arestas.get(encontraAresta("B_A"))));
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
        faces.add(new face("L_A_AT_LT"                          , arestas.get(encontraAresta("G_F"))));

        

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

