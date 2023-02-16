package com.xworkz.agniups.springconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;


@Configuration
@ComponentScan("com.xworkz.agniups")
public class AgniUpsConfiguration {

	public AgniUpsConfiguration() {
	System.out.println("Created..."+this.getClass().getSimpleName());
	}
	
	
	@Bean
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {
		System.out.println("Running...localEntityManagerFactoryBean");
		return new LocalEntityManagerFactoryBean();
	}
	
}
