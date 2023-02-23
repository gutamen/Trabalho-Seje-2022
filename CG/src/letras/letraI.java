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
public class letraI extends Shape{
    public ArrayList<vertice> vertices; 
    public ArrayList<aresta> arestas;
    

    public letraI() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
        
        vertices.add(new vertice("A", -.5, -2, 0, null));
        vertices.add(new vertice("B", -0.5, 2.0, 0.0, null));
        vertices.add(new vertice("C", 0.5, 2, 0, null));
        vertices.add(new vertice("D", .5, -2, 0, null));

        
        arestas.add(new aresta("A_B", vertices.get(0),vertices.get(1), null, null, null, null, null, null));
        arestas.add(new aresta("B_C", vertices.get(1), vertices.get(2), null, null, null, null, null, null));
        arestas.add(new aresta("C_D", vertices.get(2), vertices.get(3), null, null, null, null, null, null));
        arestas.add(new aresta("D_A", vertices.get(3), vertices.get(0), null, null, null, null, null, null));

    }
}