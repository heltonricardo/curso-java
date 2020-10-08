package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioConsultarPessoas {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o termo de pesquisa: ");
		String pesq = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM PESSOAS WHERE NOME LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + pesq + "%");
		ResultSet resultado = stmt.executeQuery();
		
		System.out.println("Nomes encontrados:");
		while (resultado.next())
			System.out.println(
					new Pessoa(resultado.getInt("CODIGO"),
					resultado.getString("NOME")));
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
