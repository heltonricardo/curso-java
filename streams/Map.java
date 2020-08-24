package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		List<String> marcas = Arrays.asList("bmw", "audi", "honda");
		
		marcas.forEach(print);
		System.out.println();
		
		marcas.stream().map(e -> e.toUpperCase()).forEach(print);
		System.out.println();
		
		UnaryOperator<String> maiuscula = m -> m.toUpperCase();
		// UnaryOperator<String> primeiraLetra = p -> Character.toString(p.charAt(0));
		// UnaryOperator<String> grito = g -> g + "!!!";
		
		marcas.stream().map(maiuscula).
			map(Utilitarios.primeiraLetra).
			map(Utilitarios::grito).forEach(print);
	}
}
