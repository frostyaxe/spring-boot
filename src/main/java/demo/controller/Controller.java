package demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.service.Service;

@RestController
public class Controller
{
		
	@RequestMapping("/rest/api/{message}")   ///// {message} is the path variable that holds the value provided in the REST URL
	public String getGreetings( @PathVariable( name = "message" ) String messageString )    // @PAthVariable stores the value pased from the rest url into the Java variable.
																							// Name value must be same as the paath variable name in the request mapping url
	{
		
		
		return new Service().getUpdatedMessage(messageString);
		
	}
	
}
