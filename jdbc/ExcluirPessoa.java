package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Lista atual de pessoas:");
		consultaSimples(conexao);
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nEntre o ID para excluir: ");
		int num = entrada.nextInt();
		
		String sql = "DELETE FROM PESSOAS WHERE CODIGO = ?";
		PreparedStatement remocao = conexao.prepareStatement(sql);
		remocao.setInt(1, num);
		
		if (remocao.executeUpdate() != 0)
			System.out.println("Pessoa excluída!");
		else
			System.out.println("Pessoa não encontrada!");
		
		System.out.println("\nNova lista de pessoas:");
		consultaSimples(conexao);
		
		entrada.close();
		remocao.close();
		conexao.close();
	}
	
	private static void consultaSimples(Connection conexao) throws SQLException {
		
		String sql = "SELECT * FROM PESSOAS";
		ResultSet retorno = conexao.createStatement().executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<>();
		
		while (retorno.next())
			pessoas.add(new Pessoa(retorno.getInt(1), retorno.getString(2)));
		
		retorno.close();		
		pessoas.stream().forEach(System.out::println);
	}
}
