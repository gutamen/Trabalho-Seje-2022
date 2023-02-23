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
public class letraQ extends Shape{
    public ArrayList<vertice> vertices; 
    public ArrayList<aresta> arestas;
    

    public letraQ() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
        
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
        
        arestas.add(new aresta("A_B", vertices.get(0),vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("B_C", vertices.get(1), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("C_D", vertices.get(2), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("D_E", vertices.get(3), vertices.get(4), null, null, null, null, null, null));
        arestas.add(new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestas.add(new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestas.add(new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add(new aresta("H_A", vertices.get(7), vertices.get(0), null, null, null, null, null, null));
        
        arestas.add(new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));      
        arestas.add(new aresta("J_K", vertices.get(9), vertices.get(10), null, null, null, null, null, null));
        arestas.add(new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add(new aresta("L_M", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add(new aresta("M_N", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add(new aresta("N_O", vertices.get(13), vertices.get(14), null, null, null, null, null, null));
        arestas.add(new aresta("O_P", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add(new aresta("P_H", vertices.get(15), vertices.get(7), null, null, null, null, null, null));
        
    }
}