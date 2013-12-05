package pt.lobo.java.intro.guice;

import pt.lobo.java.intro.servlets.TestServlet;

import com.google.inject.servlet.ServletModule;

/**
 * As sub-classes de ServletModule (que por sua vez herda de AbstractModule) podem ser usadas num
 * ambiente web, expondo as facetas mais importantes das aplicações Web Java, nomeadamente:
 * - Servlet Mapping
 * - Filter Mapping
 */
public class ServerModule extends ServletModule {

	@Override
	protected void configureServlets() {
		
		/**
		 * Fazer o Mapa da servlet TestServlet à url /test
		 */
		serve("/test").with(TestServlet.class);
	}
	
}
