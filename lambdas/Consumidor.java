package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = prod -> System.out.println(prod.nome + " " + prod.preco);
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Caneta", 5.89, 0.1));
		lista.add(new Produto("Borracha", 2.15, 0.15));
		
		lista.forEach(imprimir);
		System.out.println();
		
		lista.forEach(p -> System.out.println(p.desconto));
		System.out.println();
		
		lista.forEach(System.out::println);
	}
}
