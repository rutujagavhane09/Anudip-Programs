/*Question: Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.*/
package com.demo;

// Abstract class Shape
abstract class Shape 
{
    // Abstract method to calculate area
    abstract double calculateArea();
    
    // Abstract method to calculate perimeter
    abstract double calculatePerimeter();
}

// Circle class extending Shape
class Circle extends Shape 
{
    private double radius; // Radius of the circle

    // Constructor to initialize radius
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Overriding the calculateArea method to compute area of the circle
    @Override
    double calculateArea() 
    {
        return Math.PI * radius * radius; // Area formula: π * r^2
    }

    // Overriding the calculatePerimeter method to compute perimeter of the circle
    @Override
    double calculatePerimeter() 
    {
        return 2 * Math.PI * radius; // Perimeter formula: 2 * π * r
    }
}

// Triangle class extending Shape
class Triangle extends Shape 
{
    private double side1, side2, side3; // Sides of the triangle

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Overriding the calculateArea method to compute area of the triangle
    @Override
    double calculateArea()
    {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    // Overriding the calculatePerimeter method to compute perimeter of the triangle
    @Override
    double calculatePerimeter()
    {
        return side1 + side2 + side3; // Sum of all sides
    }
}

// Main class to test the Shape classes
public class ShapeAbs
{
    public static void main(String[] args) 
    {
        // Creating a Circle object with radius 5
        Circle circle = new Circle(5);
        
        // Creating a Triangle object with sides 3, 4, and 5
        Triangle triangle = new Triangle(3, 4, 5);

        // Displaying the area and perimeter of the circle
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Displaying the area and perimeter of the triangle
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
/*
OUTPUT: 
Circle:
Area: 78.53981633974483
Perimeter: 31.41592653589793

Triangle:
Area: 6.0
Perimeter: 12.0
*/