/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.Biblioteca;

/**
 *
 * @author gabri
 */
public class NewClass {
    
    public static void main(String[] arg){
        Editora editora = new Editora(1,"Casin");
        Autor autor = new Autor(3,"Doni");
        
        Livro livro = new Livro(123,"Livro Titulo",2000,editora,autor,1,"Capitulo Primeiro");
        livro.excluirCapitulo(null);
        livro.excluirCapitulo("Capitulo Primeiro");
        System.out.println(livro.getListaCapitulos());
    }
    
}
