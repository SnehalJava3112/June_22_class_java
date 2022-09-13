package com.aspire.java.conditionalStatement;

/* marks not more than 100,
   marks more than 75, its distinction,
   marks more than 40, its pass
   marks less than 40, its fail
*/

public class Else_if 
{
	public static void main(String[] args) 
	{
		int obtainedMarks=74;
		int passingMarks=40;

		if(obtainedMarks >= 100)
		{
			System.out.println("Out of bound !");
		}
		else if(obtainedMarks>=75)
		{
			System.out.println("Distnction");
		}
		else if(obtainedMarks>=60)
		{
			System.out.println("First class");
		}
		else if(obtainedMarks>=passingMarks)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
