/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestSort;

/**
 *
 * @author Gabriel
 */
import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };
        
        System.out.println("Original array: ");
        showArray(arr);
        
        // Sort using bubble sort
        bubbleSort(arr);
        System.out.println("Sorted array (bubble sort): ");
        showArray(arr);
        
        // Sort using selection sort
        int[] arr2 = { 5, 3, 8, 4, 2 }; // Create a new array to sort
        selectionSort(arr2);
        System.out.println("Sorted array (selection sort): ");
        showArray(arr2);
        
        // Sort using insertion sort
        int[] arr3 = { 5, 3, 8, 4, 2 }; // Create a new array to sort
        insertionSort(arr3);
        System.out.println("Sorted array (insertion sort): ");
        showArray(arr3); 
        
      // Sort using shell sort
        int[] arr4 = { 5, 3, 8, 4, 2 }; // Create a new array to sort
        shellSort(arr4);
        System.out.println("Sorted array (shell sort): ");
        showArray(arr4);
        
        // Sort using quick sort
        int[] arr5 = { 5, 3, 8, 4, 2 }; // Create a new array to sort
        quickSort(arr5, 0, arr5.length - 1);
        System.out.println("Sorted array (quick sort): ");
        showArray(arr5);
    }
    
    // Bubble sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    // Selection sort implementation
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap arr[i] and arr[minIdx]
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    
    // Insertion sort implementation
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    // Shell sort implementation
    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
    
    // Quick sort implementation
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    
    // Method to print the contents of an array
    public static void showArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
