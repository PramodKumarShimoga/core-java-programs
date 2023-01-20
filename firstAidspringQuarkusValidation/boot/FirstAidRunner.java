package com.xworkz.firstAidspringQuarkusValidation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.firstAidspringQuarkusValidation.configuration.ConfigurationMust;
import com.xworkz.firstAidspringQuarkusValidation.dto.FirstAidDTO;
import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;
import com.xworkz.firstAidspringQuarkusValidation.service.FirstaidService;

public class FirstAidRunner {
public static void main(String[] args) {
	
	
	ApplicationContext container=new AnnotationConfigApplicationContext(ConfigurationMust.class);
	
	FirstaidService service=container.getBean(FirstaidService.class);
	
	MissileDTO dto= new MissileDTO("Trishul",334325.0,"India");
	service.saveAndValidate(dto);
	boolean saved=service.saveAndValidate(dto);
	System.out.println("Saved : "+saved);
	
	
	
}
}
