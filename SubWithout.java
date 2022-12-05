package com.xworkz.prg;

public class SubWithout {

	static int sub(int a,int b)
	{
		return a+(~b+1);
	}
	public static void main(String[] args) {
		System.out.println(sub(7,5));

	}

}
