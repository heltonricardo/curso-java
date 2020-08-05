package controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in).useLocale(Locale.US);
		double nota;
		
		System.out.print("Digite a nota: ");
		nota = e.nextDouble();
		
		if (nota < 0 || 10 < nota)
			System.out.println("Nota inválida!");
		else if (8.1 <= nota)
				System.out.println("Conceito A");
		else if (6.1 <= nota)
			System.out.println("Conceito B");
		else if (4.1 <= nota)
			System.out.println("Conceito C");
		else if (2.1 <= nota)
			System.out.println("Conceito D");
		else 
			System.out.println("Conceito E");
		
		System.out.println("Fim!");
		e.close();
	}
}
