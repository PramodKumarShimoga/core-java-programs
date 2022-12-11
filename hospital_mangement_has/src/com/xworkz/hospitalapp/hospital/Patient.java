/**
 * 
 */
package com.xworkz.hospitalapp.hospital;

import lombok.Getter;
import lombok.Setter;

/**
 * @author DELL
 *
 */

//import java.util.Enumeration;
import com.xworkz.hospitalapp.constant.*;
@Getter
@Setter
public class Patient extends Hospital {
    private Gender gender;
	private String name;
	private int age;
	private String address;
	 
	public Patient( ) {
		super();
//		this.name =name;
//		this.address=address;		
//	   this.gender= Gender.valueOf(Gender);
//		
//		this.age=age;
		
	}
	public void display() {
		  System.out.println("The patient name :"+ this.name);
		  System.out.println("The patient address :"+ this.address);
		  System.out.println("The patient age :"+ this.age);
	}

}
