package SamplePackage;

import java.util.Scanner;

//To find even/odd number
public class Even_Odd 
{
	public static void main(String[] args)
	{
		System.out.println("Enter number = ");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		
		if(no % 2 == 0)
			System.out.println("Number "+no+" is Even.");
		else
			System.out.println("Number "+no+" is Odd.");
		
	}
}
