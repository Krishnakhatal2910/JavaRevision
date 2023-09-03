package polymorphism;

public class demo1_methodOverloading 
{
	public void add(int a,int b) //method declaration
	{
		System.out.println(a+b); //method definition
		
	}
	public void add(int a, int b, int c) //method declaration 
	{
		System.out.println(a+b+c); //method definition
		
	}
	public void add(int roll , String Name, char div) //method declaration
	{
		System.out.println("roll no: "+roll+" StudentName: "+Name+"Student Div: "+div); //method definition
		
	}

}
