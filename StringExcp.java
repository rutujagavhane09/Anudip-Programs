package com.demo;
import java.util.Scanner;

public class StringExcp 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try 
        {
            checkForVowels(input);
            System.out.println(input + " contains vowels.");
        } 
        catch (NoVowelsException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForVowels(String input) throws NoVowelsException 
    {
        if (!containsVowels(input)) 
        {
            throw new NoVowelsException("No vowels found in the input string.");
        }
    }

    public static boolean containsVowels(String input) 
    {
        for (char c : input.toCharArray()) 
        {
            if ("AEIOUaeiou".indexOf(c) != -1) 
            {
                return true;
            }
        }
        return false;
    }
}

class NoVowelsException extends Exception 
{
    public NoVowelsException(String message) 
    {
        super(message);
    }
}
