package com.sorting_ap.sort;

import com.sorting_ap.sort.sort_ap.Sorting;

public class SortingTest {

	public static void main(String[] args)
	{	int size=5;
		int[] arr=new int[size];
		arr[0]=19;
		arr[1]=89;
		arr[2]=22;
		arr[3]=0;
	    arr[4]=77;
	//	arr[5]=07;
		
		
		 Sorting s=new Sorting();
		 s.ascending(arr,size); 
		 s.descending(arr,size);
		 
		
	    
	    
		

	}

}
