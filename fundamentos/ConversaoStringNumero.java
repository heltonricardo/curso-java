package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		System.out.println(valor1 + " " + valor2);
		
		double soma = Double.parseDouble(valor1) + Double.parseDouble(valor2);
		
		System.out.println("Soma = " + soma);
	}
}
