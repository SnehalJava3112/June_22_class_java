package com.aspire.java.superThisKeyword;

/*
Variable searching :
1. local child class
2. global child class
3. global parent class

->Use only when duplicate variables are present in parent and child class.

->if variables are not duplicated, then use directly.

this -> global for same class
		(if not present, goto global parent)
	 -> skip local for same class
	 
super -> global for parent class
	  -> skip local for same class
	  -> skip local for same class
	 
*/
public class Child extends Parent
{
//	int a=10;	// Parent class
//	int b=20;	// Parent class
	
	int a=150;	// Child class- global variable
	int b=60;	// Child class- global variable
	int j=2;
	
	public void method()
	{
		int a=70;
		int b=80;
		int k=3;
		
		int sum=a+b;	// local a & b
		System.out.println("Sum = "+sum);
		
		int sum2=i+j+k+b;	// 1+2+3+80
		System.out.println("Sum_2 = "+sum2);
		
		int sum3=i+j+k+super.b;	// 1+2+3+20
		System.out.println("Sum_3 = "+sum3);
		
		System.out.println("local a = "+a);
		System.out.println("Global 'a' from child class = "+this.a);
		System.out.println("Global 'a' from parent class = "+super.a);
		
		int addition=super.a+this.b;	// 10+60
		System.out.println("Addition = "+addition);
		
		int addition2=this.a+super.b;	// 150+20
		System.out.println("Addition_2 = "+addition2);
		
		int addition3=super.a+b;	// 10+80
		System.out.println("Addition_3 = "+addition3);
	}
	
	public static void main(String[] args) 
	{
		Child object = new Child();
		object.method();
		
		Sample obj = new Sample();
		System.out.println("Outside class a = "+obj.a);
		System.out.println("Outside class static b = "+Sample.b);
		
	}
}
