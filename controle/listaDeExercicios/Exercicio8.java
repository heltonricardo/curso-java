package controle.listaDeExercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		System.out.print("Entre uma palavra: ");
		String word = e.next();
		System.out.println();
		
		for (int i = 0; i < word.length(); ++i)
			System.out.println(word.charAt(i));
		
		System.out.println("\nFim!");
		e.close();
	}
}
