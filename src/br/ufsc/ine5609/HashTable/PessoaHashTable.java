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
public class PessoaHashTable extends HashTable{

    public PessoaHashTable() {
        super();
    }

    public PessoaHashTable(int size) {
        super(size);
    }
    
    
    public void inserir(Object p){
        super.inserir(hash(((Pessoa)p).getMatricula()), p);
    }
    
    protected int hash(Object o){
        int i = ((Integer) o).intValue();
        return i%super.getSize();
    }
    
    public Object buscar(Object o) throws Exception{
        int matricula = ((Integer) o).intValue();
        int hash = hash(o);
        
        return super.getTable()[hash].buscarPessoa(matricula);
        
    }
}
