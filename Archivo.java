
package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Archivo {
       FileWriter archivo = null;
    
    public static void main(String[] args) {
        Archivo archivo = new Archivo();
               
                
    }
    
    public void Crear(){
     
        
        try{    
            archivo = new FileWriter("C:\\Users\\Isaac\\OneDrive\\Documentos\\NetBeansProjects\\TopicosProgramacion\\src\\Tarea1\\Archivo.txt");
            
           }catch(IOException e){
            System.err.println("NO se pudo crer el archivo");
        
        
        }
       
    }
    
       public void  agregar(String str) {
      
        PrintWriter wr = null;
     
        try{
          wr = new PrintWriter(archivo);
        
          wr.print(str);
//            System.out.println("archivo creado y guardado");
        }catch(Exception e){
            
            System.err.println("ha sucedido un error");
       
        }
       }
        public void mostrar(){
        
        FileReader archivo;
        BufferedReader lector;
        
        
        try{
            archivo = new  FileReader("C:\\Users\\Isaac\\OneDrive\\Documentos\\NetBeansProjects\\TopicosProgramacion\\src\\Tarea1\\Archivo.txt");
            if(archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                
              while((cadena = lector.readLine()) != null){
                    System.out.println(cadena);
              }
            
            }else{
                System.out.println("no se pudo leer el archivo");
            
            }
                
            
        }catch(Exception e){
            System.err.println("Error");
            
       
        }
       
        
        
        }
    }

    

