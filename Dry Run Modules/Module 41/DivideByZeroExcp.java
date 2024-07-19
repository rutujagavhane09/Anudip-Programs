//Question: Write a Java program that throws an exception and catch it using a try-catch block.

package com.demo;

public class DivideByZeroExcp 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Call the method that will throw an ArithmeticException
            int result = divideByZero(10, 0);
            // Print the result if no exception is thrown (this line will not execute in this case)
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            // Catch the ArithmeticException and print an error message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method to perform division and potentially throw an ArithmeticException
    public static int divideByZero(int numerator, int denominator)
    {
        // This line will throw an ArithmeticException when denominator is zero
        return numerator / denominator;
    }
}
/*
OUTPUT:
Exception caught: / by zero
*/