package fundamentos.listaDeExercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		final int AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		
		System.out.print("Entre temperatura em Fahrenheit: ");
		fahrenheit = e.nextDouble();
		
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.printf("Conversão %.2f °C", celsius);
		
		e.close();
	}
}
