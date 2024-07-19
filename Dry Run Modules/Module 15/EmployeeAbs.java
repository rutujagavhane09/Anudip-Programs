/*Question: Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). 
Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.*/

package com.demo;

// Abstract class Employee
abstract class Employee 
{
    // Abstract method to calculate salary
    abstract double calculateSalary();
    
    // Abstract method to display information
    abstract void displayInfo();
}

// Manager class extending Employee
class Manager extends Employee 
{
    private String name;       // Name of the manager
    private double baseSalary; // Base salary of the manager
    private double bonus;      // Bonus of the manager

    // Constructor to initialize manager's details
    public Manager(String name, double baseSalary, double bonus)
    {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Overriding the calculateSalary method to compute manager's salary
    @Override
    double calculateSalary()
    {
        return baseSalary + bonus; // Salary formula: base salary + bonus
    }

    // Overriding the displayInfo method to display manager's details
    @Override
    void displayInfo()
    {
        System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Programmer class extending Employee
class Programmer extends Employee 
{
    private String name;        // Name of the programmer
    private double baseSalary;  // Base salary of the programmer
    private int linesOfCode;    // Lines of code written by the programmer

    // Constructor to initialize programmer's details
    public Programmer(String name, double baseSalary, int linesOfCode)
    {
        this.name = name;
        this.baseSalary = baseSalary;
        this.linesOfCode = linesOfCode;
    }

    // Overriding the calculateSalary method to compute programmer's salary
    @Override
    double calculateSalary() 
    {
        return baseSalary + (2 * linesOfCode); // Salary formula: base salary + (2 * lines of code)
    }

    // Overriding the displayInfo method to display programmer's details
    @Override
    void displayInfo() 
    {
        System.out.println("Programmer Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Lines of Code Written: " + linesOfCode);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Main class to test the Employee classes
public class EmployeeAbs 
{
    public static void main(String[] args)
    {
        // Creating a Manager object with name, base salary, and bonus
        Manager manager = new Manager("Raviraj Patil", 50000, 10000);
        
        // Creating a Programmer object with name, base salary, and lines of code
        Programmer programmer = new Programmer("Ajay Patil", 60000, 5000);
        
        // Displaying manager's information
        System.out.println("Manager Information:");
        manager.displayInfo();
        
        // Displaying programmer's information
        System.out.println("\nProgrammer Information:");
        programmer.displayInfo();
    }
}
/*
OUTPUT:
Manager Information:
Manager Name: Raviraj Patil
Base Salary: 50000.0
Bonus: 10000.0
Total Salary: 60000.0

Programmer Information:
Programmer Name: Ajay Patil
Base Salary: 60000.0
Lines of Code Written: 5000
Total Salary: 70000.0
*/