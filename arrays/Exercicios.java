package arrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];

		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double mediaAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			mediaAlunoA += notasAlunoA[i];
		}
		mediaAlunoA /= notasAlunoA.length;
		
		System.out.println(mediaAlunoA);
		
		
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double mediaAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			mediaAlunoB += notasAlunoB[i];
		}
		mediaAlunoB /= notasAlunoB.length;
		
		System.out.println(mediaAlunoB);
		
		
	}
}
