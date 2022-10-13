class Truffless{
	public static void main(String arg[])
	{
		String hotelName="Truffles";
		String managerName[]={"Pramod","kumar","manohar","sanju"};
		String foodMenu[]={"Iris Coffee","Jamaican Coffee","Cappuccino Coffee","Hazelnut Coffee","Turkish Coffee","Cafe Latte","Cafe Macho","Espresso","Espresso Americana","Cafe Galato","Espresso Con Panna","Choco Mocha","Very Vanilla","Peanut Butter And Nutella","Lychee","Very Berry Blast","Montego"};
		System.out.println("\nHotel Name : "+hotelName+"\n\n");
		for(int i=0;i<managerName.length;i++)
		{
			System.out.println("Manager "+i+" :- "+managerName[i]);
		}
				System.out.println("\n\n Caffee List\n\n");
		for(int j=0;j<foodMenu.length;j++)
		{
			System.out.println("Caffee item "+(j+1)+" :- "+foodMenu[j]);
			
		}
	}
}