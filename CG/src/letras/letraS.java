/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letras;

import estrutura.aresta;
import estrutura.vertice;
import java.util.ArrayList;
import javafx.scene.shape.Shape;

/**
 *
 * @author gustavo
 */
public class letraS extends Shape{
    public ArrayList<vertice> vertices; 
    public ArrayList<aresta> arestas;
    

    public letraS() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
        
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
        
        arestas.add(new aresta("A_B", vertices.get(0),vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("B_C", vertices.get(1), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("C_D", vertices.get(2), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("D_E", vertices.get(3), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("H_I", vertices.get(7), vertices.get(8), null, null, null, null, null, null));  
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestas.add(new aresta("J_K", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("L_A", vertices.get(11), vertices.get(0), null, null, null, null, null, null));
        
    }
}