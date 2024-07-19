//Question: Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package com.corejava.demo; // Define the package for this class

class Vehicle // Define a class named Vehicle
{
    public void drive() // Method drive() in Vehicle class
    {
        System.out.println("Driving the vehicle"); // Print "Driving the vehicle" to the console
    }
}

class Car extends Vehicle // Define a class named Car that inherits from Vehicle
{
    @Override // Indicate that this method overrides a method in the superclass
    public void drive() // Method drive() in Car class, overriding the drive() method in Vehicle
    {
        System.out.println("Repairing a car"); // Print "Repairing a car" to the console
    }
    
    public static void main(String[] args) // Main method, entry point of the program
    {
        Car car = new Car(); // Create an instance of Car
        car.drive(); // Call the drive() method on the Car instance
    }
}

// Output: Repairing a car
