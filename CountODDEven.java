package com.xworkz.prg;

public class CountODDEven {
	public static void main(String args[])
	{
	int n=17;
	int countEven=0;
	int countOdd=0;
	 for(int i=0; i<n; i++){
         if(i % 2 == 0)
           countEven += 1;

         else
           countOdd += 1;
     }
     System.out.println("Even Elements count : "+ countEven);
     System.out.println("Odd Elements count : "+ countOdd);

}
}
