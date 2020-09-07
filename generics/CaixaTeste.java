package generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		
		caixaA.guardar("Segredo!");
		
		String str = caixaA.abrir();
		
		System.out.println(str);
	}
}
