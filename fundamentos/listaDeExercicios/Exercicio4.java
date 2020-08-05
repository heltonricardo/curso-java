package fundamentos.listaDeExercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int n;
		
		System.out.print("Entre um inteiro: ");
		n = e.nextInt();
		
		System.out.println();
		System.out.println(n + " ao quadrado é: " + (int) Math.pow(n, 2));
		System.out.println(n + " ao cubo é: " + (int) Math.pow(n, 3));
		
		e.close();
	}
}
