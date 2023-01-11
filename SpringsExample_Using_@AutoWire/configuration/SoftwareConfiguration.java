package com.xworkz.springAutowire.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowire")
public class SoftwareConfiguration {
	
	public SoftwareConfiguration() {
		System.out.println("SoftwareConfiguration created");
	}
	
	@Bean
	public String name()
	{
		return "poch";
	}
	@Bean
	public String version()
	{
		return "5.3.2";
	}
	@Bean
	public String developer()
	{
		return "Moon";
	}
	@Bean
	public LocalDate date()
	{
		return LocalDate.of(2022, 5, 3);
	}
	@Bean
	public boolean free()
	{
		return true;
	}

}
