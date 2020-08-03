package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.printf("%s, %s%d. ", "Olá", "Helton", 13);
		System.out.print("Bom ");
		System.out.println("dia!");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		entrada.close();
		
		System.out.println("Nome inserido: " + nome);
		
	}
}
