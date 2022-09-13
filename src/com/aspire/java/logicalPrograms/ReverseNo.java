package com.aspire.java.logicalPrograms;
import java.util.*;

// Reverse no --> 123 --> 321

public class ReverseNo 
{
	public static void main(String[] args) 
	{

		System.out.println("Enter integer no : ");
		Scanner scan = new Scanner(System.in);
		int no=scan.nextInt();
		
		int rev = 0, rem = 0;
		
		while(no>0)
		{			
			rem=no%10;		// 3	2	1
			rev=rev*10+rem;	// 30+2*10
			no=no/10;		// 123/10-->12/10-->1/10-->0
		}
		System.out.println(rev);
	}
}
