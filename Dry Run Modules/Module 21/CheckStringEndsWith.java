/*Question: Write a Java program to check whether a given string ends with another string.*/

package com.demo;

import java.util.Scanner; // Importing the Scanner class from java.util package

public class CheckStringEndsWith 
{
    public static void main(String[] args) 
    {
        String originalString = "Patil"; // Declaring and initializing the original string
        
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the user
        System.out.print("Enter the string to check if it ends with: "); // Prompting the user to enter the string
        
        String stringToCheck = scanner.nextLine(); // Reading the string entered by the user
        
        if (originalString.endsWith(stringToCheck)) // Checking if the original string ends with the entered string
        {
            System.out.println("YES, The original string ends with the specified string."); // Printing if the condition is true
        } 
        else 
        {
            System.out.println("NO, The original string does not end with the specified string."); // Printing if the condition is false
        }
        scanner.close(); // Closing the Scanner object to release resources
    }
}
/*
OUTPUT:
Enter the string to check if it ends with: il
YES, The original string ends with the specified string.
*/