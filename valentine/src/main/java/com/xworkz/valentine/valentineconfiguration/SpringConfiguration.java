package com.xworkz.valentine.valentineconfiguration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;


@Configuration
@ComponentScan("com.xworkz.valentine")
public class SpringConfiguration {
	
public SpringConfiguration() {
	System.out.println("Creating......SpringConfiguration");
}

@Bean
LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {
	System.out.println("Running....localEntityManagerFactoryBean");
	return new LocalEntityManagerFactoryBean();
}
}
