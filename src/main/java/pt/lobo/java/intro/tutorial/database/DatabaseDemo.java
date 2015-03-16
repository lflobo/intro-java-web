package pt.lobo.java.intro.tutorial.database;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DatabaseDemo {

	public static DataSource getDataSource() {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("xpto123");
		ds.setServerName("localhost");
		ds.setDatabaseName("maxmail_maxmailing");
		return ds;
	}
	
	
}
