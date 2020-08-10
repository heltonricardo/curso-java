package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// N�o armazena tipos primitivos, somente objetos, ent�o converte automaticamente:
		conjunto.add('A');  // char para Character
		conjunto.add(true); // bool para Boolean
		conjunto.add(1);    // int para Integer
		conjunto.add(1.5);  // double para Double
		conjunto.add("Teste"); 
		
		System.out.println(conjunto);
		System.out.println("Tamanho: " + conjunto.size());
		System.out.println();
		
		conjunto.add(1);    // int para Integer
		System.out.println(conjunto);
		System.out.println("Tamanho: " + conjunto.size());
		System.out.println();
		
		System.out.println("Removeu? " + conjunto.remove(2));
		System.out.println(conjunto);
		System.out.println("Tamanho: " + conjunto.size());
		System.out.println();
		
		System.out.println("Removeu? " + conjunto.remove(1));
		System.out.println(conjunto);
		System.out.println("Tamanho: " + conjunto.size());
		System.out.println();
		
		System.out.println("Cont�m A? " + conjunto.contains('A'));
		System.out.println("Cont�m B? " + conjunto.contains('B'));
		System.out.println("\n--------------\n");
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println();
		
		conjunto.addAll(nums); // Uni�o de conjuntos
		System.out.println(conjunto);
		System.out.println();
		
		conjunto.retainAll(nums); // Intersec��o de conjuntos
		System.out.println(conjunto);
		System.out.println();
		
		conjunto.clear(); // Intersec��o de conjuntos
		System.out.println(conjunto);
		System.out.println();
	}
}
