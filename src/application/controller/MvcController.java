package application.controller;

import javax.servlet.ServletContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MvcController {
    
	private static final Logger logger = LogManager.getLogger("Foo");
	
	@Autowired
	ServletContext context;
	
    @RequestMapping("/hello")
    public ModelAndView greeting() {
    	logger.info("MVC info...");
    	logger.debug("MVC debug...");
    	logger.error("MVC error...");
    	
    	String username = context.getInitParameter("username");
		ModelAndView view = new ModelAndView("HelloWorld");
		view.addObject("message", String.format("Hello %s", username));
		return view;
    }
}