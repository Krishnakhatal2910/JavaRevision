package typesOfVariable;

public class Sample2 {
	
	
	//2: static/class global variable
	
	static int c=30;
	public void m1()
	{
		int b=20;
		System.out.println(b);//20
		System.out.println(c);//30
		
	}
	public static void m2()
	{
		int a=10;
		System.out.println(a);//10
		System.out.println(c);//30
		
	}
	

	public static void main(String[] args) {
		
		//static global variable from same class
		Sample2 s2=new Sample2();
		s2.m1();
		s2.m2();
		
		//static global variable from diff class
		System.out.println(Sample3.d);
		

	}

}
