package com.xworkz.springprojectdobject.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	public Location location;
	@Autowired
	public Area area;
	@Value("PRK production")
	private String companyName;
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + "]";
	}

	public Company() {
		System.out.println("Created company using No Arg Constructor......");
	}
	
	
		

}
