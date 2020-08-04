package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		
		String parcial = media >= 5 ? "em recuperação" : " reprovado";
		String resultado = media >= 7 ? "aprovado" : parcial;
		
		System.out.println("O aluno está " + resultado);
	}
}
