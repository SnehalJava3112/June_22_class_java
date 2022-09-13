package com.aspire.java.constructor;

public class WithConstructor 
{
	// instant variables not need to assign value. taking default values.
	
	int a=56;    // non static
	float b;
	char c;
	String d;
	boolean e;
	
	// user defined constructor without parameter
	WithConstructor() // default constructor
	{ 
		
		a=10;
		b=12.36f;
		System.out.println("Constructor calling...");
		c='A';
		d="Snehal";
		e=true;
	}
	
	public void method()
	{
		int z = 20;
		System.out.println("Method starts here...");
		System.out.println(a); // 0=int and long
		System.out.println(b); // 0.0=float and double
		System.out.println(c); // char=blank space
		System.out.println(d); // string=null
		System.out.println(e); // false
		
		System.out.println(z); // local variable have to assign value
	}
	
	public static void main(String[] args) 
	{
		WithConstructor object = new WithConstructor();
		object.method();
	}
}

