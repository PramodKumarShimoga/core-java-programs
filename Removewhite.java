package com.xworkz.decSix;

public class Removewhite {

	public static void main(String[] args) {
		int count=0;
		String str="hi hi hello";
		for(char ch:str.toCharArray())
		{
			
			if(ch!=' ')
			{
				System.out.print(ch);
			}
			else
			{
				count++;
			}
			
			
		}System.out.println("\n"+count);
	}

}
