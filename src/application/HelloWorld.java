package application;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld extends HttpServlet {

  private static final Logger logger = LogManager.getLogger("Foo");
  private String username;
  
  @Override
  public void init(ServletConfig cfg) throws ServletException
  {
	  logger.info("Initializing servlet...");
      username = cfg.getServletContext().getInitParameter("username");
      
      try {
    	  throw new Exception("Something went wrong.");
      }
      catch (Exception ex) {
    	  logger.error("Oops! An error has occured! "+ ex.getMessage());
      }
      
      logger.info("Never mind, it's OK.");
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
	  // This message will not appear in the log by default, 
	  // because the Root logger level is set to "info".
	  logger.debug("GET request received.");
	  
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      out.println("<h1>Hello, " + username + "</h1>");
  }

}
