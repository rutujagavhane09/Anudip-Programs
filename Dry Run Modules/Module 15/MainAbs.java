/*Question: Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). 
Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.*/

package com.demo;

// Abstract class Vehicle
abstract class Vehicle 
{
    // Abstract method to start the engine
    abstract void startEngine();
    
    // Abstract method to stop the engine
    abstract void stopEngine();
}

// Car class extending Vehicle
class Car extends Vehicle 
{
    // Overriding the startEngine method to implement starting the car engine
    @Override
    void startEngine() 
    {
        System.out.println("Car engine started");
    }

    // Overriding the stopEngine method to implement stopping the car engine
    @Override
    void stopEngine() 
    {
        System.out.println("Car engine stopped");
    }
}

// Motorcycle class extending Vehicle
class Motorcycle extends Vehicle 
{
    // Overriding the startEngine method to implement starting the motorcycle engine
    @Override
    void startEngine() 
    {
        System.out.println("Motorcycle engine started");
    }

    // Overriding the stopEngine method to implement stopping the motorcycle engine
    @Override
    void stopEngine() 
    {
        System.out.println("Motorcycle engine stopped");
    }
}

// Main class to test the Vehicle classes
public class MainAbs 
{
    public static void main(String[] args) 
    {
        // Creating an instance of Car
        Car myCar = new Car();
        
        // Creating an instance of Motorcycle
        Motorcycle myMotorcycle = new Motorcycle();
        
        // Starting and stopping the car engine
        myCar.startEngine();
        myCar.stopEngine();
        
        // Starting and stopping the motorcycle engine
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}
/*
OUTPUT:
Car engine started
Car engine stopped
Motorcycle engine started
Motorcycle engine stopped
*/