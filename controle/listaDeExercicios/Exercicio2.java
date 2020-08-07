package controle.listaDeExercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		System.out.print("Entre o ano: ");
		int ano = e.nextInt();
		
		if (ano % 400 == 0 || ((ano % 4 == 0) && (ano % 100 != 0)))
			System.out.println(ano + " é um ano bissexto");
		else
			System.out.println(ano + " não é um ano bissexto");
			
		e.close();
	}
}
