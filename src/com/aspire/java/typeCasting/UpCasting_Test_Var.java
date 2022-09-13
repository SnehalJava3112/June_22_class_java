package com.aspire.java.typeCasting;

public class UpCasting_Test_Var 
{

	public static void main(String[] args) 
	{
		System.out.println("***Parent class***");
		UpCasting_Parent_Var p = new UpCasting_Parent_Var();
		System.out.println("a = "+p.a);
		System.out.println("b = "+p.b);
		
		System.out.println("\n***Child class***");
		UpCasting_Child_Var c = new UpCasting_Child_Var();
		c.display();
		
		System.out.println("\n***Parent class Up_casting***");
		UpCasting_Parent_Var pc = new UpCasting_Child_Var();
		System.out.println("a = "+pc.a);	// if same values --> taking value of parent class values
		System.out.println("b = "+pc.b);
		//pc.c;	    // not taking child class var 
	}
}