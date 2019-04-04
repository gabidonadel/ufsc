/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.Lista;

/**
 *
 * @author Dall Agnol
 */
public class Aula5 {
    
    
    public static void main(String[] args) {
    // TODO code application logic here
    
        Pessoa a = new Pessoa("Lígia");
        Pessoa b = new Pessoa("Doni");
        Pessoa c = new Pessoa("Zé");
        try{
        ListaPessoas lista = new ListaPessoas(a);
        lista.adicionarAposPessoa(b, a);
        lista.adicionaEmUltimo(c);
        lista.imprimeLista();
        }catch(Exception e){
            System.out.println(e);
        
        }

    }    
    
}
