package com.aspire.java.oops.inheritance.accessSpecifier;

// public 	 = anywhere in same, diff class, outside pkg too
// private 	 = no outside the class, not in child class, no outside pkg
// protected = outside class, in derived class, outside pkg by inheritance.


class Vehicle 
{
  protected String brand = "Ford";
  public void honk() 
  {
    System.out.println("Tuut, tuut! "+brand);
  }
}

public class Car extends Vehicle
{
  String modelName = "Mustang";
  public static void main(String[] args) 
  {
    Car myFastCar = new Car();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
