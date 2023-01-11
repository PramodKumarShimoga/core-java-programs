package com.xworkz.springAutowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	private String name;
	@Autowired
	private String cname;
	@Autowired
	private double salary;
	@Autowired
	private double experience;
	
	
	public SoftwareEngineer() {
		System.out.println("Software Engineer created______");
	}


	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", cname=" + cname + ", salary=" + salary + ", experience="
				+ experience + "]";
	}

}

