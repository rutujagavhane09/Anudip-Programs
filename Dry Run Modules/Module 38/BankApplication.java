//Question: Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.

package lab.com;

import java.util.Scanner;

// BankAccount class to represent a bank account
class BankAccount 
{
    // Private variable to store the balance of the bank account
    private int balance;
    
    // Constructor to initialize the bank account with an initial balance
    public BankAccount(int initialBalance) 
    {
        this.balance = initialBalance;
    }
    
    // Synchronized method to deposit an amount into the bank account
    public synchronized void deposit(int amount)
    {
        System.out.println("Depositing: " + amount);
        balance = balance + amount; // Update the balance by adding the deposit amount
        System.out.println("New balance after deposit: " + balance);
    }
    
    // Synchronized method to withdraw an amount from the bank account
    public synchronized void withdraw(int amount)
    {
        if (balance >= amount) 
        {
            System.out.println("Withdrawing: " + amount);
            balance = balance - amount; // Update the balance by subtracting the withdrawal amount
            System.out.println("New balance after withdrawal: " + balance);
        }
        else 
        {
            System.out.println("Insufficient funds for withdrawal"); // Message if there are not enough funds
        }
    }
    
    // Method to get the current balance of the bank account
    public int getBalance()
    {
        return balance;
    }
}

// Runnable class to handle deposits
class Deposit implements Runnable
{
    private BankAccount account;
    private int amount;
    
    // Constructor to initialize the account and amount for the deposit
    public Deposit(BankAccount account, int amount) 
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() 
    {
        account.deposit(amount); // Call the deposit method on the bank account
    }
}

// Runnable class to handle withdrawals
class Withdraw implements Runnable 
{
    private BankAccount account;
    private int amount;
    
    // Constructor to initialize the account and amount for the withdrawal
    public Withdraw(BankAccount account, int amount) 
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run()
    {
        account.withdraw(amount); // Call the withdraw method on the bank account
    }
}

// Main class to run the bank application
public class BankApplication
{
	public static void main(String[] args) 
	{
		// Create a new BankAccount with an initial balance of 1000
		BankAccount account = new BankAccount(1000);
        
        // Create a Scanner object to read input from the user
        Scanner xyz = new Scanner(System.in);

        // Prompt the user to enter the deposit amount
        System.out.print("Enter deposit amount: ");
        int depositAmount = xyz.nextInt();
        
        // Prompt the user to enter the withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = xyz.nextInt();

        // Create threads for deposit and withdrawal operations
        Thread depositThread = new Thread(new Deposit(account, depositAmount));
        Thread withdrawThread = new Thread(new Withdraw(account, withdrawalAmount));

        // Start the deposit and withdrawal threads
        depositThread.start();
        withdrawThread.start();

        // Close the scanner
        xyz.close();
	}
}
/*
OUTPUT:
Enter deposit amount: 500
Enter withdrawal amount: 300
Depositing: 500
New balance after deposit: 1500
Withdrawing: 300
New balance after withdrawal: 1200
-------------------------------------
Enter deposit amount: 500
Enter withdrawal amount: 300
Withdrawing: 300
New balance after withdrawal: 700
Depositing: 500
New balance after deposit: 1200
*/