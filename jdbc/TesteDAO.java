package jdbc;

import java.util.Arrays;
import java.util.List;

public class TesteDAO {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO PESSOAS (NOME) VALUES (?)";
		
		List<String> pessoas = Arrays.asList(
				"Andr� Vitor Corte Real",
				"Kaique Vitor Bernardo das Neves",
				"Luzia Joana Kamilly Cardoso",
				"Beatriz S�nia Al�cia Martins",
				"Juan Cau� Novaes",
				"Raquel Heloisa Francisca Barbosa",
				"Maya Julia Jaqueline Cavalcanti",
				"Lucas Julio Paulo Teixeira",
				"Thales Lucas Lu�s Corte Real",
				"Tom�s Juan Nunes",
				"Filipe Gustavo Caleb Melo",
				"Nicole Olivia Caldeira",
				"Camila Maya Apar�cio",
				"Ana Esther das Neves",
				"Cl�udia Fabiana Gabrielly Santos",
				"Emanuelly Manuela Fernandes",
				"Filipe F�bio Kevin Porto",
				"Oliver Martin Noah Moraes",
				"Jos� Gustavo Joaquim Figueiredo",
				"Vanessa Luiza Isabelly Corte Real",
				"Ruan M�rcio Heitor Nogueira",
				"Malu Jennifer Sophia Corte Real",
				"Olivia Rafaela Adriana Assun��o",
				"Camila Andreia Figueiredo",
				"Mariana Al�cia Martins",
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
