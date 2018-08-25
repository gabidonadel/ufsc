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
public class Produto implements IProduto {
    private int codigo;
    private CategoriaProduto categoria;
    private String descricao;
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
    public CategoriaProduto getCategoria(){
        return categoria;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public void setCategoria(CategoriaProduto categoria){
        this.categoria = categoria;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(float preco){
         this.preco = preco;
    
    }
    public void setQuantidade(int quantidade){
         this.quantidade = quantidade;
    
    }
    
}