package com.xworkz.kindergarten.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sun.tools.javac.api.DiagnosticFormatter.Configuration;

public class KinderGartenInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running....getRootConfiguration");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running....getServletConfigClasses");
		return new Class [] {Configuration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running...getServletMappings");
		return new String [] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running...configureDefaultServletHandling");	
		configurer.enable();
	}

}
