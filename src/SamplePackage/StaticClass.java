package SamplePackage;

public class StaticClass 
{
	static void display()
	{
		System.out.println("This is static method -> called directly.");
	}
	public void display1()
	{
		System.out.println("This is non-static method -> called by an object.");
	}
	public static void main(String[] args) 
	{
		display();			
		
		StaticClass c = new StaticClass();
		c.display1();
	}
}
