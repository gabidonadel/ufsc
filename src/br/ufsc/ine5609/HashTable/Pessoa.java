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
public class Pessoa {
    
    private int idade;
    private String nome;
    private int matricula;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
    
    
    
}
