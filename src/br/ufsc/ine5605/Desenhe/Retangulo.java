/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.Desenhe;

/**
 *
 * @author 12041789921
 */
public class Retangulo extends Figura implements Armazenavel{
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    public void desenhe(){
        //primeira linha
        String simbulo = "█";
        String linha="";
        System.out.println(primeiraLinha(simbulo, linha));
        //meio
        linha="";
        linha+=simbulo;
        for(int i=1;i<=largura-2;i++){
            linha+="█";
        }
        linha+=simbulo;
        for(int i=2;i<altura;i++){
            System.out.println(linha);
        }
        //ultima livra
        linha="";
        System.out.println(primeiraLinha(simbulo, linha));
    }
    public String primeiraLinha(String simbulo,String linha){
        for(int i=1;i<=largura;i++){
            linha+=simbulo;
        }
        return linha;
    } 
    
    @Override
    public void grava(){
        System.out.println("Gravou no banco!");
    }
    @Override
    public Armazenavel recupera(){
        System.out.println("Recupera do Banco");
        return this;
    } 
}
