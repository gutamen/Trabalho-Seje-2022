/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura;

import java.util.ArrayList;
import letras.caractere;

/**
 *
 * @author gusta
 */
public class fakeHash {
    public caractere chars;
    public double val;
    public face face;
    
    public fakeHash(){
        
    }
    
    public fakeHash(caractere chars, double val) {
        this.chars = chars;
        this.val = val;
    }

    public fakeHash(face face, double val) {
        this.face = face;
        this.val = val;
    }
    
    public fakeHash(caractere chars, face face, double val) {
        this.chars = chars;
        this.face = face;
        this.val = val;
    }
    
    public void setAll(caractere chars, face face, double val){
        this.chars = chars;
        this.face = face;
        this.val = val;
    
    }
    
    public caractere getChars() {
        return chars;
    }

    public face getFace() {
        return face;
    }
    
    public caractere getRefactChars() {
        return chars;
    }

    public void setRefactChars(caractere chars) {
        this.chars = chars;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }
    
}
