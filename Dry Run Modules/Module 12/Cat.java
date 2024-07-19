//Question: Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
package com.corejava.demo; // Define the package for this class

class Animal // Define a class named Animal
{
    public void makeSound() // Method makeSound() in Animal class
    {
        System.out.println("Animal makes a sound"); // Print "Animal makes a sound" to the console
    }
}

class Cat extends Animal // Define a class named Cat that inherits from Animal
{
    @Override // Indicate that this method overrides a method in the superclass
    public void makeSound() // Method makeSound() in Cat class, overriding the makeSound() method in Animal
    {
        System.out.println("Cat barks"); // Print "Cat barks" to the console
    }

    public static void main(String[] args) // Main method, entry point of the program
    {
        Cat cat = new Cat(); // Create an object of Cat
        cat.makeSound(); // Call the makeSound() method on the Cat instance
    }
}

// Output: Cat barks
