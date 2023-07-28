/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura;

import javafx.scene.paint.Color;

/**
 *
 * @author macedo
 */
public class pontoZbufferConstante {
    private Color cor = Color.WHITE;
    private double Z = Double.MIN_VALUE;
    private int X = 0;
    
    public pontoZbufferConstante(){
    
    } 
    
    public pontoZbufferConstante(double Z, int R, int G, int B){
        //if(R > 255) R = 255;
//        if(G > 255) G = 255;
//        if(B > 255) B = 255;
        this.cor = Color.rgb((int)R,(int)G,(int)B);
        this.Z = Z;
    }
    
    public pontoZbufferConstante(int X, double Z, int R, int G, int B){
//        if(R > 255) R = 255;
//        if(G > 255) G = 255;
//        if(B > 255) B = 255;
        this.cor = Color.rgb((int)R,(int)G,(int)B);
        this.Z = Z;
        this.X = X;
    }
    
    public Color corNoPonto(){
        return this.cor;
    }
    
    public int getX(){
        return this.X;
    }
    
    public double profundiade(){
        return this.Z;
    }

    public void setZ(double Z) {
        this.Z = Z;
    }
    
}
