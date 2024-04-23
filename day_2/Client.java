package com.passbyreferencedemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"King",78000);
		Employee e2=new Employee(2,"Ernst",67000);
		
		PrintToScreen.printDetails(e1);
		PrintToScreen.printDetails(e2);
		

	}

}
