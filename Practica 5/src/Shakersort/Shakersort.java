/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shakersort;

import java.util.Arrays;

/**
 *
 * @author Gabriel
 */
public class Shakersort {
    public static void shakerSort(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        boolean swapped = true;
        
        while (swapped) {
            swapped = false;
            
            // mover el mayor valor de a[1..j] a a[j]
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
            
            swapped = false;
            right--;
            
            // mover el menor valor de a[i..n] a a[i]
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i-1]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
            
            left++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 9, 6, 3, 7};
        Shakersort.shakerSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
