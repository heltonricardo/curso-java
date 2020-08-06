package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		String entrada = new String();
		
		do {
			System.out.print("Você diz: ");
			entrada = e.nextLine();
		}
		while (!entrada.equalsIgnoreCase("sair"));
		
		System.out.println("Fim!");
		e.close();
	}
}
