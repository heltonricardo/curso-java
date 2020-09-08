package generics;

public class ParesTestes {

	public static void main(String[] args) {
		
		Pares<Integer, String> lista = new Pares<>();
		
		lista.adicionar(1, "Maria");
		lista.adicionar(2, "Pedro");
		lista.adicionar(3, "Gui");
		lista.adicionar(4, "Ana");
		
		lista.adicionar(2, "Rebeca");
		
		System.out.println(lista.getValor(1));
		System.out.println(lista.getValor(4));
		System.out.println(lista.getValor(2));
	}
}
