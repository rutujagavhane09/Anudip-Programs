/*Question: Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle. */
package com.corejava.demo;

public class Rectangle //declares a class named Rectangle.
{
	int width; //declare two instance variables: width and height
	int height;

	public Rectangle(int width, int height) //This is a constructor method for the Rectangle class.
	{
		this.width = width; //It initializes the width and height instance variables with the values passed as arguments when creating a new Rectangle object.
	    this.height = height;
	}

	// Method to calculate area
	public void calculateArea() 
	{
		System.out.println("Area of the rectangle: " + width * height); //calculates the area of the rectangle by multiplying its width and height, and then prints the result to the console.
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of the rectangle: " + 2 * (width + height)); //calculates the perimeter of the rectangle by adding twice its width and twice its height, and then prints the result to the console.
	}
	public static void main(String[] args) //This is the main method
	{
		Rectangle rectangle = new Rectangle(5, 3); //It creates a new Rectangle object with width 5 and height 3 using the constructor
		rectangle.calculateArea(); //calls the calculateArea method
	    rectangle.calculatePerimeter(); //calls the calculatePerimeter method
	}
}
/*OUTPUT:
Area of the rectangle: 15
Perimeter of the rectangle: 16
 */