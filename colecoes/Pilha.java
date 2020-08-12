package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		// push retorna um boolean e lança erros
		livros.push("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		// Os dois métodos são usados para a leitura do último \
		// elemento, mas quando a pilha está vazia:

		System.out.println(livros.peek()); // Retorna null
		System.out.println(livros.element()); // Lança erro
		System.out.println();

		// Os dois métodos são usados para retirar o primeiro elemento, \
		// e retornam o objeto removido, mas quando a fila está vazia:

		System.out.println(livros.poll()); // Retorna null
		System.out.println(livros.remove()); // Lança erro
		System.out.println(livros.pop()); // Lança erro

		// Outros métodos úteis:
		// fila.size()
		// fila.isEmpty()
		// fila.clear()
		// fila.contains(...)
	}
}
