/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import estrutura.aresta;
import estrutura.face;
import estrutura.pontoZbufferConstante;
import estrutura.vertice;
import java.text.DecimalFormat;
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
    
    
    public void iluminacaoConstante(Canvas tela, ArrayList<caractere> caracteresPerspectiva, ArrayList<caractere> universo, Point3D L, int[] Il, int[] Ila, Point3D VRP ){
        this.pixels = tela.getGraphicsContext2D().getPixelWriter();
        this.caracteres = caracteresPerspectiva;
        this.canvasRelativo = tela;
        
        pontoZbufferConstante[][] matrizTela = new pontoZbufferConstante[(int)this.canvasRelativo.getWidth()][(int)this.canvasRelativo.getHeight()];
        
        for(int i = 0; i < matrizTela.length; i++){
            for(int j = 0; j < matrizTela[0].length; j++){
                matrizTela[i][j] = new pontoZbufferConstante();
            }
        }
        
        for(int i = 0; i < this.caracteres.size(); i++){
            
            
            double[] It = new double[3];
            
            It[0] = universo.get(i).Ka.getX() * Ila[0];
            It[1] = universo.get(i).Ka.getY() * Ila[1];
            It[2] = universo.get(i).Ka.getZ() * Ila[2];
            
            ArrayList<face> faces = universo.get(i).faces;
            
            double[] pontosY = universo.get(i).extremosCoordenadaY();
            double[] pontosX = universo.get(i).extremosCoordenadaX();
            
            for(int j = 0; j < faces.size(); j++){
                if(!faces.get(j).isVisivel()){
                    continue;
                }
                
                Point3D centroide = centroidePorArestas(faces.get(j).arestasFace());
                Point3D normalFace = normalDaFace(faces.get(j).arestasFace());
                
                Point3D vetorIluminacao = L.subtract(centroide);
                vetorIluminacao = vetorIluminacao.normalize();
                double LN = normalFace.dotProduct(vetorIluminacao);
                if(LN > 0){
                    
                    It[0] += universo.get(i).Kd.getX()*  Il[0] * LN;
                    It[1] += universo.get(i).Kd.getY()*  Il[1] * LN;
                    It[2] += universo.get(i).Kd.getZ()*  Il[2] * LN;
                
                    Point3D R = normalFace.multiply(2 * LN).subtract(L);
                    Point3D S = VRP.subtract(centroide).normalize();
                    double RS = R.dotProduct(S);
                    if(RS > 0){
                        RS = Math.pow(RS, this.caracteres.get(i).n);
                        
                        It[0] += universo.get(i).Ks.getX()* Il[0] * RS;
                        It[1] += universo.get(i).Ks.getY()* Il[1] * RS;
                        It[2] += universo.get(i).Ks.getZ()* Il[2] * RS;
                        
                    }
                }
                
                ArrayList<aresta> arestas = caracteresPerspectiva.get(i).faces.get(j).arestasFaceComBuraco();
                
                vertice[] minimoMaximo = caracteresPerspectiva.get(i).faces.get(j).minmaxY();
                
                int yMin = (int)minimoMaximo[0].getY();
                
                ArrayList<pontoZbufferConstante>[] bufferFace = new ArrayList[(int)minimoMaximo[1].getY()-yMin+1];
                
                //System.out.println(caracteresPerspectiva.get(i).faces.get(j).getNomeFace());
                
//                for(int teste = 0; teste < arestas.size(); teste++){
//                    System.out.println(arestas.get(teste).getNomeAresta());
//                }
                
                if((int)minimoMaximo[1].getY()- yMin > 0){
//                    System.out.println(" aresta "+ caracteresPerspectiva.get(i).faces.get(j).getNomeFace());
                    for(int l = 0; l < arestas.size(); l++){
                        aresta auxiliar = arestas.get(l);
                        if((int)auxiliar.getFim().getY() == (int)auxiliar.getInicio().getY()){
                            //System.out.println(auxiliar.getNomeAresta());
                        }else if((int)auxiliar.getFim().getY() > (int)auxiliar.getInicio().getY()){
                             
                            //System.out.println(auxiliar.getNomeAresta());
                            int posicaoBuffer = (int)auxiliar.getInicio().getY()-yMin;
                            //System.out.println(posicaoBuffer);

                            if(bufferFace[posicaoBuffer] == null){
                                bufferFace[posicaoBuffer] = new ArrayList<>();
                            }

                            if(bufferFace[posicaoBuffer].isEmpty()){
                                pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getInicio().getX(), auxiliar.getInicio().getZ(), (int) It[0], (int) It[1], (int) It[2]);
                                bufferFace[posicaoBuffer].add(pontoAdicionado);
                                
                                
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );
                                
                            }else{
                                int avanco = -1;

                                do{
                                   //System.out.println("esrtive aqui");
                                   avanco++; 
                                }while(bufferFace[posicaoBuffer].size() < avanco && (int)bufferFace[posicaoBuffer].get(avanco).getX() >= (int)auxiliar.getInicio().getX());

                                bufferFace[posicaoBuffer].add(avanco, new pontoZbufferConstante((int)auxiliar.getInicio().getX(), auxiliar.getInicio().getZ(), (int) It[0], (int) It[1], (int) It[2]));
                            }

                            double taxaZ = (auxiliar.getFim().getZ() - auxiliar.getInicio().getZ()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY());
                            double taxaX = (auxiliar.getFim().getX() - auxiliar.getInicio().getX()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY());
                            
                            //System.out.println("TaxaZ = "+taxaZ);
                            //System.out.println("TaxaX = "+taxaX);
                            posicaoBuffer++;
                            
                            
                            
                            for(int k = posicaoBuffer; k <= ((int) auxiliar.getFim().getY()) - ((int)auxiliar.getInicio().getY())  ; k++){
                               
                                if(bufferFace[k] == null){
                                    bufferFace[k] = new ArrayList<>();
                                    
                                }

                                if(bufferFace[k].isEmpty()){
                                    
                                    pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getInicio().getX()+(int)(taxaX*(k-posicaoBuffer)), auxiliar.getInicio().getZ()+(taxaZ*(k-posicaoBuffer+1)), (int) It[0], (int) It[1], (int) It[2]);
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );
                                    
                                    bufferFace[k].add(pontoAdicionado);
                                }else{
                                    int avanco = -1;

                                    do{
                                       avanco++; 
                                    }while(bufferFace[k].size() < avanco && (int)bufferFace[k].get(avanco).getX() >= (int)auxiliar.getInicio().getX()+(int)(taxaX*(k-posicaoBuffer)));
                                    
                                    pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getInicio().getX()+(int)(taxaX*(k-posicaoBuffer)), auxiliar.getInicio().getZ()+(taxaZ*(k-posicaoBuffer)), (int) It[0], (int) It[1], (int) It[2]);
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );
                                    
                                    bufferFace[k].add(avanco, pontoAdicionado);


                                }
                                   
                            }

                        }else{

                            
                            int posicaoBuffer = (int)auxiliar.getFim().getY()-yMin;
                            
                            
                            if(bufferFace[posicaoBuffer] == null){
                                bufferFace[posicaoBuffer] = new ArrayList<>();
                            }

                            if(bufferFace[posicaoBuffer].isEmpty()){
                                pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getFim().getX(), auxiliar.getFim().getZ(), (int) It[0], (int) It[1], (int) It[2]);
                                bufferFace[posicaoBuffer].add(pontoAdicionado);
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );
                                    
                                
                            }else{
                                int avanco = -1;

                                do{
                                   avanco++; 
                                }while(bufferFace[posicaoBuffer].size() < avanco && (int)bufferFace[posicaoBuffer].get(avanco).getX() >= (int)auxiliar.getFim().getX());
                                
                                pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getFim().getX(), auxiliar.getFim().getZ(), (int) It[0], (int) It[1], (int) It[2]);
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );
                                
                                bufferFace[posicaoBuffer].add(avanco, pontoAdicionado);
                            }

                            double taxaZ = (auxiliar.getInicio().getZ() - auxiliar.getFim().getZ()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY());
                            double taxaX = (auxiliar.getInicio().getX() - auxiliar.getFim().getX()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY());
//                            System.out.println("");
//                            System.out.println("taxaX = " + taxaX);
//                            System.out.println("taxaZ = " + taxaZ);
//                            System.out.println("");
                            
                            posicaoBuffer++;

                            for(int k = posicaoBuffer; k <= ((int) auxiliar.getInicio().getY()) - ((int)auxiliar.getFim().getY()) ; k++){

                                if(bufferFace[k] == null){
                                    bufferFace[k] = new ArrayList<>();
                                }

                                if(bufferFace[k].isEmpty()){
                                    pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getFim().getX()+(int)(taxaX*(k-posicaoBuffer)), auxiliar.getFim().getZ()+(taxaZ*(k-posicaoBuffer+1)), (int) It[0], (int) It[1], (int) It[2]);
                                    bufferFace[k].add(pontoAdicionado);
                                    
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );
                                }else{
                                    int avanco = -1;

                                    do{
                                       avanco++; 
                                    }while(bufferFace[k].size() < avanco && (int)bufferFace[k].get(avanco).getX() >= (int)auxiliar.getFim().getX()+(int)(taxaX*(k-posicaoBuffer)));
                                    pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getFim().getX()+(int)(taxaX*(k-posicaoBuffer)), auxiliar.getFim().getZ()+(taxaZ*(k-posicaoBuffer)), (int) It[0], (int) It[1], (int) It[2]);
                                    bufferFace[k].add(avanco, pontoAdicionado);
                                    
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );

                                }
                            }   



                        }


                    }
                     
                    System.out.println(caracteresPerspectiva.get(i).faces.get(j).getNomeFace());
                    for(int teste = 0; teste < bufferFace.length; teste++){
                        
                        if(bufferFace[teste] != null){
                            System.out.println("Linha "+teste);
                            for(int testi = 0; testi < bufferFace[teste].size(); testi++){
                                System.out.print("   "+bufferFace[teste].get(testi).getX());
                            }
                            System.out.println();
                        }
                    }
//                    
                    for(int k = 0; k < bufferFace.length-1; k++){
                        
                        ArrayList<pontoZbufferConstante> lista = bufferFace[k];
                        
                        /*if(lista == null ){
                            //System.out.println(k);
                            continue;
                        }*/
                        
                        if(lista.size() > 1){
                            
                            for(int l = 0; l < lista.size()-1; l+=2){
                                double taxaZ = (lista.get(l+1).profundiade() - lista.get(l).profundiade()) / (lista.get(l+1).getX() - lista.get(l).getX()); 
//                                System.out.println("taxa = "+taxaZ);
                                
                                
                                if(lista.get(l).getX() >= 0 && k+yMin >= 0 && lista.get(l).getX() <= matrizTela.length && k+yMin <= matrizTela[0].length){
                                    
                                    if(matrizTela[(int)lista.get(l).getX()][k+yMin].profundiade() > lista.get(l).profundiade()){
                                        //System.out.println("X = " + (int)lista.get(l).getX()+ "   Y = "+ k+yMin);
                                        matrizTela[(int)lista.get(l).getX()][k+yMin] = lista.get(l);
                                    }
                                }

                                int avanco = 1;
                                for(int coluna = 1 + ((int) lista.get(l).getX()); coluna < (int) lista.get(l+1).getX(); coluna++ ){
                                    pontoZbufferConstante pontoIncrementado = new pontoZbufferConstante(lista.get(l).profundiade()+(taxaZ*avanco), (int) It[0], (int) It[1], (int) It[2]);

                                    if(coluna > 0 && k+yMin >= 0 && coluna <= matrizTela.length && k+yMin <= matrizTela[0].length){
                                        if(matrizTela[coluna][k+yMin].profundiade() > pontoIncrementado.profundiade()){
                                            matrizTela[coluna][k+yMin] = pontoIncrementado;
                                        }
                                    }
                                    avanco++;
                                }

                            }
                        }else{
                            if(lista.get(0).getX() > 0 && k+yMin >= 0 && lista.get(0).getX() <= matrizTela.length && k+yMin <= matrizTela[0].length){
                                if(matrizTela[(int)lista.get(0).getX()][k+yMin].profundiade() < lista.get(0).profundiade()){
                                    matrizTela[(int)lista.get(0).getX()][k+yMin] = lista.get(0);
                                }
                            }
                        }

                    }
                    
                }
                
                
//                for(int k = 0; arestas.size() > k; k++){
//                    if((int)arestas.get(k).getFim().getY() == (int)arestas.get(k).getInicio().getY()){
//
//                    }
//                    else if((int)arestas.get(k).getFim().getY() > (int)arestas.get(k).getInicio().getY()){
//                        double taxaX = (arestas.get(k).getFim().getX() - arestas.get(k).getInicio().getX())/((int)arestas.get(k).getFim().getY() - (int)arestas.get(k).getInicio().getY());
//                        double taxaZ = (arestas.get(k).getFim().getZ() - arestas.get(k).getInicio().getZ())/((int)arestas.get(k).getFim().getY() - (int)arestas.get(k).getInicio().getY());
//                        System.out.println("aquiY > = "+arestas.get(k).getFim().getY());
//                        System.out.println("aquiX > = "+arestas.get(k).getFim().getX());
//                        if((int)arestas.get(k).getInicio().getX() >= 0 && (int)arestas.get(k).getInicio().getY() >= 0 && (int)arestas.get(k).getInicio().getX() < matrizTela.length && (int)arestas.get(k).getInicio().getY() < matrizTela[0].length){   
//                            if(matrizTela[(int)(arestas.get(k).getInicio().getX())][(int)arestas.get(k).getInicio().getY()].profundiade() < arestas.get(k).getInicio().getZ()){
//                                matrizTela[(int)arestas.get(k).getInicio().getX()][(int)arestas.get(k).getInicio().getY()] = new pontoZbufferConstante(arestas.get(k).getInicio().getZ(), (int) It[0], (int) It[1], (int) It[2]); 
//                            }
//                        }
//
//                        for(int incremento = (int) arestas.get(k).getInicio().getY() + 1, passo = 1; incremento < (int)arestas.get(k).getFim().getY(); incremento++, passo++){
//                            if(arestas.get(k).getInicio().getX()+passo*taxaX >= 0 && incremento >= 0
//                            && arestas.get(k).getInicio().getX()+passo*taxaX < matrizTela.length && incremento < matrizTela[0].length){
//                                if(matrizTela[(int)(arestas.get(k).getInicio().getX()+passo*taxaX)][incremento].profundiade() < arestas.get(k).getInicio().getZ()+(passo*taxaZ) ){
//                                    matrizTela[(int)(arestas.get(k).getInicio().getX()+passo*taxaX)][incremento] = new pontoZbufferConstante(arestas.get(k).getInicio().getZ()+passo*taxaZ, (int) It[0], (int) It[1], (int) It[2]);
//                                }
//                            }
//                        }
//                    }
//                    else{
//                        double taxaX = (arestas.get(k).getInicio().getX() - arestas.get(k).getFim().getX())/((int)arestas.get(k).getInicio().getY() - (int)arestas.get(k).getFim().getY());
//                        double taxaZ = (arestas.get(k).getInicio().getZ() - arestas.get(k).getFim().getZ())/((int)arestas.get(k).getInicio().getY() - (int)arestas.get(k).getFim().getY());
//                        System.out.println("aquiY > = "+(int)arestas.get(k).getFim().getY());
//                        System.out.println("aquiX > = "+(int)arestas.get(k).getFim().getX()); 
//                        if((int)arestas.get(k).getFim().getX() >= 0 && (int)arestas.get(k).getFim().getY() >= 0 && (int)arestas.get(k).getFim().getX() <= matrizTela.length && (int)arestas.get(k).getFim().getY() <= matrizTela[0].length){ 
//                            if(matrizTela[(int)(arestas.get(k).getFim().getX())][(int)arestas.get(k).getFim().getY()].profundiade() > arestas.get(k).getFim().getZ()){
//                                matrizTela[(int)arestas.get(k).getFim().getX()][(int)arestas.get(k).getFim().getY()] = new pontoZbufferConstante(arestas.get(k).getFim().getZ(), (int) It[0], (int) It[1], (int) It[2]);
//                            }
//                        }
//
//                        for(int incremento = (int) arestas.get(k).getFim().getY() + 1, passo = 1; incremento < (int)arestas.get(k).getInicio().getY(); incremento++, passo++){
//                            if(arestas.get(k).getFim().getX()+passo*taxaX >= 0 && incremento >= 0
//                            && arestas.get(k).getFim().getX()+passo*taxaX <= matrizTela.length && incremento <= matrizTela[0].length){
//                                if(matrizTela[(int)(arestas.get(k).getFim().getX()+passo*taxaX)][incremento].profundiade() > arestas.get(k).getFim().getZ()+(passo*taxaZ) ){
//                                    matrizTela[(int)(arestas.get(k).getFim().getX()+passo*taxaX)][incremento] = new pontoZbufferConstante(arestas.get(k).getFim().getZ()+passo*taxaZ, (int) It[0], (int) It[1], (int) It[2]);
//                                }
//                            }
//                        }
//
//
//
//                    }
//                }
//
//
//
            


            }
            
            //writMat(matrizTela);
            tela.getGraphicsContext2D().clearRect(0, 0, tela.getWidth(), tela.getHeight());
            for(int a = 0; a < matrizTela.length; a++){
                for(int j = 0; j < matrizTela[0].length; j++){
                    this.pixels.setColor(a, j, matrizTela[a][j].corNoPonto());
                }
            }
            tela.getGraphicsContext2D().restore();
        
            
        }        
        
    }
    
    public void writMat(pontoZbufferConstante[][] matrizR){
        DecimalFormat formato = new DecimalFormat();
        formato.setMaximumIntegerDigits(5);
        formato.setMinimumFractionDigits(5);
        formato.setMaximumFractionDigits(5);
        formato.setMinimumIntegerDigits(5);
        formato.setPositivePrefix("+");
        String numeroFormatado = null;
        System.out.println("Número formatado: " + numeroFormatado);
        for(int i = 0; i < matrizR.length; i++){
            for(int k = 0; k < matrizR[0].length; k++){
                numeroFormatado = formato.format(matrizR[i][k].profundiade());
                if(matrizR[i][k].profundiade() != Double.MIN_VALUE){
                    System.out.print(numeroFormatado+" | ");
                }else{
                    
                }
            }
            System.out.println("");
        }
    }
    
    public void gouraud(){
        
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
                
                if(faceWithVert.size() == 3){
                    break;
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