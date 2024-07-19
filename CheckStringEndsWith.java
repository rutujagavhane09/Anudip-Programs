package com.demo;

import java.util.Scanner;

public class CheckStringEndsWith 
{
    public static void main(String[] args) 
    {
        String originalString = "Patil";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string to check if it ends with: ");
        
        String stringToCheck = scanner.nextLine();
        
        if (originalString.endsWith(stringToCheck)) 
        {
            System.out.println("YES, The original string ends with the specified string.");
        } 
        else 
        {
            System.out.println("NO, The original string does not end with the specified string.");
        }
        scanner.close();
    }
}
