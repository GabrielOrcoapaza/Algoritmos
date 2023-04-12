/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suma_subconjunto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */ 
public class isSubsetSumPossible {
   public static boolean isSubsetSumPossible(int[] arr, int n, int targetSum, List<Integer> subset) {
        // Caso base: si la suma objetivo es 0, entonces es posible obtenerla con un subconjunto vacío.
        if (targetSum == 0) {
            return true;
        }

        // Caso base: si ya no hay más elementos en el arreglo, entonces no es posible obtener la suma objetivo.
        if (n == 0) {
            return false;
        }

        // Si el último elemento del arreglo es mayor que la suma objetivo, entonces ignorarlo.
        if (arr[n-1] > targetSum) {
            return isSubsetSumPossible(arr, n-1, targetSum, subset);
        }

        // Si el último elemento es un múltiplo de 7 y no es seguido por un 1, entonces debe incluirse en el subconjunto.
        if (arr[n-1] % 7 == 0) {
            subset.add(arr[n-1]);
            boolean res = isSubsetSumPossible(arr, n-1, targetSum - arr[n-1], subset);
            if (res) {
                return true;
            }
            subset.remove(subset.size()-1);
        } else {
            // Verificar si el elemento actual es seguido por un 1 y luego un 7.
            for (int i = n - 1; i < arr.length - 1; i++) {
                if (arr[i] == 1 && arr[i+1] == 7) {
                    // Si se cumple la condición, incluir el elemento actual en el subconjunto.
                    subset.add(arr[n-1]);
                    boolean res = isSubsetSumPossible(arr, n-1, targetSum - arr[n-1], subset);
                    if (res) {
                        return true;
                    }
                    subset.remove(subset.size()-1);
                    break;
                }
            }
        }

        // Caso recursivo: considerar el último elemento y ver si es posible obtener la suma objetivo.
        boolean res1 = isSubsetSumPossible(arr, n-1, targetSum - arr[n-1], subset);
        boolean res2 = isSubsetSumPossible(arr, n-1, targetSum, subset);
        if (res1 || res2) {
            return true;
        }
        return false;
    }

    public static boolean isSubsetSumPossible(int[] arr, int targetSum, List<Integer> subset) {
        return isSubsetSumPossible(arr, arr.length, targetSum, subset);
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 7, 10, 4};
        int target1 = 17;
        List<Integer> subset1 = new ArrayList<>();
        boolean result = isSubsetSumPossible(arr1, target1, subset1);
        if (result) {
            System.out.println("Es posible obtener la suma " + target1 + " con el subconjunto " + subset1);
        } else {
            System.out.println("No es posible obtener la suma " + target1 + " con ningún subconjunto.");
        }

        subset1.clear();

        int[] arr2 = {4, 2, 7, 10, 4};
        int target2 = 16;
        result = isSubsetSumPossible(arr2, target2, subset1);
        if (result) {
            System.out.println("Es posible obtener la suma " + target2 + " con el subconjunto " + subset1);
        } else {
            System.out.println("No es posible obtener la suma " + target2 + " con ningún subconjunto.");
        }

        subset1.clear();

        int target3 = 6;
        result = isSubsetSumPossible(arr1, target3, subset1);
        if (result) {
            System.out.println("Es posible obtener la suma " + target3 + " con el subconjunto " + subset1);
        } else {
            System.out.println("No es posible obtener la suma " + target3 + " con ningún subconjunto.");
        }

        subset1.clear();

        int target4 = 7;
        result = isSubsetSumPossible(arr1, target4, subset1);
        if (result) {
            System.out.println("Es posible obtener la suma " + target4 + " con el subconjunto " + subset1);
        } else {
            System.out.println("No es posible obtener la suma " + target4 + " con ningún subconjunto.");
        }

        subset1.clear();

        int target5 = 8;
        result = isSubsetSumPossible(arr1, target5, subset1);
        if (result) {
            System.out.println("Es posible obtener la suma " + target5 + " con el subconjunto " + subset1);
        } else {
            System.out.println("No es posible obtener la suma " + target5 + " con ningún subconjunto.");
        }
    }
}