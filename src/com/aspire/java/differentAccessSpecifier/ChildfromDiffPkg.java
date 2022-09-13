package com.aspire.java.differentAccessSpecifier;
import com.aspire.java.accessSpecifier.*;

// with inheritance from diff pkg
// protected can access in diff pkg, diff child class

public class ChildfromDiffPkg extends Sample
{
	public static void main(String[] args) 
	{
		Sample object4 = new Sample();
		
//		object4.method1(); private cannot access in diff pkg
//		object4.method2(); protected cannot acess in diff pkg
//		object4.method3(); default cannot acess in diff pkg
		object4.method4();
		
		ChildfromDiffPkg c = new ChildfromDiffPkg();
		//c.method1();  private cannot access in child class.
		c.method2();
		//c.method3();  default cannot access in diff pkg
		c.method4();
	}
}
