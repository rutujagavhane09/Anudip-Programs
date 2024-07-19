package com.demo;
import java.util.Scanner;
public class NumberIsOddExcp 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();
        try 
        {
            checkEvenNumber(number);
            System.out.println(number + " is Even");
        } 
        catch (OddNumberException e) 
        {
            System.out.println(e.getMessage());
        }
    }
    public static void checkEvenNumber(int number) throws OddNumberException
    {
        if (number % 2 != 0)
        {
            throw new OddNumberException("Exception " + number + " is ODD");
        }
    }
}

class OddNumberException extends Exception 
{
    public OddNumberException(String message) 
    {
        super(message);
    }
}
