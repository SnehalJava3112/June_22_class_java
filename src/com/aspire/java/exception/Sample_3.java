package com.aspire.java.exception;

public class Sample_3 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		int b=0;
		
		try 
		{	//risky code
			System.out.println(a[5]/b);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Please do not use zero value for division");
		}
		catch(ArrayIndexOutOfBoundsException arie)
		{
			System.out.println("Use index smaller than "+a.length+" from array.");
		}
		catch(Exception e)
		{
			System.out.println("Super execption who handles all type of exceptions");
		}
		finally 
		{
			System.out.println("finally block written at the end, count = 0 or 1 but its opional");
		}
		System.out.println("Great program");
	}
}