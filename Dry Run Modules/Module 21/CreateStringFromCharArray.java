/*Question: Write a Java program to create a String object with a character array.*/

package com.demo;

public class CreateStringFromCharArray 
{
    public static void main(String[] args) 
    {
        char[] charArray = {'R', 'a', 'v', 'i', 'r', 'a', 'j'}; // Declaring and initializing a char array
        
        String str = new String(charArray); // Creating a new String object from the char array
        
        System.out.println("Created String: " + str); // Printing the created string
    }
}
/*
OUTPUT:
Created String: Raviraj
*/