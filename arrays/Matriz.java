package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Quantidade de alunos: ");
		int qAlunos = e.nextInt();
		
		System.out.print("Quantidade de notas por aluno: ");
		int qNotas = e.nextInt();
		
		double[][] dados = new double[qAlunos][qNotas];
		
		System.out.println();
		
		for (int i = 0; i < qAlunos; i++) {
			for (int j = 0; j < qNotas; j++) {
				System.out.printf("Insira a %dª nota do %dº aluno: ", j + 1, i + 1);
				dados[i][j] = e.nextDouble();
			}
			System.out.println();
		}
		
		double soma = 0;
		for (double[] ds : dados)
			for (double ds2 : ds)
				soma += ds2;
		soma /= qAlunos * qNotas;
		
		System.out.printf("Média da turma: %.2f\n", soma);
		
		e.close();
	}
}
