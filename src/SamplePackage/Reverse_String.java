package SamplePackage;

import java.util.Scanner;

// Reverse the String
public class Reverse_String 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String = ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Reverse String = ");
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
