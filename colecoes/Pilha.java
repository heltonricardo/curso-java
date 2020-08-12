package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		// push retorna um boolean e lan�a erros
		livros.push("O Pequeno Pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		// Os dois m�todos s�o usados para a leitura do �ltimo \
		// elemento, mas quando a pilha est� vazia:

		System.out.println(livros.peek()); // Retorna null
		System.out.println(livros.element()); // Lan�a erro
		System.out.println();

		// Os dois m�todos s�o usados para retirar o primeiro elemento, \
		// e retornam o objeto removido, mas quando a fila est� vazia:

		System.out.println(livros.poll()); // Retorna null
		System.out.println(livros.remove()); // Lan�a erro
		System.out.println(livros.pop()); // Lan�a erro

		// Outros m�todos �teis:
		// fila.size()
		// fila.isEmpty()
		// fila.clear()
		// fila.contains(...)
	}
}
