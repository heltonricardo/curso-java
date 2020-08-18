package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
				
		BinaryOperator<Integer> calc1 = (x, y) -> x + y;
		System.out.println(calc1.apply(2, 3));
		
		BinaryOperator<Double> calc2 = (x, y) -> x + y;
		System.out.println(calc2.apply((double) 2, 3.0));
	}
}
