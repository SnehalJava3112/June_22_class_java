package com.aspire.java.string_class;

import java.util.Scanner;

public class Reverse_Word_Lettrs 
{
	public static void main(String[] args) 
	{
//// With user input
		System.out.print("Enter your input String = ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
// Normal string 
		System.out.print("Input String = "+input);

// Reverse whole string 
		System.out.print("\nReverse whole String = ");
		for(int j=input.length()-1; j>=0; j--)	
			System.out.print(input.charAt(j));
		
// Reverse word wise without change postion
		System.out.print("\nReverse string word wise = ");

		String[] splitWord = input.split(" ");
		
		for(int i=0; i<splitWord.length; i++)
		{
			char[] words = splitWord[i].toCharArray();
			for(int j=words.length-1; j>=0; j--)
			{
				System.out.print(words[j]);
			}
			System.out.print(" ");
		}
	}
} 
