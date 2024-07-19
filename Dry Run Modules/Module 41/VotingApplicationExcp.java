//Question: Write a program for voting Application, take the user’s age as input and explicitly throw the exception if the user’s age is less than 18 to terminate the program.

package com.demo;

import java.util.Scanner;

// Main class to handle voting eligibility check
public class VotingApplicationExcp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Enter your age: "); // Prompt the user to enter their age
        int age = scanner.nextInt(); // Read the integer input for age from the user

        try 
        {
            checkVotingEligibility(age); // Check if the user is eligible to vote
            System.out.println("You are eligible to vote."); // Print message if the user is eligible to vote
        }
        catch (UnderageException e) 
        {
            // Catch and handle the custom exception for underage users
            System.out.println(e.getMessage()); // Print the exception message
        }
    }

    // Method to check voting eligibility based on age
    public static void checkVotingEligibility(int age) throws UnderageException 
    {
        if (age < 18) // Check if the age is less than 18
        {
            // Throw custom exception if the age is less than 18
            throw new UnderageException("You are not eligible to vote as your age is less than 18.");
        }
    }
}

// Custom exception class for handling underage users
class UnderageException extends Exception 
{
    // Constructor to initialize the exception message
    public UnderageException(String message) 
    {
        super(message); // Pass the message to the superclass (Exception)
    }
}
/*
OUTPUT:
Enter your age: 20
You are eligible to vote.
-----------------------------
Enter your age: 16
You are not eligible to vote as your age is less than 18.
*/