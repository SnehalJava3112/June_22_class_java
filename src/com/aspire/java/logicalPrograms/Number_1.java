package com.aspire.java.logicalPrograms;

//1
//11
//111
//1111
//11111

/*public class Number_1 
{
	public static void main(String[] args) 
	{
		int rows=1;
		while(rows<=5)
		{
			int count=1;
			while(count<=rows)
			{
				System.out.print("1");
				count++;
			}
			rows++;
			System.out.println();
		}
	}
}*/


//1
//23
//456
//78910

//rows=4; count=4

/*public class Number_1 
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int rows=1; rows<5; rows++)
		{
			for(int count=1; count<=rows; count++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
}*/

//1
//23
//345
//4567
//56789

//rows=5; count=4

public class Number_1 
{
	public static void main(String[] args) 
	{
		for(int rows=1; rows<=5; rows++)
		{
			for(int count=1; count<=rows; count++)
			{
				System.out.print(rows+count-1);
			}
			System.out.println();
		}
	}
}