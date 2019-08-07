package demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/***
 * Description: This class acts as an  entry for the execution of application modules.
 * @author Sangeeta-Laptop
 *
 */
@ComponentScan( basePackageClasses = demo.controller.Controller.class )
@SpringBootApplication								// It represents that application is the spring boot application.								
public class Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}

}
