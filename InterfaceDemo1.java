package com.interfaceExamples;

interface student
{
	String a="Rohit";
}
public class InterfaceDemo1 implements student
{
	public static void main(String args)
	{
		System.out.println("--> "+ System.getProperty(student.a));
	}
}
