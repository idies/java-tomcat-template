package rest;

import java.net.URL;
import java.net.URLEncoder;

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
		return message(MediaType.TEXT_PLAIN,"World");
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return message(MediaType.TEXT_XML,"World");
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return message(MediaType.TEXT_HTML,"World");
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJsonHello() {
		return message(MediaType.APPLICATION_JSON,"World");
	}
	

	@GET
	@Path("{name}")
	public String sayHtmlHello(@PathParam("name") String name) {
		return message(MediaType.TEXT_HTML,name);
	}
	private String message(String mime, String _name) {
		
		String name=_name;
		try {
			URLEncoder.encode(_name,"UTF-8");
		} catch(Exception e){
			name = _name;
		}
		if(MediaType.TEXT_XML.equals(mime)){
			return String.format("<?xml version=\"1.0\"?>" + "<hello> Hello %s from a RESTful Jersey"
					+ "</hello>",name);
		} else if(MediaType.TEXT_HTML.equals(mime)){
			return 	String.format("<html> <title>Hello %s</title>"+
		                "<body><h1>Hello %s</body></h1></html> ",name,name);
		} else if(MediaType.APPLICATION_JSON.equals(mime)){
			return 	String.format("{\"message\":\"%s\"} ",name);
		} else {
			return String.format("Hello %s from a RESTful Jersey!",name);
		}
	}
}