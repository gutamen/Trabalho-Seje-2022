/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import estrutura.aresta;
import estrutura.face;
import java.util.ArrayList;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import letras.caractere;

/**
 *
 * @author gustavo
 */
public class iluminacao {
    private PixelWriter pixels;
    private ArrayList<caractere> caracteres;
    private Canvas canvasRelativo;
    
    
   /*public iluminacao(Canvas tela, ArrayList<caractere> caracteres){
        this.pixels = tela.getGraphicsContext2D().getPixelWriter();
        this.caracteres = caracteres;
        this.canvasRelativo = tela;
    }*/
    
    
    public void iluminacaoConstante(Canvas tela, ArrayList<caractere> caracteres){
        this.pixels = tela.getGraphicsContext2D().getPixelWriter();
        this.caracteres = caracteres;
        this.canvasRelativo = tela;
        
        pontoZbufferConstante[][] matrizTela = new pontoZbufferConstante[(int)this.canvasRelativo.getWidth()][(int)this.canvasRelativo.getHeight()];
        
        for(int i = 0; i < this.caracteres.size(); i++){
            
            /*ArrayList<face> tempFaces = this.caracteres.get(i).faces;
            for(int j = 0; j < tempFaces.size(); j++){
                face tempFace = tempFaces.get(j);
                ArrayList<aresta> tempArestas = new ArrayList<>();
                if(tempFace.isVisivel()){
                    boolean inicializa = true;
                    for(aresta avanco = new aresta("null"); !tempFace.getArestaFace().equals(avanco);){
                        if(inicializa){
                            inicializa = false;
                            avanco = tempFace.getArestaFace();
                        }         
                        tempArestas.add(avanco);    
                    }          
                } 
            }*/
            
            ArrayList<ArrayList<aresta>> arestasPorFace = this.caracteres.get(i).arestasFacesVisiveis();
            
            double[] pontosY = this.caracteres.get(i).extremosCoordenadaY();
            double[] pontosX = this.caracteres.get(i).extremosCoordenadaX();
            
            
        }
        
        
    }
    
    
    
    
    
    
    
}

class pontoZbufferConstante{
    private Color cor;
    private double Z;
    
    public pontoZbufferConstante(double Z, byte R, byte G, byte B){
        this.cor = new Color((int)R,(int)G,(int)B,255);
        this.Z = Z;
    }
    
    public Color corNoPonto(){
        return this.cor;
    }
    
    public double profundiade(){
        return this.Z;
    }
    
}
