package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		String entrada = new String();
		
		while (!entrada.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			entrada = e.nextLine();
		}
		
		System.out.println("Fim!");
		e.close();
	}
}
