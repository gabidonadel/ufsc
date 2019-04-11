/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.caixaDois;

/**
 *
 * @author Dall Agnol
 */
public class NodeChain {
    
    private Node first;
    private Node cursor;

    public NodeChain() {
        this.first = new Node();
        this.cursor = this.first;
    }
    
    public NodeChain(Object o) {
        Node node = new Node(o);
        node.setNext(node);
        node.setPrev(node);
        this.first = node;
        this.cursor = this.first;
    }
    
    public void avancar(){
        this.cursor = this.cursor.getNext();
    }
    
    public void retroceder(){
        this.cursor = this.cursor.getPrev();
    }
    
    public void inserirAntesAtual(Object obj){
        Node node = new Node(obj, this.cursor, this.cursor.getPrev());
        this.cursor.getPrev().setNext(node);
        this.cursor.setPrev(node);
    }
    
    public void inserirDepoisAtual(Object obj){
        Node node = new Node(obj, this.cursor.getNext(), this.cursor);
        this.cursor.getNext().setPrev(node);
        this.cursor.setNext(node);
    }
    
    public Object acessarAtual(){
        return this.cursor.getObj();
    }
    
    public void excluirAtual(){
        this.cursor.getPrev().setNext(this.cursor.getNext());
        this.cursor.getNext().setPrev(this.cursor.getPrev());
        this.cursor = this.cursor.getNext(); 
    }
    
    public boolean buscar(Object obj){
        Node atual = this.first;
        
        do{
            if(atual.getObj() == obj){
                this.cursor = atual;
                return true;
            }
            atual = atual.getNext();
        }while(this.first != atual);
        
        return false;
    }
    
    public void listaPessoas(){
        Node atual = this.first;
        
        do{
            System.out.println(((Pessoa) atual.getObj()).getNome());
            atual = atual.getNext();
        }while(this.first != atual);
    }
    
    
    
}
