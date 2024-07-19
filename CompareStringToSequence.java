package com.demo;

import java.util.Scanner;

public class CompareStringToSequence 
{
    public static void main(String[] args) 
    {
        String originalString = "Ram";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character sequence to compare: ");
        String sequenceToCompare = scanner.nextLine();
        
        if (originalString.equals(sequenceToCompare)) 
        {        	
            System.out.println("YES, The string is equal to the specified character sequence.");
        } 
        else 
        {
            System.out.println("NO, The string is not equal to the specified character sequence.");
        }
        scanner.close();
    }
}

