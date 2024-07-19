package com.corejava.demo;

class Vehicle 
{
	 public void drive() 
	 {
	     System.out.println("Driving the vehicle");
	 }
}

class Car extends Vehicle 
{
	@Override
 	public void drive() 
	{
		System.out.println("Repairing a car");
	}
	public static void main(String[] args) 
	{
		 Car car = new Car();
	     car.drive();
	}
}