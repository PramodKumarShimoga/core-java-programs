package com.xworkz;

public class CheckPat {

	public static void checkPat(String str)
	{
	boolean status=false;
		if(str.length()==9)
		{
			
			if( Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1))&&
				Character.isUpperCase(str.charAt(str.length()-1)))
			{
				if(Character.isDigit(str.charAt(2)) && Character.isDigit(str.charAt(3))&&
				   Character.isDigit(str.charAt(4)) && Character.isDigit(str.charAt(5)))
				{
					status=true;
					
				}
			 
			}	
		}
		if(status==true)
		{
			System.out.println("valid coupon");
			
		}
		else
		{
			
			System.out.println("invalid coupon");
		}
				
	}
	
	public static void main(String[] args) {
	checkPat("CT200201S");
	}

}
