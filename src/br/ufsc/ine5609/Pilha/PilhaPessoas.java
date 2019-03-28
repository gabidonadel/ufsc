/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.Pilha;

/**
 *
 * @author Dall Agnol
 */
public class PilhaPessoas {
    
    private Item i;

    public PilhaPessoas() {
        this.i = new Item();
    }
    
    public PilhaPessoas(Pessoa p) {
        this.i = new Item(p);
    }
    
    public void push(Pessoa p){
        this.i.setNext(this.i);
        this.i.setObj(p);
    }
    
    public Pessoa pop(){
        Item i = this.i;
        this.i = this.i.getNext();
        return  ((Pessoa) (i.getObj()));
    }
    
    
}
