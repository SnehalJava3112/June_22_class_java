package com.aspire.java.differentAccessSpecifier;

import com.aspire.java.accessSpecifier.Sample;

// without inheritance

public class DiffClassFromDiffPkg 
{
	public static void main(String[] args) 
	{

		Sample object4 = new Sample();
		
//		object4.method1(); private cannot access in diff pkg
//		object4.method2();
//		object4.method3();	
		object4.method4();
		
		ChildfromDiffPkg c = new ChildfromDiffPkg();
		c.method4();
	}

}
