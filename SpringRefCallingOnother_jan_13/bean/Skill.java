package com.xworkz.springprojectdobject.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Skill {
	
	@Value("V.Good")
	private String leaderShip;
	@Value("Good")
	private String organization;
	@Value("excelent")
	private String Creativity;
	public Skill() {
		System.out.println("Created skill using No Arg Constructor......");
	}
	@Override
	public String toString() {
		return "Skill [leaderShip=" + leaderShip + ", organization=" + organization + ", Creativity=" + Creativity
				+ "]";
	}

}
