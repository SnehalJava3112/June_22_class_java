package com.aspire.java.constructor;

public class Simple2 
{
	public static void main(String [] args)
	{
		Sample object1 = new Sample();
		object1.addition();
		//object1.multiplication();
		System.out.println();
		
		Sample object2 = new Sample(10,20);
		object2.addition();
		//object2.multiplication();
	}
}
