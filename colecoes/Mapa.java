package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		// Adiciona se chave não existe e substitui caso exista
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo");
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebeca");
		usuarios.put(4, "Rosana");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println();
		
		System.out.println(usuarios.containsKey(5));
		System.out.println(usuarios.containsValue("Rafaela"));
		System.out.println();
		
		System.out.println(usuarios.get(4));
		System.out.println();
		System.out.println("Remove: " + usuarios.remove(3));
		System.out.println("Remove: " + usuarios.remove(1, "Teste"));
		
		
		for (int n: usuarios.keySet())
			System.out.print(n + " ");
		System.out.println("\n");
		
		for (String s: usuarios.values())
			System.out.print(s + " ");
		System.out.println("\n");
		
		for (Entry<Integer, String> m: usuarios.entrySet())
			System.out.printf("O id %d pertence a %s\n", m.getKey(), m.getValue());
	}
}
