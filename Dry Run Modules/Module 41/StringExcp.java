//Question: Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels

package com.demo;

import java.util.Scanner;

// Main class to handle string vowel checking
public class StringExcp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Enter a string: "); // Prompt the user to enter a string
        String input = scanner.nextLine(); // Read the string input from the user

        try 
        {
            checkForVowels(input); // Check if the string contains vowels
            System.out.println(input + " contains vowels."); // Print message if the string contains vowels
        } 
        catch (NoVowelsException e) 
        {
            // Catch and handle the custom exception if no vowels are found
            System.out.println(e.getMessage()); // Print the exception message
        }
    }

    // Method to check if the string contains vowels
    public static void checkForVowels(String input) throws NoVowelsException 
    {
        if (!containsVowels(input)) // Check if the string does not contain vowels
        {
            // Throw custom exception if no vowels are found
            throw new NoVowelsException("No vowels found in the input string.");
        }
    }

    // Method to check if the string contains any vowels
    public static boolean containsVowels(String input) 
    {
        for (char c : input.toCharArray()) // Convert the string to a character array and iterate over each character
        {
            if ("AEIOUaeiou".indexOf(c) != -1) // Check if the character is a vowel (both uppercase and lowercase)
            {
                return true; // Return true if a vowel is found
            }
        }
        return false; // Return false if no vowels are found
    }
}

// Custom exception class for handling cases where no vowels are found
class NoVowelsException extends Exception 
{
    // Constructor to initialize the exception message
    public NoVowelsException(String message) 
    {
        super(message); // Pass the message to the superclass (Exception)
    }
}
/*
OUTPUT:
Enter a string: hello
hello contains vowels.
-----------------------
Enter a string: hll
No vowels found in the input string.
*/