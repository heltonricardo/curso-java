package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		try {
			System.out.println(7 / e.nextInt());
			
		} catch (Exception x) {
			System.out.println(x.getMessage());
		
		// Finally sempre � executado, entrando no catch ou n�o
		} finally {
			System.out.println("Entrou no finally...");
			e.close();
		}
		
		System.out.println("Fim");
	}
}
