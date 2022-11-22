/**
 * 
 */
package com.xworkz.mobile;

import com.xworkz.mobile.mobileapp.*;

/**
 * @author DELL
 *
 */
public class ProcessorDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProcessorDTO bd= new ProcessorDTO();
		 bd.setId(023);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("AMD-processor-090235");
		 System.out.println("Name = " +bd.getName());
	}

}
