package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConexao() {
		final String url1 = "jdbc:mysql://localhost?"; 
		final String url2 = "verifyServerCertificate=false&"; 
		final String url3 = "useSSL=true&"; 
		final String url4 = "useTimezone=true&serverTimezone=UTC"; 
		
		final String url = url1 + url2 + url3 + url4;				
		final String usuario = "root";
		final String senha = "12345";
		
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
