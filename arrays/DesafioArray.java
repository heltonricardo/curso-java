package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Quantidade de notas: ");
		int n = e.nextInt();
		
		double[] notas = new double[n];
		
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Entre a %dª nota: ", i + 1);
			notas[i] = e.nextDouble();
		}
		
		double media = 0;
		for (double d : notas)
			media += d;
		media /= notas.length;
		
		System.out.println("\nNotas: " + Arrays.toString(notas));
		System.out.printf("Média: %.2f", media);
		
		e.close();
	}
}
