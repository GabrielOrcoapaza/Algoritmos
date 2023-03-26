/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasSemana; 


/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in); 
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();       
        DiasSemana dias = DiasSemana.valueOf(dia.toUpperCase());
        switch(dias){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia "+dias.name().toLowerCase()+" es laborable");
                break;                
            case SABADO:
            case DOMINGO:
                System.out.println("El dia "+dias+" no es laborable");
                break;
        }              
    }
    
}
