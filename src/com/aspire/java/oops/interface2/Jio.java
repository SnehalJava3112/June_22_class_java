package com.aspire.java.oops.interface2;

public class Jio implements TelecomInterface
{
	public void calling()
	{
		System.out.println("150 unlimited calling");
	}
	public void sms()
	{
		System.out.println("100 sms per day");
	}
	public void internet()
	{
		System.out.println("Per day 2 gb");
	}
	public void hotstar()
	{
		System.out.println("Free 1 month subscription");
	}
}
