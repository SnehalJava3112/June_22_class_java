package com.aspire.java.methods;

import com.aspire.java.methodsFromDifferentPackage.Methods;

public class NonStaticMethod 
{
	public void method11()
	{
		System.out.println("non static method 11 from same class.");
	}
	public void method12()
	{
		System.out.println("non static method 12 from same class.");
	}
	public static void method13()
	{
		System.out.println("non static method 13 from same class.");
	}
	
	public static void main(String[] args) 
	{ 
		// from same class
		NonStaticMethod object1 = new NonStaticMethod();
		object1.method11();     // non-static method = call by object
		object1.method12();
		method13();            // static method = direct call  
		
		// from different class
		DifferentClass object2 = new  DifferentClass();
		object2.method14();
		object2.method15();
		DifferentClass.method3();     // static method from diff class. classname.methodname()
		
		// from different package
		Methods object3 = new Methods();
		object3.method16();
		Methods.method5();
		
	}
}
