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
    
    
    
    
    
    
   
    
    
    public static void iluminacaoConstante(Canvas tela, ArrayList<caractere> caracteresPerspectiva, ArrayList<caractere> universo, Point3D L, int[] Il, int[] Ila, Point3D VRP ){
        PixelWriter pixels = tela.getGraphicsContext2D().getPixelWriter();
        
        
        pontoZbufferConstante[][] matrizTela = new pontoZbufferConstante[(int)tela.getWidth()][(int)tela.getHeight()];
        
        for(int i = 0; i < matrizTela.length; i++){
            for(int j = 0; j < matrizTela[0].length; j++){
                matrizTela[i][j] = new pontoZbufferConstante();
            }
        }
        
        for(int i = 0; i < caracteresPerspectiva.size(); i++){
            
            
            double[] Ita = new double[3];
            
            Ita[0] = universo.get(i).Ka.getX() * Ila[0];
            Ita[1] = universo.get(i).Ka.getY() * Ila[1];
            Ita[2] = universo.get(i).Ka.getZ() * Ila[2];
            
            ArrayList<face> faces = universo.get(i).faces;
            
            double[] pontosY = universo.get(i).extremosCoordenadaY();
            double[] pontosX = universo.get(i).extremosCoordenadaX();
            
            
            
            
            for(int j = 0; j < faces.size(); j++){
//                System.out.println(faces.get(j).isVisivel());
                if(!faces.get(j).isVisivel()){
//                    System.out.println("aqui");
                    continue;
                }
                double[] It = new double[3];
                
                It[0] = Ita[0];
                It[1] = Ita[1];
                It[2] = Ita[2];
                
                Point3D centroide = faces.get(j).centroide();
                Point3D normalFace = makeNormal(faces.get(j).verticesFace());
                
                Point3D vetorIluminacao = L.subtract(centroide);
                vetorIluminacao = vetorIluminacao.normalize();
                double LN = normalFace.dotProduct(vetorIluminacao);
//                System.out.println("LN = " + LN);
                
                if(LN > 0){
                    
                    It[0] += universo.get(i).Kd.getX()*  Il[0] * LN;
                    It[1] += universo.get(i).Kd.getY()*  Il[1] * LN;
                    It[2] += universo.get(i).Kd.getZ()*  Il[2] * LN;
                
                    Point3D R = normalFace.multiply(2 * LN);
                    R = R.subtract(vetorIluminacao);
                    
//                    System.out.println("L = " + vetorIluminacao);
//                    System.out.println("N = " + normalFace);
//                    System.out.println("R = " + R);
                    
                    Point3D S = VRP.subtract(centroide).normalize();
                    double RS = R.dotProduct(S);
                    
//                    System.out.println("RS = " + RS);
                    if(RS > 0){
                        RS = Math.pow(RS, caracteresPerspectiva.get(i).n);
                        
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
                        
//                        System.out.println(auxiliar.getNomeAresta());
//                        System.out.println("InicioX = " + ((int) auxiliar.getInicio().getX()) + "    FinalX = " + ((int) auxiliar.getFim().getX()) + "    FinalZ = " + ((int) auxiliar.getFim().getZ()));
//                        System.out.println("InicioY = " + ((int) auxiliar.getInicio().getY()) + "    FinalY = " + ((int) auxiliar.getFim().getY()) + "    IncioZ = " + ((int) auxiliar.getInicio().getZ()));
//                        System.out.println(yMin);
//                        System.out.println("");
//                        
                        
                        if((int)auxiliar.getFim().getY() == (int)auxiliar.getInicio().getY()){
                            
                            //System.out.println(auxiliar.getNomeAresta());
                            
                        }else if((int)auxiliar.getFim().getY() > (int)auxiliar.getInicio().getY()){
                             
                            //System.out.println(auxiliar.getNomeAresta());
                            
                            // Cuidar arredondamento para truncamento
                            
                            int posicaoBuffer = (int)auxiliar.getInicio().getY()-yMin;
                            
                            //System.out.println(posicaoBuffer);

                            
                            if(bufferFace[posicaoBuffer] == null){
                                bufferFace[posicaoBuffer] = new ArrayList<>();
                            
                            

                            
                                pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getInicio().getX(), auxiliar.getInicio().getZ(), (int) It[0], (int) It[1], (int) It[2]);
                                bufferFace[posicaoBuffer].add(pontoAdicionado);
                                
//                                System.out.println(auxiliar.getNomeAresta() + "  Linha = " + posicaoBuffer);
//                                for(int jegue = 0; jegue < bufferFace[posicaoBuffer].size(); jegue++){
//                                    System.out.print("   "+bufferFace[posicaoBuffer].get(jegue).getX());
//                                }
//                                System.out.println();
//                                System.out.println(pontoAdicionado.getX());
//                                System.out.println();
//                                
                                
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );
                                
                            }else{
                                int avanco = -1;

                                do{
                                   //System.out.println("esrtive aqui");
                                   avanco++; 
                                }while( avanco < bufferFace[posicaoBuffer].size() && (int)auxiliar.getInicio().getX() >= (int)bufferFace[posicaoBuffer].get(avanco).getX() );
                                
                                pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getInicio().getX(), auxiliar.getInicio().getZ(), (int) It[0], (int) It[1], (int) It[2]);
                                bufferFace[posicaoBuffer].add(avanco, pontoAdicionado );
                                
//                                System.out.println(auxiliar.getNomeAresta() + "  Linha = " + posicaoBuffer);
//                                for(int jegue = 0; jegue < bufferFace[posicaoBuffer].size(); jegue++){
//                                    System.out.print("   "+bufferFace[posicaoBuffer].get(jegue).getX());
//                                }
//                                System.out.println();
//                                System.out.println(pontoAdicionado.getX());
//                                System.out.println();
                            }

                            double taxaZ = (auxiliar.getFim().getZ() - auxiliar.getInicio().getZ()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY());
                            double taxaX = (auxiliar.getFim().getX() - auxiliar.getInicio().getX()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY());
                            
                            //System.out.println("TaxaZ = "+taxaZ);
                            //System.out.println("TaxaX = "+taxaX);
//                            posicaoBuffer++;
                            
                            //int k = posicaoBuffer + 1;
                            
                            for(int k = 1; k < ((int) auxiliar.getFim().getY()) - ((int)auxiliar.getInicio().getY())  ; k++){
                               
                                if(bufferFace[k+posicaoBuffer] == null){
                                    bufferFace[k+posicaoBuffer] = new ArrayList<>();
                                    
                                
                                    
                                    pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getInicio().getX()+(int)(taxaX*(k)), auxiliar.getInicio().getZ()+(taxaZ*(k)), (int) It[0], (int) It[1], (int) It[2]);
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );
                                    
                                    bufferFace[k+posicaoBuffer].add(pontoAdicionado);
                                    
                                    
//                                    System.out.println(auxiliar.getNomeAresta() + "  Linha = " + (k+posicaoBuffer));
//                                    for(int jegue = 0; jegue < bufferFace[k+posicaoBuffer].size(); jegue++){
//                                        System.out.print("   "+bufferFace[k+posicaoBuffer].get(jegue).getX());
//                                    }
//                                    System.out.println();
//                                    System.out.println(pontoAdicionado.getX());
//                                    System.out.println();
                                    
                                }else{
                                    
                                    int avanco = -1;

                                    do{
                                       avanco++; 
                                    }while( avanco < bufferFace[k+posicaoBuffer].size() &&  (int)auxiliar.getInicio().getX()+(int)(taxaX*(k)) >= (int)bufferFace[k+posicaoBuffer].get(avanco).getX());
                                    
                                    
                                    pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getInicio().getX()+(int)(taxaX*(k)), auxiliar.getInicio().getZ()+(taxaZ*(k)), (int) It[0], (int) It[1], (int) It[2]);
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );
                                    
                                    bufferFace[k+posicaoBuffer].add(avanco, pontoAdicionado);
                                    
//                                    System.out.println(auxiliar.getNomeAresta() + "  Linha = " + (k+posicaoBuffer));
//                                    for(int jegue = 0; jegue < bufferFace[k+posicaoBuffer].size(); jegue++){
//                                        System.out.print("   "+bufferFace[k+posicaoBuffer].get(jegue).getX());
//                                    }
//                                    System.out.println();
//                                    System.out.println(pontoAdicionado.getX());
//                                    System.out.println();


                                }
                                   
                            }

                        }else if((int)auxiliar.getInicio().getY() > (int)auxiliar.getFim().getY()){

                            
                            int posicaoBuffer = (int)auxiliar.getFim().getY()-yMin;
                            
                            
                            if(bufferFace[posicaoBuffer] == null){
                                bufferFace[posicaoBuffer] = new ArrayList<>();
                            
                                pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getFim().getX(), auxiliar.getFim().getZ(), (int) It[0], (int) It[1], (int) It[2]);
                                bufferFace[posicaoBuffer].add(pontoAdicionado);
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );

//                                System.out.println(auxiliar.getNomeAresta() + "  Linha = " + posicaoBuffer);
//                                for(int jegue = 0; jegue < bufferFace[posicaoBuffer].size(); jegue++){
//                                    System.out.print("   "+bufferFace[posicaoBuffer].get(jegue).getX());
//                                }
//                                System.out.println();
//                                System.out.println(pontoAdicionado.getX());
//                                System.out.println();
                                    
                                
                            }else{
                                int avanco = -1;

                                do{
                                   avanco++; 
                                }while(avanco < bufferFace[posicaoBuffer].size() &&   (int)auxiliar.getFim().getX() >= (int)bufferFace[posicaoBuffer].get(avanco).getX());
                                
                                pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getFim().getX(), auxiliar.getFim().getZ(), (int) It[0], (int) It[1], (int) It[2]);
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );
                                
                                bufferFace[posicaoBuffer].add(avanco, pontoAdicionado);
                                
//                                System.out.println(auxiliar.getNomeAresta() + "  Linha = " + posicaoBuffer);
//                                for(int jegue = 0; jegue < bufferFace[posicaoBuffer].size(); jegue++){
//                                    System.out.print("   "+bufferFace[posicaoBuffer].get(jegue).getX());
//                                }
//                                System.out.println();
//                                System.out.println(pontoAdicionado.getX());
//                                System.out.println();
                            }

                            double taxaZ = (auxiliar.getInicio().getZ() - auxiliar.getFim().getZ()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY());
                            double taxaX = (auxiliar.getInicio().getX() - auxiliar.getFim().getX()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY());
//                            System.out.println("");
//                            System.out.println("taxaX = " + taxaX);
//                            System.out.println("taxaZ = " + taxaZ);
//                            System.out.println("");
                            
//                            posicaoBuffer++;
                            

                            for(int k = 1; k < ((int) auxiliar.getInicio().getY()) - ((int)auxiliar.getFim().getY()) ; k++){
//                                System.out.println(bufferFace[k]);
                                


                                if(bufferFace[k+posicaoBuffer] == null){
                                    bufferFace[k+posicaoBuffer] = new ArrayList<>();
                                
                                    pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getFim().getX()+(int)(taxaX*(k)), auxiliar.getFim().getZ()+(taxaZ*(k)), (int) It[0], (int) It[1], (int) It[2]);
                                    bufferFace[k+posicaoBuffer].add(pontoAdicionado);
                                    
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );

//                                    System.out.println(auxiliar.getNomeAresta() + "  Linha = " + (k+posicaoBuffer));
//                                    for(int jegue = 0; jegue < bufferFace[k+posicaoBuffer].size(); jegue++){
//                                        System.out.print("   "+bufferFace[k+posicaoBuffer].get(jegue).getX());
//                                    }
//                                    System.out.println();
//                                    System.out.println(pontoAdicionado.getX());
//                                    System.out.println();
                                    
                                }else{
                                    int avanco = -1;

                                    do{
                                       avanco++; 
                                    }while( avanco < bufferFace[k+posicaoBuffer].size() &&    (int)auxiliar.getFim().getX()+(int)(taxaX*(k)) >= (int)bufferFace[k+posicaoBuffer].get(avanco).getX() );
                                    
                                    
                                    pontoZbufferConstante pontoAdicionado = new pontoZbufferConstante((int)auxiliar.getFim().getX()+(int)(taxaX*(k)), auxiliar.getFim().getZ()+(taxaZ*(k)), (int) It[0], (int) It[1], (int) It[2]);
                                    bufferFace[k+posicaoBuffer].add(avanco, pontoAdicionado);
                                    
//                                    System.out.println(auxiliar.getNomeAresta() + "  Linha = " + (k+posicaoBuffer));
//                                    for(int jegue = 0; jegue < bufferFace[k+posicaoBuffer].size(); jegue++){
//                                        System.out.print("   "+bufferFace[k+posicaoBuffer].get(jegue).getX());
//                                    }
//                                    System.out.println();
//                                    System.out.println(pontoAdicionado.getX());
//                                    System.out.println();
                                    
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );

                                }
                            }   



                        }


                    }
                     
//                    System.out.println(caracteresPerspectiva.get(i).faces.get(j).getNomeFace());
//                    for(int teste = 0; teste < bufferFace.length; teste++){
//                        
//                        if(bufferFace[teste] != null){
//                            System.out.println("Linha "+teste);
//                            for(int testi = 0; testi < bufferFace[teste].size(); testi++){
//                                System.out.print("   "+bufferFace[teste].get(testi).getX() + " Z = "+ bufferFace[teste].get(testi).profundiade() + " \\");
//                            }
//                            System.out.println();
//                        }
//                    }
                    
                    for(int k = 0; k < bufferFace.length-1; k++){
                        
                        ArrayList<pontoZbufferConstante> lista = bufferFace[k];
                        
//                        if(lista == null ){
//                            System.out.println("Linha Y = "+ (k+yMin) +" está nula");
//                            
//                            continue;
//                        }
                        
                        if(lista.size() > 1){
                            
                            for(int l = 0; l < lista.size(); l+=2){
                                double taxaZ = (lista.get(l+1).profundiade() - lista.get(l).profundiade()) / (lista.get(l+1).getX() - lista.get(l).getX()); 
//                                System.out.println("taxa = "+taxaZ);
                                
                                
                                if(lista.get(l).getX() >= 0 && k+yMin >= 0 && lista.get(l).getX() < matrizTela.length && k+yMin < matrizTela[0].length){
                                    if(matrizTela[(int)lista.get(l).getX()][k+yMin].profundiade() < lista.get(l).profundiade()){
                                        matrizTela[(int)lista.get(l).getX()][k+yMin] = lista.get(l);
                                    }
                                }

                                int avanco = 1;
                                for(int coluna = 1 + ((int) lista.get(l).getX()); coluna < (int) lista.get(l+1).getX(); coluna++ ){
                                    pontoZbufferConstante pontoIncrementado = new pontoZbufferConstante(lista.get(l).profundiade()+(taxaZ*avanco), (int) It[0], (int) It[1], (int) It[2]);

                                    if(coluna >= 0 && k+yMin >= 0 && coluna < matrizTela.length && k+yMin < matrizTela[0].length){
                                        if(matrizTela[coluna][k+yMin].profundiade() < pontoIncrementado.profundiade()){
                                            matrizTela[coluna][k+yMin] = pontoIncrementado;
                                        }
                                    }
                                    avanco++;
                                }

                            }
                        }else{
                            if(lista.get(0).getX() >= 0 && k+yMin >= 0 && lista.get(0).getX() < matrizTela.length && k+yMin < matrizTela[0].length){
                                if(matrizTela[(int)lista.get(0).getX()][k+yMin].profundiade() < lista.get(0).profundiade()){
                                    matrizTela[(int)lista.get(0).getX()][k+yMin] = lista.get(0);
                                }
                            }
                        }

                    }
                    
                }
                
                

            


            }
            
            //writMat(matrizTela);
            tela.getGraphicsContext2D().clearRect(0, 0, tela.getWidth(), tela.getHeight());
            for(int a = 0; a < matrizTela.length; a++){
                for(int j = 0; j < matrizTela[0].length; j++){
                    pixels.setColor(a, j, matrizTela[a][j].corNoPonto());
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
    
    
    public static void iluminacaoPhong(Canvas tela, ArrayList<caractere> caracteresPerspectiva, ArrayList<caractere> universo, Point3D L, int[] Il, int[] Ila, Point3D VRP ){
        PixelWriter pixels = tela.getGraphicsContext2D().getPixelWriter();
        
        
        pontoZbufferPhong[][] matrizTela = new pontoZbufferPhong[(int)tela.getWidth()][(int)tela.getHeight()];
        
        for(int i = 0; i < matrizTela.length; i++){
            for(int j = 0; j < matrizTela[0].length; j++){
                matrizTela[i][j] = new pontoZbufferPhong();
            }
        }
        
        for(int i = 0; i < caracteresPerspectiva.size(); i++){
            
            
            double[] Ita = new double[3];
            
            Ita[0] = universo.get(i).Ka.getX() * Ila[0];
            Ita[1] = universo.get(i).Ka.getY() * Ila[1];
            Ita[2] = universo.get(i).Ka.getZ() * Ila[2];
            
            ArrayList<face> faces = universo.get(i).faces;
            
            
            
            
            ArrayList<vertice> listaNormais = new ArrayList<>();
            
            for(int criaNormais = 0 ; criaNormais < caracteresPerspectiva.get(i).vertices.size(); criaNormais++){
                listaNormais.add(new vertice(caracteresPerspectiva.get(i).vertices.get(criaNormais).getNomeVertice(), normVertFace(universo.get(i).faces, caracteresPerspectiva.get(i).vertices.get(criaNormais).getNomeVertice())));
            }
            
            for(int j = 0; j < faces.size(); j++){
                
//                if(!faces.get(j).isVisivel()){
//                    continue;
//                }
//                double[] It = new double[3];
//                
//                It[0] = Ita[0];
//                It[1] = Ita[1];
//                It[2] = Ita[2];
//                
                Point3D centroide = faces.get(j).centroide();
//                Point3D normalFace = makeNormal(faces.get(j).verticesFace());
//                
                Point3D vetorIluminacao = L.subtract(centroide);
                vetorIluminacao = vetorIluminacao.normalize();
                Point3D S = VRP.subtract(centroide);
                S = S.normalize();
                
                Point3D H = vetorIluminacao.add(S);
                H = H.normalize();
                
//                double LN = normalFace.dotProduct(vetorIluminacao);
////                System.out.println("LN = " + LN);
//                
//                if(LN > 0){
//                    
//                    It[0] += universo.get(i).Kd.getX()*  Il[0] * LN;
//                    It[1] += universo.get(i).Kd.getY()*  Il[1] * LN;
//                    It[2] += universo.get(i).Kd.getZ()*  Il[2] * LN;
//                
//                    Point3D R = normalFace.multiply(2 * LN);
//                    R = R.subtract(vetorIluminacao);
//                    
////                    System.out.println("L = " + vetorIluminacao);
////                    System.out.println("N = " + normalFace);
////                    System.out.println("R = " + R);
//                    
//                    Point3D S = VRP.subtract(centroide).normalize();
//                    double RS = R.dotProduct(S);
//                    
////                    System.out.println("RS = " + RS);
//                    if(RS > 0){
//                        RS = Math.pow(RS, this.caracteres.get(i).n);
//                        
//                        It[0] += universo.get(i).Ks.getX()* Il[0] * RS;
//                        It[1] += universo.get(i).Ks.getY()* Il[1] * RS;
//                        It[2] += universo.get(i).Ks.getZ()* Il[2] * RS;
//                        
//                    }
//                }
                
                
                
                ArrayList<aresta> arestas = caracteresPerspectiva.get(i).faces.get(j).arestasFaceComBuraco();
                
                vertice[] minimoMaximo = caracteresPerspectiva.get(i).faces.get(j).minmaxY();
                
                int yMin = (int)minimoMaximo[0].getY();
                
                ArrayList<pontoZbufferPhong>[] bufferFace = new ArrayList[(int)minimoMaximo[1].getY()-yMin+1];
                
                
                
                //System.out.println(caracteresPerspectiva.get(i).faces.get(j).getNomeFace());
                
//                for(int teste = 0; teste < arestas.size(); teste++){
//                    System.out.println(arestas.get(teste).getNomeAresta());
//                }
                
                if((int)minimoMaximo[1].getY()- yMin > 0){
//                    System.out.println(" aresta "+ caracteresPerspectiva.get(i).faces.get(j).getNomeFace());
                    for(int l = 0; l < arestas.size(); l++){
                        
                        
                        aresta auxiliar = arestas.get(l);
                        
//                        System.out.println(auxiliar.getNomeAresta());
//                        System.out.println("InicioX = " + ((int) auxiliar.getInicio().getX()) + "    FinalX = " + ((int) auxiliar.getFim().getX()));
//                        System.out.println("InicioY = " + ((int) auxiliar.getInicio().getY()) + "    FinalY = " + ((int) auxiliar.getFim().getY()));
//                        System.out.println("");
                        
                        
                        if((int)auxiliar.getFim().getY() == (int)auxiliar.getInicio().getY()){
                            
                            //System.out.println(auxiliar.getNomeAresta());
                            
                        }else if((int)auxiliar.getFim().getY() > (int)auxiliar.getInicio().getY()){
                             
                            //System.out.println(auxiliar.getNomeAresta());
                            
                            // Cuidar arredondamento para truncamento
                            
                            int posicaoBuffer = (int)auxiliar.getInicio().getY()-yMin;
                            
                            //System.out.println(posicaoBuffer);
                                
                            Point3D inicio = vetorNormalVertice(auxiliar.getInicio().getNomeVertice(), listaNormais);
                            Point3D fim = vetorNormalVertice(auxiliar.getFim().getNomeVertice(), listaNormais);
                            
                            if(bufferFace[posicaoBuffer] == null){
                                bufferFace[posicaoBuffer] = new ArrayList<>();
                            
                            

                            
                                pontoZbufferPhong pontoAdicionado = new pontoZbufferPhong((int)auxiliar.getInicio().getX(), auxiliar.getInicio().getZ(), inicio );
                                bufferFace[posicaoBuffer].add(pontoAdicionado);
                                
//                                System.out.println(auxiliar.getNomeAresta() + "  Linha = " + posicaoBuffer);
//                                for(int jegue = 0; jegue < bufferFace[posicaoBuffer].size(); jegue++){
//                                    System.out.print("   "+bufferFace[posicaoBuffer].get(jegue).getX());
//                                }
//                                System.out.println();
//                                System.out.println(pontoAdicionado.getX());
//                                System.out.println();
                                
                                
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );
                                
                            }else{
                                int avanco = -1;

                                do{
                                   //System.out.println("esrtive aqui");
                                   avanco++; 
                                }while( avanco < bufferFace[posicaoBuffer].size() && (int)auxiliar.getInicio().getX() >= (int)bufferFace[posicaoBuffer].get(avanco).getX() );
                                
                                pontoZbufferPhong pontoAdicionado = new pontoZbufferPhong((int)auxiliar.getInicio().getX(), auxiliar.getInicio().getZ(), inicio );
                                bufferFace[posicaoBuffer].add(avanco, pontoAdicionado);
                                
//                                System.out.println(auxiliar.getNomeAresta() + "  Linha = " + posicaoBuffer);
//                                for(int jegue = 0; jegue < bufferFace[posicaoBuffer].size(); jegue++){
//                                    System.out.print("   "+bufferFace[posicaoBuffer].get(jegue).getX());
//                                }
//                                System.out.println();
//                                System.out.println(pontoAdicionado.getX());
//                                System.out.println();
                            }
                            
                            
                            
                            
                            double taxaZ = (auxiliar.getFim().getZ() - auxiliar.getInicio().getZ()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY());
                            double taxaX = (auxiliar.getFim().getX() - auxiliar.getInicio().getX()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY());
                            Point3D taxaIJK = new Point3D((fim.getX() - inicio.getX()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY()), (fim.getY() - inicio.getY()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY()), (fim.getZ() - inicio.getZ()) / (auxiliar.getFim().getY() - auxiliar.getInicio().getY()));
                            
                            
                            //System.out.println("TaxaZ = "+taxaZ);
                            //System.out.println("TaxaX = "+taxaX);
//                            posicaoBuffer++;
                            
                            //int k = posicaoBuffer + 1;
                            
                            for(int k = 1; k < ((int) auxiliar.getFim().getY()) - ((int)auxiliar.getInicio().getY())  ; k++){
                               
                                if(bufferFace[k+posicaoBuffer] == null){
                                    bufferFace[k+posicaoBuffer] = new ArrayList<>();
                                    
                                    pontoZbufferPhong pontoAdicionado = new pontoZbufferPhong((int)auxiliar.getInicio().getX()+(int)(taxaX*(k)), auxiliar.getInicio().getZ()+(taxaZ*(k)),taxaIJK.multiply(k).add(inicio) );
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );
                                    
                                    bufferFace[k+posicaoBuffer].add(pontoAdicionado);
                                    
                                    
//                                    System.out.println(auxiliar.getNomeAresta() + "  Linha = " + (k+posicaoBuffer));
//                                    for(int jegue = 0; jegue < bufferFace[k+posicaoBuffer].size(); jegue++){
//                                        System.out.print("   "+bufferFace[k+posicaoBuffer].get(jegue).getX());
//                                    }
//                                    System.out.println();
//                                    System.out.println(pontoAdicionado.getX());
//                                    System.out.println();
                                    
                                }else{
                                    
                                    int avanco = -1;

                                    do{
                                       avanco++; 
                                    }while( avanco < bufferFace[k+posicaoBuffer].size() &&  (int)auxiliar.getInicio().getX()+(int)(taxaX*(k)) >= (int)bufferFace[k+posicaoBuffer].get(avanco).getX());
                                    
                                    
                                    pontoZbufferPhong pontoAdicionado = new pontoZbufferPhong((int)auxiliar.getInicio().getX()+(int)(taxaX*(k)), auxiliar.getInicio().getZ()+(taxaZ*(k)),taxaIJK.multiply(k).add(inicio) );
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );
                                    
                                    bufferFace[k+posicaoBuffer].add(avanco, pontoAdicionado);
                                    
//                                    System.out.println(auxiliar.getNomeAresta() + "  Linha = " + (k+posicaoBuffer));
//                                    for(int jegue = 0; jegue < bufferFace[k+posicaoBuffer].size(); jegue++){
//                                        System.out.print("   "+bufferFace[k+posicaoBuffer].get(jegue).getX());
//                                    }
//                                    System.out.println();
//                                    System.out.println(pontoAdicionado.getX());
//                                    System.out.println();


                                }
                                   
                            }

                        }else if((int)auxiliar.getInicio().getY() > (int)auxiliar.getFim().getY()){

                            
                            int posicaoBuffer = (int)auxiliar.getFim().getY()-yMin;
                            Point3D inicio = vetorNormalVertice(auxiliar.getInicio().getNomeVertice(), listaNormais);
                            Point3D fim = vetorNormalVertice(auxiliar.getFim().getNomeVertice(), listaNormais);
                            
                            
                            if(bufferFace[posicaoBuffer] == null){
                                bufferFace[posicaoBuffer] = new ArrayList<>();
                            
                                pontoZbufferPhong pontoAdicionado = new pontoZbufferPhong((int)auxiliar.getFim().getX(), auxiliar.getFim().getZ(), fim);
                                bufferFace[posicaoBuffer].add(pontoAdicionado);
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );

//                                System.out.println(auxiliar.getNomeAresta() + "  Linha = " + posicaoBuffer);
//                                for(int jegue = 0; jegue < bufferFace[posicaoBuffer].size(); jegue++){
//                                    System.out.print("   "+bufferFace[posicaoBuffer].get(jegue).getX());
//                                }
//                                System.out.println();
//                                System.out.println(pontoAdicionado.getX());
//                                System.out.println();
                                    
                                
                            }else{
                                int avanco = -1;

                                do{
                                   avanco++; 
                                }while(avanco < bufferFace[posicaoBuffer].size() &&   (int)auxiliar.getFim().getX() >= (int)bufferFace[posicaoBuffer].get(avanco).getX());
                                
                                pontoZbufferPhong pontoAdicionado = new pontoZbufferPhong((int)auxiliar.getFim().getX(), auxiliar.getFim().getZ(), fim);
//                                System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                System.out.println("ponto");
//                                System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + posicaoBuffer );
                                
                                bufferFace[posicaoBuffer].add(avanco, pontoAdicionado);
                                
//                                System.out.println(auxiliar.getNomeAresta() + "  Linha = " + posicaoBuffer);
//                                for(int jegue = 0; jegue < bufferFace[posicaoBuffer].size(); jegue++){
//                                    System.out.print("   "+bufferFace[posicaoBuffer].get(jegue).getX());
//                                }
//                                System.out.println();
//                                System.out.println(pontoAdicionado.getX());
//                                System.out.println();
                            }

                            double taxaZ = (auxiliar.getInicio().getZ() - auxiliar.getFim().getZ()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY());
                            double taxaX = (auxiliar.getInicio().getX() - auxiliar.getFim().getX()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY());
                            Point3D taxaIJK = new Point3D((inicio.getX() - fim.getX()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY()), (inicio.getY() - fim.getY()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY()), (inicio.getZ() - fim.getZ()) / (auxiliar.getInicio().getY() - auxiliar.getFim().getY()));
//                            System.out.println("");
//                            System.out.println("taxaX = " + taxaX);
//                            System.out.println("taxaZ = " + taxaZ);
//                            System.out.println("");
                            
//                            posicaoBuffer++;
                            //int k = posicaoBuffer + 1;
//                            if(auxiliar.getNomeAresta().equals("H_G")){
//                                System.out.println(((int) auxiliar.getInicio().getY()) - ((int)auxiliar.getFim().getY()) + " MACACO   bufferFace = " + posicaoBuffer +  "      yMin = " + (yMin));
//                            }

                            for(int k = 1; k < ((int) auxiliar.getInicio().getY()) - ((int)auxiliar.getFim().getY()) ; k++){
//                                System.out.println(bufferFace[k]);
                                
//                                if(auxiliar.getNomeAresta().equals("H_G")){
//                                    System.out.println("MACEDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo");
//                                    
//                                }

                                if(bufferFace[k+posicaoBuffer] == null){
                                    bufferFace[k+posicaoBuffer] = new ArrayList<>();
                                
                                    pontoZbufferPhong pontoAdicionado = new pontoZbufferPhong((int)auxiliar.getFim().getX()+(int)(taxaX*(k)), auxiliar.getFim().getZ()+(taxaZ*(k)),taxaIJK.multiply(k).add(fim) );
                                    bufferFace[k+posicaoBuffer].add(pontoAdicionado);
                                    
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );

//                                    System.out.println(auxiliar.getNomeAresta() + "  Linha = " + (k+posicaoBuffer));
//                                    for(int jegue = 0; jegue < bufferFace[k+posicaoBuffer].size(); jegue++){
//                                        System.out.print("   "+bufferFace[k+posicaoBuffer].get(jegue).getX());
//                                    }
//                                    System.out.println();
//                                    System.out.println(pontoAdicionado.getX());
//                                    System.out.println();
                                    
                                }else{
                                    int avanco = -1;

                                    do{
                                       avanco++; 
                                    }while( avanco < bufferFace[k+posicaoBuffer].size() &&    (int)auxiliar.getFim().getX()+(int)(taxaX*(k)) >= (int)bufferFace[k+posicaoBuffer].get(avanco).getX() );
                                    
                                    
                                    pontoZbufferPhong pontoAdicionado = new pontoZbufferPhong((int)auxiliar.getFim().getX()+(int)(taxaX*(k)), auxiliar.getFim().getZ()+(taxaZ*(k)),taxaIJK.multiply(k).add(fim) );
                                    bufferFace[k+posicaoBuffer].add(avanco, pontoAdicionado);
                                    
//                                    System.out.println(auxiliar.getNomeAresta() + "  Linha = " + (k+posicaoBuffer));
//                                    for(int jegue = 0; jegue < bufferFace[k+posicaoBuffer].size(); jegue++){
//                                        System.out.print("   "+bufferFace[k+posicaoBuffer].get(jegue).getX());
//                                    }
//                                    System.out.println();
//                                    System.out.println(pontoAdicionado.getX());
//                                    System.out.println();
                                    
//                                    System.out.println("face " + caracteresPerspectiva.get(i).faces.get(j).getNomeFace()  );
//                                    System.out.println("aresta " + arestas.get(l).getNomeAresta());
//                                    System.out.println("ponto");
//                                    System.out.println("  " + pontoAdicionado.getX() + "    "+ pontoAdicionado.profundiade() + "   " + k );

                                }
                            }   



                        }


                    }
                    
//                    for(int loco = 0; loco < listaNormais.size();  loco++ ){
//                        System.out.println(" normal do vértice "+listaNormais.get(loco).getNomeVertice()+"  "+ listaNormais.get(loco).ponto);
//                    }
                     
//                    System.out.println(caracteresPerspectiva.get(i).faces.get(j).getNomeFace());
//                    for(int teste = 0; teste < bufferFace.length; teste++){
//                        
//                        if(bufferFace[teste] != null){
//                            System.out.println("Linha "+teste);
//                            for(int testi = 0; testi < bufferFace[teste].size(); testi++){
//                                System.out.print("   "+bufferFace[teste].get(testi).getX() + "   ");
//                                System.out.print((bufferFace[teste].get(testi).vetorNormalizado()));
//                                System.out.print(" ///");
//                            }
//                            System.out.println();
//                        }
//                    }
                    
                    for(int k = 0; k < bufferFace.length-1; k++){
                        
                        ArrayList<pontoZbufferPhong> lista = bufferFace[k];
                        
//                        if(lista == null ){
//                            System.out.println("Linha Y = "+ (k+yMin) +" está nula");
//                            
//                            continue;
//                        }
                        
                        if(lista.size() > 1){
                            
                            for(int l = 0; l < lista.size(); l+=2){
                                double taxaZ = (lista.get(l+1).profundiade() - lista.get(l).profundiade()) / (lista.get(l+1).getX() - lista.get(l).getX()); 
                                Point3D taxaIJK = (lista.get(l+1).vetor().subtract(lista.get(l).vetor()));
                                taxaIJK = new Point3D(taxaIJK.getX() / (lista.get(l+1).getX() - lista.get(l).getX()), taxaIJK.getY() / (lista.get(l+1).getX() - lista.get(l).getX()), taxaIJK.getZ() / (lista.get(l+1).getX() - lista.get(l).getX()));
                                
//                                double taxaZ = (lista.get(l+1).profundiade() - lista.get(l).profundiade()) / (lista.get(l+1).getX() - lista.get(l).getX()); 
//                                Point3D taxaIJK = (lista.get(0).vetor().subtract(lista.get(lista.size()-1).vetor()));
//                                taxaIJK = new Point3D(taxaIJK.getX() / (lista.get(lista.size()-1).getX() - lista.get(0).getX()), taxaIJK.getY() / (lista.get(lista.size()-1).getX() - lista.get(0).getX()), taxaIJK.getZ() / (lista.get(lista.size()-1).getX() - lista.get(0).getX()));
                                
                                
                                
//                                int avanco;
                                
                                
                                if(lista.get(l).getX() >= 0 && k+yMin >= 0 && lista.get(l).getX() < matrizTela.length && k+yMin < matrizTela[0].length){
                                    
                                    if(matrizTela[(int)lista.get(l).getX()][k+yMin].profundiade() < lista.get(l).profundiade()){  
                                        
                                        double[] It = {Ita[0], Ita[1], Ita[2]};
                                        Point3D vetorNormalizado = lista.get(l).vetorNormalizado();
                                        double LN = vetorNormalizado.dotProduct(vetorIluminacao);
                                        
                                        if(LN > 0){
                    
                                            It[0] += universo.get(i).Kd.getX()*  Il[0] * LN;
                                            It[1] += universo.get(i).Kd.getY()*  Il[1] * LN;
                                            It[2] += universo.get(i).Kd.getZ()*  Il[2] * LN;
                                            
                                            double HN = vetorNormalizado.dotProduct(H);
                                            if(HN > 0){
                                                HN = Math.pow(HN, caracteresPerspectiva.get(i).n);

                                                It[0] += universo.get(i).Ks.getX()* Il[0] * HN;
                                                It[1] += universo.get(i).Ks.getY()* Il[1] * HN;
                                                It[2] += universo.get(i).Ks.getZ()* Il[2] * HN;

                                            }
                                        
                                        }
                                        
                                        lista.get(l).novaCor((int)It[0], (int)It[1], (int)It[2]);
                                        
                                        
                                        
                                        matrizTela[(int)lista.get(l).getX()][k+yMin] = lista.get(l);
                                        
                                    }
                                }

                                
                                
//                                System.out.println("Linha = "+(k+yMin));
//                                System.out.print(((int) lista.get(l).getX())+ "    ");
//                                System.out.println(((int) lista.get(l+1).getX()));
//                                System.out.println("Inicio = " + lista.get(l).vetor());
//                                System.out.println("Fim = "+lista.get(l+1).vetor());
//                                System.out.println("");
                                int avanco2 = 1;
//                                avanco = (int) lista.get(lista.size()-1).getX() - lista.get(0).getX() + lista.get(l).getX();
                                //System.out.println("av" + avanco);
                                
                                for(int coluna = 1 + ((int) lista.get(l).getX()); coluna < (int) lista.get(l+1).getX(); coluna++ ){
                                    pontoZbufferPhong pontoIncrementado = new pontoZbufferPhong(lista.get(l).profundiade()+(taxaZ*avanco2), taxaIJK.multiply(avanco2).add(lista.get(l).vetor()));
//                                    System.out.print(taxaIJK.multiply(avanco).add(lista.get(l).vetor())+ "    ");
                                    if(coluna >= 0 && k+yMin >= 0 && coluna < matrizTela.length && k+yMin < matrizTela[0].length){
                                        if(matrizTela[coluna][k+yMin].profundiade() < pontoIncrementado.profundiade()){
                                            
                                            double[] It = {Ita[0], Ita[1], Ita[2]};
                                            Point3D vetorNormalizado = pontoIncrementado.vetorNormalizado();
                                            double LN = vetorNormalizado.dotProduct(vetorIluminacao);

                                            if(LN > 0){

                                                It[0] += universo.get(i).Kd.getX()*  Il[0] * LN;
                                                It[1] += universo.get(i).Kd.getY()*  Il[1] * LN;
                                                It[2] += universo.get(i).Kd.getZ()*  Il[2] * LN;

                                                double HN = vetorNormalizado.dotProduct(H);
                                                if(HN > 0){
                                                    HN = Math.pow(HN, caracteresPerspectiva.get(i).n);

                                                    It[0] += universo.get(i).Ks.getX()* Il[0] * HN;
                                                    It[1] += universo.get(i).Ks.getY()* Il[1] * HN;
                                                    It[2] += universo.get(i).Ks.getZ()* Il[2] * HN;

                                                }

                                            }

                                            pontoIncrementado.novaCor((int)It[0], (int)It[1], (int)It[2]);


                                            
                                            
                                            
                                            matrizTela[coluna][k+yMin] = pontoIncrementado;
                                        }
                                    }
//                                    avanco++;
                                    avanco2++;
                                }
//                                System.out.println("");

                            }
//                            System.out.println("");
                        }else{
                            if(lista.get(0).getX() >= 0 && k+yMin >= 0 && lista.get(0).getX() < matrizTela.length && k+yMin < matrizTela[0].length){
                                if(matrizTela[(int)lista.get(0).getX()][k+yMin].profundiade() < lista.get(0).profundiade()){
                                    
                                    double[] It = {Ita[0], Ita[1], Ita[2]};
                                    Point3D vetorNormalizado = lista.get(0).vetorNormalizado();
                                    double LN = vetorNormalizado.dotProduct(vetorIluminacao);

                                    if(LN > 0){

                                        It[0] += universo.get(i).Kd.getX()*  Il[0] * LN;
                                        It[1] += universo.get(i).Kd.getY()*  Il[1] * LN;
                                        It[2] += universo.get(i).Kd.getZ()*  Il[2] * LN;

                                        double HN = vetorNormalizado.dotProduct(H);
                                        if(HN > 0){
                                            HN = Math.pow(HN, caracteresPerspectiva.get(i).n);

                                            It[0] += universo.get(i).Ks.getX()* Il[0] * HN;
                                            It[1] += universo.get(i).Ks.getY()* Il[1] * HN;
                                            It[2] += universo.get(i).Ks.getZ()* Il[2] * HN;

                                        }

                                    }

                                    lista.get(0).novaCor((int)It[0], (int)It[1], (int)It[2]);
                                    
                                    
                                    matrizTela[(int)lista.get(0).getX()][k+yMin] = lista.get(0);
                                }
                            }
                        }

                    }
                    
                }
                
                

            


            }
            
            //writMat(matrizTela);
            tela.getGraphicsContext2D().clearRect(0, 0, tela.getWidth(), tela.getHeight());
            for(int a = 0; a < matrizTela.length; a++){
                for(int j = 0; j < matrizTela[0].length; j++){
                    pixels.setColor(a, j, matrizTela[a][j].corNoPonto());
                }
            }
            tela.getGraphicsContext2D().restore();
        
            
        }
    
    }
    
    
    public void gouraud(){
        
    }
    
    
    public static Point3D vetorNormalVertice(String verticeNome, ArrayList<vertice> vertices){
        
        for(int i = 0; i < vertices.size(); i++){
            if(verticeNome.equals(vertices.get(i).getNomeVertice())){
                return vertices.get(i).ponto;
            }
        }
        return null;
        
    }
    
    public static Point3D normVertFace(ArrayList<face> faces, String vert){
        ArrayList<face> faceWithVert = new ArrayList<>();
        
        int parada = 0;
        for(int j = 0; j < faces.size() && parada < 3; j ++){
            ArrayList<vertice> auxiliar = faces.get(j).verticesFaceComBuraco();
            
            for(int k = 0; k < auxiliar.size(); k++){
                if(auxiliar.get(k).getNomeVertice().equals(vert)){
                    faceWithVert.add(faces.get(j));
                    parada++;
                    break;
                }
            }
            
//            int o = 0;
//            aresta k = faces.get(j).getArestaFace();
//            
//            boolean rigth = false;
//            for(aresta p = new aresta("null"); !k.getNomeAresta().equals(p.getNomeAresta()); o++){//andando nas arestas da face
//                if(o < 1){
//                    p = k;
//                }
//
//                if(rigth){
//                    if(p.getFim().getNomeVertice().equals(vert)){
//                        faceWithVert.add(faces.get(j));
//                    }
//                }else{
//                    if(p.getInicio().getNomeVertice().equals(vert)){
//                        faceWithVert.add(faces.get(j));
//                    } 
//                }
//                
//                if(faceWithVert.size() == 3){
//                    break;
//                }
//                
//                if(p.getDireita().getNomeFace().equals(faces.get(j).getNomeFace())){
//                    p = p.getArestaDireitaSuc();
//                    rigth = true;
//                }else{
//                    p = p.getArestaEsquerdaSuc();
//                    rigth = false;
//                }
//            }
        }
//        System.out.println(vert);
//        for(int i = 0; i < faceWithVert.size(); i++){
//            System.out.println(faceWithVert.get(i).getNomeFace());
//        }
        
        Point3D midUnitVert = makeNormal(faceWithVert.get(0).verticesFace());

        for(int k = 1; k < faceWithVert.size(); k++){
            midUnitVert = midUnitVert.add(makeNormal(faceWithVert.get(k).verticesFace()));
        }

        
        midUnitVert = midUnitVert.normalize();
        

//        System.out.println("testeAnt = "+midUnitVert);
        
        return midUnitVert;
    }
    
    public static Point3D makeNormal(ArrayList<vertice> vertList){  
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