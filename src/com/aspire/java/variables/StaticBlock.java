package com.aspire.java.variables;

/* static block --> used for native methods(other lang code)
				--> initialize static variables
				--> multiple static blocks can write in class
				--> execution is from top to bottom, then main()
				--> without main method we can execute static block for version below 1.6
				--> above version 1.6, JVM neesd main method first
*/

public class StaticBlock
{
	static
	{
		System.out.println("Hello,");
	}
	public static void main(String[] args) 
	{
		System.out.print("I am in main method");
	}
	static
	{
		System.out.println("Good Morning");
	}
}
