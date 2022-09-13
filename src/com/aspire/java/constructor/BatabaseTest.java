package com.aspire.java.constructor;

public class BatabaseTest 
{
	// Usage
	public static void main(String[] args) 
	{		
		Database Snehal = new Database();
		Snehal.name = "Snehal Patil";
		Snehal.mobNo = 123456789;
		Database.principalName = "Shailendra";
		Database.collegeName = "COEP";
			
		Snehal.collegeData();
		
		Database Sharvil = new Database();
		Sharvil.name = "Sharvil Patil";
		Sharvil.mobNo = 987456321;
		
		Sharvil.collegeData();
	}
}
