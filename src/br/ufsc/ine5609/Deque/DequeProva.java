/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5609.Deque;

/**
 *
 * @author Dall Agnol
 */
public class DequeProva {
    
    Elemento prim;
    Elemento ult;
    
    void entrarPelaFrente(int dado){
        Elemento novo =new Elemento(dado);
        novo.setProx(this.prim);
        this.prim = novo;
    }
    /*
        Visto que entrar pela frente seria "furar" a fila o 
        elemento inserido vai antes do primeiro elemento se
        tornando ele mesmo o primeito elemento
    */
    
    void entrarNoFim(int dado){
        Elemento novo = new Elemento(dado);
        this.ult.setProx(novo);
        this.ult = novo;
    }
    /*
        Essa função segue o comportamento padrão esperado em
        uma função de inserção numa fila comum, intanciando o
        objeto no final da fila
    */
    
    int sairDaFrente(){
        Elemento res = this.prim;
        if(res == this.ult){
           this.ult = null; 
        }
        this.prim = this.prim.getProx();
        return res.getDado();
    }
    /*
        Remove o primeiro objeto de uma lista fazendo o ponteiro
        Prim apontar para o próximo objeto e assim como não existem
        outros ponteiros para ele após o final da execução da função
        o coletor de lixo removerá o objeto do heap
    */
    
    int sairDoFim(){
        Elemento penultimo = this.prim;
        if(penultimo != null || penultimo.getProx() == penultimo){
            this.prim = null;
            this.ult = null;
            return penultimo.getDado();//return penultimo;
        }//verifica se o tamanho da lista é menor que 2
        while(penultimo.getProx() != this.ult){
            penultimo = penultimo.getProx();
        }
        Elemento res = this.ult;
        penultimo.setProx(null);
        this.ult = penultimo;
        return res.getDado();
    }
    /*
        Substitui o ultimo elemento de uma lista pelo pelo penultimo
        e retorna o antigo numero
    */
    
    boolean filaCheia(){
        return false;
    }
    /*
        Como estamos usando alocação dinâmica, diferentemente de um
        array a nossa lista não possui um limite de tamanho que possa
        ser estabelecido, apenas um limite físico do tamanho do sistema.
    */
    
}
