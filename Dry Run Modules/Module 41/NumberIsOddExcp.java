//Question: Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

package com.demo;

import java.util.Scanner;

// Main class to handle odd number exception
public class NumberIsOddExcp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Enter a Number : "); // Prompt the user to enter a number
        int number = scanner.nextInt(); // Read the integer input from the user
        try 
        {
            checkEvenNumber(number); // Check if the number is even
            System.out.println(number + " is Even"); // Print if the number is even
        } 
        catch (OddNumberException e) 
        {
            // Catch and handle the custom exception for odd numbers
            System.out.println(e.getMessage()); // Print the exception message
        }
    }

    // Method to check if the number is even
    public static void checkEvenNumber(int number) throws OddNumberException
    {
        if (number % 2 != 0) // Check if the number is odd
        {
            // Throw custom exception if the number is odd
            throw new OddNumberException("Exception " + number + " is ODD");
        }
    }
}

// Custom exception class for handling odd numbers
class OddNumberException extends Exception 
{
    // Constructor to initialize the exception message
    public OddNumberException(String message) 
    {
        super(message); // Pass the message to the superclass (Exception)
    }
}
/*
OUTPUT:
Enter a Number : 4
4 is Even
-------------------
Enter a Number : 5
Exception 5 is ODD
*/