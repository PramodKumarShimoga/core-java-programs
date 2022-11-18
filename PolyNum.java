import java.util.Scanner;
class PolyNum{
	
	public static void main(String arg[])
	{ 
	 Scanner sc=new Scanner(System.in);
	 int rev=0;
	 
		System.out.println("enter a Number to check Polindrome or not");
		int str=sc.nextInt();
		
		//System.out.println(str.length());
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("it is polindrome");
		}
		else
		{
			System.out.println("it is  not polindrome");
			
		}
		
		
	}
	
	
}