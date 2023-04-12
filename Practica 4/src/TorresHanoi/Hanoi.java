/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TorresHanoi;

/**
 *
 * @author Gabriel
 */
/*public class Hanoi {
 
    public static void main(String[] args) {
 // TODO code application logic here
        Hanoi objHanoi = new Hanoi ();
        objHanoi.torresHanoi(3,1,2,3);
    }
        //Creando el metodo recursivo para la solucion de las torres hanoi
    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
        //Caso base
        if(discos == 1){
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3);
        }else{
        //Dominio (problema – 1)
            torresHanoi(discos -1, torre1, torre3, torre2);
            System.out.println("mover disco de torre "+ torre1 + " a torre " + torre3);
            torresHanoi(discos -1, torre2, torre1, torre3);
        }
    }
}*/


public class Hanoi {
    public static void main(String[] args) {
        Hanoi objHanoi = new Hanoi ();
        int numMovimientos = objHanoi.torresHanoi(3,1,2,3);
        System.out.println("Número de movimientos necesarios: " + numMovimientos);
    }
    
    public int torresHanoi(int discos, int torre1, int torre2, int torre3){
        int numMovimientos = 0;
        // Caso base
        if(discos == 1){
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3);
            numMovimientos = 1;
        }else{
            // Dominio (problema – 1)
            numMovimientos += torresHanoi(discos -1, torre1, torre3, torre2);
            System.out.println("mover disco de torre "+ torre1 + " a torre " + torre3);
            numMovimientos++;
            numMovimientos += torresHanoi(discos -1, torre2, torre1, torre3);
        }
        return numMovimientos;
    }
} 