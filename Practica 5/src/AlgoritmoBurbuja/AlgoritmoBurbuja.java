/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmoBurbuja;

import java.util.Arrays;

/**
 *
 * @author Gabriel
 */
public class AlgoritmoBurbuja {
    
    public static void brickSort(int[] arr) {
        boolean isSorted = false;
        int n = arr.length;
        
        while (!isSorted) {
            isSorted = true;
            
            // Mover el elemento más grande a la posición correcta
            for (int j = n - 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    isSorted = false;
                }
            }
            
            // Mover el elemento más pequeño a la posición correcta
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i-1]) {
                    swap(arr, i, i-1);
                    isSorted = false;
                }
            }
            
            n--;
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 
    
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 6, 8, 2, 4, 0};
        System.out.println("Arreglo antes de ordenar: " + Arrays.toString(arr));
        
        AlgoritmoBurbuja.brickSort(arr);
        System.out.println("Arreglo después de ordenar: " + Arrays.toString(arr));
    }
    
}