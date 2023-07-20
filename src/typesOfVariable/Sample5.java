package typesOfVariable;

public class Sample5 {
	
	int c=30; //non static global variable

	public static void main(String[] args) {
		
		Sample5 s5=new Sample5();
		s5.m1();
		s5.m2();
		System.out.println(s5.c);
		

	}
	public void m1() 
	{
		int b=20;
		System.out.println(b);//20
		
		//non static global variable from diff class
		Sample4 s4=new Sample4();
		System.out.println(s4.a);//10
		
	}
	public static void m2()
	{
		//non static global varibale from diff class
		Sample4 s4=new Sample4();
		System.out.println(s4.a);//10
		Sample5 s5=new Sample5();
		System.out.println(s5.c);
	}

}
