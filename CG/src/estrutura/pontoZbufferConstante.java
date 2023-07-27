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
    
    public pontoZbufferConstante(){
    
    } 
    
    public pontoZbufferConstante(double Z, int R, int G, int B){
        this.cor = Color.rgb((int)R,(int)G,(int)B);
        this.Z = Z;
    }
    
    public Color corNoPonto(){
        return this.cor;
    }
    
    public double profundiade(){
        return this.Z;
    }

    public void setZ(double Z) {
        this.Z = Z;
    }
    
}
