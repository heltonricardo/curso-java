package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		double media;
		
		System.out.println("Entre a m�dia: ");
		media = e.nextDouble();
		
		if (7 <= media && media <= 10) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
			
		}
		
		if (4.5 <= media && media < 7)
			System.out.println("Recupera��o!");
		
		if (0 <= media && media < 4.5)
			System.out.println("Reprovado!");
		
		e.close();
	}
}
