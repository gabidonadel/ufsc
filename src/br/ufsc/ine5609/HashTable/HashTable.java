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
public abstract class HashTable {
    private NodeChain[] table;
    private int size;

    public HashTable() {
        this.size = 5;
        this.table = new NodeChain[this.size];
        instantiateTable();
    }
    
    public HashTable(int size) {
        this.table = new NodeChain[size];
        this.size = size;
        instantiateTable();
    }
    
    private void instantiateTable(){
        for(int i = 0;i<this.size;i++){
            this.table[i] = new NodeChain();
        }
    }
    
    public void inserir(int i, Object o){
        table[i].inserirAntesAtual(o);
    } 
    
    public void remover(){
    
    }

    public NodeChain[] getTable() {
        return table;
    }
    
    public abstract Object buscar(Object o) throws Exception;

    public int getSize() {
        return size;
    }
    
    
    
    protected abstract int hash(Object o);
    
}
