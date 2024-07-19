/*Question: Write a Java program to compare a given string to the specified character sequence.*/

package com.demo;

import java.util.Scanner; // Importing the Scanner class from java.util package

public class CompareStringToSequence 
{
    public static void main(String[] args) 
    {
        String originalString = "Ram"; // Declaring and initializing the original string
        
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the user
        System.out.print("Enter the character sequence to compare: "); // Prompting the user to enter the character sequence
        
        String sequenceToCompare = scanner.nextLine(); // Reading the character sequence entered by the user
        
        if (originalString.equals(sequenceToCompare)) // Checking if the original string is equal to the entered character sequence
        {        	
            System.out.println("YES, The string is equal to the specified character sequence."); // Printing if the condition is true
        } 
        else 
        {
            System.out.println("NO, The string is not equal to the specified character sequence."); // Printing if the condition is false
        }
        scanner.close(); // Closing the Scanner object to release resources
    }
}
/*
OUTPUT:
Enter the character sequence to compare: Ram
YES, The string is equal to the specified character sequence.
*/