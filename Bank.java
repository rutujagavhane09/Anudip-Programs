package com.corejava.demo;

class BankAccount 
{
    double balance;

    public BankAccount() 
    {
        balance = 0;
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

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

    public double getBalance() 
    {
        return balance;
    }
}

class SavingsAccount extends BankAccount 
{
    double withdrawalLimit;

    public SavingsAccount() 
    {
        super();
        withdrawalLimit = 500;
    }

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

class CheckingAccount extends BankAccount 
{
    double withdrawalFee;

    public CheckingAccount() 
    {
        super();
        withdrawalFee = 2.5;
    }

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

public class Bank 
{
    public static void main(String[] args) 
    {
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        savingsAccount.deposit(1000);
        savingsAccount.withdraw(300); // Within limit
        savingsAccount.withdraw(700); // Exceeds limit
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        
        checkingAccount.deposit(800);
        checkingAccount.withdraw(200); // With fee
        checkingAccount.withdraw(700); // Insufficient funds
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}

