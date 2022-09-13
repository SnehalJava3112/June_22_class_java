package com.aspire.java.oops.encapsulation1;

public class UseClass 
{
	public static void main(String[] args) 
	{
		DefineClass object = new DefineClass();
		System.out.println(object.MobNo);
		System.out.println(object.name);
		//System.out.println(object.UID);	private member cannot accessible in other class	
		System.out.println();
		
		object.customerData();
	}
}
