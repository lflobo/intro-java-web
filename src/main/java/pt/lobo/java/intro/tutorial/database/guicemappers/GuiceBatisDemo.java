package pt.lobo.java.intro.tutorial.database.guicemappers;

import pt.lobo.java.intro.tutorial.database.types.Cliente;

import com.google.inject.Guice;
import com.google.inject.Inject;

public class GuiceBatisDemo {

	// O mapper é injetado na classe
	@Inject ClienteMapper mapper;
	
	public GuiceBatisDemo() {
		// Carregar o módulo do Guice e injectar a classe atual
		Guice.createInjector(new BatisModule()).injectMembers(this);
		
		// executar a consulta
		Cliente c = mapper.getCliente(50);
		
		// Fazer cenas...
		System.out.println("Encontrei o cliente com o id=" + c.getClienteId());
	}
	
	public static void main(String[] args) {
		new GuiceBatisDemo();
	}
	
}
