package pt.lobo.java.intro.tutorial.database.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.lobo.java.intro.tutorial.database.DatabaseDemo;


public class JdbcDemo {

	private static final Logger logger = LoggerFactory.getLogger(JdbcDemo.class);
	
	/**
	 * A stack JDBC visa conseguir uma API uniforme independemente do driver
	 * de acesso à base de dados.
	 * 
	 * Assim temos as classes essenciais:
	 *   DataSource   - materializa o acesso à base de dados e permite-nos obter Connection's sobre as quais
	 *                  podemos executar consultas/updates
	 *   Connection   - sessão de acesso à base de dados com métodos expondo os comandos standard do SQL
	 *   *Statement   - contém o query que usamos para executar o comando SQL 
	 *   ResultSet    - resultado retornado da execução de um comando SQL
	 *   SQLException - exception lançada quando acontece um erro de SQL nalgumas das classes em cima
	 */
	
	public static void main(String[] args) {
		// Criar a data source
		DataSource ds = DatabaseDemo.getDataSource();
		
		// O query que irei fazer
		String query = "select cliente_id, empresa, pais, servidor from maxmailing_clientes where cliente_id=?";
		
		// Obter uma ligação/sessão à base de dados
		try(
				Connection con = ds.getConnection();
				PreparedStatement st = con.prepareStatement(query)
			) {
			
			// Definir o valor para o placeholder - cliente_id=?
			st.setInt(1, 50);
			
			// Obter os resultados do query
			try(ResultSet rs = st.executeQuery()) {
				
				// Navegar pela lista de registos
				while(rs.next())
					System.out.println("Encontrei o cliente com o id=" + rs.getInt("cliente_id"));
			}
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
		} 
	}

}
