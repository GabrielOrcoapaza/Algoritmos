/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchIterativo;

/**
 *
 * @author Gabriel
 */
public class BinarySearchIterativo {
 /**
 * @param args the command line arguments
 */

    int binarySearch(int arr[], int x){
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        // TODO code application logic here

        BinarySearchIterativo ob = new BinarySearchIterativo();
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int x = 3;
        int position = ob.binarySearch(arr, x);
        if (position == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index: " + position);
    }

}