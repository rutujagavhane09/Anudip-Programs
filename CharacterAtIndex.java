package com.demo;

import java.util.Scanner;

public class CharacterAtIndex 
{
    public static void main(String[] args) 
    {
        String str = "Raviraj Patil";
        
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Enter the index to retrieve the character: ");        
        int index = scanner.nextInt();
        
        if (index >= 0 && index < str.length()) 
        {
            char character = str.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } 
        else 
        {
            System.out.println("Index is out of bounds for the given string.");
        }
        scanner.close();
    }
}

