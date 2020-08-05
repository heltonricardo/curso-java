package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		double a, b, r;
		char op;
		
		a = e.nextDouble();
		b = e.nextDouble();
		op = e.next().charAt(0);
		
		r = 0;
		r = op == '+' ? a + b : r;
		r = op == '-' ? a - b : r;
		r = op == '*' ? a * b : r;
		r = op == '/' ? a / b : r;
		r = op == '%' ? a % b : r;
		
		System.out.println("Resposta: " + r);
		e.close();
	}
}
