package com.xworkx.varun.springconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class VarunInit extends AbstractAnnotationConfigDispatcherServletInitializer 
 implements WebMvcConfigurer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Runnning getRootConfigClasses....");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] ref = {SpringConfiguration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running....getServletMethod");
		return new String [] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running....ConfigureDefaultServletHandling");
		configurer.enable();
	}

}
