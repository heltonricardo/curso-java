package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = n -> n % 2 == 0;
		Predicate<Integer> isTresDigitos = n -> 100 <= n && n <= 999;
		
		System.out.println(isPar.and(isTresDigitos).test(50));
		System.out.println(isPar.and(isTresDigitos).test(105));
		System.out.println(isPar.and(isTresDigitos).test(150));
		System.out.println(isPar.and(isTresDigitos).negate().test(150));
		System.out.println(isPar.or(isTresDigitos).test(105));
		
	}
}
