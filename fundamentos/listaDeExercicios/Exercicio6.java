package fundamentos.listaDeExercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int a, b, c;
		double d, x1, x2;
		
		System.out.println("Cálculo de Bhaskara\n");
		
		System.out.print("Entre o valor de A: ");
		a = e.nextInt();

		System.out.print("Entre o valor de B: ");
		b = e.nextInt();
		
		System.out.print("Entre o valor de C: ");
		c = e.nextInt();
		
		d = b * b - 4 * a * c;
		x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
		x2 = (-b - Math.pow(d, 0.5)) / (2 * a);
		
		System.out.println();
		System.out.println("Delta = " + d);
		System.out.println("X'    = " + x1);
		System.out.println("X''   = " + x2);
		
		
		e.close();
	}
}
