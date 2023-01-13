package com.xworkz.springprojectdobject.bean;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Area {
	@Value("RajajiNagara")
	private String areaName;

	@Override
	public String toString() {
		return "Area [areaName=" + areaName + "]";
	}

	public Area() {
		System.out.println("Created Area using No Arg Constructor......");
	}
	
	
	
	
	
	
	

}
