/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

/**
 *
 * @author gustavo
 */
public class pontoZbufferPhong {
    
    private Color cor = Color.WHITE;
    private Point3D vetorPonto = Point3D.ZERO;
    private double Z = Double.MIN_VALUE;
    private int X = 0;
    
    public pontoZbufferPhong(){
    
    } 
    
    public pontoZbufferPhong(double Z, Point3D ponto){

        this.vetorPonto = ponto;
        this.Z = Z;
    }
    
    public pontoZbufferPhong(int X, double Z, Point3D ponto){

        this.vetorPonto = ponto;
        this.Z = Z;
        this.X = X;
        
    }
    
    public Point3D vetor(){
        return this.vetorPonto;
    }
    
    public int getX(){
        return this.X;
    }
    
    public double profundiade(){
        return this.Z;
    }
    
    public Point3D vetorNormalizado(){
        return this.vetorPonto.normalize();
    }

    public void setZ(double Z) {
        this.Z = Z;
    }
    
    public Color corNoPonto(){
        return this.cor;
    }
    
    public void novaCor(int R, int G, int B){
        if(R > 255) R = 255;
        if(G > 255) G = 255;
        if(B > 255) B = 255;
        this.cor = Color.rgb(R, G, B);
    }
    
    public void novaCor(Color cor){
        this.cor = cor;
    }
    
}
    
    

