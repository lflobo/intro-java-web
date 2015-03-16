package pt.lobo.java.intro.tutorial.database.mappers;

import java.util.List;

import pt.lobo.java.intro.tutorial.database.types.Cliente;

public interface ClienteMapper {

	/**
	 * @return A lista de todos os clientes
	 */
	List<Cliente> getClienteList();
	
}
