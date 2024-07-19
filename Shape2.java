package com.corejava.demo;

class Shape 
{
    void draw()
    {
    	System.out.println("Draw Method of Shape class");
    }
    double calculateArea()
    {
    	return 0;
    }
}

class Circle extends Shape 
{
    double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    void draw() 
    {
        System.out.println("Drawing Circle");
    }

    @Override
    double calculateArea() 
    {
        return 3.14 * radius * radius;
    }
}

class Cylinder extends Circle 
{
    double height;

    public Cylinder(double radius, double height) 
    {
        super(radius);
        this.height = height;
    }

    @Override
    void draw() 
    {
        System.out.println("Drawing Cylinder");
    }

    @Override
    double calculateArea() 
    {
        double circleArea = super.calculateArea();
        double cylinderArea = 2 * 3.14 * super.radius * height + 2 * circleArea;
        return cylinderArea;
    }
}

public class Shape2 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(3, 7);
        cylinder.draw();
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}
