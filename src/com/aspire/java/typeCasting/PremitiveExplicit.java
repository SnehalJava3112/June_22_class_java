package com.aspire.java.typeCasting;

// higher to lower data type
// data loss
// byte range is -128 to 127
// -128 to 127, next cycle starts from -128 till 127 and go on

public class PremitiveExplicit
{
	public static void main(String[] args)
	{
		int a = 257;
		//byte b = a;	byte is lower, int is higher data type
		byte b = (byte)a;
		System.out.println("int value = "+a);
		System.out.println("byte value = "+b);
		
		float c = 145656848985.62055f;
		int d = (int)c;
		System.out.println("float value = "+c);
		System.out.println("int value = "+d);
		
		long x = 9874563214569852l;
		double y = 56325411.236987456221d;
	}
}
