package com.xworkz.decSix;

import java.util.*;

public class MergeArrayusingScanner {
	
	static void mergeArray(int arrayOne[],int arrayTwo[])
	{
		int size=arrayOne.length+arrayTwo.length;
		int array[]=new int[size];
		for(int i=0;i<arrayOne.length;i++)
		{
			array[i]=arrayOne[i];
		}
		
		
		for(int j=0;j<arrayTwo.length;j++)
		{
			array[arrayOne.length+j]=arrayTwo[j];
		}
		
		System.out.println("First array is: "+Arrays.toString(arrayOne));
		System.out.println("Second arrays is: "+Arrays.toString(arrayTwo));
		System.out.println("\nMerged array is: "+Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first Array");
		int sizeOne=sc.nextInt();
		int first[]=new int[sizeOne];
		
		for(int i=0;i<sizeOne;i++)
		{
			System.out.println("enter the "+(i+1)+" elements for 1st array");
			first[i]=sc.nextInt();
		}
			
		System.out.println("enter the size of second Array");
		int sizeTwo=sc.nextInt();
		int second[]=new int[sizeTwo];
		
		for(int i=0;i<sizeTwo;i++)
		{
			System.out.println("enter the "+(i+1)+" elements for 2nd array");
			second[i]=sc.nextInt();
		}
		mergeArray(first,second);
		
		
		sc.close();
	}

}
