package pt.lobo.java.intro.tutorial.guice;

import javax.inject.Named;

import pt.lobo.java.intro.api.WebApi;
import pt.lobo.java.intro.guice.ApiModule;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


/**
 * - O Guice permite fazer uma gestão 'sóbria' e simples das Instâncias dos nossos objetos
 * - Os objetos são configurados numa classe Wrapper denominada de Module que faz extend de com.google.inject.AbstractModule
 * - Ao iniciar o nosso programa (contexto) criamos um injetor com base no(s) nosso(s) Module(s)
 * - Para utilizar as instâncias basta 'injetá-las' com a annotation @Inject
 * 
 * Para ver mais tarde:
 * - https://www.youtube.com/watch?v=hBVJbzAagfs
 */

public class GuiceTutorial {

	@Inject WebApi apiSql;
	@Inject @Named("NoSQL") WebApi apiNoSql;
	@Inject @Named("File") WebApi apiFile;
	
	@Inject MyWorker worker;
	
	public GuiceTutorial() {
		/**
		 * O Guice encarega-se de inicializar todas as dependências e hierarquia de classes.
		 * Para isso precisamos de criar um injector e começar por injetar a classe que tem
		 * o main(...)
		 */
		
		// Criar o Injector
		Injector injector = Guice.createInjector(new ApiModule());
		
		// Injectar as dependências na classe atual
		injector.injectMembers(this);
	}
	
	private void run() {
		// Usando a API versão SQL
		System.out.println(apiSql.getStuffList());

		// Usando a API versão NoSQL
		System.out.println(apiNoSql.getStuffList());

		// Usando a API versão File
		System.out.println(apiFile.getStuffList());
		
		// Usar a classe Worker
		worker.run();
	}

	// Executable
	public static void main(String[] args) {
		new GuiceTutorial().run();
	}

}
