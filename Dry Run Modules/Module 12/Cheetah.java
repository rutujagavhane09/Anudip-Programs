//Question: Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

package com.corejava.demo; // Define the package for this class

class Animal // Define a class named Animal
{
    public void move() // Method move() in Animal class
    {
        System.out.println("The animal moves"); // Print "The animal moves" to the console
    }
}

class Cheetah extends Animal // Define a class named Cheetah that inherits from Animal
{
    @Override // Indicate that this method overrides a method in the superclass
    public void move() // Method move() in Cheetah class, overriding the move() method in Animal
    {
        System.out.println("The cheetah runs"); // Print "The cheetah runs" to the console
    }

    public static void main(String[] args) // Main method, entry point of the program
    {
        Cheetah obj = new Cheetah(); // Create an object of Cheetah
        obj.move(); // Call the move() method on the Cheetah instance
    }
}

// Output: The cheetah runs
