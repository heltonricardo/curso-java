package controle.listaDeExercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		Random aleat = new Random();
		boolean flag = false;
		
		int n = aleat.nextInt(101);
		
		System.out.println("Jogo da adivinha��o");
		
		for (int i = 10; !flag && i > 0; --i) {			
			System.out.println("\nVoc� ainda tem " + i + " chance(s)!");
			System.out.print("Tente adivinhar o valor: ");
			int v = e.nextInt();
			
			if (v > n)
				System.out.println("Errou, tente um n�mero menor!");
			else if (v < n)
				System.out.println("Errou, tente um n�mero maior!");
			else
				flag = true;
		}
		
		String resp = flag ? "Voc� venceu!" : "Voc� Perdeu!"; 
		System.out.println("\nO jogo acabou! " + resp);
		
		e.close();
	}
}