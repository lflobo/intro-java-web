package pt.lobo.java.intro.tutorial.database.guicemappers;

import javax.sql.DataSource;

import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;

import pt.lobo.java.intro.tutorial.database.DatabaseDemo;
import pt.lobo.java.intro.tutorial.database.types.Cliente;

import com.google.inject.Provides;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class BatisModule extends MyBatisModule {

	@Override
	protected void initialize() {
		// Definir o environment ID
		environmentId("egoi");
		
		// Definir o Transaction Manager
		bindTransactionFactoryType(JdbcTransactionFactory.class);
		
		// Fazer o bind do(s) mapper(s)
		addMapperClass(ClienteMapper.class);
		
		// Adicionar o alias para a classe Cliente
		addSimpleAlias(Cliente.class);
		
		// Definir de onde vem a DataSource
		bind(DataSource.class).toInstance(DatabaseDemo.getDataSource());
	}
	
}
