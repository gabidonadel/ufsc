/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.HashTable;


/**
 *
 * @author Dall Agnol
 */
public class Node {
    
    Object obj;
    Node next;
    Node prev;

    public Node() {
        this.obj = null;
        this.next = null;
    }
    
    public Node(Object obj) {
        this.obj = obj;
        this.next = null;
    }
    
    public Node(Object obj, Node next) {
        this.obj = obj;
        this.next = next;
    }
    
    public Node(Object obj, Node next, Node prev) {
        this.obj = obj;
        this.next = next;
        this.prev = prev;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
     
}
