/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura;

import java.util.ArrayList;


/**
 *
 * @author gustavo
 */
public class face {
    private String nomeFace;
    private aresta arestaFace;
    private boolean interna = false;
    private boolean visivel = true;
    private boolean temBuraco = false;
    public  int quantosBuracos = 0;
    private aresta[] arestaBuraco;
   
    public boolean temBuraco() {
        return temBuraco;
    }

    public boolean isInterna() {
        return interna;
    }
    
    public boolean isVisivel() {
        return visivel;
    }
    
    public int quantosBuracos(){
        return this.quantosBuracos;
    }
    
    public void colocaArestaBuraco(aresta[] buracos ){
        this.arestaBuraco = buracos; 
    }
    
    public aresta[] arestaBuraco(){
        if(this.temBuraco)
            return this.arestaBuraco;
        else
            return null;
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
    
    public face(String nomeFace, aresta arestaFace, boolean interna, boolean buraco) {
        this.nomeFace = nomeFace;
        this.arestaFace = arestaFace;
        this.interna = interna;
        this.temBuraco = buraco;
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
    
    public ArrayList<aresta> arestasFace(){
        ArrayList<aresta> arestas = new ArrayList<>();
        
        aresta i = this.arestaFace;
        do{
            arestas.add(i);
            if(i.esquerda.equals(this)){
                i = i.arestaEsquerdaSuc;
            }
            else{
                i = i.arestaDireitaSuc;
            }            
        }while(!this.arestaFace.equals(i));
        
        return arestas;
    }
    
}