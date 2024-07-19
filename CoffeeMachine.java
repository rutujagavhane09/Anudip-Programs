package com.corejava.demo;
import java.util.*;
public class CoffeeMachine 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Welcome To ASM IBMR Coffee Center ---");
		System.out.println("1. Espresso");
		System.out.println("2. Latte");
		System.out.println("3. Cappuccino");
		System.out.println("4. Americano");
		
		System.out.print("Choose Your Coffe : ");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("\n\tYou Choose the Espresso \n\tPrice is 250 Rs.");
				break;
			case 2:
				System.out.println("\n\tYou Choose the Latte \n\tPrice is 200 Rs.");
				break;
			case 3:
				System.out.println("\n\tYou Choose the Cappuccino \n\tPrice is 150 Rs.");
				break;
			case 4:
				System.out.println("\n\tYou Choose the Americano \n\tPrice is 300 Rs.");
				break;
			default:
				System.out.println("\n\tInvalild Choice");
		}
		
	}
}
//Monday Tuesday Wednesday Thursday 
//Friday Saturday Sunday 
//Espresso
//Cappuccino
//Latte
//Americano
//Flat white
//Macchiato
//Mocha
//Doppio