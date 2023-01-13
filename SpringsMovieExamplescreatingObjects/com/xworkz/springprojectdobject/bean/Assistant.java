package com.xworkz.springprojectdobject.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	@Value("MoonManu")
	private String assistantName;
	
	@Override
	public String toString() {
		return "Assistant [assistantName=" + assistantName + "]";
	}

	public Assistant() {
		System.out.println("Created Assistant using No Arg Constructor.....");
	}
	
	



}
