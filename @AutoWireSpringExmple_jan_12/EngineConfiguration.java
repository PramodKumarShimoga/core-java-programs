package com.xworkz.springAutowirewithconst.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.springAutowirewithconst.bean.Engine;

@Configuration
@ComponentScan("com.xworkz.springAutowirewithconst")
public class EngineConfiguration {
	public EngineConfiguration() {
		System.out.println("engine started");
	}
	@Bean
	public String  name() {
		return  "classic";
	}

	@Bean
	public String type () {
		return "motor" ;
	}

	@Bean
	public int number () {
		return  125;
	}
	@Bean
	public String  version () {
		return "V1" ;
	}
	@Bean
	public String  company () {
		return "hero" ;
	}
	@Bean
	public String  strokes () {
		return "two" ;
	}
	@Bean
	
	public Engine en() {
		Engine eng=new Engine("legacy","heavy-motor","yamaha");
		eng.setStrokes("four");
		return eng;

	}


}
