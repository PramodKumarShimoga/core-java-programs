package com.xworkz.prg;

public class ReverseNumber {

	static int reverse(int num)
	{
		int rem=0,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		
		System.out.println(reverse(523));

		
	}

}
