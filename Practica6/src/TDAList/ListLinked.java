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

public class ListLinked<T> implements TDAList<T> {
    Node<T> first;
    
    public ListLinked() {
        this.first = null;
    }

    public boolean isEmptyList() {
        return first == null;
    }

    public int length() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.getnext();
        }
        return count;
    }

    public void destroyList() {
        first = null;
    }

    public int search(T searchItem) {
        int index = 0;
        Node<T> current = first;
        while (current != null) {
            if (current.getData().equals(searchItem)) {
                return index;
            }
            index++;
            current = current.getnext();
        }
        return -1;
    }

    public void insertFirst(T newItem) {
        Node<T> newNode = new Node<T>(newItem);
        newNode.setnext(first);
        first = newNode;
    }

    public void insertLast(T newItem) {
        Node<T> newNode = new Node<T>(newItem);
        if (isEmptyList()) {
            first = newNode;
        } else {
            Node<T> current = first;
            while (current.getnext() != null) {
                current = current.getnext();
            }
            current.setnext(newNode);
        }
    }

    public void removeNode(T deleteItem) {
        if (isEmptyList()) {
            return;
        }
        if (first.getData().equals(deleteItem)) {
            first = first.getnext();
            return;
        }
        Node<T> current = first;
        while (current.getnext() != null) {
            if (current.getnext().getData().equals(deleteItem)) {
                current.setnext(current.getnext().getnext());
                return;
            }
            current = current.getnext();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = first;
        while (current != null) {
            sb.append(current.getData().toString()).append(" ");
            current = current.getnext();
        }
        return sb.toString();
    }
}