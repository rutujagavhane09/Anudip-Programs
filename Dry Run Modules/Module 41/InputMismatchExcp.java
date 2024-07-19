//Question: Write a Java program that asks the user to enter an integer. Handle the InputMismatchException that may occur if the user enters something that is not an integer.

package com.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        try 
        {
            System.out.print("Please enter an integer: "); // Prompt the user to enter an integer
            int number = scanner.nextInt(); // Read the integer input from the user
            System.out.println("You entered: " + number); // Print the entered integer
        } 
        catch (InputMismatchException e) 
        {
            // Catch and handle the case where the input is not a valid integer
            System.out.println("Input error: Please enter a valid integer.");
        }
    }
}
/*
OUTPUT:
Please enter an integer: 5
You entered: 5
---------------------------
Please enter an integer: abc
Input error: Please enter a valid integer.
*/