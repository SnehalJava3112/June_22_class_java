package com.aspire.java.methods;

/* main method is used to execute the program. 
   Compiler finds this main method for start the execution. 
   Only one main method is present in one program.
   Code within main method is executable code.
 */

public class Sample 
{
	public static void main(String[] args)  
	{
		browserLaunch();
		login();
		for(int i=1; i<=100; i++)
		{
			logout();
		}
	}
	public static void browserLaunch()
	{
		// 4 lines
		// code of launch
	}
	public static void login()
	{
		//10 lines * 100 users = 1000 lines
		// code of login page
	}
	public static void logout()
	{
		// 4 lines
		// code of logout
	}
}
