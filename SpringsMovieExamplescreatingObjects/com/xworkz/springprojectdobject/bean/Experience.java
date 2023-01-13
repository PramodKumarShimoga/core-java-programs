package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	@Autowired
	public Skill skill;
	@Value("9")
	private int noofExperience;

	public Experience() {
		System.out.println("Created Experience using No Arg Constructor......");
	}

	@Override
	public String toString() {
		return "Experience [noofExperience=" + noofExperience + "]";
	}
	
}
