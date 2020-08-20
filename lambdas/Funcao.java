package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par" : "Ímpar";
		
		Function<String, String> oResultadoE = str -> "O resultado é: " + str;
		
		Function<String, String> empolgado = str -> str + "!!!";
		
		System.out.println(parOuImpar.apply(10));
		System.out.println(parOuImpar.apply(11));

		System.out.println(parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(12));
	}
}
