/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAList;

import TDAList.Practica6.TDAList;

/**
 *
 * @author Gabriel
 */
public class ListArray<T> implements TDAList<T> {
    private T[] list;
    private int size;
    private final int MAX_SIZE = 100;

    public ListArray() {
        list = (T[]) new Object[MAX_SIZE];
        size = 0;
    }

    
    public boolean isEmptyList() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public void destroyList() {
        list = (T[]) new Object[MAX_SIZE];
        size = 0;
    }

    public int search(T x) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public void insertFirst(T x) {
        if (size == MAX_SIZE) {
            System.out.println("List is full.");
            return;
        }
        for (int i = size - 1; i >= 0; i--) {
            list[i + 1] = list[i];
        }
        list[0] = x;
        size++;
    }

    public void insertLast(T x) {
        if (size == MAX_SIZE) {
            System.out.println("List is full.");
            return;
        }
        list[size] = x;
        size++;
    }

    public void removeNode(T x) {
        int index = search(x);
        if (index == -1) {
            System.out.println("Element not found.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size--;
    }
    
    
}