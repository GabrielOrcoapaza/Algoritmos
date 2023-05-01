/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAList;

/**
 *
 * @author Gabriel
 */
public class OrdenListLinked<T extends Comparable<T>> extends ListLinked<T> {
    
    @Override
    public void insertFirst(T newItem) {
        insert(newItem);
    }

    @Override
    public void insertLast(T newItem) {
        insert(newItem);
    }

    @Override
    public void removeNode(T deleteItem) {
        if (isEmptyList()) {
            return;
        }
        if (first.getData().compareTo(deleteItem) == 0) {
            first = first.getnext();
            return;
        }
        Node<T> current = first;
        Node<T> previous = null;
        while (current != null && current.getData().compareTo(deleteItem) != 0) {
            previous = current;
            current = current.getnext();
        }
        if (current != null) {
            previous.setnext(current.getnext());
        }
    }

    @Override
    public int search(T searchItem) {
        int index = 0;
        Node<T> current = first;
        while (current != null && current.getData().compareTo(searchItem) < 0) {
            index++;
            current = current.getnext();
        }
        if (current != null && current.getData().compareTo(searchItem) == 0) {
            return index;
        }
        return -1;
    }

    void insert(T newItem) {
        Node<T> newNode = new Node<T>(newItem);
        Node<T> current = first;
        Node<T> previous = null;
        while (current != null && current.getData().compareTo(newItem) < 0) {
            previous = current;
            current = current.getnext();
        }
        if (previous == null) {
            first = newNode;
        } else {
            previous.setnext(newNode);
        }
        newNode.setnext(current);
    }
}
