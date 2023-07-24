/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import estrutura.aresta;
import estrutura.face;
import estrutura.vertice;
import java.util.ArrayList;
import javafx.geometry.Point3D;
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
    //private Point3D L;
    //private byte[] Il = new byte[3], Ila = new byte[3];
    
    
   /*public iluminacao(Canvas tela, ArrayList<caractere> caracteres){
        this.pixels = tela.getGraphicsContext2D().getPixelWriter();
        this.caracteres = caracteres;
        this.canvasRelativo = tela;
    }*/
    
    
    public void iluminacaoConstante(Canvas tela, ArrayList<caractere> caracteresPerspectiva, ArrayList<caractere> universo, Point3D L, byte[] Il, byte[] Ila ){
        this.pixels = tela.getGraphicsContext2D().getPixelWriter();
        this.caracteres = caracteresPerspectiva;
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
            
            for(int j = 0; j < arestasPorFace.size(); j++){
                
                Point3D centroide = centroidePorArestas(arestasPorFace.get(j));
                Point3D normalFace = normalDaFace(arestasPorFace.get(j));
                
                Point3D vetorIluminacao = L.subtract(centroide);
                vetorIluminacao = vetorIluminacao.normalize();
                
                double[] Id = new double[3];
                Id[0] = this.caracteres.get(i).Kd.getX()* (int) Il[0] * normalFace.dotProduct(vetorIluminacao);
                
            }
            
            
        }
        
        
    }
    
    public Point3D centroidePorArestas(ArrayList<aresta> entry){
        double minX, minY, minZ;
        double maxX, maxY, maxZ;
        minX = entry.get(0).getInicio().getX();
        minY = entry.get(0).getInicio().getY();
        minZ = entry.get(0).getInicio().getZ();
        maxX = entry.get(0).getInicio().getX();
        maxY = entry.get(0).getInicio().getY();
        maxZ = entry.get(0).getInicio().getZ();
            
        for(int i = 1; i < entry.size(); i++){
            if(minX > entry.get(i).getInicio().getX()){
                minX = entry.get(i).getInicio().getX();
            }
            if(maxX < entry.get(i).getInicio().getX()){
                maxX = entry.get(i).getInicio().getX();    
            }
            if(minY > entry.get(i).getInicio().getY()){
                minY = entry.get(i).getInicio().getY();
            }
            if(maxY < entry.get(i).getInicio().getY()){
                maxY = entry.get(i).getInicio().getY();    
            }
            if(minZ > entry.get(i).getInicio().getZ()){
                minZ = entry.get(i).getInicio().getZ();
            }
            if(maxZ < entry.get(i).getInicio().getZ()){
                maxZ = entry.get(i).getInicio().getZ();    
            }
        }
        
        return new Point3D((minX+maxX)/2, (minY+maxY)/2, (minZ+maxZ)/2);
    }
    
    public Point3D normalDaFace(ArrayList<aresta> lista){
        // Pode ter cagada ¬ Satanas Existe
        Point3D vetorX = lista.get(0).getFim().ponto.add(Point3D.ZERO);
        Point3D vetorY = lista.get(lista.size()-1).getFim().ponto.add(Point3D.ZERO);
        Point3D vetorZ = lista.get(0).getInicio().ponto.add(Point3D.ZERO);
        
        vetorX = vetorX.subtract(vetorZ);
        vetorY = vetorY.subtract(vetorZ);
        
        vetorX = vetorX.crossProduct(vetorY);
        
        return vetorX.normalize();
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
