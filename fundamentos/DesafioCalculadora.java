package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		double a, b, r;
		String op;
		
		System.out.print("Valor para A ..: ");
		a = e.nextDouble();
		System.out.print("Valor para B ..: ");
		b = e.nextDouble();
		System.out.print("Operação ......: ");
		op = e.next();
		
		r = 0;
		r = op.equals("+") ? a + b : r;
		r = op.equals("-") ? a - b : r;
		r = op.equals("*") ? a * b : r;
		r = op.equals("/") ? a / b : r;
		r = op.equals("%") ? a % b : r;
		
		System.out.println("\nResposta: " + r);
		e.close();
	}
}
