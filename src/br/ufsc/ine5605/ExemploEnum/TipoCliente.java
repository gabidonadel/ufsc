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
public enum TipoCliente {
    ESPECIAL("Pode vender com desconto"),
    COMUM("Pode vender"),
    DEVEDOR("Verifique o saldo devedor");
    
    public final String mensagem;
    
    TipoCliente(String mensagemRecebida){
        mensagem = mensagemRecebida;
    }
    
}
