/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.ExercicioMVC;

import java.util.ArrayList;
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
        int opcao;
        
        do{
            System.out.println("--- Cadastro Usuario ---");
            System.out.println("--- Escolha a opcao desejada ---");
            System.out.println("[1] - Novo Usuario");
            System.out.println("[2] - Alterar Usuario");
            System.out.println("[3] - Listar Usuarios");
            System.out.println("[0] - Retornar Tela Principal");
            opcao = leValorInteiro();

            switch(opcao){
                case 1: mostraTelaCadastroUsuario();
                    break;
                case 3: controladorUsu.listaUsuarios();
                    break;
            }
        }while(opcao!=0);
    }

    private void mostraTelaCadastroUsuario() {
        System.out.println("--- Novo Usuario ---");
        System.out.println("Nome Usuario");
        ConteudoTelaUsuario conteudoTela = new ConteudoTelaUsuario();
        conteudoTela.nomeUsuario = s.nextLine();
        controladorUsu.incluiUsuario(conteudoTela);
        
    }
    
    void mostraListaUsuarios(ArrayList<ConteudoTelaUsuario> listagemUsuarios) {
        
        System.out.println("--- Lista de Usuario ---");
        for(ConteudoTelaUsuario conteudoTela : listagemUsuarios){
            System.out.println("Nome: " + conteudoTela.nomeUsuario);
        }
        System.out.println("--------------------------");
        
    }

    private int leValorInteiro() {
        int i = s.nextInt();
        s.nextLine();
        return i;
    }

    private void retornaMenuprincipal() {
        return;
    }
    
}
