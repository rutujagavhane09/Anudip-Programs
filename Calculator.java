package com.corejava.demo;

class ABC
{
	public void add(int a, int b)
	{
		System.out.println("In ABC class");
	}
}

class PQR
{
	public void add(int a, int b)
	{
		System.out.println("in PQR class");
	}
}

public class Calculator 
{
	public static void main(String args[])
	{
		ABC obj=new ABC();
		obj.add(2,3);
		
		ABC obj1=new PQR();  //upcasting
		obj1.add(2, 9);
	}
}
