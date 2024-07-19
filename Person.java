package com.corejava.demo;

public class Person
{
	String name;
	int age;
	    
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	    // Display person details
	public void displayPersonDetails() 
	{
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	}

	public static void main(String[] args) 
	{
	    Person person1 = new Person("Ram", 25);
	    Person person2 = new Person("Shyam", 30);

	    person1.displayPersonDetails();
	    person2.displayPersonDetails();
	}
}