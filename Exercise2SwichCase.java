package com.corejava.demo;
import java.util.*;
public class Exercise2SwichCase 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.println("--- VOWELS ---");
		System.out.println("1. A");
		System.out.println("2. E");
		System.out.println("3. I");
		System.out.println("4. O");
		System.out.println("4. U");
			
		System.out.print("Choose Your Vowel : ");
		int choice=sc.nextInt();
			
		switch(choice)
		{
				case 1:
					System.out.println("\n\tYou Choose 'A'");
					break;
				case 2:
					System.out.println("\n\tYou Choose 'E'");
					break;
				case 3:
					System.out.println("\n\tYou Choose 'I'");
					break;
				case 4:
					System.out.println("\n\tYou Choose 'O'");
					break;
				case 5:
					System.out.println("\n\tYou Choose 'U'");
					break;
				default:
					System.out.println("\n\tInvalild Choice");
			}
	}
}
