package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (a, b) -> a + b;
		
		// Sem identidade (valor inicial):
		System.out.println(nums.stream().reduce(soma).get());
		
		// Com identidade:
		System.out.println(nums.stream().reduce(100, soma));
		
		// Usando Stream Paralela a identidade é passada para cada chamada:
		System.out.println(nums.parallelStream().reduce(soma).get());
		System.out.println(nums.parallelStream().reduce(100, soma));
		
		System.out.println("\n***\n");
		
		// O retorno do reduce sem valor inicial pode ser null, portanto \
		// é mais seguro atribuir o resultado a um objeto da classe Integer.
		// Integer a = a.stream().reduce(n).get()
		
		// Já o reduce com valor inicial pode ser atribuído a um int primitivo \ 
		// sem a necessidade de, ao final, usar o .get() para capturar o valor.
		// int a = a.stream().reduce(0, n)
		
		System.out.print("Com filtro >  1: ");
		nums.stream()
			.filter(f -> f > 1)
			.reduce(soma)
			.ifPresent(System.out::println);
		
		System.out.print("Com filtro >  5: ");
		nums.stream()
			.filter(f -> f > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
		System.out.print("Com filtro > 10: ");
		nums.stream()
			.filter(f -> f > 10)
			.reduce(soma)
			.ifPresent(System.out::println);
		System.out.println();
		
		// Erro pois o retorno não possui valor:
		System.out.print("Com filtro > 10 sem ifPresent: ");
		System.out.println(nums.stream()
		.filter(f -> f > 10)
		.reduce(soma).get());
	}
}
