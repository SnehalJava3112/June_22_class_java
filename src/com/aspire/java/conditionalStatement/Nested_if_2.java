package com.aspire.java.conditionalStatement;
/*
 App Login -> username password OTP
 */


public class Nested_if_2 
{
	public static void main(String[] args) 
	{
		String username = "Snehal";
		String password = "Snehal@123";
		int OTP = 416589;
		
		if(username == "Snehal")
		{
			if(password == "Snehal@123")
			{
				if(OTP == 41689)
				{
					System.out.println("Login sucessfully.");
				}
				else
				{
					System.out.println("Invalid OTP.");
				}
			}
			else
			{
				System.out.println("Invalid password.");
			}
		}
		else
		{
			System.out.println("Invalid username.");
		}
	}
}
