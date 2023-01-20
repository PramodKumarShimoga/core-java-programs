package com.xworkz.firstAidspringQuarkusValidation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.firstAidspringQuarkusValidation.configuration.ConfigurationMust;
import com.xworkz.firstAidspringQuarkusValidation.dto.FirstAidDTO;
import com.xworkz.firstAidspringQuarkusValidation.dto.MissileDTO;
import com.xworkz.firstAidspringQuarkusValidation.dto.ResortDTO;
import com.xworkz.firstAidspringQuarkusValidation.service.FirstaidService;
import com.xworkz.firstAidspringQuarkusValidation.service.FirstaidServiceImpl;
import com.xworkz.firstAidspringQuarkusValidation.service.MissileDTOServiceImpl;
import com.xworkz.firstAidspringQuarkusValidation.service.ResortDTOServiceImpl;

public class FirstAidRunner {
public static void main(String[] args) {
	
	
	ApplicationContext container=new AnnotationConfigApplicationContext(ConfigurationMust.class);
	
	
	FirstaidServiceImpl service=container.getBean(FirstaidServiceImpl.class);
	FirstAidDTO dto1= new FirstAidDTO("AidBox",435.0,6);
	boolean save = service.saveAndValidate(dto1);
	System.out.println("Saved FirstAidDto : "+save);
	
	MissileDTOServiceImpl sr = container.getBean(MissileDTOServiceImpl.class);
	MissileDTO dto= new MissileDTO("Trishul",334325.0,"India");
	boolean sav = sr.validateAnd(dto);
	System.out.println("Saved Missile DTO : "+sav);
	
	ResortDTOServiceImpl rs = container.getBean(ResortDTOServiceImpl.class);
	ResortDTO rd = new ResortDTO("Pommu Resorts",15000.0,"shimogga");
	 boolean resave = rs.saveAndUpdate(rd);
	 System.out.println(resave);
	 
	 ResortDTO rd1 = new ResortDTO("Po",15000.0,"shimogga");
	 boolean resave1 = rs.saveAndUpdate(rd1);
	 System.out.println(resave1);
}
}
