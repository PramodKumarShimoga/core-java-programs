package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	public Capacity capacity;
	@Value("Lion-n")
	private String BatteryName;
	public Battery() {
		System.out.println("Created Battery using No Arg Constructor......");
	}
	@Override
	public String toString() {
		return "Battery [BatteryName=" + BatteryName + "]";
	}

}
