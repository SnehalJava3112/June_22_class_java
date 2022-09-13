package com.aspire.java.typeCasting;

// lower to higher data type
// memory loss
// byte  short  int  long  float  double
//  1  	   2	 4    8      4      8

public class PremitiveImplicit 
{
	public static void main(String[] args) 
	{
		byte a = 127;	// byte range is -128 to 127
		byte b = 100;
		
		int sum = a+b;
		short c = a;
		int d = a;
		long e = a;
		float f = a;
		double g = a;
		
		System.out.println(a);
		System.out.println(sum);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		long i = 98765432123l;
		float j = i;
		System.out.println(j);
	}
}
