package com.xworkz.bakery.springconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BakeryInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running....."+this.getClass().getSimpleName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running...getServletConfigClasses");
		Class [] ref= {SpringConfiguration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running...getServletMappings");	
		return new String [] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running...configureDefaultHandling");
		configurer.enable();
	}

}
