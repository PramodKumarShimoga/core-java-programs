package com.xworkz.springAutowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowire")
public class HardwareConfiguration {

	public HardwareConfiguration() {
		System.out.println("Hardware Configured");
	}
	@Bean
	public int id()
	{
		return 10;
	}	
	
@Bean
public String name()
{
	return "moonHardware";
}
@Bean
public String gstNo()
{
	return "566446EDR44646";
}
@Bean
public String ownerName()
{
	return "Pramod";
}
@Bean
public String address()
{
	return "Nelamangala";
}






}
