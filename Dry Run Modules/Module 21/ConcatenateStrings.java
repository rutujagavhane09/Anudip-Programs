/*Question: Write a Java program to concatenate a given string to the end of another string.*/

package com.demo;

import java.util.Scanner; // Importing the Scanner class from java.util package

public class ConcatenateStrings 
{
    public static void main(String[] args) 
    {
        String originalString = "Jay Shree Ram, "; // Declaring and initializing the original string
        
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the user
        System.out.print("Enter the string to concatenate: "); // Prompting the user to enter the string to concatenate
        
        String stringToConcatenate = scanner.nextLine(); // Reading the string entered by the user
        
        String concatenatedString = originalString.concat(stringToConcatenate); // Concatenating the original string with the entered string
        
        System.out.println("Concatenated String: " + concatenatedString); // Displaying the concatenated string
        
        scanner.close(); // Closing the Scanner object to release resources
    }
}
/*
OUTPUT:
Enter the string to concatenate: with blessings
Concatenated String: Jay Shree Ram, with blessings

Enter the string to concatenate: Jai Hanuman
Concatenated String: Jay Shree Ram, Jai Hanuman
*/