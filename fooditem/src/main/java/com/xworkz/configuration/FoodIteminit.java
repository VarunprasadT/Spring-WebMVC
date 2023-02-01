package com.xworkz.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodIteminit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public FoodIteminit() {
		System.out.println("Creating..."+this.getClass().getName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Runing...getRootConfigClasses");
		Class [] configClass={SpringConfiguration.class};
		System.out.println("configClass : "+Arrays.toString(configClass));
		return configClass;
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Runing...getServletConfigClasses");
		Class [] configClass={SpringConfiguration.class};
		System.out.println("configClass : "+Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		String[] ref = {"/"};
		System.out.println("getServletMappings : "+Arrays.toString(ref));
		return ref;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

}
