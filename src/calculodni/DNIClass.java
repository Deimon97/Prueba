/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodni;

/**
 *
 * @author dawbio
 * Is the class DNI use string dni,string letra and int numero
 */
public class DNIClass {

    private String dni;

    public DNIClass() {
    }
    
    
    /**
     * 
     * @param dni is a dni for pass
     */
    public DNIClass(String dni) {
        
          this.dni=dni;

    }

/**
 * Is a getter for the dni
 * @return the dni
 */
    public String getDni() {
        return dni;
    }
/**
 * Is a setter for the dni
 * @param dni is a dni
 */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * Is a function a comprovation the dni is valid
     * @param caracteres is a caracteres for validation the char of the dni
     * @return a boolean for use in the test
     */
    public static boolean comprovar_dni (String caracter,int num_dni){
       DNIClass codedni= new DNIClass();
        int rest;
       rest=num_dni%23;
String caracteres[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};       String character;
        character= caracteres[rest];
        if ((caracter==character))
        {
           System.out.println("Valido");
           return true;
        }
        else 
        {
            System.out.println("No valido");
            return false;
        }
    }
}
