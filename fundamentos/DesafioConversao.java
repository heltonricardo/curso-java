package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		double a, b, c, m;
		
		a = Double.parseDouble(e.nextLine().replace(',', '.'));
		b = Double.parseDouble(e.nextLine().replace(',', '.'));
		c = Double.parseDouble(e.nextLine().replace(',', '.'));
		
		m = (a + b + c) / 3;
		
		System.out.println("Média: " + m);
		
		e.close();
	}
}
