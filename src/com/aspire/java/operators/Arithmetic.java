package com.aspire.java.operators;

public class Arithmetic 
{
	public static void main(String[] args)  
	{	
		// Arithmetic operators
		
		int a=8, b=3, c=5;
		
		int add, sub, multi, div, remin;
		add=a+b+c; sub=a-b; multi=a*b; div=a/b; remin=a%b;
		
		float division;
		float aa=8.0f, bb=3.0f;  // same for double
		division=aa/bb;
		
		System.out.println(add); 
		/*System.out.println(sub);
		System.out.println(multi);
		System.out.println(div);
		System.out.println(remin);
		System.out.println(division);	*/
		
		System.out.printf("%d %d %f",add, sub, division);// print multiple variables in single syso statement
		System.out.printf("\n%d,%d,%f",add, sub, division); //comma seperated variables
		System.out.printf("\n%d %d %d",multi, div, remin);
	}
}
