package com.xworkz.weponDTO.wepon;


import java.io.Serializable;
import java.time.LocalDate;

public class WeponDTO implements Serializable,Comparable<WeponDTO>{
	private String name;
	private String madeby;
	private LocalDate madeon;
	private double price;
	private Type type;
	public WeponDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeponDTO(String name, String madeby, LocalDate madeon, double price, Type type) {
		super();
		this.name = name;
		this.madeby = madeby;
		this.madeon = madeon;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "\nWeponDTO [name=" + name + ", madeby=" + madeby + ", madeon=" + madeon + ", price=" + price + ", type="
				+ type + "]";
	}
	@Override
	public int hashCode() {
		return 5;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof WeponDTO)
			{
				WeponDTO wepon=(WeponDTO)obj;
				if(this.name.equals(wepon.name)&& this.madeby.equals(wepon.madeby)&&this.type.equals(wepon.type))
				{
					return true;
				}
				
			}
		}
		
			return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMadeby() {
		return madeby;
	}
	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}
	public LocalDate getMadeon() {
		return madeon;
	}
	public void setMadeon(LocalDate madeon) {
		this.madeon = madeon;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public int compareTo(WeponDTO o) {
		return this.name.compareTo(o.name);
	}

}
