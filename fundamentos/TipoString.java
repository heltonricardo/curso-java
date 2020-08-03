package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.printf("Nome: %s com idade %d.", "Helton", 25);
		
		String frase = String.format("\nNome: %s com idade %d.", "Helton", 25);
		
		System.out.println(frase);
	}
}
