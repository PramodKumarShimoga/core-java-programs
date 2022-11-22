/**
 * 
 */
package com.xworkz.mobile;

import com.xworkz.mobile.mobileapp.*;

/**
 * @author DELL
 *
 */
public class MemoryCardDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusDTO bd= new BusDTO();
		 bd.setId(128);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("SONY-128GB");
		 System.out.println("Name = " +bd.getName());
	}

}
