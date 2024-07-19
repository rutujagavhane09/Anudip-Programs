package com.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcp 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Please enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Input error: Please enter a valid integer.");
        }
    }
}
