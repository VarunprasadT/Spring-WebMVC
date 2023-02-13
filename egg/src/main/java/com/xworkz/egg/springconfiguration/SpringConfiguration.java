package com.xworkz.egg.springconfiguration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.egg")
public class SpringConfiguration {
	public SpringConfiguration() {
	System.out.println("Running..........SpringConfiguration");
}

@Bean
public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
	System.out.println("Registering  localContainerEntityManagerFactoryBean");
	LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
	return bean;
	
}
}