/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularpreciototal;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;

public class CalcularPrecioTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto:");
        double precio = sc.nextDouble();
        
        System.out.println("Ingrese el porcentaje de impuestos:");
        double impuestos = sc.nextDouble();
        
        System.out.println("Ingrese el costo de envío:");
        double envio = sc.nextDouble();
        
        double impuestosCalculados = precio * (impuestos / 100);
        double precioConImpuestos = precio + impuestosCalculados;
        double precioTotal = precioConImpuestos + envio;
        
        System.out.println("El precio total de su compra es: " + precioTotal);
    }

}



