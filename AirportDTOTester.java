package com.xworkz.collectionsapp.equalsMethodDTO;

import java.util.ArrayList;
import java.util.Collection;

public class AirportDTOTester {

	public static void main(String[] args) {
		AiroportDTO dto=new AiroportDTO("kempegowdaAirport","Bangalore","International");
		AiroportDTO dto1=new AiroportDTO("MangaloreAirport","Mangalore","International");
			
		AiroportDTO dto3=new AiroportDTO("Belagavi","Belagaum","national");
		AiroportDTO dto4=new AiroportDTO("HubliAirport","Hubli","International");
		AiroportDTO dto5=new AiroportDTO("chennaiAirport","Chenni","International");
		
		System.out.println(dto.equals(dto1));System.out.println("============================================================");
		System.out.println(dto.equals(dto3));System.out.println("============================================================");
		System.out.println(dto3.equals(dto3));System.out.println("============================================================");
		
		
		Collection<AiroportDTO> col=new <AiroportDTO>ArrayList();
		col.add(dto);col.add(dto1);col.add(dto3);col.add(dto4);col.add(dto5);
		//System.out.println(col);
	    col.contains(dto1);col.contains(dto3);
		
		
		
	}

}
