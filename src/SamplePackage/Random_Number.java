package SamplePackage;

import java.util.Random;
import java.util.Scanner;

public class Random_Number 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter Max range for random number = ");
		int range = s.nextInt();
		
		System.out.println("How many random numbers you want = ");
		int count = s.nextInt();

		
		for(int i=0; i<count; i++)
		{
			Random randomNum = new Random();
			System.out.print(randomNum.nextInt(range)+" ");
		}
	}
}
