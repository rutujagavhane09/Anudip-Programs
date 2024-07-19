/*Question: Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method in 
each subclass to draw the respective shape. In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.*/

package com.corejava.demo;

// Base class representing a generic shape
class Shape 
{
    // Method to draw the shape
    void draw()
    {
        System.out.println("Draw Method of Shape class");
    }

    // Method to calculate the area of the shape
    double calculateArea()
    {
        return 0;
    }
}

// Class representing a circle, inheriting from Shape
class Circle extends Shape 
{
    double radius; // Variable to store the radius of the circle

    // Constructor to initialize the radius of the circle
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Override the draw method to print specific message for Circle
    @Override
    void draw() 
    {
        System.out.println("Drawing Circle");
    }

    // Override the calculateArea method to calculate the area of the circle
    @Override
    double calculateArea() 
    {
        return 3.14 * radius * radius;
    }
}

// Class representing a cylinder, inheriting from Circle
class Cylinder extends Circle 
{
    double height; // Variable to store the height of the cylinder

    // Constructor to initialize the radius and height of the cylinder
    public Cylinder(double radius, double height) 
    {
        super(radius); // Call the constructor of the Circle class
        this.height = height;
    }

    // Override the draw method to print specific message for Cylinder
    @Override
    void draw() 
    {
        System.out.println("Drawing Cylinder");
    }

    // Override the calculateArea method to calculate the surface area of the cylinder
    @Override
    double calculateArea() 
    {
        double circleArea = super.calculateArea(); // Calculate the area of the circular base
        double cylinderArea = 2 * 3.14 * super.radius * height + 2 * circleArea; // Calculate the total surface area
        return cylinderArea;
    }
}

// Main class to test the shapes
public class Shape2 
{
    public static void main(String[] args) 
    {
        // Create a Circle instance with radius 5
        Circle circle = new Circle(5);
        circle.draw(); // Draw the circle
        System.out.println("Area of Circle: " + circle.calculateArea()); // Print the area of the circle

        // Create a Cylinder instance with radius 3 and height 7
        Cylinder cylinder = new Cylinder(3, 7);
        cylinder.draw(); // Draw the cylinder
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea()); // Print the surface area of the cylinder
    }
}
/*
OUTPUT:
Drawing Circle
Area of Circle: 78.5
Drawing Cylinder
Total Surface Area of Cylinder: 188.4
*/