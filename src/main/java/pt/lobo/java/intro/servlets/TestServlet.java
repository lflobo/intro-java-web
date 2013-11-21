package pt.lobo.java.intro.servlets;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Strings;
import com.google.inject.Singleton;

@Singleton
@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {

	// Variavél estática para fazermos logging (magicamente criada pelo LoggerFactory :-P)
	private static final Logger logger = LoggerFactory.getLogger(TestServlet.class);
	
	/**
	 * O parametro req permite-nos ler os dados do request
	 * O parametro resp permite-nos escrever dados para o client
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Enviar qualquer coisa para o log
		logger.info("Incoming test request from " + req.getRemoteAddr() + "!");
		
		/**
		 * As Outpustreams são a forma que o Java fornece de 'enviar' dados para o lado do cliente.
		 */
		ServletOutputStream out = resp.getOutputStream();
		
		// Enviar uma string para o cliente
		out.println("Hello from Test Servlet!");
		
		// Tentar ler um parâmetro de request e escrever o seu valor para log
		String foo = req.getParameter("foo");
		if(!Strings.isNullOrEmpty(foo))
			logger.info("The parameter 'foo' was specified with value: " + foo);
	}
	
}
