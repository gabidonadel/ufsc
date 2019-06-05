/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.Deque;

/**
 *
 * @author Dall Agnol
 */
class Elemento {
    
    private Elemento next;
    private int number;

    public Elemento(int number) {
        this.number = number;
    }

    public int getDado() {
        return number;
    }

    public void setDado(int number) {
        this.number = number;
    } 
    
    public Elemento getProx(){
        return this.next;
    }
    
    public void setProx(Elemento e){
        this.next = e;
    }
}
