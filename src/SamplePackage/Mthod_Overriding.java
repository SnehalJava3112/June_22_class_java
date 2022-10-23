package SamplePackage;

class Sample
{
	public void print()
	{
		System.out.println("This is super class.");

	}
}
class Sample2 extends Sample
{
	public void print()
	{
		System.out.println("This is sub class.");
	}
}
public class Mthod_Overriding 
{
	public static void main(String[] args) 
	{
	    Sample2 obj2 = new Sample2();
	    obj2.print();
	    
	    Sample obj = new Sample();
		obj.print();
	}
}
