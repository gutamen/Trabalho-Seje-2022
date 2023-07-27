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
    
    
    public void iluminacaoConstante(Canvas tela, ArrayList<caractere> caracteresPerspectiva, ArrayList<caractere> universo, Point3D L, int[] Il, int[] Ila, double n, Point3D VRP ){
        this.pixels = tela.getGraphicsContext2D().getPixelWriter();
        this.caracteres = caracteresPerspectiva;
        this.canvasRelativo = tela;
        
        pontoZbufferConstante[][] matrizTela = new pontoZbufferConstante[(int)this.canvasRelativo.getWidth()][(int)this.canvasRelativo.getHeight()];
        
        for(int i = 0; i < this.caracteres.size(); i++){
            
            
            double[] It = new double[3];
            
            It[0] = this.caracteres.get(i).Ka.getX() * Il[0];
            It[1] = this.caracteres.get(i).Ka.getY() * Il[1];
            It[2] = this.caracteres.get(i).Ka.getZ() * Il[2];
            
            ArrayList<ArrayList<aresta>> arestasPorFace = this.caracteres.get(i).arestasFacesVisiveis();
            
            double[] pontosY = this.caracteres.get(i).extremosCoordenadaY();
            double[] pontosX = this.caracteres.get(i).extremosCoordenadaX();
            
            for(int j = 0; j < arestasPorFace.size(); j++){
                
                Point3D centroide = centroidePorArestas(arestasPorFace.get(j));
                Point3D normalFace = normalDaFace(arestasPorFace.get(j));
                
                Point3D vetorIluminacao = L.subtract(centroide);
                vetorIluminacao = vetorIluminacao.normalize();
                double LN = normalFace.dotProduct(vetorIluminacao);
                if(LN > 0){
                    
                    It[0] += this.caracteres.get(i).Kd.getX()*  Il[0] * LN;
                    It[1] += this.caracteres.get(i).Kd.getY()*  Il[1] * LN;
                    It[2] += this.caracteres.get(i).Kd.getZ()*  Il[2] * LN;
                
                    Point3D R = normalFace.multiply(2 * LN).subtract(L);
                    Point3D S = VRP.subtract(centroide).normalize();
                    double RS = R.dotProduct(S);
                    if(RS > 0){
                        RS = Math.pow(RS, n);
                        
                        It[0] += this.caracteres.get(i).Ks.getX()* Il[0] * RS;
                        It[1] += this.caracteres.get(i).Ks.getY()* Il[1] * RS;
                        It[2] += this.caracteres.get(i).Ks.getZ()* Il[2] * RS;
                        
                    }
                    
                
                }
                
                ArrayList<aresta> arestas = arestasPorFace.get(j);
                for(int k = 0; arestas.size() > k; k++){
                    if((int)arestas.get(k).getFim().getY() == (int)arestas.get(k).getInicio().getY()){
                        
                    }
                    else if((int)arestas.get(k).getFim().getY() > (int)arestas.get(k).getInicio().getY()){
                        double taxaX = (arestas.get(k).getFim().getX() - arestas.get(k).getInicio().getX())/((int)arestas.get(k).getFim().getY() - (int)arestas.get(k).getInicio().getY());
                        double taxaZ = (arestas.get(k).getFim().getZ() - arestas.get(k).getInicio().getZ())/((int)arestas.get(k).getFim().getY() - (int)arestas.get(k).getInicio().getY());
                        
                        if(matrizTela[(int)(arestas.get(k).getInicio().getX())][(int)arestas.get(k).getInicio().getY()].profundiade() > arestas.get(k).getInicio().getZ()){
                            if((int)arestas.get(k).getInicio().getX() >= 0 && (int)arestas.get(k).getInicio().getY() >= 0 && (int)arestas.get(k).getInicio().getX() <= matrizTela.length && (int)arestas.get(k).getInicio().getY() <= matrizTela[0].length){
                                matrizTela[(int)arestas.get(k).getInicio().getX()][(int)arestas.get(k).getInicio().getY()] = new pontoZbufferConstante(arestas.get(k).getInicio().getZ(), (int) It[0], (int) It[1], (int) It[2]);
                            }
                        }
                        
                        for(int incremento = (int) arestas.get(k).getInicio().getY() + 1; incremento < (int)arestas.get(k).getFim().getY(); incremento++){
                            if(matrizTela[(int)(arestas.get(k).getInicio().getX()+incremento*taxaX)][incremento].profundiade() > arestas.get(k).getInicio().getZ()+incremento*taxaZ ){
                                if((int)arestas.get(k).getInicio().getX() >= 0 && (int)arestas.get(k).getInicio().getY() >= 0 && (int)arestas.get(k).getInicio().getX() <= matrizTela.length && (int)arestas.get(k).getInicio().getY() <= matrizTela[0].length){
                                    matrizTela[(int)(arestas.get(k).getInicio().getX()+incremento*taxaX)][incremento] = new pontoZbufferConstante(arestas.get(k).getInicio().getZ()+incremento*taxaZ, (int) It[0], (int) It[1], (int) It[2]);
                                }
                            }
                        }
                    }
                    else{
                        double taxaX = (arestas.get(k).getInicio().getX() - arestas.get(k).getFim().getX())/((int)arestas.get(k).getInicio().getY() - (int)arestas.get(k).getFim().getY());
                        double taxaZ = (arestas.get(k).getInicio().getZ() - arestas.get(k).getFim().getZ())/((int)arestas.get(k).getInicio().getY() - (int)arestas.get(k).getFim().getY());
                        
                        if(matrizTela[(int)(arestas.get(k).getFim().getX())][(int)arestas.get(k).getFim().getY()].profundiade() > arestas.get(k).getFim().getZ()){
                            if((int)arestas.get(k).getFim().getX() >= 0 && (int)arestas.get(k).getFim().getY() >= 0 && (int)arestas.get(k).getFim().getX() <= matrizTela.length && (int)arestas.get(k).getFim().getY() <= matrizTela[0].length){
                                matrizTela[(int)arestas.get(k).getFim().getX()][(int)arestas.get(k).getFim().getY()] = new pontoZbufferConstante(arestas.get(k).getFim().getZ(), (int) It[0], (int) It[1], (int) It[2]);
                            }
                        }
                        
                        for(int incremento = (int) arestas.get(k).getFim().getY() + 1; incremento < (int)arestas.get(k).getInicio().getY(); incremento++){
                            if(matrizTela[(int)(arestas.get(k).getFim().getX()+incremento*taxaX)][incremento].profundiade() > arestas.get(k).getFim().getZ()+incremento*taxaZ ){
                                if((int)arestas.get(k).getFim().getX() >= 0 && (int)arestas.get(k).getFim().getY() >= 0 && (int)arestas.get(k).getFim().getX() <= matrizTela.length && (int)arestas.get(k).getFim().getY() <= matrizTela[0].length){
                                    matrizTela[(int)(arestas.get(k).getFim().getX()+incremento*taxaX)][incremento] = new pontoZbufferConstante(arestas.get(k).getFim().getZ()+incremento*taxaZ, (int) It[0], (int) It[1], (int) It[2]);
                                }
                            }
                        }
                        
                        
                        
                    }
                }
                
                
                
            }
            
            
        }
        
        
    }
    
    public Point3D normVertFace(ArrayList<face> faces, String vert){
        ArrayList<face> faceWithVert = new ArrayList<face>();
        for(int j = 0; j < faces.size(); j ++){
            aresta k = faces.get(j).getArestaFace();
            int o = 0;

            boolean rigth = false;
            for(aresta p = new aresta("null"); !k.getNomeAresta().equals(p.getNomeAresta()); o++){//andando nas arestas da face
                if(o < 1){
                    p = k;
                }

                if(rigth){
                    if(p.getFim().getNomeVertice().equals(vert)){
                        faceWithVert.add(faces.get(j));
                    }
                }else{
                    if(p.getInicio().getNomeVertice().equals(vert)){
                        faceWithVert.add(faces.get(j));
                    } 
                }

                if(p.getDireita().getNomeFace().equals(faces.get(j).getNomeFace())){
                    p = p.getArestaDireitaSuc();
                    rigth = true;
                }else{
                    p = p.getArestaEsquerdaSuc();
                    rigth = false;
                }
            }
        }
        
        Point3D midUnitVert = makeNormal(faceWithVert.get(0).verticesFace());

        for(int k = 1; k < faceWithVert.size(); k++){
            midUnitVert = midUnitVert.add(makeNormal(faceWithVert.get(k).verticesFace()));
        }

        
        midUnitVert = midUnitVert.normalize();
        

        System.out.println("testeAnt = "+midUnitVert);
        
        return midUnitVert;
    }
    
    public Point3D makeNormal(ArrayList<vertice> vertList){  
        Point3D vect1 = vertList.get(1).ponto.subtract(vertList.get(0).ponto);
        Point3D vect2 = vertList.get(vertList.size()-1).ponto.subtract(vertList.get(0).ponto);

        Point3D vectN = null;

        vectN = vect1.crossProduct(vect2);
        return vectN.normalize();
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
    private double Z = Double.MIN_VALUE;
    
    public pontoZbufferConstante(double Z, int R, int G, int B){
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
