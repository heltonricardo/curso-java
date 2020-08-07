package controle.listaDeExercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		Random aleat = new Random();
		boolean flag = false;
		
		int n = aleat.nextInt(101);
		
		System.out.println("Jogo da adivinhação");
		
		for (int i = 10; !flag && i > 0; --i) {			
			System.out.println("\nVocê ainda tem " + i + " chance(s)!");
			System.out.print("Tente adivinhar o valor: ");
			int v = e.nextInt();
			
			if (v > n)
				System.out.println("Errou, tente um número menor!");
			else if (v < n)
				System.out.println("Errou, tente um número maior!");
			else
				flag = true;
		}
		
		String resp = flag ? "Você venceu!" : "Você Perdeu!"; 
		System.out.println("\nO jogo acabou! " + resp);
		
		e.close();
	}
}