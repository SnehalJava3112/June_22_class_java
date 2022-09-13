package com.aspire.java.typeCasting;

public class UpCasting_Child_Var extends UpCasting_Parent_Var
{

	int a = 20;
	int c = 30;

	public void display()
	{
		System.out.println("this.a = "+this.a);
		System.out.println("super.a = "+super.a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}