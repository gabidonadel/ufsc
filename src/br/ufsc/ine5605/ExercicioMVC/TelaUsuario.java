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
public class TelaUsuario {
    
    private Scanner s;
    private ControladorUsuario controladorUsu;

    public TelaUsuario(ControladorUsuario controladorUsu) {
        this.controladorUsu = controladorUsu;
        this.s = new Scanner(System.in);
    }

    void mostraMenuUsuario() {
        System.out.println("---Cadastro Usuario ---");
    }
    
}
