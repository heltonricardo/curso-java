package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		// Quando a fila possui limite de componentes \
		// as duas inser��es abaixo tem comportamento diferente \
		// quando a fila est� cheia:
		
		// offer apenas retorna um boolean
		System.out.println(fila.offer("Bia"));
		
		// add retorna um boolean e lan�a erros
		System.out.println(fila.add("Ana"));
		
		System.out.println(fila.offer("Carlos"));
		System.out.println(fila.offer("Daniel"));
		System.out.println(fila.offer("Rafaela"));
		System.out.println(fila.offer("Gui"));
		System.out.println();
		
		// Os dois m�todos s�o usados para a leitura do primeiro \
		// elemento, mas quando a fila est� vazia:
		
		System.out.println(fila.peek());    // Retorna null
		System.out.println(fila.element()); // Lan�a erro
		System.out.println();
		
		// Outros m�todos �teis:
		// fila.size()
		// fila.isEmpty()
		// fila.clear()
		// fila.contains(...)
		
		// Os dois m�todos s�o usados para retirar o primeiro elemento, \
		// e retornam o objeto removido, mas quando a fila est� vazia:
		
		System.out.println(fila.poll());   // Retorna null
		System.out.println(fila.remove()); // Lan�a erro
	}
}
