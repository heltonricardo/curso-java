package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		// Esquerda para direira
		System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0));

		// Direira para esquerda
		System.out.println(maisDois.compose(vezesDois).compose(aoQuadrado).apply(0));
	}
}
