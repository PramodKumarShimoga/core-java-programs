package com.xworkz.prg;

public class PrimeOrNot {

//	static int Check(int num)
//	{
//		
//		
//	}
	public static void main(String[] args) {
		int n=13,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime "+n);
		}
		else
		{
			System.out.println("its not prime"+n);
		}

		
	}

}
