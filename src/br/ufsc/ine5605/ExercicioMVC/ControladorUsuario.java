/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.ExercicioMVC;

import java.util.ArrayList;

/**
 *
 * @author 12041789921
 */
public class ControladorUsuario {

    private ControladorPrincipal controladorPrin;
    private TelaUsuario telaUsuario;
    private ArrayList<Usuario> usuarios;
    
    public ControladorUsuario(ControladorPrincipal controladorPrin) {
        this.controladorPrin = controladorPrin;
        this.telaUsuario = new TelaUsuario(this);
        this.usuarios = new ArrayList<>();
    }

    public void mostraMenuUsuario() {
        telaUsuario.mostraMenuUsuario();
    }

    public void listaUsuarios() {
        ArrayList<ConteudoTelaUsuario> listagemUsuarios = new ArrayList<>();
        
        for(Usuario usuario : usuarios){
            listagemUsuarios.add(empacota(usuario));
        }
        
        telaUsuario.mostraListaUsuarios(listagemUsuarios);
    }

    public void incluiUsuario(ConteudoTelaUsuario conteudoTela) {
        Usuario usuario = desempacota(conteudoTela);
        usuarios.add(usuario);
    }

    private Usuario desempacota(ConteudoTelaUsuario conteudoTela) {
        return new Usuario(conteudoTela.nomeUsuario);
    }

    private ConteudoTelaUsuario empacota(Usuario usuario) {
        return new ConteudoTelaUsuario(usuario.getNome());
    
    }
    
}
