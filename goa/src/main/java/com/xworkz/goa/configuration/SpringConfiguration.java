package com.xworkz.goa.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.goa")
public class SpringConfiguration {
public SpringConfiguration() {
	System.out.println("Running..."+this.getClass().getSimpleName());
}
}
