package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		
		String parcial = media >= 5 ? "em recupera��o" : " reprovado";
		String resultado = media >= 7 ? "aprovado" : parcial;
		
		System.out.println("O aluno est� " + resultado);
	}
}
