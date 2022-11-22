/**
 * 
 */
package com.xworkz.mobile;
import com.xworkz.mobile.mobileapp.*;

/**
 * @author DELL
 *
 */
public class SpaceJetDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpaceJetDTO bd= new SpaceJetDTO();
		 bd.setId(549);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("PSLV_025");
		 System.out.println("Name = " +bd.getName());
	}

}
