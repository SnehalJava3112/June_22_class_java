package com.aspire.java.string_class;

public class Sample_2 
{
	public static void main(String[] args) 
	{
		String a="";	// this is empty string
						// " " = not empty, space is also char
		System.out.println("a is "+a.isEmpty());
		
		String b="Snehal";
		String c=b.toUpperCase();
		String d="Sharvil Snehal Shailendra Patil";
		String e="snehal";
		
		System.out.println("a = "+a); 	//blank_space_output_as_a_is_null_string
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("b.toLowerCase() = "+b.toLowerCase());
		System.out.println("d.length() = "+d.length());
		System.out.println("d.charAt(23) = "+d.charAt(23));
		
		System.out.println(d.contains(b));	// t case sensitivity must
		System.out.println(b.contains(a));  // gap between single char to char
		
		System.out.println((d.toUpperCase()).contains(e.toUpperCase()));	// t
	}
}