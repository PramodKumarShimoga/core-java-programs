package com.xworkz.springbeans.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;







@Configuration
@ComponentScan("com.xworkz.springbeans")
public class RocketConfiguration {
	
	public RocketConfiguration() {
		System.out.println("Class_Configured_______");
	}
	
}
