package com.xworkz.firstAidspringQuarkusValidation.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.firstAidspringQuarkusValidation")
public class ConfigurationMust {
	
	public ConfigurationMust() {
		System.out.println("Configured>>>>>>>>>>");
	}
	@Bean
	public Validator validator() {
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}

}
