/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.Fila;

/**
 *
 * @author Dall Agnol
 */
public class FilaPessoas {
    
    private Item firstItem;
    private Item lastItem;

    public FilaPessoas(Pessoa p) {
        this.firstItem = new Item(p);
        this.lastItem = null;
    }
    
    
    
}
