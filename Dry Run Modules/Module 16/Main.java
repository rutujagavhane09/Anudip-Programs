/*Question: Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. 
In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.*/

package com.corejava.demo;

// Class representing a general employee
class Employee 
{
    String name; // Variable to store the name of the employee
    int baseSalary; // Variable to store the base salary of the employee

    // Constructor to initialize the name and base salary of the employee
    public Employee(String name, int baseSalary) 
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to calculate the salary of the employee
    public int calculateSalary() 
    {
        return baseSalary;
    }
}

// Class representing a manager, which is a type of employee
class Manager extends Employee 
{
    int bonus; // Variable to store the bonus of the manager

    // Constructor to initialize the name, base salary, and bonus of the manager
    public Manager(String name, int baseSalary, int bonus) 
    {
        super(name, baseSalary); // Call the constructor of the base class
        this.bonus = bonus;
    }

    // Override the calculateSalary method to include the bonus
    @Override
    public int calculateSalary() 
    {
        return baseSalary + bonus;
    }
}

// Class representing a programmer, which is a type of employee
class Programmer extends Employee 
{
    int linesOfCode; // Variable to store the number of lines of code written by the programmer

    // Constructor to initialize the name, base salary, and lines of code of the programmer
    public Programmer(String name, int baseSalary, int linesOfCode) 
    {
        super(name, baseSalary); // Call the constructor of the base class
        this.linesOfCode = linesOfCode;
    }

    // Override the calculateSalary method to include the lines of code
    @Override
    public int calculateSalary() 
    {
        return baseSalary + (linesOfCode * 2);
    }
}

// Main class to test the employee and its subclasses
public class Main 
{
    public static void main(String[] args) 	
    {
        // Create a manager instance with name, base salary, and bonus
        Manager manager = new Manager("Raviraj Patil", 50000, 10000);

        // Create a programmer instance with name, base salary, and lines of code
        Programmer programmer = new Programmer("Narendra Modi", 60000, 2000);

        // Print the manager's calculated salary
        System.out.println("Manager's Salary: " + manager.calculateSalary());

        // Print the programmer's calculated salary
        System.out.println("Programmer's Salary: " + programmer.calculateSalary());
    }
}
/*
OUTPUT:
Manager's Salary: 60000
Programmer's Salary: 64000
*/