package SamplePackage;

public class thisCallingMethod 
{
	public thisCallingMethod()
	{
		
		System.out.println("This is defalut");
	}
	
	public thisCallingMethod(int x)
	{
		this();
		System.out.println("This is int constructor");
	}
	
	
	public static void main(String[] args) 
	{
		thisCallingMethod obj = new thisCallingMethod();
	}
}
/*
	public thisCallingMethod(String y)
	{
		System.out.println("This is String constructor");
	}*/