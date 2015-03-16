package pt.lobo.java.intro.tutorial.database.types;

/**
 * A classe Cliente representa o modelo da tabela maxmail_maxmailing.maxmailing_clientes 
 */
public class Cliente {

	private int clienteId;

	private String empresa;

	private String pais;

	private int servidor;

	public Cliente() {
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getServidor() {
		return servidor;
	}

	public void setServidor(int servidor) {
		this.servidor = servidor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clienteId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (clienteId != other.clienteId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", empresa=" + empresa + ", pais=" + pais + ", servidor=" + servidor + "]";
	}
	
}
