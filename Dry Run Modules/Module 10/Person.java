/*Question: Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, 
set their attributes using the constructor, and print their name and age.*/
package com.corejava.demo;

public class Person //	declares a class named Person.
{
	String name; //declare instance variables: name of type String
	int age; //declare instance variables: age of type int
	    
	public Person(String name, int age) //This is a constructor method for the Person class
	{
		this.name = name; //initializes the name instance variables with the values passed as arguments when creating a new Person object.
		this.age = age;
	}

	// Display person details
	public void displayPersonDetails() 
	{
	    System.out.println("Name: " + name); //prints the name and age of the person to the console.
	    System.out.println("Age: " + age);
	}

	public static void main(String[] args) //This is the main method
	{
	    Person person1 = new Person("Ram", 25); //It creates two Person objects, person1 and person2, with different names and ages using the constructor.
	    Person person2 = new Person("Shyam", 30);

	    person1.displayPersonDetails(); //it calls the displayPersonDetails method for each Person object to print their details to the console.
	    person2.displayPersonDetails();
	}
}
/*OUTPUT:
Name: Ram
Age: 25
Name: Shyam
Age: 30
 */