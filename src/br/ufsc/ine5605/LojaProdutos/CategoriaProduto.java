/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
package br.ufsc.ine5605.LojaProdutos;

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date   01/09/2017
 */
public class CategoriaProduto implements ICategoriaProduto {
    
    
    private int codigo;

    public CategoriaProduto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}