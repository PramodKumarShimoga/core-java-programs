class Empire{
	public static void main(String arg[])
	{
		String hotelName="Empire Hotel";
		String managerName[]={"Pramod","kumar","manohar","sanju"};
		String foodMenu[]={"Empire Spl Chicken Kebab","Empire Spl Chicken Kebab B’Less","Empire Spl Chilly Kebab","Empire Spl Chilly Kebab B’Less","Chicken Biriyani","Grilled Chicken Biryani","Prawns Biriyani","Fish Biriyani","Egg Biriyani","Veg Biriyani","Mutton Raan Biriyani","Biriyani Rice","Malabar Parota","Ceylon Parota","Coin Parota","Wheat Parota","Egg Parota"};
		System.out.println("\nHotel Name : "+hotelName+"\n\n");
		for(int i=0;i<managerName.length;i++)
		{
			System.out.println("Manager "+i+" ) "+managerName[i]);
		}
				System.out.println("\n\n Food List\n\n");
		for(int j=0;j<foodMenu.length;j++)
		{
			System.out.println("Food item "+(j+1)+"] "+foodMenu[j]);
			
		}
	}
}