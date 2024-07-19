/*Question: Write a Java program to get the character at the given index within the string.*/

package com.demo;

import java.util.Scanner; // Importing the Scanner class from java.util package

public class CharacterAtIndex 
{
    public static void main(String[] args) 
    {
        String str = "Raviraj Patil"; // Declaring and initializing a String variable
        
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the user
        System.out.print("Enter the index to retrieve the character: "); // Prompting the user to enter the index
        
        int index = scanner.nextInt(); // Reading the index entered by the user
        
        if (index >= 0 && index < str.length()) // Checking if the index is within bounds of the string
        {
            char character = str.charAt(index); // Retrieving the character at the specified index
            System.out.println("Character at index " + index + ": " + character); // Printing the character at the specified index
        } 
        else 
        {
            System.out.println("Index is out of bounds for the given string."); // Printing an error message if index is out of bounds
        }
        
        scanner.close(); // Closing the Scanner object to release resources
    }
}
/*
OUTPUT:
Enter the index to retrieve the character: 5
Character at index 5: a
*/