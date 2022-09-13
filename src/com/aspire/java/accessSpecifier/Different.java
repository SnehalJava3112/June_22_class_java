package com.aspire.java.accessSpecifier;

// without inheritance

public class Different 
{
	public static void main(String[] args) 
	{
		Sample object3 = new Sample();
		//object3.method1();	// private cannot access in diff class
		object3.method2();
		object3.method3();
		object3.method4();
		
		Child c = new Child(); // without inheritance
		//c.method1();  private cannot access in child class.
		c.method2();
		c.method3();
		c.method4();
	}
}
