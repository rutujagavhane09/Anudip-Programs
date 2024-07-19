package com.corejava.demo;

public class SampleSecond 							// 3
{
	int x=10;										// 4
	public void method1()							// 6
	{
		System.out.println("Value of x = "+x);		// 7
	}
	
	public static void main(String args[])			// 1
	{
		SampleSecond ss1=new SampleSecond();		// 2
		ss1.method1();								// 5
	}
}
// 	