package com.xworkz.springAutowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hardware {
	@Autowired
	private int id;
	@Autowired
	private String name;
	@Autowired
	private String gstNo;
	@Autowired
	private String ownerName;
	@Autowired
	private String address;
	
	
	
	
	@Override
	public String toString() {
		return "Hardware [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName + ", address="
				+ address + "]";
	}
	
	
	
	

}
