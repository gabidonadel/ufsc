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
public class Prova1 {
    
    public static void main(String[] args){
    
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        
        DequeFinal dequeImplementadoNaProva = new DequeFinal();
        System.out.println("### INSERINDO NUMEROS NO DEQUE ###");
        dequeImplementadoNaProva.entrarPelaFrente(a);
        System.out.println("### NÚMERO 1 INSERIDO PELA FRENTE ###");
        dequeImplementadoNaProva.entrarNoFim(b);
        System.out.println("### NÚMERO 2 INSERIDO NO FIM ###");
        dequeImplementadoNaProva.entrarNoFim(c);
        System.out.println("### NÚMERO 3 INSERIDO NO FIM ###");
        
        try{
            //Print dequeImplementadoNaProva
            /*System.out.println(dequeImplementadoNaProva.sairDaFrente());
            System.out.println(dequeImplementadoNaProva.sairDaFrente());
            System.out.println(dequeImplementadoNaProva.sairDaFrente());*/
            
            System.out.println("### REMOVENDO NÚMERO PELA FRENTE ###");
            System.out.println(dequeImplementadoNaProva.sairDaFrente());
            System.out.println("### REMOVENDO NÚMERO PELO FIM ###");
            System.out.println(dequeImplementadoNaProva.sairDoFim());
            System.out.println("### REMOVENDO NÚMERO PELO FIM ###");
            System.out.println(dequeImplementadoNaProva.sairDoFim());
            System.out.println("### REMOVENDO NÚMERO PELO FIM ###");
            System.out.println(dequeImplementadoNaProva.sairDoFim());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
