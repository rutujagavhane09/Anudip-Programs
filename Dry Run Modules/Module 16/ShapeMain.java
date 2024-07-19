/*Question: Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. 
Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.*/

package com.corejava.demo;

// Base class representing a generic shape
class Shape1
{
    // Method to draw the shape
    void draw()
    {
        System.out.println("This is Shape Class");
    }

    // Method to calculate the area of the shape
    double calculateArea()
    {
        return 0;
    }
}

// Class representing a circle, inheriting from Shape1
class Circle1 extends Shape1
{
    double radius; // Variable to store the radius of the circle

    // Constructor to initialize the radius of the circle
    Circle1(double radius) 
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
        return Math.PI * radius * radius;
    }
}

// Class representing a square, inheriting from Shape1
class Square extends Shape1
{
    double side; // Variable to store the side length of the square

    // Constructor to initialize the side length of the square
    Square(double side)
    {
        this.side = side;
    }

    // Override the draw method to print specific message for Square
    @Override
    void draw() 
    {
        System.out.println("Drawing Square");
    }
    
    // Override the calculateArea method to calculate the area of the square
    @Override
    double calculateArea() 
    {
        return side * side;
    }
}

// Class representing a triangle, inheriting from Shape1
class Triangle extends Shape1
{
    double base; // Variable to store the base length of the triangle
    double height; // Variable to store the height of the triangle

    // Constructor to initialize the base and height of the triangle
    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    // Override the draw method to print specific message for Triangle
    @Override
    void draw()
    {
        System.out.println("Drawing Triangle");
    }

    // Override the calculateArea method to calculate the area of the triangle
    @Override
    double calculateArea() 
    {
        return 0.5 * base * height;
    }   
}

// Main class to test the shapes
public class ShapeMain 
{
    public static void main(String[] args) 
    {
        // Create a Circle1 instance with radius 5
        Circle1 circle = new Circle1(5);
        // Create a Square instance with side length 4
        Square square = new Square(4);
        // Create a Triangle instance with base 3 and height 6
        Triangle triangle = new Triangle(3, 6);

        // Draw the circle and print its area
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Draw the square and print its area
        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        // Draw the triangle and print its area
        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
/*
OUTPUT:
Drawing Circle
Area of Circle: 78.53981633974483
Drawing Square
Area of Square: 16.0
Drawing Triangle
Area of Triangle: 9.0
*/