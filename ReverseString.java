package com.xworkz.prg;

public class ReverseString {

	public static void main(String[] args) {
		String str="pramod";
		String rev="";
		
 for(char ch:str.toCharArray())
    {
	  rev=ch+rev;
	}
 		System.out.println(rev);
	}
		
}
