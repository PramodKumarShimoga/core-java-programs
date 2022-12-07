package com.xworkz.decSix;

public class RotationString {
	
	static void checkRotate(String str1,String str2)
	{
		String str3="";
		if(str1.length()==str2.length())
		{
			str3=str1+str1;
			if(str3.contains(str2))
			{
				System.out.println(str2+" is rotation of "+str1);
			}
			else
			{
				System.out.println(str2+" is not rotation of "+str1);
			}
		}
		else {
			System.out.println("it is not a rotation of string");
		}
	}
	public static void main(String[] args) {
		
		String str1="avajava",str2="javaava";
		checkRotate(str1,str2);
	}
}
