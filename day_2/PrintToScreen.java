package com.passbyreferencedemo;

public class PrintToScreen {
	
	public static void printDetails(Employee emp)
	{
		emp.setSalary(90000);
		System.out.println(emp.toString());
	}

}
