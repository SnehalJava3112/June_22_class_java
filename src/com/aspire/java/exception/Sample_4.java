package com.aspire.java.exception;

public class Sample_4 
{
	public static void main(String[] args) 
	{
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		int b=0;
		int c=10;
		int d=0;
		try
		{
			d=a[8]/c;
			System.out.println("d="+d);
			try
			{	
				System.out.println(c/d);
			}
			catch (ArithmeticException ae)
			{
				System.out.println("division by zero");
			}
			catch (Exception e)
			{
				System.out.println("Other all exceptions");
			}
			finally
			{
				System.out.println("Inner finally block");
			}
		}
		catch(ArrayIndexOutOfBoundsException arie)
		{
			System.out.println("Array index incorrect");
		}
		catch (Exception e)
		{
			System.out.println("Other all exception");
		}
		finally 
		{
			System.out.println("Outer finally block");
		}
	}
}