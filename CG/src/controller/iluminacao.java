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
        
        pontoZbufferConstante[][] matrizTela = new pontoZbufferConstante[(int)tela.getWidth()][(int)tela.getHeight()];
        
        for(int i = 0; i < caracteres.size(); i++){
            
            ArrayList<face> tempFaces = caracteres.get(i).faces;
            for(int j = 0; j < tempFaces.size(); j++){
                face tempFace = tempFaces.get(j);
                if(tempFace.isVisivel()){
                    
                    for(aresta avanco = new aresta("null");;){
                        
                    }
                    
                }
                
            }
            
            
            
            
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
