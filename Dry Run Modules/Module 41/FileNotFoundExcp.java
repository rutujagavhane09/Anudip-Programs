//Question: Write a Java program to create a method that reads a file and throws an exception if the file is not found.

package com.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExcp 
{
    public static void main(String[] args) 
    {
        String filename = "example.txt"; // Define the filename to read
        try 
        {
            readFile(filename); // Attempt to read the file
        } 
        catch (FileNotFoundException e) 
        {
            // Catch and handle the case where the file is not found
            System.out.println("File not found: " + e.getMessage());
        } 
        catch (IOException e) 
        {
            // Catch and handle any other IO exceptions
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    // Method to read the contents of a file
    public static void readFile(String filename) throws FileNotFoundException, IOException 
    {
        BufferedReader reader = null; // Initialize the BufferedReader to null
        try 
        {
            reader = new BufferedReader(new FileReader(filename)); // Create a BufferedReader to read the file
            String line; // Variable to hold each line read from the file
            while ((line = reader.readLine()) != null) 
            {
                // Read the file line by line until the end of the file
                System.out.println(line); // Print each line
            }
        }
        finally 
        {
            if (reader != null) 
            {
                // Ensure the BufferedReader is closed
                try
                {
                    reader.close(); // Close the BufferedReader to release resources
                } 
                catch (IOException e) 
                {
                    // Handle any IO exceptions that occur while closing the reader
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }
    }
}
/*
OUTPUT:
Hello, world!
This is an example file.
*/