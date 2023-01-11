package com.xworkz.springAutowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	private String name;
	@Autowired
	private String type;
	@Autowired
	private double price;
	@Autowired
	private String color;
	@Autowired
	private String sharp;
	@Autowired
	private boolean stolen;
	
	
	
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}
	
}
