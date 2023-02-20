package com.xworkz.kindergarten.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.xworkz")
public class Configuration {
	public Configuration() {
		System.out.println("Created.."+this.getClass().getSimpleName());
	}
	
	public ViewResolver viewResolver() {
		System.out.println("Running...viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
}
