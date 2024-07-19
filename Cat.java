package com.corejava.demo;

class Animal 
{
	public void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
}

class Cat extends Animal 
{
	@Override
	public void makeSound() 
	{
		System.out.println("Cat barks");
	}
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		cat.makeSound();
	}
}