package com.corejava.demo;

public class Rectangle 
{
	int width;
	int height;

	public Rectangle(int width, int height) 
	{
		this.width = width;
	    this.height = height;
	}

	    // Method to calculate area
	public void calculateArea() 
	{
		System.out.println("Area of the rectangle: " + width * height);
	}
	public void calculatePerimeter() 
	{
		System.out.println("Perimeter of the rectangle: " + 2 * (width + height));
	}
	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle(5, 3);
		rectangle.calculateArea();
	    rectangle.calculatePerimeter();
	}
}
