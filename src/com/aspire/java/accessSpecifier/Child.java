package com.aspire.java.accessSpecifier;

//with inheritance
//private -> only in same class. not for others

public class Child extends Sample
{
	public static void main(String[] args) 
	{
		Sample p = new Sample();
		//p.method1();	// private cannot access in child class
		p.method2();
		p.method3();
		p.method4();
		
		Child c = new Child();
		//c.method1();  private cannot access in child class.
		c.method2();
		c.method3();
		c.method4();
	}
}
