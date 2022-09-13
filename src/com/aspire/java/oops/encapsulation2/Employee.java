package com.aspire.java.oops.encapsulation2;

class Company 
{
	private int emp_id;
	private String emp_name;
	public void setEmpid(int id, String name)
	{
		emp_id = id;
		emp_name = name;
	}
	public int getEmpid()
	{
		System.out.println(emp_name);
		return emp_id;
	}
}

public class Employee
{
	public static void main(String[] args) 
	{
		Company c = new Company();
		c.setEmpid(5, "Snehal");
		System.out.println(c.getEmpid());
	}
}