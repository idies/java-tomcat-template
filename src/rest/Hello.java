package rest;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello World from a RESTful Jersey!";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello World from a RESTful Jersey"
				+ "</hello>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Hello World from a RESTful Jersey"
				+ "</title>" + "<body><h1>" + "Hello World from a RESTful Jersey"
				+ "</body></h1>" + "</html> ";
	}
	

	@GET
	@Path("{name}")
	public String sayHtmlHello(@PathParam("name") String name) {
		return "<html> " + "<title>" + "Hello "+name
				+ "</title>" + "<body><h1>" + "Hello "+name 
				+ "</body></h1>" + "</html> ";
	}
	
}