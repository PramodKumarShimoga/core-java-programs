package com.xworkz.springAutowirewithconst.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	@Autowired
	private double length;
	@Autowired
	private String color;
	
	private String type;
	private boolean poison;






	
	@Autowired
	public Snake(String name, String type, boolean poison) {
		super();
		this.name = name;
		this.type = type;
		this.poison = poison;
	}







	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poison=" + poison
				+ "]";
	}


}
