package com.xworkz.decSix;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		int arrayOne[]= {1,2,3,4,5};
		int arrayTwo[]= {10,20,30,40,50};
		
		
		int size=arrayOne.length+arrayTwo.length;
		int array[]=new int[size];int count=0;
		
		for(int i=0;i<arrayOne.length;i++)
		{
			array[i]=arrayOne[i];count++;
		}
		
		
		for(int j=0;j<arrayTwo.length;j++)
		{
			array[count++]=arrayTwo[j];
		}
		
		System.out.println("First array is: "+Arrays.toString(arrayOne));
		System.out.println("Second arrays is: "+Arrays.toString(arrayTwo));
		System.out.println("\nmerged array : "+Arrays.toString(array));
		
	}

}
