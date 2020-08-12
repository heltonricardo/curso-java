package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		
		// Para o equals funcionar, o hashCode deve ser implementado
		boolean result = usuarios.contains(new Usuario("Ana"));
		
		System.out.println(result);
	}
}
