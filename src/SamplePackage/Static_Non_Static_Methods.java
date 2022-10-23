package SamplePackage;

// static = calling directly.
// non static = by object name.

public class Static_Non_Static_Methods 
{
	static int a=10;
	int b=20;
	
	void first()
	{
		System.out.println("first.");
	}
	static void second()
	{
		System.out.println("In second.");
	}
	void third()
	{
		System.out.println("Third");
	}
	public static void main(String[] args) 
	{
		System.out.println("I am in main method.");
		second();
		a=100;
		System.out.println("a = "+a);
		
		Static_Non_Static_Methods m1 = new Static_Non_Static_Methods();
		m1.third();
		m1.b=200; // we can change value by this method
		System.out.println("b = "+m1.b);
		
		//new Static_Non_Static_Methods().first();
	}
}
