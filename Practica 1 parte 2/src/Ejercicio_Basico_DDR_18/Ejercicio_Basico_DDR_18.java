/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Basico_DDR_18;

/**
 *
 * @author Gabriel
 */

import java.util.Scanner;
public class Ejercicio_Basico_DDR_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Scanner sn = new Scanner(System.in);
        //hace que podamos escribir espacio en la frase y coja todo el string
        sn.useDelimiter("\n");
        System.out.println("Escribe una frase");
        String frase = sn.next();       
        //Divido la frase en palabras
        String palabras[] = frase.split(" ");
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }        
    }
    
}
