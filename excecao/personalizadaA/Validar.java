package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

	private Validar() {}
	
	public static void aluno(Aluno aluno) {
		
		if (aluno == null)
			throw new IllegalArgumentException("Aluno nulo!");
		
		if (aluno.nome == null || aluno.nome.trim().isEmpty())
			throw new StringVaziaException("nome");
		
		if (aluno.nota < 0 || 10 < aluno.nota)
			throw new NumeroForaDoIntervaloException("nota");
	}
}
