/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CalculadoraPolacaInversaApp;

/**
 *
 * @author Gabriel
 */
import javax.swing.JOptionPane;
public class CalculadoraPolacaInversaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double operando1;// 
        double operando2;
        double resultado=0; //TODO code application logic here
    
        String texto=JOptionPane.showInputDialog("Escribe el operando 1");
        operando1=Integer.parseInt(texto);
        
        String operacion=JOptionPane.showInputDialog("Escribe el codigo de operacion");
        String texto2=JOptionPane.showInputDialog("Escribe el operando 2");
        operando2=Integer.parseInt(texto);
        
        switch (operacion){
            case "+":
                resultado=operando1+operando2;
                break; 
            
            case "-":
                resultado=operando1-operando2;
                break; 
            case "*":
                resultado=operando1*operando2;
                break;  
            case "/":
                resultado=operando1/operando2;
                break; 
            case "^":
                resultado=(int) Math.pow(operando1,operando2);
                break;    
            case "%":
                resultado=operando1%operando2;
                break;     
        }
        JOptionPane.showMessageDialog(null, operando1+" "+operacion+" "+operando2+" = "+resultado);
    }
    
}
