package com.xworkz.collectionsapp.equalsMethodDTO;

import java.io.Serializable;

public class AiroportDTO implements Serializable{
	
	private String  name;private String place;
	private String type;
	public AiroportDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AiroportDTO(String name, String place, String type) {
		super();
		this.name = name;
		this.place = place;
		this.type = type;
	}
	@Override
	public String toString() {
		return "AiroportDTO [name=" + name + ", place=" + place + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public boolean equals(Object obj) {
		boolean rtn=false;
		if(obj!=null)
		{
			if(obj instanceof AiroportDTO)
			{
				AiroportDTO dto=(AiroportDTO)obj;
				if(dto.name.equals(this.name))
				{
					System.out.println("Name Matched: "+dto.name);
					rtn=true;
				}
				if(dto.place.equals(this.place))
				{
					System.out.println("place  Matched: "+dto.place);
					rtn=true;
					
				}
				if(dto.type.equals(this.type))
				{
					System.out.println("type  Matched: "+dto.type);
					rtn=true;
					
				}
				
			}
			
			
		}
		return rtn;
	}
	
	
	
		
}
