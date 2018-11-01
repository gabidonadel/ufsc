/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.JogoDaVelha;

import java.util.Arrays;
/**
 *
 * @author 12041789921
 */
public class ControladorJogoDaVelha {
    
    private  int rodada = 2;
    private int[][] jogadas;
    private TelaJogoDaVelha telaJogoDaVelha;
    

    public ControladorJogoDaVelha() {
        this.telaJogoDaVelha = new TelaJogoDaVelha(this);
        this.jogadas = (new int[3][3]);
        limpaJogo();
        
    }
    

    public int[][] getJogadas() {
        return jogadas;
    }

    public void setJogadas(int x ,int y ) throws Exception{
        if(this.jogadas[x][y] == -10){
            this.jogadas[x][y] = Math.abs((rodada-1)%2);        
        }else{
            throw new Exception("Área já demarcada");
        }

    }
    
    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }
    
    public String jogar(int x ,int y ) throws Exception{
        setJogadas(x, y);
        String j = jogadorAtual();
        rodada++;
        return j;
    }
    
    public String jogadorAtual(){
        return (rodada%2 == 0) ? "X" : "O";
    }
    public boolean verificaVitoria() throws Exception{
        for(int i = 0;i<3; i++){
            int countLinha = 0;
            int countColuna = 0;
            for(int j = 0;j<3; j++){
                countLinha += jogadas[i][j];
                countColuna += jogadas[j][i];
                System.out.println("X: "+i+" - Y:"+j+" ::: "+jogadas[i][j]);
            }
            System.out.println("Coluna : "+i+" " + countLinha);
            if(countLinha ==0 || countLinha == 3 || countColuna ==0 || countColuna == 3){
                return true;
            }
        }
        
        int countDiagonalPrincipal = 0;
        int countDiagonalSecundaria = 0;
        for(int i = 0;i<3; i++){
            countDiagonalPrincipal += jogadas[i][i];
            countDiagonalSecundaria += jogadas[2-i][i];
        }
        if(countDiagonalPrincipal ==0 || countDiagonalPrincipal == 3 || countDiagonalSecundaria ==0 || countDiagonalSecundaria == 3){
            return true;
        }else if(rodada == 9){
            throw new Exception("Velha, tente novamente!");
        }
        return false;      
    }
    public void limpaJogo(){
        Arrays.fill(jogadas[0],-10);
        Arrays.fill(jogadas[1],-10);
        Arrays.fill(jogadas[2],-10);
        rodada = 0;
    }
}
