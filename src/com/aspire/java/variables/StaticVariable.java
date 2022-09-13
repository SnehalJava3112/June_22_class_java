package com.aspire.java.variables;

public class StaticVariable 

{
	int a;				//Global-instance
	int b=20;			//Global-instance
	static int c;		//Global-static
	static int d=40;	//Global-static
	public void nonstaticmethod()
	{
		int p=50;
	//	static int q=60; 		//creation not allowed
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	//calling/use allowed
		System.out.println(d);
	}
	public static void staticmethod()
	{
		int r=10;	//static int r=10;
	//	System.out.println(a);	//calling/use/creation not allowed
	//	System.out.println(b);	//not allowed
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		StaticVariable object= new StaticVariable();
		object.nonstaticmethod();
		staticmethod();
		
		System.out.println(object.a);
		System.out.println(object.b);
		System.out.println(c);
		System.out.println(d);
	}
}