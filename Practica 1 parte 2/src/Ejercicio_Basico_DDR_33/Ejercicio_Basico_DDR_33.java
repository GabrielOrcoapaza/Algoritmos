/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Basico_DDR_33;

/**
 *
 * @author Gabriel
 */
public class Ejercicio_Basico_DDR_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Hola mundo";        
        //Cuidado: Es 3 porque empiesa en 0 las cadenas(cuartra letra)
        // el 5 es porque siempre hay que sumarle uno  ya que sino no mostraria lo que deseamos (quinta letra)
        String subcadena = cadena.substring(3, 5);
        System.out.println(subcadena);       
    }
    
}
