/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.Fila;

/**
 *
 * @author Dall Agnol
 */
public class Item {
    
    Object obj;
    Item next;

    public Item() {
        this.obj = null;
        this.next = null;
    }
    
    public Item(Object obj) {
        this.obj = obj;
        this.next = null;
    }
    
    public Item(Object obj, Item next) {
        this.obj = obj;
        this.next = next;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }
    
    
    
    
}
