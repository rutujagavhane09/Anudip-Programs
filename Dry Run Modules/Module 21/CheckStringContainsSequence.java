/*Question: Write a Java program to test if a given string contains the specified sequence of char values.*/

package com.demo;

import java.util.Scanner; // Importing the Scanner class from java.util package

public class CheckStringContainsSequence 
{
    public static void main(String[] args) 
    {
        String originalString = "Raviraj Patil"; // Declaring and initializing the original string
        
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the user
        System.out.print("Enter the sequence of characters to check: "); // Prompting the user to enter the sequence
        
        String sequenceToCheck = scanner.nextLine(); // Reading the sequence entered by the user
        
        if (originalString.contains(sequenceToCheck)) // Checking if the original string contains the entered sequence
        {
            System.out.println("YES, The string contains the specified sequence of characters."); // Printing if the sequence is found
        } 
        else 
        {
            System.out.println("NO, The string does not contain the specified sequence of characters."); // Printing if the sequence is not found
        }
        
        scanner.close(); // Closing the Scanner object to release resources
    }
}
/*
OUTPUT:
Enter the sequence of characters to check: raj
YES, The string contains the specified sequence of characters.
*/