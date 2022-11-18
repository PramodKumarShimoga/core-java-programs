import java.util.*;
class ArrayEx{
	static String array[]={};
	static int index=0;
static void addArray(String arr)
{
	if(array.length>=0)
	{
		array[index++]=arr;
	}
	else
	{
		System.out.println("array is full");
	}
	
		
	
}
static void getArray()
{
	
	System.out.println(Arrays.toString(array));
}

public static void main(String args[])
{
	addArray("pramod");
	getArray();
}

}