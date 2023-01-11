package com.xworkz.springAutowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowire")
public class MeConfiguration {

	public MeConfiguration() {
		System.out.println("class Configured");
	}
	
	
	
	@Bean
	public String name()
	{
		return "Pramod";
	}
	@Bean
	public int age()
	{
		return 25;
	}
	@Bean
	public char gender()
	{
		return 'M';
	}
	@Bean
	public int adhar()
	{
		return 4748263;
	}
	@Bean
	public long mob()
	{
		return 7456372784622l;
	}
	@Bean
	public String address()
	{
		return "shimoga";
	}
	@Bean
	public boolean studying()
	{
		return true;
	}
	@Bean
	public String where()
	{
		return "x-workz";
	}
	@Bean
	public float discount()
	{
		return 15.4f;
	}
	@Bean
	public double courseFees()
	{
		return 22000.00;
	}
	@Bean
	public byte rating()
	{
		return 8;
	}
	@Bean
	public short outOf()
	{
		return 10;
	}
	
}
