package jdbc;

import java.util.Arrays;
import java.util.List;

public class TesteDAO {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO PESSOAS (NOME) VALUES (?)";
		
		List<String> pessoas = Arrays.asList(
				"André Vitor Corte Real",
				"Kaique Vitor Bernardo das Neves",
				"Luzia Joana Kamilly Cardoso",
				"Beatriz Sônia Alícia Martins",
				"Juan Cauê Novaes",
				"Raquel Heloisa Francisca Barbosa",
				"Maya Julia Jaqueline Cavalcanti",
				"Lucas Julio Paulo Teixeira",
				"Thales Lucas Luís Corte Real",
				"Tomás Juan Nunes",
				"Filipe Gustavo Caleb Melo",
				"Nicole Olivia Caldeira",
				"Camila Maya Aparício",
				"Ana Esther das Neves",
				"Cláudia Fabiana Gabrielly Santos",
				"Emanuelly Manuela Fernandes",
				"Filipe Fábio Kevin Porto",
				"Oliver Martin Noah Moraes",
				"José Gustavo Joaquim Figueiredo",
				"Vanessa Luiza Isabelly Corte Real",
				"Ruan Márcio Heitor Nogueira",
				"Malu Jennifer Sophia Corte Real",
				"Olivia Rafaela Adriana Assunção",
				"Camila Andreia Figueiredo",
				"Mariana Alícia Martins",
				"Samuel Murilo Assis",
				"Samuel Guilherme Severino Fernandes",
				"Amanda Giovanna Baptista",
				"Antonio Pietro Pinto",
				"Giovanna Stefany Santos");
		
		for (String pessoa : pessoas)
			System.out.println(dao.incluir(sql, pessoa));
		
		dao.close();
	}
}
