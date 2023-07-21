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
    public ArrayList<caractere> refactChars;
    public double val;
    
    public void setAll(ArrayList<caractere> refactChars, double val){
        this.refactChars = refactChars;
        this.val = val;
    }

    public ArrayList<caractere> getRefactChars() {
        return refactChars;
    }

    public void setRefactChars(ArrayList<caractere> refactChars) {
        this.refactChars = refactChars;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }
    
}
