package com.aspire.java.string_class;

public class Sample_4 
{
	public static void main(String[] args)
	{
// split stmt by space
		String a="Aspire Training Institute Pune";
		String[] ar=a.split(" ");
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+", ");
		}
		
// split single word in reverse order
		System.out.println();
		String b="snehal";
		String[] br=b.split("");
		for(int j=br.length-1; j>=0; j--)
		{
			System.out.print(br[j]+",");
		}
		
// reverse the single word
		System.out.println();
		String c = "sharvil";
		for(int k=c.length()-1; k>=0; k--)
		{
			System.out.print(c.charAt(k));
		}

	}
}