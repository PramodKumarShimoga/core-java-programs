package com.xworkz.springAutowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Me {
	
	@Autowired
	private String name;
	@Autowired
	private int age;
	@Autowired
	private char gender;
	@Autowired
	private int adhar;
	@Autowired
	private long mob;
	@Autowired
	private String address; 
	@Autowired
	private boolean studying;
	@Autowired
	private String where;
	@Autowired
	private double courseFees;
	@Autowired
	private float discount;
	@Autowired
	private byte rating;
	@Autowired
	private short outOf;
	
	
	@Override
	public String toString() {
		return "Me [name=" + name + ", age=" + age + ", gender=" + gender + ", adhar=" + adhar + ", mob=" + mob
				+ ", address=" + address + ", studying=" + studying + ", where=" + where + ", courseFees=" + courseFees
				+ ", discount=" + discount + ", rating=" + rating + ", outOf=" + outOf + "]";
	}
	
	
	

}
