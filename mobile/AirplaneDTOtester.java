/**
 * 
 */
package com.xworkz.mobile;

import com.xworkz.mobile.mobileapp.*;

/**
 * @author DELL
 *
 */
public class AirplaneDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AirplaneDTO bd= new AirplaneDTO();
		 bd.setId(24435);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("Indigo");
		 System.out.println("Name = " +bd.getName());
	}

}
