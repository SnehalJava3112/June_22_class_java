package SamplePackage;

import java.util.Scanner;

public class Palindrom_No 
{
	public static void main(String[] args) 
	{				
		
// Palindrom from 1-100		
		for (int n = 1; n <= 100; n++) 
		{
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) 
			{
				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;
			}
			if (n == j) 
				System.out.println(n);
		}
		System.out.println();
		
// String palindrome	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name or number which have to check : ");
		
		String name=s.nextLine(); 
		String temp="";
		for(int i=name.length()-1; i>=0 ;i--)
		{
			temp=temp+name.charAt(i);
		}
		
		if(temp.equals(name)) //temp==name --> int 
			System.out.println(name+" is palindrome");	
		else
			System.out.println(name+" is not palindrome");
		
// Number palindrome
		int no=s.nextInt();
	    int tempNo=no;
		int rem=0, rev=0;
		while(no>0)
		{
			rem=no%10;//3
			rev=rev*10+rem;
			no=no/10;//15				
		}
		System.out.println(rev);
		if(rev==tempNo)
			System.out.println(rev+" is palindrome");
		else
			System.out.println(rev+" is not palindrome");


	}
}
