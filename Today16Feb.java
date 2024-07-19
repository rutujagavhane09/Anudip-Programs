package com.corejava.demo;

public class Today16Feb 
{
	int a,b;
	
	Today16Feb()
	{
		this.a=10;
		b=20;
	}
	public Today16Feb get()
	{
		return this;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[])
	{
		Today16Feb obj=new Today16Feb();
		System.out.println(obj);
		obj.get().display();
	}
}
