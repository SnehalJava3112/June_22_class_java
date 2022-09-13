package com.aspire.java.datatypes;

public class DataTypes 
{
	public static void main(String[] args) 
	{
		byte aa=100;
		byte x=100;
		short bb=20;
		int c=30;
		long d=100;
		
		/*byte sum;   // byte is very short here so use int
		sum=a+x;	  // byte range is vary here
		syso(sum);	  // so always use int and long mostly
					  // having more memory for int and long
		*/
		long m = 9223372036854775807l; // use l at last so that compiler knows that this is long type not human error
		float e=10.8f; // f adding at last
		double s=12355.67892d;  //d have to add at last
		
		boolean f=true;
		boolean h=false;
		
		char z=65;
		char y='A';
		int sum = z+y;  //65+65
		System.out.println(sum);
		
		int a=10;
		char b='@';  // @=64
		int total=a+b;  //97+10
		System.out.println(total);
		
		// non-primitive data types
		String fname="Snehal";
		String lname=" Patil";
		System.out.println(fname+lname);
		
		//string nm="Snehal";  //string cannot be resolved type in java
		//System.out.println(nm);		
	}

}
