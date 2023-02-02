package com.xworkz.interview.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")

public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Creating..."+this.getClass().getSimpleName());
	}
}
