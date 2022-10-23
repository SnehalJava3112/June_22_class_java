package SamplePackage;

import java.util.Scanner;

public class Swap_No_without3 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter two swapping numbers = ");
		Scanner s = new Scanner(System.in);
		int no1 = s.nextInt();
		int no2 = s.nextInt();
		
		no1 = no1+no2;
		no2 = no1-no2;
		no1 = no1-no2;
		System.out.print("Swapping numbers are = ");
		System.out.print(no1+" ");System.out.println(no2);
	}
}
