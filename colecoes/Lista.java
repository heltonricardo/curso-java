package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		// Quando mandamos imprimir um objeto, ele usará o método toString
		
		for (Usuario u: lista)
			System.out.println(u);
		System.out.println();
		
		System.out.println(lista.get(3).nome);
		System.out.println();
		
		// Remoção pelo índice retorna o objeto
		System.out.println("Removido: " + lista.remove(1));
		// Remoção por objeto retorna boolean
		System.out.println("Removido: " + lista.remove(new Usuario("Lia")));
		System.out.println();
		
		System.out.println("Tem? " + lista.contains(new Usuario("Manu")));
		System.out.println();

		for (Usuario u: lista)
			System.out.println(u.nome);
	}
}
