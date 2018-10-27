package br.ufsc.ine5605.JavaSwing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class TelaPrincipal extends JFrame{
    private JLabel titulo;
    private JLabel texto1;
    private JTextArea horarioDesejado;
    private JButton botao;
    
    
    public TelaPrincipal(){
        super("Marque um horário com a Solange");
        
        Container container =  getContentPane();
        container.setLayout(new FlowLayout());
        GerenciadorBotoes gb = new GerenciadorBotoes();
        
        
        titulo = new JLabel();
        texto1 = new JLabel();
        horarioDesejado = new JTextArea();
        botao = new JButton();
        
        titulo.setVerticalAlignment(CENTER);
        titulo.setText("Marque um horário com a Solange");
        texto1.setText("Digite o horario:");
        
        botao.setText("Agendar");
        horarioDesejado.setMinimumSize(new Dimension(200000, 100));
        
        botao.addActionListener(gb);
        
        container.add(titulo);
        container.add(texto1);
        container.add(horarioDesejado);
        container.add(botao);
        
        setSize(500,400 );
        
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    private class GerenciadorBotoes implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae){
            JOptionPane.showMessageDialog(null, "Tia solanje está te aguardando");
        
        }
    } 
    
}
