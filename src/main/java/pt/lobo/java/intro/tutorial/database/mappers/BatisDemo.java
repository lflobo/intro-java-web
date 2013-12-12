package pt.lobo.java.intro.tutorial.database.mappers;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.lobo.java.intro.tutorial.database.types.Cliente;


public class BatisDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(BatisDemo.class);

	/**
	 * @NOTE:
	 * Os blocos do género:
	 * 
	 * try({code}) {
	 * }
	 * 
	 * Garantem que tudo o que é aberto em {code} (sub-classes de Closable) é fechado antes
	 * de terminar o bloco. 
	 * É a forma ideal de garantir que fechamos recursos (ex.: streams de ficheiros, sessões à bd, ...)
	 */
	
	public static void main(String[] args) {
		// Ler a configuração a partir do ficheiro BatisConfig.xml
		try(InputStream stream = BatisDemo.class.getResourceAsStream("BatisConfig.xml")) {
			
			/**
			 * Criar uma factory de SQL Sessions
			 * 
			 * Junto desta factory obteremos as sessões para executar pesquisas e queries de um modo geral
			 */
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
			
			// Iniciar uma nova sessão
			try(SqlSession session = sessionFactory.openSession()) {
				// Executar o query com o id getClienteList no mapper ClienteMapper
				List<Cliente> list = session.selectList("ClienteMapper.getClienteList");
				
				// Fazer cenas com os dados
				for(Cliente c : list)
					System.out.println("Encontrei o cliente com o id=" + c.getClienteId());
			}
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}
	
}
