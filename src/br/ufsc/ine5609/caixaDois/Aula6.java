/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.caixaDois;


/**
 *
 * @author Dall Agnol
 */
public class Aula6 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa a = new Pessoa("Lígia");
        Pessoa b = new Pessoa("Doni");
        Pessoa c = new Pessoa("Zé");
        Pessoa d = new Pessoa("LG");
        Pessoa e = new Pessoa("Rapha");
        NodeChain nodeChain = new NodeChain(a);
        nodeChain.inserirDepoisAtual(b);
        nodeChain.retroceder();
        nodeChain.inserirDepoisAtual(c);
        nodeChain.inserirAntesAtual(d);
        nodeChain.excluirAtual();
        System.out.println(nodeChain.buscar(c));
        System.out.println(((Pessoa)nodeChain.acessarAtual()).getNome());
        nodeChain.avancar();
        System.out.println("--Avanço");
        System.out.println(((Pessoa)nodeChain.acessarAtual()).getNome());
        nodeChain.retroceder();
        System.out.println("--Retrocede");
        System.out.println(((Pessoa)nodeChain.acessarAtual()).getNome());
        System.out.println("-----LISTA PESSOAS-----");
        nodeChain.listaPessoas();
       
        try{ 
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
