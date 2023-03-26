/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena="La lluvia en Sevilla es una maravilla"; 
        int contador=0; 
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='a' || 
               cadena.charAt(i)=='e' || 
               cadena.charAt(i)=='i' || 
               cadena.charAt(i)=='o' || 
               cadena.charAt(i)=='u'){
               contador ++; 
            }
        }
        System.out.println("Hay " +contador+ " vocales");
    }
    
}
