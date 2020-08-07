package controle.listaDeExercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int maior = 0, valor;
		
		System.out.println("Entre 10 valores e direi qual é o maior!\n");
		
		for (int i = 1; i <= 10; ++i) {
			System.out.print("Entre o " + i + "º valor: ");
			valor = e.nextInt();
			
			if (i == 1 || valor > maior)
				maior = valor;
			
		}
		
		System.out.println("\nMaior valor: " + maior);
		e.close();
	}
}
