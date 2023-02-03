package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class BeachDTO {
	
	private String bname;
	private String  blocation;
	private boolean bclean;
	private String games;
	public BeachDTO() {
		System.out.println("Created: " + this.getClass().getSimpleName());
	}
	

}
