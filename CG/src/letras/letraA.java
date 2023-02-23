package letras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gustavo
 */


import estrutura.aresta;
import estrutura.vertice;
import java.util.ArrayList;
import javafx.scene.shape.Shape;


/**
 *
 * @author Gustavo
 */
public class letraA extends Shape{
    public ArrayList<vertice> vertices; 
    public ArrayList<aresta> arestas;
    

    public letraA() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
        
        vertices.add(new vertice("A", -2, -2, 0.25, null));
        vertices.add(new vertice("B", -0.5, 2.0, 0.25, null));
        vertices.add(new vertice("C", 0.5, 2, 0.25, null));
        vertices.add(new vertice("D", 2, -2, 0.25, null));
        vertices.add(new vertice("E", 1.5, -2.0, 0.25, null));
        vertices.add(new vertice("F", 0.9375, -0.5, 0.25, null));
        vertices.add(new vertice("G", -0.9375, -0.5, 0.25, null));
        vertices.add(new vertice("H", -1.5, -2, 0.25, null));
        vertices.add(new vertice("I", -0.75, 0, 0.25, null));
        vertices.add(new vertice("J", -0.25, 1.5, 0.25, null));   
        vertices.add(new vertice("K", 0.25, 1.5, 0.25, null));
        vertices.add(new vertice("L", 0.75, 0, 0.25, null));
        
        vertices.add(new vertice("AT", -2, -2, -0.25, null));
        vertices.add(new vertice("BT", -0.5, 2.0, -0.25, null));
        vertices.add(new vertice("CT", 0.5, 2, -0.25, null));
        vertices.add(new vertice("DT", 2, -2, -0.25, null));
        vertices.add(new vertice("ET", 1.5, -2.0, -0.25, null));
        vertices.add(new vertice("FT", 0.9375, -0.5, -0.25, null));
        vertices.add(new vertice("GT", -0.9375, -0.5, -0.25, null));
        vertices.add(new vertice("HT", -1.5, -2, -0.25, null));
        vertices.add(new vertice("IT", -0.75, 0, -0.25, null));
        vertices.add(new vertice("JT", -0.25, 1.5, -0.25, null));   
        vertices.add(new vertice("KT", 0.25, 1.5, -0.25, null));
        vertices.add(new vertice("LT", 0.75, 0, -0.25, null));
        
        arestas.add(new aresta("A_B", vertices.get(0),vertices.get(1), null, null, null, null, null, null));
        vertices.get(0).setArestaVertice(arestas.get(0));
        arestas.add(new aresta("B_C", vertices.get(1), vertices.get(2), null, null, null, null, null, null));
        vertices.get(1).setArestaVertice(arestas.get(1));
        arestas.add(new aresta("C_D", vertices.get(2), vertices.get(3), null, null, null, null, null, null));
        vertices.get(2).setArestaVertice(arestas.get(2));
        arestas.add(new aresta("D_E", vertices.get(3), vertices.get(4), null, null, null, null, null, null));
        vertices.get(3).setArestaVertice(arestas.get(3));
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        vertices.get(4).setArestaVertice(arestas.get(4));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        vertices.get(5).setArestaVertice(arestas.get(5));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        vertices.get(6).setArestaVertice(arestas.get(6));
        arestas.add(new aresta("H_A", vertices.get(7), vertices.get(0), null, null, null, null, null, null));
        vertices.get(7).setArestaVertice(arestas.get(7));

        arestas.add(new aresta("I_L", vertices.get(8), vertices.get(11), null, null, null, null, null, null));      
        vertices.get(8).setArestaVertice(arestas.get(8));
        arestas.add(new aresta("L_K", vertices.get(11), vertices.get(10), null, null, null, null, null, null));
        vertices.get(11).setArestaVertice(arestas.get(9));
        arestas.add(new aresta("K_J", vertices.get(10), vertices.get(9), null, null, null, null, null, null));
        vertices.get(10).setArestaVertice(arestas.get(10));
        arestas.add(new aresta("J_I", vertices.get(9), vertices.get(8), null, null, null, null, null, null));
        vertices.get(9).setArestaVertice(arestas.get(11));
        
        
        arestas.add(new aresta("AT_BT", vertices.get(12),vertices.get(13), null, null, null, null, null, null));
        vertices.get(12).setArestaVertice(arestas.get(12));
        arestas.add(new aresta("BT_CT", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        vertices.get(13).setArestaVertice(arestas.get(13));
        arestas.add(new aresta("CT_DT", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        vertices.get(14).setArestaVertice(arestas.get(14));
        arestas.add(new aresta("DT_ET", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        vertices.get(15).setArestaVertice(arestas.get(15));
        arestas.add(new aresta("ET_FT", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        vertices.get(16).setArestaVertice(arestas.get(16));
        arestas.add(new aresta("FT_GT", vertices.get(17), vertices.get(18), null, null, null, null, null, null));
        vertices.get(17).setArestaVertice(arestas.get(17));
        arestas.add(new aresta("GT_HT", vertices.get(18), vertices.get(19), null, null, null, null, null, null));
        vertices.get(18).setArestaVertice(arestas.get(18));
        arestas.add(new aresta("HT_AT", vertices.get(19), vertices.get(12), null, null, null, null, null, null));
        vertices.get(19).setArestaVertice(arestas.get(19));

        arestas.add(new aresta("IT_LT", vertices.get(20), vertices.get(23), null, null, null, null, null, null));      
        vertices.get(20).setArestaVertice(arestas.get(20));
        arestas.add(new aresta("LT_KT", vertices.get(23), vertices.get(22), null, null, null, null, null, null));
        vertices.get(23).setArestaVertice(arestas.get(21));
        arestas.add(new aresta("KT_JT", vertices.get(22), vertices.get(21), null, null, null, null, null, null));
        vertices.get(22).setArestaVertice(arestas.get(22));
        arestas.add(new aresta("JT_IT", vertices.get(21), vertices.get(20), null, null, null, null, null, null));
        vertices.get(21).setArestaVertice(arestas.get(23));
        
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
        
        arestas.add(new aresta("ligacao_G_I", vertices.get(6), vertices.get(8), null, null, null, null, null, null));
        
        
        
    }
    
    public int encontraVertice(String S){
        for(int i=0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getNomeVertice().contains(S))
                return i;
        }
        return -1;
    }
    
    public int encontraAresta(String S){
        for(int i=0; i < this.arestas.size(); i++){
            if(this.arestas.get(i).getNomeAresta().contains(S))
                return i;
        }
        return -1;
    }
}
