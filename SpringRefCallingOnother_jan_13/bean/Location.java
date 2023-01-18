package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Location {
	@Autowired
	public Area area;
	@Value("Bangalore")
	private String locationName;
	

	@Override
	public String toString() {
		return "Location [locationName=" + locationName + "]";
	}


	public Location() {
		          
		System.out.println("Created Location using No Arg Constructor......");
		
	}
	

	
	


}
