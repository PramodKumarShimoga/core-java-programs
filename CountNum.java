package com.xworkz.prg;

public class CountNum {
	static int count(int a)
	{
		int i=0;
		while(a!=0)
		{
			a=a/10;
			i++;
		}return i;
	}

	public static void main(String[] args) {

		System.out.println(count(19474));
		
	}

}
