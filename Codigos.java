
package Tarea1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Codigos extends JFrame{
    
    private final JTextArea textArea1;
    private final JTextArea textArea2;
    private final JButton boton1;
    private final JButton boton2;
    private final JButton boton3;
    private final JButton boton4;
    
    
    public Codigos(){
    
    super("Prueba Actividad 5 ");
        setLayout(new FlowLayout());
        textArea1 = new JTextArea(5, 25);
        textArea2 = new JTextArea(5, 25);       
        boton1 = new JButton("Encripta");
        boton2 = new JButton("Decifra");
        boton3 = new JButton("Guardar");
        boton4 = new JButton("Mostrar");
        
        add(textArea1);
        
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        
        add(textArea2);
        
        Operacion objOperacion =new Operacion();
        boton1.addActionListener(objOperacion);
        Operacion2 objOperacion2 =new Operacion2();
        boton2.addActionListener(objOperacion2);
        Operacion3 Guardar = new Operacion3();
        boton3.addActionListener(Guardar);
        Operacion4 Mostrar = new Operacion4();
        boton4.addActionListener(Mostrar);
    
    
    }
    
    public class Operacion implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent event){
            String cadena; 
            String str;
            cadena =  textArea1.getText();
            Ascii objTopico =new Ascii();
           textArea2.setText(objTopico.cifrar(cadena));
           
        }   
    }
    
    public class Operacion2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String cadena;
            cadena =  textArea1.getText();
            Ascii objTopico =new Ascii();
           textArea2.setText(objTopico.desCifrar(cadena));
       
        }
    }
    
    public class Operacion3 implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent event){
            String Ncadena;
            Archivo archivo = new Archivo();
            Ncadena = textArea2.getText();
            archivo.Crear();
          
            if(boton1.isValid()){
              
              
              archivo.agregar(Ncadena + ".txt");
               
              
              
             System.out.println("texto agregado");
            }else 
                archivo.Crear();
             
              
        }
     

    }
    public class Operacion4 implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent event){
            String cadena;
            cadena =  textArea1.getText();
            
        }
    
    
    
    }
   
    
    public static void main(String[] args) {
        Codigos Ventana = new Codigos();
        
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setSize(300,300);
        Ventana.setVisible(true);
    }
}
