package com.xworkz.springbeans.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("Vikram-S")
	private String name;
	@Value("INDIA")
	private String country;
	@Value("5783927583")
	private double price;

	public Rocket() {
		System.out.println("RocketLaunched_____");
		
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public double getPrice() {
		return price;
	}
	
	@Bean
	public Rocket launched()
	{
		System.out.println("once again launched");
		Rocket rk=new Rocket();
		return rk;
	}
}
