package com.demo;

import java.util.Scanner;

public class CheckStringContainsSequence 
{
    public static void main(String[] args) 
    {
        String originalString = "Raviraj Patil";
        
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the sequence of characters to check: ");
        String sequenceToCheck = scanner.nextLine();
        
        if (originalString.contains(sequenceToCheck)) 
        {
            System.out.println("YES, The string contains the specified sequence of characters.");
        } 
        else 
        {
            System.out.println("NO, The string does not contain the specified sequence of characters.");
        }
        scanner.close();
    }
}
