package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM PESSOAS";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
			
		while (resultado.next()) {
			int codigo = resultado.getInt("CODIGO");
			String nome = resultado.getString("NOME");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa);
		
		stmt.close();
		conexao.close();
	}
}
