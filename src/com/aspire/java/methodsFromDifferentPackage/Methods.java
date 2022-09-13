package com.aspire.java.methodsFromDifferentPackage;

/* static method only access static variables.
   if method is static, no need to write keyword as static, by default its static.
   Outside of static method, you have to put keyword as static for method and variables.
   b=20, have to write as static , outside the method,
   b=30, by default its static. Sum is also static.
*/

public class Methods 
{
	public static void method5()
	{
		System.out.println("Static method 5 from differnt package.");
	}
	
	public void method16()
	{
		System.out.println("non static method 16 from different package.");
	}
}
