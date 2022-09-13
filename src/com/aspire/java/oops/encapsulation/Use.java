package com.aspire.java.oops.encapsulation;

public class Use 
{
	public static void main(String[] args) 
	{
		Define d = new Define();
		d.setName("Snehal");
		d.setMobNo(123456);
		
		System.out.println("Name   = "+d.getName());
		System.out.println("Mob No = "+d.getMobNo());
	}
}
