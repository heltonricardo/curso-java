package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.print("Insira o nome: ");
		String nome = entrada.nextLine();
		
		String sql = "INSERT INTO PESSOAS (NOME) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Pessoa inclu�da com sucesso!");
		entrada.close();
	}
}
