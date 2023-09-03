package polymorphism;

public class son1 extends father1_overriding
{
	
	
	public void bike() //method declartion
	{
		System.out.println("bike:FZ v3");
		
	}
	
	public void home() //method declaration
	{
		System.out.println("Home: 3BHK"); //method definition
		
	}
	//method overriding
	public void car()
	{
		System.out.println("Car: Kia");
		
	}
	//method overriding
	public void money()
	{
		System.out.println("Money: 5L");
		
	}

}
