package com.corejava.demo;

class Shape1
{
	void draw()
	{
		System.out.println("This is Shape Class");
	}
	double calculateArea()
	{
		return 0;
	}
}

class Circle1 extends Shape1
{
	double radius;

	Circle1(double radius) 
	{
		this.radius = radius;
	}

	void draw() 
	{
		System.out.println("Drawing Circle");
	}
	
	double calculateArea()
	{
		return Math.PI * radius * radius;
	}
}

class Square extends Shape1
{
	double side;
	Square(double side)
	{
		this.side = side;
	}

	void draw() 
	{
		System.out.println("Drawing Square");
	}
	
	double calculateArea() 
	{
		return side * side;
	}
}

class Triangle extends Shape1
{
	double base;
	double height;

	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	void draw()
	{
		System.out.println("Drawing Triangle");
	}

	double calculateArea() 
	{
		return 0.5 * base * height;
	}	
}

public class ShapeMain 
{
	public static void main(String[] args) 
	{
		Circle1 circle = new Circle1(5);
		Square square = new Square(4);
		Triangle triangle = new Triangle(3, 6);

		circle.draw();
		System.out.println("Area of Circle: " + circle.calculateArea());

		square.draw();
		System.out.println("Area of Square: " + square.calculateArea());

		triangle.draw();
		System.out.println("Area of Triangle: " + triangle.calculateArea());
	}
}
