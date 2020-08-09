package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		double media = 0;
		for (double d : notas) {
			media += d;
		}
		media /= notas.length;
		
		System.out.println(media);
	}
}
