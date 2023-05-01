/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TDAList;

/**
 *
 * @author Gabriel
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public interface TDAList<T> {
        boolean isEmptyList();
        int length();
        void destroyList();
        int search(T x);
        void insertFirst(T x);
        void insertLast(T x);
        void removeNode(T x);
    }
    
}

