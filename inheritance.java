package com.corejava.demo;
//method overloading
public class inheritance 
{
	int a;
	float b, res;
	public void add(int a, float b)
	{
		res=a+b;
		System.out.println(res);
		System.out.println(res);
	}
	public void add(float a, float b)
	{
		res=a+b;
		System.out.println(res);
		System.out.println(res);
	}
	public void add(float a, int b)
	{
		res=a+b;
		System.out.println(res);
		System.out.println(res);
	}
	
	public static void main(String args[])
	{
		inheritance cal= new inheritance();
		cal.add(2.4f,3);
		//cal.add(2,3,9);
		//cal.add(2,3,5,9);
	}
}
