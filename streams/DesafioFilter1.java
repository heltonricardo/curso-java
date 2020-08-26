package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {

	public static void main(String[] args) {
		
		List<Figura> figuras = Arrays.asList(
				new Figura(1, 2, 3), new Figura(3, 3, 3),
				new Figura(3, 4, 9), new Figura(6, 5, 3),
				new Figura(4, 4, 5), new Figura(5, 5, 5),
				new Figura(8, 1, 0), new Figura(4, 5, 6));
		
		Predicate<Figura> isTriangulo = f ->
			f.lado1 < f.lado2 + f.lado3 &&
		    f.lado2 < f.lado1 + f.lado3 &&
		    f.lado3 < f.lado1 + f.lado2;
			
		Predicate<Figura> isEscaleno = f ->
			f.lado1 != f.lado2 && f.lado2 != f.lado3;
			
		Function<Figura, String> descricao = f ->
			"A figura " + f + " é um triângulo escaleno!";
			
		Consumer<String> print = System.out::println;
			
		figuras.stream().
		filter(isTriangulo).
		filter(isEscaleno).
		map(descricao).
		forEach(print);
	}
}
