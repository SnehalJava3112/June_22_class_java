package com.aspire.java.loops;
/*do
{
loop body
}
while(condition);
*/
/*
// print no from 1-5
public class Do_while_loop 
{
	public static void main(String[] args) 
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=5);
		
		System.out.println("Outside loop, i="+i);
	}
}*/

// marks checking
public class Do_while_loop 
{
	public static void main(String[] args) 
	{
		int passingMarks=40;
		int obtainedMarks=10;
		do
		{
			System.out.println("Apper for exam." + obtainedMarks);
			obtainedMarks=obtainedMarks+5;
		}while(obtainedMarks<passingMarks);
		
	}
}
