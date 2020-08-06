package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in).useLocale(Locale.US);
		double nota = 0, soma = 0;
		int qnt = 0;
		
		while (nota != -1) {
			System.out.print("Digite uma nota [0-10] ou [-1] para sair: ");
			nota = e.nextDouble();
			if (0 <= nota && nota <= 10) {
				soma += nota;
				++qnt;
			}
			
		}
		
		double media = soma / qnt;
		
		System.out.println("Média das notas: " + media);
		e.close();
	}
}
