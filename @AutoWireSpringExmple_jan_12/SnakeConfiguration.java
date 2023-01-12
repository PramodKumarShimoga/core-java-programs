package com.xworkz.springAutowirewithconst.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springAutowirewithconst.bean.Snake;

@Configuration
@ComponentScan("com.xworkz.springAutowirewithconst")
public class SnakeConfiguration {
	public SnakeConfiguration() {
		System.out.println("snake configuared");
	}
	
	@Bean
	public String name() {
		return "kalinga";
	}
	@Bean
	public double length() {
		return 5.6;
	}
	@Bean
	public String color() {
		return "kappu" ;
	}
	@Bean
	public String type() {
		return "jungli" ;
	}
	@Bean
	public boolean poison() {
		return  true ;
	}
	@Bean 
	public Snake sn() {
		Snake havu2=new Snake("nagara","halli",true);
		return havu2;
	}

}
