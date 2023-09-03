package Multiple_Interface;

public class Sample1 implements Interf1,Interf_1
{
	public void m1() 
	{
		System.out.println("method m1 from I1 completed in IC");
		
	}
	
	public void m2() 
	{
		System.out.println("method m2 from I1 completed in IC");
		
	}

	public void m3() 
	{
		System.out.println(j);
		System.out.println("method m3 from I2 completed in IC");
		
	}
	public void m4() 
	{
		System.out.println("method m4 from I2 completed in IC");
		
	}
}
