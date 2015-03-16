package pt.lobo.java.intro.api;

import java.util.List;

import pt.lobo.java.intro.domain.Stuff;

import com.google.common.collect.Lists;
import com.google.inject.Singleton;

@Singleton
public class WebApiFileImpl implements WebApi {

	private List<Stuff> dummyStuff = Lists.newArrayList(
		new Stuff(1, "File Stuff 1"),
		new Stuff(2, "File Stuff 2"),
		new Stuff(3, "File Stuff 3"),
		new Stuff(4, "File Stuff 4")
	);
	
	@Override
	public List<Stuff> getStuffList() {
		return dummyStuff;
	}

	@Override
	public String hello() {
		return "Hello File Impl!";
	}

}