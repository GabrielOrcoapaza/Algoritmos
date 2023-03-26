/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Basico_DDR_30_V2;

/**
 *
 * @author Gabriel
 */
import javax.swing.JOptionPane;
public class Ejercicio_Basico_DDR_30_V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Por favor, introduce una frase",
                "Introduccion",
                JOptionPane.INFORMATION_MESSAGE);
        String cadenaResultante;
        //true: lo pasamos a mayusculas
        //false: lo pasamos todo a minusculas
        boolean IsMayus;
        int eleccion=JOptionPane.showConfirmDialog(null,
                "Quieres que se pase a mayusculas",
                "Eleccion",
                JOptionPane.YES_NO_OPTION);
        IsMayus= (eleccion==JOptionPane.YES_OPTION);
        //segun lo elegido, lo transformaremos a mayuscula o miniscula
        if(IsMayus){
            cadenaResultante=texto.toUpperCase();
        }
        else{
            cadenaResultante=texto.toLowerCase();
        }
        //Mosramos el menaje resultante
        JOptionPane.showMessageDialog(null,
                cadenaResultante,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
} 