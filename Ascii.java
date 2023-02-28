
package Tarea1;


public class Ascii {
    
 public static void main(String[] args) {
    
    String codigo = "abcABC1";
        Ascii objtopi =new Ascii();

        String codigoTradu = "";
        String codigodesi = "";
        int cambio = 2;
        int asciiValue;
        int condicion = codigo.length() / 2;
//         hacemos que recorra toda la palabra
        for (int i = 0; i < codigo.length(); i++) {

            asciiValue = codigo.charAt(i);
           //verificamos que llegue a la mitad para hacer el cambio en el incremento  //verificamos que llegue a la mitad para hacer el cambio en el incremento
            if (i > condicion) {
                cambio = 3;
            }
            // verificamos que sea una letra para hacer el cambio de valor 
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambio;
            }

           
            // hacemos que guarde el char del string pero invertido 
            codigoTradu = (char) asciiValue + codigoTradu;
        }

        cambio = -3;

        for (int i = 0; i < codigoTradu.length(); i++) {

            asciiValue = codigoTradu.charAt(i);
            //verificamos que llegue a la mitad para hacer el cambio en el incremento 
            if (i >= condicion) {
                cambio = -2;
            }
            // verificamos que sea una letra para hacer el cambio de valor 
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambio;
            }

            // hacemos que guarde el char del string pero invertido 
            codigodesi = (char) asciiValue + codigodesi;
        }
        

       
        objtopi.desCifrar(objtopi.cifrar(codigo));
        

        
    
    }
    String cifrar(String información) {
        String codigoTradu = "";
        int cambio = 2;
        int asciiValue;
        int condicion = información.length() / 2;
        // hacemos que recorra toda la palabra
        for (int i = 0; i < información.length(); i++) {

            asciiValue = información.charAt(i);
            //verificamos que llegue a la mitad para hacer el cambio en el incremento 
            if (i > condicion) {
                cambio = 3;
            }
            // verificamos que sea una letra para hacer el cambio de valor 
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambio;
            }


            // hacemos que guarde el char del string pero invertido 
            codigoTradu = (char) asciiValue + codigoTradu;
        }

        return codigoTradu;
    }

    String desCifrar(String información) {
        String codigoTradu = "";
        int cambio = -3;
        int asciiValue;
        int condicion = información.length() / 2;
        // hacemos que recorra toda la palabra
      

        for (int i = 0; i < información.length(); i++) {

            asciiValue = información.charAt(i);
            //verificamos que llegue a la mitad para hacer el cambio en el incremento 
            if (i >= condicion) {
                cambio = -2;
            }
            // verificamos que sea una letra para hacer el cambio de valor 
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambio;
            }


            // hacemos que guarde el char del string pero invertido 
            codigoTradu = (char) asciiValue + codigoTradu;
        }
//       System.out.println(" Codigo traducido: " + codigoTradu);
        return codigoTradu;
    }
}

    


