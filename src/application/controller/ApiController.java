package application.controller;

import javax.servlet.ServletContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Message;

@RestController
public class ApiController {

    private static final Logger logger = LogManager.getLogger("Foo");
     
    @Autowired
    ServletContext context;

    @RequestMapping("/api/hello")
    public Message greeting() {
        logger.info("API info...");
        logger.debug("API debug...");
        logger.error("API error...");
        
        String username = context.getInitParameter("username");
        return new Message(String.format("Hello %s", username));
    }
}
