package com.interfaceExamples;

interface stu
{
	int a=10;
	void runnig();
}
public class TestInterface 
{
	void running()
	{
		System.out.println("Rohit Sharma");
	}
	public static void main(String[] args) 
	{
		TestInterface obj=new TestInterface();
		obj.running();
		System.out.println(stu.a);
	}
}
