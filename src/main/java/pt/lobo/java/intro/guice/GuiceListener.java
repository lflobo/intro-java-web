package pt.lobo.java.intro.guice;

import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceListener extends GuiceServletContextListener implements HttpSessionListener {

	private static final Logger logger = LoggerFactory.getLogger(GuiceListener.class);
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		if(logger.isDebugEnabled())
			logger.debug("Session created: " + se.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		if(logger.isDebugEnabled())
			logger.debug("Session destroyed: " + se.getSession().getId());
	}

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServerModule());
	}
	
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		/**
		 * Fazer cenas de inicialização aqui
		 */
		
		logger.info("Starting IntroJ Web App");
		
		super.contextInitialized(servletContextEvent);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		/**
		 * Fazer cenas de fecho aqui
		 */
		
		super.contextDestroyed(servletContextEvent);
	}
	
}
