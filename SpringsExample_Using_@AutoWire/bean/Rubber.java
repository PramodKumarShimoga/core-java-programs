package com.xworkz.springAutowire.bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Rubber {
	@Autowired
	private String name;
	@Autowired
	private  String type;
	@Autowired
	private double price;
	@Autowired
	private  String color;
	@Autowired
	private String shape;
	@Autowired
	private boolean stolen;
	@Autowired
	private String size;
	
	
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
	

}
