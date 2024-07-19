/*Question: Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). 
Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.*/
package com.corejava.demo;

// Base class representing a bank account
class BankAccount 
{
    double balance; // Variable to store the account balance

    // Constructor to initialize the balance to 0
    public BankAccount() 
    {
        balance = 0;
    }

    // Method to deposit money into the account
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) 
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("Insufficient funds");
        }
    }

    // Method to get the current balance of the account
    public double getBalance() 
    {
        return balance;
    }
}

// Derived class representing a savings account with a withdrawal limit
class SavingsAccount extends BankAccount 
{
    double withdrawalLimit; // Variable to store the withdrawal limit

    // Constructor to initialize the balance and withdrawal limit
    public SavingsAccount() 
    {
        super(); // Call the constructor of the base class
        withdrawalLimit = 500; // Set the withdrawal limit to 500
    }

    // Override the withdraw method to include the withdrawal limit
    @Override
    public void withdraw(double amount) 
    {
        if (amount <= withdrawalLimit && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("Withdrawal limit exceeded or insufficient funds");
        }
    }
}

// Derived class representing a checking account with a withdrawal fee
class CheckingAccount extends BankAccount 
{
    double withdrawalFee; // Variable to store the withdrawal fee

    // Constructor to initialize the balance and withdrawal fee
    public CheckingAccount() 
    {
        super(); // Call the constructor of the base class
        withdrawalFee = 2.5; // Set the withdrawal fee to 2.5
    }

    // Override the withdraw method to include the withdrawal fee
    @Override
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            balance -= withdrawalFee;
            System.out.println("Withdrawn: " + amount + " (including " + withdrawalFee + " fee)");
        } 
        else 
        {
            System.out.println("Insufficient funds");
        }
    }
}

// Main class to test the bank accounts
public class Bank 
{
    public static void main(String[] args) 
    {
        // Create a savings account instance
        SavingsAccount savingsAccount = new SavingsAccount();

        // Create a checking account instance
        CheckingAccount checkingAccount = new CheckingAccount();

        // Deposit money into the savings account
        savingsAccount.deposit(1000);

        // Withdraw money within the limit from the savings account
        savingsAccount.withdraw(300); // Within limit

        // Attempt to withdraw money exceeding the limit from the savings account
        savingsAccount.withdraw(700); // Exceeds limit

        // Print the balance of the savings account
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Deposit money into the checking account
        checkingAccount.deposit(800);

        // Withdraw money from the checking account including fee
        checkingAccount.withdraw(200); // With fee

        // Attempt to withdraw money exceeding the balance from the checking account
        checkingAccount.withdraw(700); // Insufficient funds

        // Print the balance of the checking account
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}
/*
OUTPUT:
Deposited: 1000.0
Withdrawn: 300.0
Withdrawal limit exceeded or insufficient funds
Savings Account Balance: 700.0
Deposited: 800.0
Withdrawn: 200.0 (including 2.5 fee)
Insufficient funds
Checking Account Balance: 597.5
*/

