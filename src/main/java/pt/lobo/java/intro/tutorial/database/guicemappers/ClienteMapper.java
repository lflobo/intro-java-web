package pt.lobo.java.intro.tutorial.database.guicemappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pt.lobo.java.intro.tutorial.database.types.Cliente;

public interface ClienteMapper {

	/**
	 * @return A lista de todos os clientes
	 */
	List<Cliente> getClienteList();
	
	/**
	 * Obter um cliente
	 * @param id O ID do cliente
	 * @return O cliente se existir
	 */
	Cliente getCliente(@Param("id") int id);
}
