package SamplePackage;

import java.util.Scanner;

public class Sum_Digits 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number = ");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int sum = 0;
		int dig = 0;
		while(no>0)
		{
			dig=no%10;
			sum+=dig;
			no=no/10;
		}
		System.out.println("Sum of digits = "+sum);
	}
}
