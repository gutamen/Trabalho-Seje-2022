/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javafx.geometry.Point3D;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import letras.caractere;

/**
 *
 * @author gutam
 */
public class controleArquivo {
    
    
    public static ArrayList<caractere> carregaArquivo(Stage tela){
        FileChooser escolheArquivo = new FileChooser();
        escolheArquivo.setTitle("Selecione o Arquivo para Carregamento");
        escolheArquivo.getExtensionFilters().addAll(new ExtensionFilter("Arquivo de Letra", "*.ltr"));
        escolheArquivo.setInitialDirectory(new File("."));
        File arquivo = escolheArquivo.showOpenDialog(tela);
        
        ArrayList<caractere> caracteres = new ArrayList<>();
        
        if (arquivo != null) {
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
                caracteres = new ArrayList<>();
                String linha;
                boolean novoCaractere = true;
                int contadorVertice = 0;
                int contadorCaractere = 0;
                
                
                while ((linha = leitor.readLine()) != null) {
                    
                    if(linha.length() == 0){ 
                        novoCaractere = true;
                        contadorVertice = 0;
                        contadorCaractere++;
                        continue;
                    }
                    
                    
                    
                    if(novoCaractere){
                        
                        caracteres.add(new caractere(linha));
                        novoCaractere = false;
                        
                        continue;
                    }
                    
                    if(linha.equals("\n")){
                        System.out.println("teste");
                        continue;
                    }
                    
                    String[] valores = linha.trim().split(",");
                    caracteres.get(contadorCaractere).vertices.get(contadorVertice).ponto = new Point3D(Double.parseDouble(valores[0]), Double.parseDouble(valores[1]), Double.parseDouble(valores[2]));
                    contadorVertice++;
                    
                    
                }
                
            } catch (Exception e) {
                System.out.println("Erro ao salvar dados no arquivo: " + e.getMessage());
            }
            
            
        }
        return caracteres;
        
    }
    
    
    
    
    public static void salvaArquivo(ArrayList<caractere> caracteres, Stage tela){
        
        FileChooser escolheArquivo = new FileChooser();
        escolheArquivo.setTitle("Salvar Arquivo");
        escolheArquivo.setInitialDirectory(new File("."));
        escolheArquivo.getExtensionFilters().addAll(new ExtensionFilter("Arquivo de Letra", "*.ltr"));
        
        File arquivo = escolheArquivo.showSaveDialog(tela);
        
        try {
            //File arquivo = new File("cu.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
            
            FileWriter escritor = new FileWriter(arquivo);
            
            for(int i = 0; i < caracteres.size(); i++){
                escritor.write(caracteres.get(i).letra + "\n");
                for(int k = 0; k < caracteres.get(i).vertices.size(); k++){
                    escritor.write(caracteres.get(i).vertices.get(k).getX() + "," + caracteres.get(i).vertices.get(k).getY() + "," + caracteres.get(i).vertices.get(k).getZ() +"\n");
                }
                escritor.write("\n");
            }           
            escritor.close();
            System.out.println("Dados salvos no arquivo com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }
    }
    
    
    
}
