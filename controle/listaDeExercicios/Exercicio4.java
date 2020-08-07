package controle.listaDeExercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		boolean primo = true;
		Scanner e = new Scanner(System.in);
		long n = e.nextLong();
		
		
		if (n != 2 && n % 2 == 0 || n == 1)
			primo = false;
		else for (long i = 3, raiz = (long) Math.sqrt(n); primo && i < raiz; i += 2)
			if (n % i == 0) primo = false;
		
		String resp = primo ? "O valor é primo!" : "O valor não é primo!";
		
		System.out.println(resp);
		
		e.close();
	}
}
