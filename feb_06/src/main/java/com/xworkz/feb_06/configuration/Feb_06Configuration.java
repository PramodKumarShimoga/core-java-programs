package com.xworkz.feb_06.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.feb_06")
@Configuration
public class Feb_06Configuration {
	public Feb_06Configuration() {
		System.out.println("Created  : " + this.getClass().getSimpleName());
	}
}
