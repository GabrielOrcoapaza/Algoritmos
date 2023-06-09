/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solucion;

/**
 *
 * @author Gabriel
 */
public class Solucion1{
    // Construir 's1' y 's2' a partir de la lista enlazada dada con secuencias consecutivas
    // enumera los elementos en la dirección hacia adelante y hacia atrás
    public static void construct(Node head, StringBuilder s1, StringBuilder s2){
    // caso base
        if (head == null) {
            return;
        }
        s1.append(head.data);
        construct(head.next, s1, s2);
        s2.append(head.data);
    }
    // Metodo para verificar si una lista enlazada de caracteres dada es un palíndromo
    public static boolean isPalindrome(Node head){
    // construye la string 's1' y 's2' con elementos consecutivos de la lista enlazada
    // comenzando desde el principio y el final
        StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
        construct(head, s1, s2);
        // comprueba si la lista enlazada es un palíndromo
        return s1.toString().equals(s2.toString());
    }
    public static void main(String[] args)    {
        Node head = new Node('A');
        head.next = new Node('A');
        head.next.next = new Node('N');
        head.next.next.next  = new Node('A');
        head.next.next.next.next  = new Node('L');
        head.next.next.next.next.next  = new Node('A'); 
        head.next.next.next.next.next.next  = new Node('V');
        head.next.next.next.next.next.next.next  = new Node('L');
        head.next.next.next.next.next.next.next.next  = new Node('A');
        head.next.next.next.next.next.next.next.next.next  = new Node('T');
        head.next.next.next.next.next.next.next.next.next.next  = new Node('I');
        head.next.next.next.next.next.next.next.next.next.next.next  = new Node('N');
        head.next.next.next.next.next.next.next.next.next.next.next.next  = new Node('A');
        if (isPalindrome(head)){
        System.out.println("Linked List Es palindrome.");
        }
        else {
        System.out.println("Linked List is No es palindrome.");
        }
    }
}
