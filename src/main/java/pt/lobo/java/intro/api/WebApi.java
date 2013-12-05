package pt.lobo.java.intro.api;

import java.util.List;

import pt.lobo.java.intro.domain.Stuff;

public interface WebApi {

	/**
	 * @return A lista de todos os Stuff existentes
	 */
	List<Stuff> getStuffList();

	/**
	 * Dizer olá :-P
	 * @return Olá
	 */
	String hello();

}