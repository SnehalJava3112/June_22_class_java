package com.aspire.java.constructor;

public class DefaultConstructor 
{
	// instant variables not need to assign value. taking default values.
	
	int a=56;    // non static
	float b;
	char c;
	String d;
	boolean e;
	
	// user defined constructor without parameter
	public DefaultConstructor() // default constructor
	{ 
		a=10;
		b=12.36f;
		c='A';
		d="Snehal";
		e=true;
	}
		
	public void method()
	{
		int z = 200;
		
		System.out.println("int --> "+a); // 0=int and long
		System.out.println("float --> "+b); // 0.0=float and double
		System.out.println("char --> "+c); // char=blank space
		System.out.println("string --> " +d); // string=null
		System.out.println("boolean --> " +e); // false
		
		System.out.println("local int --> " +z); // local variable have to assign value
	}
	
	public static void main(String[] args) 
	{
		DefaultConstructor object = new DefaultConstructor();
		object.method();
	}
}
