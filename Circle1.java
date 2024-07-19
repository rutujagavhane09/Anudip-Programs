package com.corejava.demo;

public class Circle1 
{
	double radius;

	public Circle1(double radius) 
	{
		this.radius = radius;
	}
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	public void calculateArea() 
	{
		System.out.println("Area of the circle: " + 3.14*radius*radius);
	}
	public void calculateCircumference() 
	{
		System.out.println("Circumference of the circle: " + 2*3.14*radius);
	}

	public static void main(String[] args) 
	{
		Circle1 circle = new Circle1(5);
		circle.calculateArea();
		circle.calculateCircumference();

		circle.setRadius(7);  
		circle.calculateArea();
		circle.calculateCircumference();
	}

}
