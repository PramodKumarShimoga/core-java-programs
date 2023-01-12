package com.xworkz.springAutowirewithconst.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	private int id;

	private String name;

	private String ownerName;
	@Autowired
	private String language;
	private double price;


	@Autowired
	public NewsPaper(String name,@Qualifier("newsownername")String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}


	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}




	@Autowired
	public void setPrice(@Qualifier("price2")double price) {
		this.price = price;
	}



}
