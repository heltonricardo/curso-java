package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 6.8);
		Aluno a4 = new Aluno("Gui", 9.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		alunos.stream().
			filter(p -> p.nota >= 7).
			map(m -> "Parabéns, " + m + "! Você passou!").
			forEach(System.out::println);
		
		// Dependendo do caso é aconselhável criar Lambda Expressions para \
		// reutilizar em outras partes do código. Nesse caso seria criada uma \
		// do tipo Predicate e uma do tipo BinaryOperator, respectivamente.
	}
}
