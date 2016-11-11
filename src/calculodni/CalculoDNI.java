/**
 * This program calculate the DNI character
 * 
 * 2.- Programa que deixa introduir per un costat el número del DNI i per l'altra 
 * la lletra del DNI, i respon si és un DNI inventat o vertader.
 */
package calculodni;

import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

/**
 *
 * @author dawbio
 * The program comprovate the dni is correct
 */
public class CalculoDNI {
    public static Scanner scanner =new Scanner(System.in);
        public static ArrayList characters = new ArrayList();

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String letra_dni;
        int num_dni;
        
        
        DNIClass codedni= new DNIClass();
        System.out.println("Pon un DNI");
        codedni.setDni(scanner.next());
        letra_dni=separacion_letra(codedni.getDni());
        num_dni=separacion_num(codedni.getDni());
        codedni.comprovar_dni(letra_dni,num_dni);
         
    }
    /**
     * The function separate the char for the dni
     * @param dni is  dni for validation
     * @return the char of the dni
     */
    public static String separacion_letra (String dni){
       String cadena;
        
       cadena=dni.substring(8);
       
        return  cadena;
    }
    /**
     * Is a function for separate the number of the dni
     * @param dni is a dni for validation
     * @return  the number of the dni
     */
    public static int separacion_num (String dni){
       String cadena;
       int num_dni;
        
        cadena=dni.substring(8);
        cadena=dni.substring(0,8); // (indica posicion, longitud de la cosa que coje)
        num_dni= Integer.parseInt(cadena);
        
        return  num_dni;
    }
   
    
}
