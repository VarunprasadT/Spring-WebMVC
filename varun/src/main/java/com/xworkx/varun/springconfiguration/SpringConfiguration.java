package com.xworkx.varun.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkx.varun")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Running ....."+this.getClass().getSimpleName());
	}
}
