package com.aspire.java.variables;

public class GlobalVariable 
 
{
	int b;				//global variable
	int c=30;			//global variable
	int d;
	static int p=10;
	static int q;
		
	public void method1()
	{
		int a=10;		// local variable--> scope = only in same method body
		b=100;
		d=10;
		System.out.println(p);
		System.out.println(a+b+c+d);
	}
	public void method2()
	{
		int a=20;
		d=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void method3()
	{
	//	System.out.println(b);  //in static method we can call/use only static datamembers
		System.out.println(p);
	//	System.out.println(a);
		int z=10;	//static int z=10;
	}
	public static void main(String[] args) {
		GlobalVariable object = new GlobalVariable();
		object.method2();   //b=0
		object.method1();	//b=100
		object.method2();	//b=100
		method3();
		System.out.println();
		System.out.println(object.b);
		System.out.println(object.c);
		System.out.println(object.d);
		System.out.println(p);
		System.out.println(q);
	}
}