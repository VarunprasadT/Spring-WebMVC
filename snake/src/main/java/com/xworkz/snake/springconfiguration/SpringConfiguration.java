package com.xworkz.snake.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.snake")
public class SpringConfiguration {

	public SpringConfiguration() {
	System.out.println("Created"+this.getClass().getSimpleName());
	}
}
