package com.aspire.java.conditionalStatement;
//Days of week 1-Sunday, 2-Monday....
public class Switch_1 
{
	public static void main(String[] args) 
	{
		int day=8; // try for 3,5,8,0,-2 
		switch(day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;  //try this one also, without break
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:   // other than 1-7.   0,-5 are valid
			System.out.println("Invalid input");
			break;
		}
	}
}