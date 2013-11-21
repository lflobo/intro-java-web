package pt.lobo.java.intro.guice;

import pt.lobo.java.intro.servlets.TestServlet;

import com.google.inject.servlet.ServletModule;

public class ServerModule extends ServletModule {

	@Override
	protected void configureServlets() {
		serve("/test").with(TestServlet.class);
	}
	
}
