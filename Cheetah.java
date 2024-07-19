package com.corejava.demo;

class Animal 
{
	public void move() 
	{
		System.out.println("The animal moves");
	}
}

class Cheetah extends Animal 
{
	@Override
	public void move() 
	{
		System.out.println("The cheetah runs");
	}
	public static void main(String[] args) 
	{
		Cheetah obj = new Cheetah();
		obj.move();
	}
}