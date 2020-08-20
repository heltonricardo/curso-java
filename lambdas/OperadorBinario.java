package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (a, b) -> (a + b) / 2;
		
		BiFunction<Double, Double, String> status = 
				(a, b) -> (a + b) / 2 >= 7 ? "Aprovado" : "Reprovado";
		
		Function<Double, String> calc = m -> m >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println(media.apply(9.8, 5.7));
		System.out.println();
				
		System.out.println(status.apply(6.8, 5.7));
		System.out.println();
		
		System.out.println(media.andThen(calc).apply(9.8, 5.7));
		System.out.println();
	}
}
