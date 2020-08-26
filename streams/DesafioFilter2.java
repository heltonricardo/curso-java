package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		
		List<Produto> produtos = Arrays.asList(
				new Produto("Notebook", 3999.99, 0.4, true),
				new Produto("Mesa", 499.99, 0.25, false),
				new Produto("Mouse", 49.99, 0.1, true),
				new Produto("Teclado", 99.99, 0.35, false));
		
		Predicate<Produto> descontao = d -> d.desconto >= 0.3;
		Predicate<Produto> freteGratuito = f -> f.freteGratis;
		Function<Produto, String> grandePromocao = g -> g + " está em grande promoção!";
		Consumer<String> print = System.out::println;
		
		produtos.stream().
		filter(descontao).
		filter(freteGratuito).
		map(grandePromocao).
		forEach(print);
	}
}
