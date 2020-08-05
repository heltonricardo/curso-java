package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Entre um inteiro:");
		int n = Integer.parseInt(s);
		
		if (n % 2 == 0)
			System.out.println("Número par!");
		else
			System.out.println("Número ímpar!");
	}
}
