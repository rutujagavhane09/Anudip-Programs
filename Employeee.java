package com.corejava.demo;

public class Employeee 
{
	String name;
	String JobTitle;
	int salary;
    
	public Employeee(String name, String JobTitle, int salary) 
	{
		this.name = name;
	    this.JobTitle = JobTitle;
	    this.salary = salary;
	}

	public int calculateAnnualSalary() 
	{
	    return salary * 12;
	}

	public void updateSalary(int newSalary) 
	{
	    this.salary = newSalary;
	}

	public static void main(String[] args) 
	{
		Employeee employeee = new Employeee("Raviraj Patil", "Software Engineer", 100000);

		System.out.println("Employee Name: " + employee.name);
		System.out.println("Job Title: " + employee.JobTitle);
		System.out.println("Salary: " + employee.salary);

		System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

		employee.updateSalary(150000);

		System.out.println("Updated Salary: " + employee.salary);
	}
}
