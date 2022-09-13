package com.aspire.java.logicalPrograms;

//*
//**
//***
//****
//*****
//rows=5 star=5

/*public class Star_3 
{
	public static void main(String[] args) 
	{
		for(int rows=1; rows<=5; rows++)
		{
			for(int column=1; column<=rows; column++)
			{
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}*/

//*****
//****
//***
//**
//*

public class Star_3
{
	public static void main(String[] args) 
	{
		for(int rows=1; rows<=5; rows++)
		{
			for(int column=rows; column<=5; column++)
			{
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
