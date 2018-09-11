/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.ExercicioMVC;

import java.util.Scanner;

/**
 *
 * @author 12041789921
 */
class TelaPrincipal {

    private Scanner s;
    private ControladorPrincipal controladorPrin;

    public TelaPrincipal(ControladorPrincipal controladorPrin) {
        this.controladorPrin = controladorPrin;
        this.s = new Scanner(System.in);
    }
    
    public void mostraMenuPrincipal(){
        
        System.out.println("--- Sistema Usuarios ---");
        System.out.println("--- Digite a opção desejada ---");
        System.out.println("[1] - Cadastro de Usuario");
        System.out.println("[2] - Listar Usuarios");
        int opcao = s.nextInt();
        
        controladorPrin.executaOpcaoMunuPrincipal(opcao);
        
    }
    
}
