/*Question: Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. 
The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, 
calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.*/
package com.demo;

// Define an interface Account with common methods for all account types
interface Account 
{
	// Method to deposit money into the account
	void deposit(double amount);

	// Method to withdraw money from the account
	void withdraw(double amount);

	// Method to calculate interest for the account
	void calculateInterest();

	// Method to get the current balance of the account
	double getBalance();
}

// Class SavingAccount implements the Account interface
class SavingAccount implements Account 
{
	// Variable to store the balance of the savings account
	private double balance;

	// Variable to store the interest rate of the savings account
	private double interestRate;

	// Constructor to initialize the balance and interest rate of the savings account
	public SavingAccount(double initialBalance, double interestRate) 
	{
		this.balance = initialBalance;
		this.interestRate = interestRate;
	}

	// Override method to deposit money into the savings account
	@Override
 	public void deposit(double amount) 
	{
		balance += amount;
	}

	// Override method to withdraw money from the savings account
	@Override
	public void withdraw(double amount) 
	{
		if (balance >= amount) 
		{
			balance -= amount;
		} 
		else 
		{
			System.out.println("Insufficient funds");
		}
	}

	// Override method to calculate interest for the savings account
	@Override
	public void calculateInterest() 
	{
		double interest = balance * interestRate;
		deposit(interest);
	}

	// Override method to get the current balance of the savings account
	@Override
	public double getBalance() 
	{
		return balance;
	}	
}

// Class CurrentAccount implements the Account interface
class CurrentAccount implements Account 
{
	// Variable to store the balance of the current account
	private double balance;

	// Constructor to initialize the balance of the current account
	public CurrentAccount(double initialBalance) 
	{
		this.balance = initialBalance;
	}

	// Override method to deposit money into the current account
	@Override
	public void deposit(double amount) 
	{
		balance += amount;
	}

	// Override method to withdraw money from the current account
	@Override
	public void withdraw(double amount) 
	{
		if (balance >= amount) 
		{
			balance -= amount;
		} 
		else 
		{
			System.out.println("Insufficient funds");
		}
	}

	// Override method to calculate interest for the current account
	@Override
	public void calculateInterest() 
	{
		// Current account typically doesn't earn interest
	}

	// Override method to get the current balance of the current account
	@Override
	public double getBalance() 
	{
		return balance;
	}

	// Method to issue an overdraft for the current account
	public void issueOverdraft(double amount) 
	{
		balance -= amount;
		System.out.println("Overdraft issued: " + amount);
	}
}

// Main class to run the banking system application
public class BankingSystemInterface 
{
	public static void main(String[] args) 
	{
		// Create an instance of SavingAccount with an initial balance and interest rate
		SavingAccount savingsAccount = new SavingAccount(1000, 0.05);

		// Create an instance of CurrentAccount with an initial balance
		CurrentAccount currentAccount = new CurrentAccount(500);

		// Deposit money into the savings account
		savingsAccount.deposit(200);

		// Withdraw money from the savings account
		savingsAccount.withdraw(50);

		// Deposit money into the current account
		currentAccount.deposit(300);

		// Withdraw money from the current account
		currentAccount.withdraw(200);

		// Calculate interest for the savings account
		savingsAccount.calculateInterest();

		// Issue an overdraft for the current account
		currentAccount.issueOverdraft(200);

		// Print the balance of the savings account
		System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

		// Print the balance of the current account
		System.out.println("Current Account Balance: " + currentAccount.getBalance());
	}
}
/*
OUTPUT:
Overdraft issued: 200.0
Savings Account Balance: 1262.5
Current Account Balance: 400.0
*/