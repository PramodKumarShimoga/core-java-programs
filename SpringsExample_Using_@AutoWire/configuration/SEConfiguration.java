package com.xworkz.springAutowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan("com.xworkz.springAutowire")

public class SEConfiguration {
	
	public SEConfiguration() {


		System.out.println("SEConfiguration done");
	}

	@Bean
	public String name()
	{
		return "sanjay";
	}
	@Bean
	public String cname()
	{
		return "DELOITE";
	}
	@Bean
	public double salary()
	{
		return 567883.56;
	}
	@Bean
	public double experience()
	{
		return 5.4;
	}
}
