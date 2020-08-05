package fundamentos.listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in).useLocale(Locale.US);
		double base, altura, area;
		
		System.out.print("Entre a base do tri‚ngulo: ");
		base = e.nextDouble();

		System.out.print("Entre a altura do tri‚ngulo: ");
		altura = e.nextDouble();
		
		area = base * altura / 2.0;
		
		System.out.println("\n¡rea do tri‚ngulo: " + area);

		
		e.close();
	}
}
