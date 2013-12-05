package pt.lobo.java.intro.tutorial.guice;

import pt.lobo.java.intro.api.WebApi;

import com.google.inject.Inject;

/**
 * A classe worker, apesar de não ser bind() explicitamente no nosso
 * guice module, pode usar a infra-estrutura do Guice desde que também
 * ela seja injetada algures (ex.: {@link GuiceTutorial})
 */
public class MyWorker {

	private WebApi api;

	/**
	 * Podemos injetar objectos no construtor das nossas classes
	 */
	@Inject
	public MyWorker(WebApi api) {
		this.api = api;
	}
	
	public void run() {
		System.out.println("From Worker class, api says: " + api.hello());
	}
	
}
