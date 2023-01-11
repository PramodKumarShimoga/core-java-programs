package com.xworkz.springbeans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springbeans.beans.Season;

@Configuration
@ComponentScan("com.xworkz.springbeans")

public class SeasonConfiguration {
	public SeasonConfiguration() {
		System.out.println("Season_Configured");
	}
	
@Bean
public Season seson1()
{
	Season s1=new Season();
	s1.setSname("summer");
	s1.setStartMonth("march");
	s1.setDuration("feb");	
	return s1;
	
}
}
