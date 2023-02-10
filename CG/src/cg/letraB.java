/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cg;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class letraB {
    ArrayList<vertice> vertices; 
    ArrayList<aresta> arestas;
    //vertice V1,V2,V3,V4,V5,V6,V7,V8,V9,V10,V11,V12,V13,V14,V15,V16,V17,V18;

    public letraB() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
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
        
        arestas.add( new aresta("A_B", vertices.get(0), vertices.get(1), null, null, null, null, null, null));
        arestas.add( new aresta("B_C", vertices.get(1), vertices.get(2), null, null, null, null, null, null));
        arestas.add( new aresta("C_D", vertices.get(2), vertices.get(3), null, null, null, null, null, null));
        arestas.add( new aresta("D_E", vertices.get(3), vertices.get(4), null, null, null, null, null, null));
        arestas.add( new aresta("E_F", vertices.get(4), vertices.get(5), null, null, null, null, null, null));
        arestas.add( new aresta("F_G", vertices.get(5), vertices.get(6), null, null, null, null, null, null));
        arestas.add( new aresta("G_H", vertices.get(6), vertices.get(7), null, null, null, null, null, null));
        arestas.add( new aresta("H_I", vertices.get(7), vertices.get(8), null, null, null, null, null, null));
        arestas.add( new aresta("I_J", vertices.get(8), vertices.get(9), null, null, null, null, null, null));
        arestas.add( new aresta("J_A", vertices.get(9), vertices.get(0), null, null, null, null, null, null));
        
        arestas.add( new aresta("K_L", vertices.get(10), vertices.get(11), null, null, null, null, null, null));
        arestas.add( new aresta("L_M", vertices.get(11), vertices.get(12), null, null, null, null, null, null));
        arestas.add( new aresta("M_N", vertices.get(12), vertices.get(13), null, null, null, null, null, null));
        arestas.add( new aresta("N_K", vertices.get(13), vertices.get(10), null, null, null, null, null, null));
        
        arestas.add( new aresta("O_P", vertices.get(14), vertices.get(15), null, null, null, null, null, null));
        arestas.add( new aresta("P_Q", vertices.get(15), vertices.get(16), null, null, null, null, null, null));
        arestas.add( new aresta("Q_R", vertices.get(16), vertices.get(17), null, null, null, null, null, null));
        arestas.add( new aresta("R_O", vertices.get(17), vertices.get(14), null, null, null, null, null, null));
        
    }
}
