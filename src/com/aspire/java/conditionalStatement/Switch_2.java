package com.aspire.java.conditionalStatement;

// ATM = BC,CW,PC,FT,MS

public class Switch_2 
{
	public static void main(String[] args) 
	{
		String option="FT";  // try only for blank, ""," ",ft(case sensitive)
		switch(option)
		{
		case "BC":
			System.out.println("Balance Check");
			break;
		case "CW":
			System.out.println("Cash Withdraw");
			break;
		case "PC":
			System.out.println("Pin Change");
			break;
		case "FT":
			System.out.println("Fund Transfer");
			break;
		case "MS":
			System.out.println("Mini Statement");
			break;
		default:
			System.out.println("Invalid input");
			//break;
		}
	}
}
