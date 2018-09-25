/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.ExemploEnum;

import java.util.ArrayList;

/**
 *
 * @author 12041789921
 */
public class ExemploEnum {
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Cliente cliente1 = new Cliente(12345, "cLIENTE 1", TipoCliente.ESPECIAL);
        Cliente cliente2 = new Cliente(54894, "Cliente 2", TipoCliente.COMUM);
        Cliente cliente3 = new Cliente(12345, "Cliente 3", TipoCliente.DEVEDOR);
        
        clientes.add(cliente1);
        clientes.add(cliente3);
        clientes.add(cliente2);
        
        for(Cliente cliente : clientes){
            System.out.println(cliente.getNome() +": "+ cliente.getTipoCliente().mensagem);
        }
        
        
    }
    
}
