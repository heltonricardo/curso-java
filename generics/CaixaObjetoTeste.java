package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double
		
		Double coisa1 = (Double) caixaA.abrir();
		System.out.println(coisa1);
		
		Integer coisa2 = (Integer) caixaA.abrir(); // Erro pois é Double
		System.out.println(coisa2);
	}
}
