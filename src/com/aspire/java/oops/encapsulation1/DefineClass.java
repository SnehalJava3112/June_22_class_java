package com.aspire.java.oops.encapsulation1;

public class DefineClass 
{
	String name = "Snehal";
	private int UID = 987;
	int MobNo = 1234567890;
	
	public void customerData()
	{
		System.out.println(name);
		System.out.println(UID);	
		System.out.println(MobNo);
	}
}



// data member private --> wrap into other datamember(class/method)
// private member cannot accessible in other class
// private member indirectly called by method
// no direct call to private member in other class