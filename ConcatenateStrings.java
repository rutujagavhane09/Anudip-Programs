package com.demo;

import java.util.Scanner;

public class ConcatenateStrings 
{
    public static void main(String[] args) 
    {
        String originalString = "Jay Shree Ram, ";
       
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the string to concatenate: ");        
        String stringToConcatenate = scanner.nextLine();
        
        String concatenatedString = originalString.concat(stringToConcatenate);
        
        System.out.println("Concatenated String: " + concatenatedString);
        
        scanner.close();
    }
}

