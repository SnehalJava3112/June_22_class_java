package com.aspire.java.string_class;

public class Builder_Class
{
	public static void main(String[] args) 
	{
		String s="Snehal Patil 3112";
		String[] word = s.split(" ");
		String reverseword="";
		for(String w:word)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseword = reverseword+sb.toString()+" ";
		}
		System.out.println(reverseword);
	}

}