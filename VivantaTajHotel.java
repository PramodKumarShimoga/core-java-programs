class vivantaTaj
{
	public static void main(String arg[])
	{
		
		String address="MG Road";
		String[] managerNames={"Pramod","sanju","manohar","preeti_raj"};	
		int noOfManagers=managerNames.length;
	
		String foodMenu[]={"Drums of hevaen","chicken lolipop","chicken tikka","chicken kolapuri","chicken hydrabadi","chicken tandooi","chicken chilly","chicken biryani","chicken friedrice","chicken bambu biryani","chicken sukka","chicken pepper dry","guntur chicken","vivanta spl biryani","tandoor roti","butter kulch","parota","roti","chicken manchurian","shezwan fried rice","chicken wings","chicken leg"};
		
		System.out.println("_____welcome to vivanta Taj Hotel____");
		System.out.println("\t__Non_veg_world__");
		System.out.println("Address"+address);
		System.out.println("No of manages is"+noOfManagers);
		for(int i=0;i<managerNames.length;i++)
		{
			System.out.println("Manager "+i+1+"is "+managerNames[i]);
		}
		for(int j=0;j<foodMenu.length;j++)
		{
			System.out.println(foodMenu[j]+"\n");
		}
		}
}