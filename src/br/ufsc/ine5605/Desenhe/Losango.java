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
public class Losango extends Figura{
    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public Losango(int raio) {
        this.raio = raio;
    }
    
    public void desenhe(){
        int NumEspacos = raio;
        String simbulo = "█";
        String linhas = "█  █";
        //primeira metade
        for(int i=1;i<=this.raio/2;i++){ 
            String espacos="";
            for(int j=1;j<=NumEspacos;j++){
                espacos+=" ";
            }
            NumEspacos--;
            System.out.print(espacos);
            if(i==1){
                System.out.println(" "+simbulo);
            }else{
                System.out.println(linhas);
                linhas = "█"+"  "+linhas.substring(1);
            }
        }
        //meio
        if(raio%2 ==1){
            String espacos=" ";
            for(int j=1;j<=this.raio/2;j++){
                espacos+=" ";
            }
            System.out.print(espacos);
            System.out.println(linhas);
            linhas = "█"+linhas.substring(3);
        }
        //segunda metade
        for(int i=1;i<=this.raio/2;i++){ 
            String espacos=" ";
            for(int j=1;j<=NumEspacos;j++){
                espacos+=" ";
            }
            NumEspacos++;
            System.out.print(espacos);
            if(i== this.raio/2){
                System.out.println(" "+simbulo);
            }else{
                
                System.out.println(linhas);
                linhas = "█"+linhas.substring(3);
            }
        }
        
        //System.out.println(Plinha);
    }
    
}
