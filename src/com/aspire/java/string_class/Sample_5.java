package com.aspire.java.string_class;

public class Sample_5 
{
	public static void main(String[] args) 
	{
		
		String a="Aspire Training Institute Pune";
		String[] ar=a.split(" ");
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println();
		String b="aspire";
		String[] br=b.split("");
		for(int j=br.length-1; j>=0; j--)
		{
			System.out.print(br[j]+",");
		}
		System.out.println();
		for(int k=b.length()-1;k>=0; k--)
		{
			System.out.print(b.charAt(k));
		}
	}
}