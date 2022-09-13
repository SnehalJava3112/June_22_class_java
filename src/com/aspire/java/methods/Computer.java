package com.aspire.java.methods;

/* Program for one package, two classes.
  
   access the methods of other class by creating object.
   Method name = first character should be in small case.
   
   Here, there are 2 classes, but we can save the program with only one class name which is having main() method.
   
   1. class Computer = constructor of Computer(), computer_method(), main() method.
   2. class Laptop = constructor of Laptop(), laptop_method()
   
   If we create an object of class, by default constructor is running behind.
 */

public class Computer 
{
	   Computer()      // Constructor of class Computer. Constructor name is same as class name.
	   {
	      System.out.println("This is constructor of Computer class.");
	   }
	   
	   public static void computer_method() // computer class method having printing statement.
	   {
	      System.out.println("Computer method is running.");
	   }
	   
	   public static void main(String[] args)     // Main method
	   {
	      Computer.computer_method();  // method class by class_name.method_name
	      Laptop.laptop_method();
	   }
}
class Laptop 
{
   Laptop()    // Constructor of class Laptop. Simple print statement.
   {
	      System.out.println("This is constructor of Laptop class.");
   }
   public static void laptop_method() // computer class method having printing statement.
   {
	   System.out.println("Laptop method is running.");
   }
}

/*
Output:

This is constructor of Computer class.
Computer method is running.
This is constructor of Laptop class.
Laptop method is running.
*/