/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.JogoDaVelha;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class TelaJogoDaVelha extends JFrame{

    private ControladorJogoDaVelha controladorJogoDaVelha;



    private JButton x1y1;
    private JButton x1y2;
    private JButton x1y3;
    private JButton x2y1;
    private JButton x2y2;
    private JButton x2y3;
    private JButton x3y1;
    private JButton x3y2;
    private JButton x3y3;
    private GerenciadorBotoes gb;
    
    
    public TelaJogoDaVelha(ControladorJogoDaVelha controladorJogoDaVelha){
        super("Jogo da Velha");
        this.controladorJogoDaVelha = controladorJogoDaVelha;
        configuraTela();
        
    }
    
    private void configuraTela(){
        
        getContentPane().removeAll();
        Container container =  getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints constrains = new GridBagConstraints();
        
        gb = new GerenciadorBotoes();
        
        //primeira coluna
        constrains.gridx = 0;
        constrains.gridy = 0;
        x1y1 = new JButton();
        x1y1.setName("1,1");
        x1y1.setPreferredSize(new Dimension(80, 80));
        container.add(x1y1, constrains);
        x1y1.addActionListener(gb);
        
        constrains.gridy = 1;
        x1y2 = new JButton();
        x1y2.setName("1,2");
        x1y2.setPreferredSize(new Dimension(80, 80));
        container.add(x1y2, constrains);
        x1y2.addActionListener(gb);
        
        constrains.gridy = 2;
        x1y3 = new JButton();
        x1y3.setName("1,3");
        x1y3.setPreferredSize(new Dimension(80, 80));
        container.add(x1y3, constrains);
        x1y3.addActionListener(gb);
        
        //segunda coluna
        constrains.gridx = 1;
        constrains.gridy = 0;
        x2y1 = new JButton();
        x2y1.setName("2,1");
        x2y1.setPreferredSize(new Dimension(80, 80));
        container.add(x2y1, constrains);
        x2y1.addActionListener(gb);
        
        constrains.gridy = 1;
        x2y2 = new JButton();
        x2y2.setName("2,2");
        x2y2.setPreferredSize(new Dimension(80, 80));
        container.add(x2y2, constrains);
        x2y2.addActionListener(gb);
        
        constrains.gridy = 2;
        x2y3 = new JButton();
        x2y3.setName("2,3");
        x2y3.setPreferredSize(new Dimension(80, 80));
        container.add(x2y3, constrains);
        x2y3.addActionListener(gb);
        
        
        //terceira coluna
        constrains.gridx = 2;
        constrains.gridy = 0;
        x3y1 = new JButton();
        x3y1.setName("3,1");
        x3y1.setPreferredSize(new Dimension(80, 80));
        container.add(x3y1, constrains);
        x3y1.addActionListener(gb);
        
        constrains.gridy = 1;
        x3y2 = new JButton();
        x3y2.setName("3,2");
        x3y2.setPreferredSize(new Dimension(80, 80));
        container.add(x3y2, constrains);
        x3y2.addActionListener(gb);
        
        constrains.gridy = 2;
        x3y3 = new JButton();
        x3y3.setName("3,3");
        x3y3.setPreferredSize(new Dimension(80, 80));
        container.add(x3y3, constrains);
        x3y3.addActionListener(gb);
        
        
        
        
        setSize(500,400 );
        
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    private class GerenciadorBotoes implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae){
            JButton botao = (JButton) ae.getSource();
            
            String pos = botao.getName();

            int x = Integer.valueOf(pos.substring(0, 1))-1;
            int y = Integer.valueOf(pos.substring(2))-1;
            System.out.println("X: "+ x+" Y: "+ y);
            try{
                //controladorJogoDaVelha.setJogadas(x, y);
                String j = controladorJogoDaVelha.jogar(x,y);
                botao.setText(j);
                try{
                    if(controladorJogoDaVelha.verificaVitoria()){
                        JOptionPane.showMessageDialog(null, "Parabens Jogardor "+j+" você ganhou!");
                        controladorJogoDaVelha.limpaJogo();
                        configuraTela();
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    controladorJogoDaVelha.limpaJogo();
                    configuraTela();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                
            }
            
            
        }
    } 
    
}

    
    
    
    
    
    
    
