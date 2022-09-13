package com.aspire.java.conditionalStatement;

public class If_1 
{
	public static void main(String[] args) 
	{
		//**  exam marks
		
		int obtainedMarks=47, passingmarks=40;
		if(obtainedMarks>=passingmarks)
		{
			System.out.println("Congratulations! you pass the exam.");
		}
		else
		{
			System.out.println("You are fail.");
		}
		
		//**  even and odd
		
		int num=21;
		if(num%2==0)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is Odd");
		}
	}
}
