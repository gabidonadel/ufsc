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
public class Aula7 {
    
    public static void main(String[] args) {
    // TODO code application logic here
    
        Pessoa a = new Pessoa("Lígia",1);
        Pessoa b = new Pessoa("Doni",2);
        Pessoa c = new Pessoa("Zé",3);
        Pessoa d = new Pessoa("LG",5);
        Pessoa e = new Pessoa("Rapha",6);
        
        PessoaHashTable intHash = new PessoaHashTable(4);
        intHash.inserir(a);
        intHash.inserir(b);
        intHash.inserir(c);
        intHash.inserir(d);
        
        
        try{
            
            Pessoa p = (Pessoa) intHash.buscar(new Integer(1));
            System.out.println(p.getNome());
        }catch(Exception ex){
            System.out.println(ex);
        }

    }  
}
