package SamplePackage;

public class CheckConstructor
{
	int a;
	String b;
	char c;
	CheckConstructor()
	{
		a=5;
		b="xyz";
		c='q';
	}
	CheckConstructor(int a, String b, char c)
	{
		this.a=a; // 10
		this.b=b; // abc
		this.c=c; // q
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);		
	}
	public static void main(String[] args) 
	{
		CheckConstructor s= new CheckConstructor();
		s.c='S';
		s.display();
		
	}
}
