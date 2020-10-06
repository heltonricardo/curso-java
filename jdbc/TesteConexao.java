package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		final String url1 = "jdbc:mysql://localhost:3306?"; 
		// o :3306 é opcional pois é a porta padrão
		final String url2 = "verifyServerCertificate=false&"; 
		final String url3 = "useSSL=true&"; 
		final String url4 = "useTimezone=true&serverTimezone=UTC"; 
		
		final String url = url1 + url2 + url3 + url4;				
		final String usuario = "root";
		final String senha = "12345";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}
}
