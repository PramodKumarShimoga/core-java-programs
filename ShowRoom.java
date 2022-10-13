class ShowRoom{
	static void getCarNames(String[] carNames)
	{
		System.out.println("inside getCarNames()");
		System.out.println("size of carnames is "+carNames.length);
		System.out.println("list of carnames is ");
		for(int i=0;i<carNames.length;i++)
		{
			System.out.println(carNames[i]);
		}
		System.out.println("END of getCarNames() \n\n");
	}
	static void getBikeNames(String[] bikeNames)
	{
		System.out.println("inside getBikeNames()");
		System.out.println("size of bikeNames is "+bikeNames.length);
		System.out.println("list of bikeNames is ");
		for(int j=0;j<bikeNames.length;j++)
		{
			System.out.println(bikeNames[j]);
		}
		System.out.println("END of getbikeNames() \n\n");
		
	}
}