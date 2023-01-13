package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Capacity {
	@Value("5000mah")
	private String capacityofBattery;
	
	@Override
	public String toString() {
		return "Capacity [capacityofBattery=" + capacityofBattery + "]";
	}

	public Capacity() {
		System.out.println("Created capacity using No Arg Constructor......");
	}

}
