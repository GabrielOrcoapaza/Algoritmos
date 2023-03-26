/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Basico_DDR_32;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Ejercicio_Basico_DDR_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        //Creamos un scanner para leer
        Scanner sn = new Scanner(System.in);
        //pedimos las palabras
        System.out.println("Escribe la palabra 1");
        String palabra1= sn.next();
        System.out.println("Escribe la palabra 2");
        String palabra2= sn.next();
        //Comparamos con el metodo equals
        //con equalsIgnoreCase, no considera las mayusculas
        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras con iguales");
        }
        else{
            System.out.println("Las palabras no son iguales");
        }        
    }
    
}
