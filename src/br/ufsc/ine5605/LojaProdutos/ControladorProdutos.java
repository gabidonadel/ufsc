/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
package br.ufsc.ine5605.LojaProdutos;
import java.util.ArrayList;
/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date   01/09/2017
 */
public class ControladorProdutos implements IControladorProdutos {
    
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<CategoriaProduto> categorias = new ArrayList<>();
    
    public void atualizaPrecos(float inflacao){
        for(Produto produto : produtos){
            float precoAjustado = produto.getPreco()*(1+inflacao/100f);
            produto.setPreco(precoAjustado);
        }

    }
    public IProduto getProdutoPeloCodigo(int codigo){
        for(Produto produto : produtos){
            if(produto.getCodigo() == codigo){
                return (IProduto) produto;
            }
        }
        return null;
    }

    public ICategoriaProduto incluiCategoriaProduto(int codigo, String nome){
        CategoriaProduto categoria = new CategoriaProduto(codigo,nome);
        return (ICategoriaProduto) categoria;
    }


    public IProduto incluiProduto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria){
        Produto produto = new Produto(codigo,nome,descricao,  preco,  quantidade,categoria);
        produtos.add(produto);
        return (IProduto) produto;
    
    }
    
    
}