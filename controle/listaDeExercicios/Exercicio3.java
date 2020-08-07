package controle.listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Insira a nota 1: ");
		double nota1 = e.nextDouble();
		System.out.print("Insira a nota 2: ");
		double nota2 = e.nextDouble();
		
		double media = (nota1 + nota2) / 2.0;
		
		if (media >= 7.0)
			System.out.println("Aprovado");
		else if (media >= 4.0)
			System.out.println("Recuperação");
		else
			System.out.println("Reprovado");
		
		e.close();
	}
}
