package application;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HelloWorld extends HttpServlet {

  private String username;

  @Override
  public void init(ServletConfig cfg) throws ServletException
  {
      username = cfg.getServletContext().getInitParameter("username");
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      out.println("<h1>Hello, " + username + "</h1>");
  }

}