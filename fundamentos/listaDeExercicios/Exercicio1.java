package fundamentos.listaDeExercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		final int AJUSTE = 32;
		final double FATOR = 9.0 / 5.0;
		
		System.out.print("Entre temperatura em Celsius: ");
		celsius = e.nextDouble();
		
		fahrenheit = celsius * FATOR + AJUSTE;
		
		System.out.printf("Conversão %.2f F", fahrenheit);
		
		e.close();
	}
}
