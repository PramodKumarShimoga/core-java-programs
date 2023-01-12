package com.xworkz.springAutowirewithconst.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springAutowirewithconst.bean.NewsPaper;



@Configuration
@ComponentScan("com.xworkz.springAutowirewithconst")

public class NewspaperConfiguration {
	
	public NewspaperConfiguration() {
		
		System.out.println("NewspaperConfiguration class created...");
	}
@Bean
public int id()
{
	
	return 101;
}
@Bean
public String name()
{
	
	return "vijayakarntaka";
}
@Bean
public String newsownername()
{
	
	return "vijay";
}
@Bean
public String language()
{
	
	return "Kannada";
}
@Bean
public double price()
{
	
	return 12.00;
}
@Bean
public double price2()
{
	
	return 10.00;
}
@Bean
public NewsPaper vk()
{
	NewsPaper pap=new NewsPaper("VijayaVani","vijayananda");
	pap.setPrice(14.00);
	return pap;
}

	
	
}
		
		
	


