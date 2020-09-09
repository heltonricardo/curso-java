package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // Centraliza na tela
		
		JButton botao = new JButton("Clicar!");
		
		botao.addActionListener(e -> System.out.println("Erro1"));
		botao.addActionListener(e -> System.out.println("Erro2"));
		
		janela.add(botao);
		janela.setVisible(true);
	}
}
