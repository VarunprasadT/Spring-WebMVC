package com.xworkz.interview.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InterviewWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{
	
	public InterviewWebInit() {
		System.out.println("Creating..."+this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClass");
		Class[] ref = {SpringConfiguration.class};
		System.out.println("getServletConfigClasses : "+Arrays.toString(ref));
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		String [] ref = {"/"};
		System.out.println("getServletMappings : "+Arrays.toString(ref));
		return ref;
	}
	
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("Running configureDefaultServletHandling");
	WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
}

}
