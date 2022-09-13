package SamplePackage;

public class MethodOverloading extends Parent 
{
	public void display()
	{
		System.out.println("Child display 1");
	}
	public void display(int a)
	{
		System.out.println("Child display int "+a);
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.display();
		obj.display(5);
		Parent pobj = new Parent();
		pobj.display();
	}
}

class Parent 
{
	public void display()
	{
		System.out.println("Parent display 1");
	}
}