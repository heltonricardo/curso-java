package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAtualizarPessoa {

public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM PESSOAS";
		Statement todos = conexao.createStatement();
		ResultSet resultado = todos.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while (resultado.next()) {
			int codigo = resultado.getInt("CODIGO");
			String nome = resultado.getString("NOME");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		System.out.println("Listagem atual:");
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.getNome());
		
		System.out.print("\nInsira o nome que será alterado: ");
		String pesq = entrada.nextLine();
		System.out.print("Alterar para: ");
		String novo = entrada.nextLine();
		
		sql = "UPDATE PESSOAS SET NOME = ? WHERE NOME = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, novo);
		stmt.setString(2, pesq);
		stmt.execute();
		
		pessoas.clear();
		sql = "SELECT * FROM PESSOAS";
		todos = conexao.createStatement();
		resultado = todos.executeQuery(sql);
		
		while (resultado.next()) {
			int codigo = resultado.getInt("CODIGO");
			String nome = resultado.getString("NOME");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		System.out.println("\nNova listagem:");
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.getNome());
		
		todos.close();
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
