package com.xworkz.decSix;
import java.util.*;

public class ReverseParticularString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a statement..");
		String statement=sc.nextLine();
		System.out.println("enter a word");
		String word=sc.nextLine();
		System.out.println("given statement is : "+statement+"\nenterde word is : "+word);
		String temp="";
		String str[]= statement.split(" ");
		
		for(String st:str)
		{
			if(word.equals(st))
			{
				for(int i=st.length()-1;i>=0;i--)
				{
					temp=temp+st.charAt(i);
				}
				System.out.print(temp+" ");
			}
			else if(!word.equals(st))
			{
			System.out.print(st+" ");
			}
			else {
				System.out.println("word not found");
			}
			
		}
	   sc.close();
	}
}

		
	
