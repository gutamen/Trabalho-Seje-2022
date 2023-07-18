/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura;
/**
 *
 * @author gustavo
 */
public class face {
    private String nomeFace;
    private aresta arestaFace;
    private boolean interna = false;
    private boolean visivel = true;
    
    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }
    
    

    public face(String nomeFace, aresta arestaFace) {
        this.nomeFace = nomeFace;
        this.arestaFace = arestaFace;
    }
    
    public face(String nomeFace, aresta arestaFace, boolean interna) {
        this.nomeFace = nomeFace;
        this.arestaFace = arestaFace;
        this.interna = interna;
    }

    public String getNomeFace() {
        return nomeFace;
    }

    public void setNomeFace(String nomeFace) {
        this.nomeFace = nomeFace;
    }

    public aresta getArestaFace() {
        return arestaFace;
    }

    public void setArestaFace(aresta arestaFace) {
        this.arestaFace = arestaFace;
    }
}