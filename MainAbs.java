package com.demo;

abstract class Vehicle 
{
	abstract void startEngine();
	abstract void stopEngine();
}

class Car extends Vehicle 
{
	@Override
 	void startEngine() 
 	{
     	System.out.println("Car engine started");
 	}
 
	@Override
	void stopEngine() 
	{
		System.out.println("Car engine stopped");
	}
}

class Motorcycle extends Vehicle 
{
	@Override
	void startEngine() 
	{
		System.out.println("Motorcycle engine started");
	}
 
	@Override
	void stopEngine()
	{
		System.out.println("Motorcycle engine stopped");
	}
}

public class MainAbs 
{
	public static void main(String[] args) 
	{
		Car myCar = new Car();
		Motorcycle myMotorcycle = new Motorcycle();
     
		myCar.startEngine();
		myCar.stopEngine();
     
		myMotorcycle.startEngine();
		myMotorcycle.stopEngine();
	}
}
