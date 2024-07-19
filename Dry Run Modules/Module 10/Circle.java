/*Question: Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle. */
package com.corejava.demo;

public class Circle // declares a class named Circle.
{
	double radius; //declares an instance variable radius of type double

	public Circle(double radius) //constructor method for the Circle class
	{
		this.radius = radius; //It initializes the radius instance variable with the value passed as an argument when creating a new Circle object.
	}
	public void setRadius(double radius)
	{
		this.radius = radius; //It sets the radius instance variable to the value passed as an argument.
	}
	public void calculateArea() 
	{
		System.out.println("Area of the circle: " + 3.14*radius*radius); //calculates the area of the circle using the formula π * r^2 (where π is approximately 3.14). It prints the result to the console.
	}
	public void calculateCircumference() 
	{
		System.out.println("Circumference of the circle: " + 2*3.14*radius); //calculates the circumference of the circle using the formula 2 * π * r.
	}

	public static void main(String[] args) //main method
	{
		Circle circle = new Circle(5); //creates a new Circle object with a radius of 5 using the constructor
		circle.calculateArea(); //calling method
		circle.calculateCircumference();

		circle.setRadius(7); //changes the radius using the setRadius method
		circle.calculateArea();
		circle.calculateCircumference();
	}
}
/*OUTPUT:
Area of the circle: 78.5
Circumference of the circle: 31.400000000000002
Area of the circle: 153.86
Circumference of the circle: 43.96
*/