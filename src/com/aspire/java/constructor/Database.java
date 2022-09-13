package com.aspire.java.constructor;

public class Database 
{
	// Variable declaration
	String name;
	int mobNo;
	static String principalName;
	static String collegeName;
	
    // comment to mulitple lines :		ctl+shift+/  or  ctrl+/
	// uncomment to mulitple lines :	ctl+shift+\  or  ctrl+\
	
	// Variable initialization
	
	 Database() 
	 { 
		  System.out.println("****Constructor body****");
		  System.out.println("Student name = "+name);
	  	  System.out.println("Student Mobile = "+mobNo);
	  	  System.out.println("Principal name = "+principalName);
	   	  System.out.println("College name = "+collegeName); 
	 }
	 public void collegeData()
	 {
		System.out.println("****Method body****");
		System.out.println("Student name = "+name);
		System.out.println("Student Mobile = "+mobNo);
		System.out.println("Principal name = "+principalName);
		System.out.println("College name = "+collegeName);
		System.out.println();
	 }
}
