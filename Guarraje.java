class Guarraje{
	static void getBikeNumber(String[] bikeNumbers)
	{
		System.out.println("inside getBikeNumber()");
		System.out.println("size of numbers plate is "+bikeNumbers.length);
		System.out.println("list of number is ");
		for(int i=0;i<bikeNumbers.length;i++)
		{
			System.out.println(bikeNumbers[i]);
		}
		System.out.println("END of getBikeNumber() \n\n");
	}
	
}