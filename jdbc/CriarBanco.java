package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String url1 = "jdbc:mysql://localhost?"; 
		final String url2 = "verifyServerCertificate=false&"; 
		final String url3 = "useSSL=true&"; 
		final String url4 = "useTimezone=true&serverTimezone=UTC"; 
		
		final String url = url1 + url2 + url3 + url4;				
		final String usuario = "root";
		final String senha = "12345";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS CURSO_JAVA");
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}
}
