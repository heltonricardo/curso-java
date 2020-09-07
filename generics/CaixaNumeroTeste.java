package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		// Erro: CaixaNumero<String> caixaA = new CaixaNumero<>() \
		// pois String não herda de Number, como Integer, Double e Float
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(12.3);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(123);
		System.out.println(caixaB.abrir());
	}
}
