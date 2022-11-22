package com.xworkz.mobile;

import com.xworkz.mobile.mobileapp.MobileDTO;

public class MobileDTOTester {

	public static void main(String[] args) {

		MobileDTO mob=new MobileDTO();
		mob.setmobID(124580);
		mob.setmname("OPPO");
		mob.setmPrice(550000);
		System.out.println(mob.getmobId());
		System.out.println(mob.getmName());
		System.out.println(mob.getmPrice());		
		
	}

}
