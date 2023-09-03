package polymorphism;

public class TestDemo1
{
	public static void main(String[] args) 
	{
		demo1_methodOverloading ol=new demo1_methodOverloading();
		ol.add(45, 55); //compile time polymorphism
		ol.add(21, 54, 62); //compile time polymorphism
		ol.add(1, "Shiva", 'A'); //compile time polymorphism
		
	}

}
