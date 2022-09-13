package com.aspire.java.oops.interface2;

public class Idea implements TelecomInterface
{
	public void calling()
	{
		System.out.println("200 Rs per month 1 p/s plan");
	}
	public void sms()
	{
		System.out.println("Monthly 1000 sms");
	}
	public void internet()
	{
		System.out.println("Per day 1.5 gb");
	}
	public void gaming()
	{
		System.out.println("Free gaming subscription");
	}
}
