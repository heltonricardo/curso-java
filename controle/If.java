package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		double media;
		
		System.out.println("Entre a média: ");
		media = e.nextDouble();
		
		if (7 <= media && media <= 10) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
			
		}
		
		if (4.5 <= media && media < 7)
			System.out.println("Recuperação!");
		
		if (0 <= media && media < 4.5)
			System.out.println("Reprovado!");
		
		e.close();
	}
}
