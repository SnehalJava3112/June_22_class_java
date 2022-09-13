package com.aspire.java.typeCasting;

public class UpCasting_Test 
{
	public static void main(String[] args) 
	{
		System.out.println("***Parent class***");
		UpCasting_Parent p = new UpCasting_Parent();
		p.farm();
		p.house();
		
		System.out.println("\n***Child class***");
		UpCasting_Child c = new UpCasting_Child();
		c.car();
		c.farm();
		c.house(); 
		
		// creating object of child class with ref of parent class name --> parent class methods are running
		System.out.println("\n***Parent class-Up casting***");
		
		UpCasting_Parent pc = new UpCasting_Child();
		
		pc.farm();	// child running (if available in both --> first check for child and then for parent)
		pc.house();	// parent running
		//pc.car();	// not possible --> only parent methods are running 
		
		
		/* Example : casting is used for wed applications
		 WebDriver	  = parent class
		 ChromeDriver = child class
		WebDriver driver = new ChromeDriver();
		*/
	}
}
