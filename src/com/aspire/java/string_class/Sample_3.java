package com.aspire.java.string_class;

public class Sample_3 
{
	public static void main(String[] args) 
	{
		String a="Snehal Shailesh Sharvil Patil.";
		String b="snehal";
		String s=" ";
		System.out.println("a.length() = "+a.length());
		System.out.println("a.charAt(26) = "+a.charAt(26));
		System.out.println("a.indexOf('p') = "+a.indexOf('p'));
		System.out.println("a.indexOf('S') = "+a.indexOf('S'));
		System.out.println("a.lastIndexOf('S') = "+a.lastIndexOf('S'));
		
		System.out.println();
		System.out.println(a.endsWith("Patil"));    // f
		System.out.println(a.endsWith("Patil.")); 	// t have space 
		System.out.println(a.startsWith("Snehal")); // t
		
		System.out.println();
		System.out.println(a.contains("shailesh")); // f
		System.out.println(a.contains("Shailesh")); // t
		
		System.out.println("a.substring(5)    = "+a.substring(5));
		System.out.println("b.substring(2,5)  = "+b.substring(2,5));	// 2 to (5-1)
		System.out.println("a.substring(5,19) = "+a.substring(5,19));  // 5 to (19-1)
		
		System.out.println();
    	System.out.println(a.concat(b));
    	
		String c=a.concat(s).concat(b);
		System.out.println(c);
		
		String d=a.replace("Patil", "Dharigouda");
		System.out.println(d);
		System.out.println(a);  // its not peranent change in a string
		
	}
}