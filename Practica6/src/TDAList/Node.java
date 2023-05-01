/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAList;

/**
 *
 * @author Gabriel
 */
public class Node<T>{
   private T data;
   private Node<T>  next; 
   public Node(T data){
       this (data, null);            
   }
   public Node(T data, Node<T> next){
       this.data = data;
       this.next = next;
   }
   public T getData(){
       return this.data;
   }
   public Node<T> getnext(){
       return this.next;
   }
   public void setData(T data){
       this.data = data;
   }
   public void setnext (Node<T> next){
       this.next = next; 
   } 
}

