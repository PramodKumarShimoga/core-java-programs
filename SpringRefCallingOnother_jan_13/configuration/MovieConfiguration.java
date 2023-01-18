package com.xworkz.springprojectdobject.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.springprojectdobject")

public class MovieConfiguration {

	public MovieConfiguration() {
		System.out.println("............MovieConfiguration class created.......");
	}
	
	
}
