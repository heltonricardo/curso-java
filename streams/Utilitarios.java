package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	// Torna Utilitarios uma interface e tira o "final" da função "grito" ou \
	// Torna o construtor privado para que ela não possa ser instanciada
	
	private Utilitarios() {
		
	}

	public final static UnaryOperator<String> maiuscula = m -> m.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra = p -> Character.toString(p.charAt(0));
	
	public final static String grito(String g) {
		return g + "!!!";
	}
}
