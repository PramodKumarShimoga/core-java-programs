package com.xworkz.goa.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoaInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public GoaInit() {
		System.out.println("Created: " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("creatd : getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("creatd : getServletConfigClasses");
		return new Class[] {GoaConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("creatd : getServletMappings");
		return new String[] {"/"};
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("creatd : configureDefaultServletHandling");
		configurer.enable();
		
	}

}
