package controle.listaDeExercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
			
		int primo = 1;
		Scanner e = new Scanner(System.in);
		long n = e.nextLong();
		
		if (n != 2 && n % 2 == 0 || n == 1)
			primo = 0;
		else for (long i = 3, raiz = (long) Math.sqrt(n); primo == 1 && i < raiz; i += 2)
			if (n % i == 0) primo = 0;
		
		String resp = "";
		
		switch (primo) {
			case 0:
				resp = "O valor não é primo!";
				break;
			case 1:
				resp = "O valor é primo!";
				break;
		}
		
		System.out.println(resp);
		e.close();
	}
}
