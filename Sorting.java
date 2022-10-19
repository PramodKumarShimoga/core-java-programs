package com.sorting_ap.sort.sort_ap;

import java.util.Arrays;

public class Sorting 
{
	int temp;
	
	public boolean ascending(int[] arr,int size)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
					
				}
			}
		}
		System.out.println("Ascending Order: "+Arrays.toString(arr));
			
		
			
			
		return false;
	}
	
	public boolean descending(int[] arr,int size)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
					
				}
			}
		}
		System.out.println("descending Order: "+Arrays.toString(arr));
			
		
			
		return false;
	}
	
	
	

}
