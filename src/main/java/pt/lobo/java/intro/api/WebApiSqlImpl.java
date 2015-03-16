package pt.lobo.java.intro.api;

import java.util.List;

import pt.lobo.java.intro.domain.Stuff;

import com.google.common.collect.Lists;
import com.google.inject.Singleton;

/**
 * Todas as classes handled pelo Guice que têm a anotação @Singleton são instanciadas
 * apenas uma vez - o ideal para API's 
 */
@Singleton
public class WebApiSqlImpl implements WebApi {

	private List<Stuff> dummyStuff = Lists.newArrayList(
		new Stuff(1, "Stuff 1"),
		new Stuff(2, "Stuff 2"),
		new Stuff(3, "Stuff 3"),
		new Stuff(4, "Stuff 4")
	);
	
	@Override
	public List<Stuff> getStuffList() {
		return dummyStuff;
	}

	@Override
	public String hello() {
		return "Hello Sql Impl!";
	}

}