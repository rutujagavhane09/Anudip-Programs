package com.corejava.demo;

class Shape 
{
	public void getArea() 
	{
		System.out.println("getArea method from Shape Class");
	}
}

class Rectanglee extends Shape 
{
	int length;
	int width;

	public Rectanglee(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}
	@Override
	public void getArea() 	
	{
		System.out.println("Area of Rectangle is "+length * width); 
	}
	
	public static void main(String[] args) 
	{
	     Rectanglee rectangle = new Rectanglee(7, 4);
	     rectangle.getArea();
	}
}