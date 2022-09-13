package com.aspire.java.oops.abstractClass;

public class Test 
{
	public static void main(String[] args) 
	{
		GrandChild gc = new GrandChild();
		gc.farm();
		gc.bunglow();
		gc.car();
		gc.addition();
		
		// sample() is static, present in parent class so you can access 
		// call in 3 ways parent, child, grandchild.
		// checking Grandchild-->Child -->Parent
			
		Parent.sample();
		Child.sample();
		GrandChild.sample();
	}
}

/*
Static method cannot be abstract?
=> Abstract method is imcoplete method, method body is not present.
=> Static method needs method body, cannot make incomplete.
=> We cannot create instance of static method.
=> For static method, memory is allocated at once.
=> So we cannot define again in subclass.
*/ 

