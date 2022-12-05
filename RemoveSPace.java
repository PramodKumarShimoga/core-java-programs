package com.xworkz.prg;

public class RemoveSPace {

	public static void main(String[] args) {

		String str="va va va";
		for(char ch:str.toCharArray())
		{
			if(ch!=' ')
				
			{
				System.out.print(ch);
			}
			
		}
	}

}
