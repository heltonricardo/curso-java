package fundamentos.listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in).useLocale(Locale.US);
		double peso, altura, imc;
		
		System.out.print("Entre seu peso ....: ");
		peso = e.nextDouble();
		
		System.out.print("Entre sua altura ..: ");
		altura = e.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.printf("\nIMC calculado: %.2f", imc);
		
		e.close();
	}
}
