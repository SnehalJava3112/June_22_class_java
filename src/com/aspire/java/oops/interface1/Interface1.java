package com.aspire.java.oops.interface1;

// Interface dont having all static members
// don't having any constructor, so no initialization of var
// so its static. Here 'int a' is static by default

public interface Interface1	// Parent interface
{
	int a=10;			// by defalut static
	static int b=20;
	
	public void farm();
	public void bunglow();
	public void gold();
	
	public static void demo()
	{
		// allowed static in interface
	}
}
