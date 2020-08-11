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
		
		// Quando mandamos imprimir um objeto, ele usar� o m�todo toString
		
		for (Usuario u: lista)
			System.out.println(u);
		System.out.println();
		
		System.out.println(lista.get(3)); 
	}
}
