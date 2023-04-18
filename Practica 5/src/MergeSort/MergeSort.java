/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MergeSort;

import java.util.Arrays;

/**
 *
 * @author Gabriel
 */
public class MergeSort {
    
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            T[] left = Arrays.copyOfRange(arr, 0, mid);
            T[] right = Arrays.copyOfRange(arr, mid, arr.length);
            
            mergeSort(left);
            mergeSort(right);
            
            int i = 0;
            int j = 0;
            int k = 0;
            
            while (i < left.length && j < right.length) {
                if (left[i].compareTo(right[j]) < 0) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            
            while (i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            }
            
            while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        Integer[] arr = { 10, 7, 4, 2, 8, 3, 1, 9, 5, 6 };
    
        System.out.println("Arreglo original: " + Arrays.toString(arr));
    
        MergeSort.mergeSort(arr);
    
        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
    }
}
