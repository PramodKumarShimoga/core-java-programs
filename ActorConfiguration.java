package com.xworkz.springbeans.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springbeans")
public class ActorConfiguration {
	public ActorConfiguration() {
		System.out.println("Actor Arrived___");
	}

}
