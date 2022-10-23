package SamplePackage;

import java.util.Scanner;

//Print the count of the given number

public class Count_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int count=0;
		while(no>0)
		{
			no=no/10;
			count++;
		}
		System.out.println("Digits in number = "+count);
		
	}
}
