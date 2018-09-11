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
public class ControladorUsuario {

    private ControladorPrincipal controladorPrin;
    private TelaUsuario telaUsuario;
    
    public ControladorUsuario(ControladorPrincipal controladorPrin) {
        this.controladorPrin = controladorPrin;
        this.telaUsuario = new TelaUsuario(this);
    }

    void mostraMenuUsuario() {
        telaUsuario.mostraMenuUsuario();
    }

    void mostraListaUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}
