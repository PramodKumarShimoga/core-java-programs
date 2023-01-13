package com.xworkz.springprojectdobject.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	public Assistant assistant;
	@Autowired
	public Company company;
	private String producerName;

	
	@Override
	public String toString() {
		return "Producer [producerName=" + producerName + "]";
	}


	public Producer() {
		System.out.println("Created Producer using No Arg Constructor......");
	}
	

	

	
	

}
