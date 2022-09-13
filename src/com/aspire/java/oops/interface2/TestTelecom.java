package com.aspire.java.oops.interface2;

public class TestTelecom 
{
	public static void main(String[] args) 
	{
		System.out.println("*****Idea*****");
		Idea i = new Idea();
		i.calling(); i.sms(); i.internet(); i.gaming();
		System.out.println();
		
		System.out.println("*****Jio*****");
		Jio j = new Jio();
		j.calling(); j.sms(); j.internet(); j.hotstar();	
	}
}
