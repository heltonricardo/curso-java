package controle.listaDeExercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int soma = 0;
		int valor = 0;
		
		while (true) {
			
			System.out.println("Soma acumulada: " + soma);
			System.out.print("Entre um valor natural para somar ou negativo para acabar: ");
			valor = e.nextInt();
			
			if (valor >= 0) {
				soma += valor;
			}
			else break;
		}
		
		System.out.println("Fim do programa!");
		e.close();
	}
}
