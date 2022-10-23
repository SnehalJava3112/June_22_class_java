package SamplePackage;

class Two 
{
	int a=10;
	Two()
	{  
		System.out.println("in constructor "+a);
		System.out.println("TWO"); 
	} 
}

class Three extends Two
{
	Three()
	{  
		super();	// if you are not writing, compiler calls automatically.
		System.out.println("Three"); 
	}
}
public class Super_Calling 
{
	public static void main(String[] args) 
	{
		Three obj = new Three();
		obj.a=20;
		System.out.println(obj.a);
	}
}
