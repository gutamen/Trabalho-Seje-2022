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
public class letraD extends Shape{
    public ArrayList<vertice> vertices; 
    public ArrayList<aresta> arestas;
    public ArrayList<face> faces;

    public letraD() {
        vertices    = new ArrayList<>();
        arestas     = new ArrayList<>();
        faces       = new ArrayList<>();
        
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
