package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		String conceito = "";
		
		System.out.print("Insira a nota [0-10]: ");
		int nota = e.nextInt();
		
		switch (nota) {
			case 10: case 9:
				conceito = "A";
				break;
			case 8: case 7:
				conceito = "B";
				break;
			case 6: case 5:
				conceito = "C";
				break;
			case 4: case 3:
				conceito = "D";
				break;
			case 2: case 1: case 0:
				conceito = "E";
				break;
			default:
				conceito = "N�o encontrado";
		}
		
		System.out.println("Conceito: " + conceito);
	}
}
