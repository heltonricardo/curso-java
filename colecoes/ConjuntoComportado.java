package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<String>();
		// ou Set<String> lista = new HashSet<>() pois já definiu na esquerda
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String nome: listaAprovados)
			System.out.println(nome);
		
		System.out.println();
		
		// Para manter a ordem de inserção usamos LinkedHashSet:
		Set<Integer> nums = new LinkedHashSet<>();
		
		nums.add(5);
		nums.add(7);
		nums.add(3);
		nums.add(9);
		
		System.out.println(nums);
	}
}
