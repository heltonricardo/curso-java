package lambdas;

import java.util.List;
import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional:");
		for (String nome: aprovados)
			System.out.println(nome);
		System.out.println();
		
		System.out.println("Forma lambda #1:");
		aprovados.forEach((nome) -> { System.out.println(nome + " #1"); });
		System.out.println();

		System.out.println("Forma lambda #2:");
		aprovados.forEach((nome) -> System.out.println(nome + " #2"));
		System.out.println();

		System.out.println("Forma lambda #3:");
		aprovados.forEach((nome) -> meuImprimir(nome));
		System.out.println();
		
		System.out.println("Method Reference #1:");
		aprovados.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Method Reference #2:");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Nome: " + nome);
	}
}
