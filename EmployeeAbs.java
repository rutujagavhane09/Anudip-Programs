package com.demo;

abstract class Employee 
{
	abstract double calculateSalary();
	abstract void displayInfo();
}

class Manager extends Employee 
{
	private String name;
	private double baseSalary;
	private double bonus;

	public Manager(String name, double baseSalary, double bonus)
	{
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	@Override
	double calculateSalary()
	{
		return baseSalary + bonus;
	}

	@Override
	void displayInfo()
	{
		System.out.println("Manager Name: " + name);
		System.out.println("Base Salary: " + baseSalary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + calculateSalary());
	}
}

class Programmer extends Employee 
{
	private String name;
	private double baseSalary;
	private int linesOfCode;

	public Programmer(String name, double baseSalary, int linesOfCode)
	{
		this.name = name;
		this.baseSalary = baseSalary;
		this.linesOfCode = linesOfCode;
	}

	@Override
	double calculateSalary() 
	{
		return baseSalary + (2 * linesOfCode);
	}

	@Override
	void displayInfo() 
	{
		System.out.println("Programmer Name: " + name);
		System.out.println("Base Salary: " + baseSalary);
		System.out.println("Lines of Code Written: " + linesOfCode);
		System.out.println("Total Salary: " + calculateSalary());
	}
}
	
public class EmployeeAbs 
{
	public static void main(String[] args)
	{
		Manager manager = new Manager("Raviraj Patil", 50000, 10000);
		Programmer programmer = new Programmer("Ajay Patil", 60000, 5000);
    	
		System.out.println("Manager Information:");
		manager.displayInfo();
    	
		System.out.println("\nProgrammer Information:");
		programmer.displayInfo();
	}
}
