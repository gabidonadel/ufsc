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
        Pessoa d = new Pessoa("LG");
        Pessoa e = new Pessoa("Rapha");
        try{
            ListaPessoas lista = new ListaPessoas(a);
            lista.adicionarAposPessoa(b, a);
            lista.adicionaEmUltimo(c);
            lista.adicionaEmPrimeiro(d);
            lista.adicionar(e, 2);
            lista.excluiUltimo();
            lista.excluir(b);
            lista.excluir(2);
            lista.imprimeLista();
        }catch(Exception ex){
            System.out.println(ex);
        
        }

    }    
    
}
