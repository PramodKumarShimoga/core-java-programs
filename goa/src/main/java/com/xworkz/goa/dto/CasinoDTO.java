package com.xworkz.goa.dto;



import lombok.Data;

@Data
public class CasinoDTO { 
	private String cname;
	private String crname;
	private double fees;
	private boolean freefood;
	public CasinoDTO()
	{
		System.out.println("Created: " + this.getClass().getSimpleName());
	}
}
