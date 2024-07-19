/*Question: Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.*/
package com.corejava.demo;

// Class definition for Employeee
public class Employee
{
    // Instance variables to store employee details
    String name;        // Employee name
    String JobTitle;    // Job title
    int salary;         // Salary

    // Constructor to initialize employee details
    public Employeee(String name, String JobTitle, int salary) 
    {
        this.name = name;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }

    // Method to calculate annual salary
    public int calculateAnnualSalary() 
    {
        return salary * 12;     // Multiply monthly salary by 12 to get annual salary
    }

    // Method to update employee salary
    public void updateSalary(int newSalary) 
    {
        this.salary = newSalary;    // Update employee's salary with new salary
    }

    // Main method to test the Employeee class
    public static void main(String[] args) 
    {
        // Create an instance of Employeee class
        Employeee employee = new Employeee("Raviraj Patil", "Software Engineer", 100000);

        // Print employee details
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Job Title: " + employee.JobTitle);
        System.out.println("Salary: " + employee.salary);

        // Calculate and print annual salary
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

        // Update employee salary
        employee.updateSalary(150000);

        // Print updated salary
        System.out.println("Updated Salary: " + employee.salary);
    }
}
/*
OUTPUT:
Employee Name: Raviraj Patil
Job Title: Software Engineer
Salary: 100000
Annual Salary: 1200000
Updated Salary: 150000
*/