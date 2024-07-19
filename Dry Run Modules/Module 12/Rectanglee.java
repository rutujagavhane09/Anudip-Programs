//Question: Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides 
//the getArea() method to calculate the area of a rectangle.
package com.corejava.demo;

// Base class Shape
class Shape 
{
    // Method to print a message, demonstrating polymorphism
    public void getArea() 
    {
        System.out.println("getArea method from Shape Class");
    }
}

// Derived class Rectanglee extending Shape
class Rectanglee extends Shape 
{
    int length; // Length of the rectangle
    int width;  // Width of the rectangle

    // Constructor to initialize the length and width of the rectangle
    public Rectanglee(int length, int width) 
    {
        this.length = length;
        this.width = width;
    }

    // Overriding the getArea method from Shape class
    @Override
    public void getArea() 
    {
        // Print the area of the rectangle
        System.out.println("Area of Rectangle is " + (length * width)); 
    }

    // Main method to test the Rectanglee class
    public static void main(String[] args) 
    {
        // Create an instance of Rectanglee with length 7 and width 4
        Rectanglee rectangle = new Rectanglee(7, 4);
        // Call the overridden getArea method
        rectangle.getArea();
    }
}
//OUTPUT: Area of Rectangle is 28
