package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	public Experience experience;
	@Autowired
	public Skill skill;
	@Value("SavithaRajesh")
	private String directorName;
	
	@Override
	public String toString() {
		return "Director [directorName=" + directorName + "]";
	}

	public Director() {
		System.out.println("Created Director using No Arg Constructor......");
	}

}
