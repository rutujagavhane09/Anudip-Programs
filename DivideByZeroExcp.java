package com.demo;

public class DivideByZeroExcp 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Throw an ArithmeticException
            int result = divideByZero(10, 0);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static int divideByZero(int numerator, int denominator)
    {
        return numerator / denominator;
    }
}
