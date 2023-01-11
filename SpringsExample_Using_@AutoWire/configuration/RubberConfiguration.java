package com.xworkz.springAutowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowire")

public class RubberConfiguration {
	
	public RubberConfiguration() {
		System.out.println("Rubber class configured");
	}

	
	
	@Bean
	public String name()
	{
		return "DOMS";
	}
	@Bean
	public String type()
	{
		return "Pencil with eraser";
	}
	@Bean
	public String color()
	{
		return "RED";
	}
	@Bean
	public String shape()
	{
		return "Diamond";
	}
	@Bean
	public String size()
	{
		return "5mm";
	}
	@Bean
	public boolean stolen()
	{
		return true;
	}
	@Bean
	public double price()
	{
		return 17.33;
	}
}
