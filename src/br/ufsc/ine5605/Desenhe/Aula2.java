/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.Desenhe;
import java.util.ArrayList;

/**
 *
 * @author 12041789921
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Losango losango = new Losango(53);
        losango.desenhe();
        Retangulo retangulo = new Retangulo(20,30);
        
        ArrayList<Armazenavel> armazenaveis = new ArrayList<>();
        retangulo.desenhe();
    }
    
}
