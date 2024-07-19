package com.demo;
import java.util.Scanner;

public class VotingApplicationExcp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try 
        {
            checkVotingEligibility(age);
            System.out.println("You are eligible to vote.");
        }
        catch (UnderageException e) 
        {
            System.out.println(e.getMessage());
        }
    }
    public static void checkVotingEligibility(int age) throws UnderageException 
    {
        if (age < 18) 
        {
            throw new UnderageException("You are not eligible to vote as your age is less than 18.");
        }
    }
}

class UnderageException extends Exception 
{
    public UnderageException(String message) 
    {
        super(message);
    }
}
