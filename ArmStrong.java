class ArmStrong{
public static void main(String a[])
{
	int n=153,rem=0,arm=0;
	int temp=n;
	while(n!=0)
	{
		rem=n%10;
		arm=arm+(rem*rem*rem);
		n=n/10;
	}
	if(temp==arm)
	{
		System.out.println("armstrong no");
		}
		else
		{
					System.out.println("not armstrong"+arm);
		}
	
	
}
}