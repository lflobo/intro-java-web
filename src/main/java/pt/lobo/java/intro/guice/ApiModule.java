package pt.lobo.java.intro.guice;

import javax.inject.Named;

import pt.lobo.java.intro.api.WebApi;
import pt.lobo.java.intro.api.WebApiFileImpl;
import pt.lobo.java.intro.api.WebApiNoSqlImpl;
import pt.lobo.java.intro.api.WebApiSqlImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

/**
 * As sub-classes de AbstractModule podem ser usados como módulos do Guice.
 */
public class ApiModule extends AbstractModule {

	@Override
	protected void configure() {
		/**
		 * Dizer que a classe que implementa a WebApi Módulo é a
		 * WebApiImpl
		 */
		bind(WebApi.class).to(WebApiSqlImpl.class);
		
		/**
		 * Adicionalmente podemos dar nomes às instâncias usando a anotação @Named
		 * (ver o método getNoSqlWebApi() em baixo) ou então explicitamente
		 */
		bind(WebApi.class).annotatedWith(Names.named("File")).to(WebApiFileImpl.class);
	}
	
	/**
	 * Podemos devolver instâncias mais complexas usando um método para criar
	 * e anotanto-o com @Provides
	 * 
	 * 
	 */
	@Provides
	@Named("NoSQL")
	public WebApi getNoSqlWebApi() {
		return new WebApiNoSqlImpl();
	}

}