package com.aspire.java.operators;

public class Assignment 
{
	public static void main(String[] args) 
	{
		int a=18,b=3,c=10,d=6,e=0;
		System.out.println("Original a="+a);
		a+=b;      //a=a+b;  //overwrite value of a. Reassignment of a
		System.out.println("a+b="+a);
		System.out.println("new a="+a);
		
		a-=c;    //a=a-c   21-10=11
		System.out.println("after substraction a="+a);
		
		a%=d;    //a= a%d= 11%6= 5(reminder value)
		System.out.println("mod res a="+a);
		
		e=a;      // store value of a into e.  
		System.out.println("e=a="+e);
		
		a=90;
		System.out.println("a="+a);
		System.out.println("e="+e);
		
	}
}
