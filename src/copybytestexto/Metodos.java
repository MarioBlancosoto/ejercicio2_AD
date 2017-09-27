/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copybytestexto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mblancosoto
 */
public class Metodos {
    FileInputStream is;
    FileOutputStream os;
    
    int finArchivo;
   ArrayList <Integer> palabras  = new ArrayList();
    
    public void leer(){
    
        try {
            is = new FileInputStream("/home/local/DANIELCASTELAO/mblancosoto/NetBeansProjects/Copybytestexto/texto1");
            finArchivo = 0;
     
            
            while(finArchivo!=-1){
               finArchivo = is.read();
          
               palabras.add(finArchivo);
               
                System.out.println("+"+(char)finArchivo);
               
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao leelo arquivo "+ex.getMessage());
        } catch (IOException ex) {
            System.out.println("erro"+ex.getMessage());
        }
        try {
            is.close();
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void copiar(){
        
        
             
        try {
            os = new FileOutputStream("/home/local/DANIELCASTELAO/mblancosoto/NetBeansProjects/Copybytestexto/texto2.txt",true);
     
          for(int i=0;i<palabras.size();i++){
            if(palabras.get(i)!=-1){
              os.write(palabras.get(i));
            }
          }
        } catch (FileNotFoundException ex) {
            System.out.println("erro" +ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            os.close();
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
