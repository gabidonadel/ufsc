/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.ExemploEnum;

/**
 *
 * @author 12041789921
 */
public class Cliente {
    private int cpf;
    private String nome;
    private TipoCliente tipoCliente;
    
    //constantes
    /**
     * Tipos de Cliente: <br/>
     * [0] - Especial
     * [1] - Comum
     * [2] - Devedor
     */
    
    /*
    public static final String[] TIPO = {"ESPECIAL","COMUM","DEVEDOR"};
    
    public static final String ESPECIAL = "ESPECIAL";
    public static final String COMUM = "COMUM";
    public static final String DEVEDOR = "DEVEDOR";
    */
    
    //public static enum TipoCliente {ESPECIAL,COMUM,DEVEDOR}; 

    public Cliente(int cpf, String nome, TipoCliente tipoCliente) {
        this.cpf = cpf;
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
    
}
