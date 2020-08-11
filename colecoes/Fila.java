package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		// Quando a fila possui limite de componentes \
		// as duas inserções abaixo tem comportamento diferente \
		// quando a fila está cheia:
		
		// offer apenas retorna um boolean
		System.out.println(fila.offer("Bia"));
		
		// add retorna um boolean e lança erros
		System.out.println(fila.add("Ana"));
		
		System.out.println(fila.offer("Carlos"));
		System.out.println(fila.offer("Daniel"));
		System.out.println(fila.offer("Rafaela"));
		System.out.println(fila.offer("Gui"));
		System.out.println();
		
		// Os dois métodos são usados para a leitura do primeiro \
		// elemento, mas quando a fila está vazia:
		
		System.out.println(fila.peek());    // Retorna null
		System.out.println(fila.element()); // Lança erro
		System.out.println();
		
		// Outros métodos úteis:
		// fila.size()
		// fila.isEmpty()
		// fila.clear()
		// fila.contains(...)
		
		// Os dois métodos são usados para retirar o primeiro elemento, \
		// e retornam o objeto removido, mas quando a fila está vazia:
		
		System.out.println(fila.poll());   // Retorna null
		System.out.println(fila.remove()); // Lança erro
	}
}
