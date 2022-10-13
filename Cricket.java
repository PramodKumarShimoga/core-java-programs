
//Explicit way of using array variable -:

class Cricket
{	
	public static void main(String args[])
	{
		int rohitHighestScore=264;
		int sachinHighestScore=200;
		int mandannaHighestScore=135;
		int ackerrHighestScore=232;
		int bjClarkHighestScore=229;
		
		int highestScores[]={rohitHighestScore,sachinHighestScore,mandannaHighestScore,ackerrHighestScore,bjClarkHighestScore};

	int ref=highestScores[0];
	int ref1=highestScores[1];
	int ref2=highestScores[2];
	int ref3=highestScores[3];
	int ref4=highestScores[4];
	
	System.out.println("element at index 1 is "+ref);
	System.out.println("element at index 2 is "+ref1);
	System.out.println("element at index 3 is "+ref2);
	System.out.println("element at index 4 is "+ref3);
	
	System.out.println("\n\n");
	
	
	for(int index=0;index<highestScores.length;index++)
	{
		int re=highestScores[index];
		System.out.println("element at index "+(index+1)+" is "+re);
	}
	
	
	
	
	}
}