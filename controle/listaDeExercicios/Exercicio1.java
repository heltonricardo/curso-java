package controle.listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in).useLocale(Locale.US);
		
		int n = e.nextInt();
		
		if (0 <= n && n <= 10)
			System.out.println("Valor dentro da faixa [0-10].");
		else
			System.out.println("Valor fora da faixa [0-10].");
		
		if (n % 2 == 0)
			System.out.println(n + " é par!");
		else
			System.out.println(n + " é ímpar!");
		
		e.close();
	}
}
