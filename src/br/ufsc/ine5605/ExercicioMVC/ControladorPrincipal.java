/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.ExercicioMVC;

/**
 *
 * @author 12041789921
 */
public class ControladorPrincipal {
    
    private TelaPrincipal telaPrincipal;
    private ControladorUsuario controladorUsuario;

    public ControladorPrincipal() {
        this.telaPrincipal = new TelaPrincipal(this);
        this.controladorUsuario = new ControladorUsuario(this);
    }

    public void iniciaSistema() {
        telaPrincipal.mostraMenuPrincipal();
        
    }

    public void executaOpcaoMunuPrincipal(int opcao) {
        switch(opcao){
            case 1: controladorUsuario.mostraMenuUsuario();
                break;
            case 2: System.out.println("merdaaaaaa");
                break;
        }
    }
    
}
