package SamplePackage;

import java.util.Scanner;

public class Swap_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter no1 = ");
		Scanner s = new Scanner(System.in);
		int no1 = s.nextInt();
		System.out.println("Enter no2 = ");
		int no2 = s.nextInt();
		
		int no3 = no1;
		no1 = no2;
		no2 = no3;
		
		System.out.print("Swapping numbers are = ");
		System.out.print(no1+" ");System.out.println(no2);
	}
}
