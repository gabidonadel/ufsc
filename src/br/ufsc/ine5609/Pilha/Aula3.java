/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.Pilha;

import br.ufsc.ine5609.SuperIntArray.SuperIntArray;
import java.util.Scanner;

/**
 *
 * @author Dall Agnol
 */
public class Aula3 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa a = new Pessoa("Zé");
        Pessoa b = new Pessoa("Maria");
        Pessoa c = new Pessoa("Lucas");
        
        PilhaPessoas pilha = new PilhaPessoas(a);
        pilha.push(b);
        pilha.push(c);
        System.out.println(pilha.pop().getNome());
    }
    
}
