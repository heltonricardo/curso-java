package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a = null;
		try {			
			imprimirNomeDoAluno(a);
		}
		catch (Exception e) {
			System.out.println("Erro ao imprimir nome do usu�rio!");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		System.out.println("Fim!");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
