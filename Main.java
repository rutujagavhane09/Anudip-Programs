package com.corejava.demo;

class Employee 
{
	String name;
	int baseSalary;

	public Employee(String name, int baseSalary) 
	{
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public int calculateSalary() 
	{
		return baseSalary;
	}
}

class Manager extends Employee 
{
	int bonus;

	public Manager(String name, int baseSalary, int bonus) 
	{
		super(name, baseSalary);
		this.bonus = bonus;
	}

	@Override
 	public int calculateSalary() 
	{
		return baseSalary + bonus;
	}
}

class Programmer extends Employee 
{
	int linesOfCode;

	public Programmer(String name, int baseSalary, int linesOfCode) 
	{
		super(name, baseSalary);
		this.linesOfCode = linesOfCode;
	}

	@Override
	public int calculateSalary() 
	{
		return baseSalary + (linesOfCode * 2);
	}
}

public class Main 
{
	public static void main(String[] args) 	
	{
		Manager manager = new Manager("Raviraj Patil", 50000, 10000);
		Programmer programmer = new Programmer("Narendra Modi", 60000, 2000);

		System.out.println("Manager's Salary: " + manager.calculateSalary());
		System.out.println("Programmer's Salary: " + programmer.calculateSalary());
	}
}

