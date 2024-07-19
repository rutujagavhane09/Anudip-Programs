/*Question: Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.*/

package com.demo;

// Abstract class BankAccount to define common properties and methods for all bank accounts
abstract class BankAccount 
{
	// Protected variable to store the balance of the bank account
	protected double balance;

	// Abstract method to deposit money into the account
	abstract void deposit(double amount);

	// Abstract method to withdraw money from the account
	abstract void withdraw(double amount);

	// Method to get the current balance of the account
	public double getBalance()
	{
		return balance;
	}	
}

// Class SavingsAccount extends BankAccount and provides implementation for deposit and withdraw methods
class SavingsAccount extends BankAccount 
{
	// Implement the deposit method to add money to the savings account
	@Override
	void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited " + amount + " into Savings Account");
	}

	// Implement the withdraw method to take money out of the savings account
	@Override
	void withdraw(double amount) 
	{
		if (balance >= amount) 
		{
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Savings Account");
		} 
		else 
		{
			System.out.println("Insufficient funds in Savings Account");
		}
	}
}

// Class CurrentAccount extends BankAccount and provides implementation for deposit and withdraw methods
class CurrentAccount extends BankAccount 
{
	// Implement the deposit method to add money to the current account
	@Override
	void deposit(double amount) 
	{
		balance += amount;
		System.out.println("Deposited " + amount + " into Current Account");
	}

	// Implement the withdraw method to take money out of the current account
	@Override
	void withdraw(double amount) 
	{
		if (balance >= amount) 
		{
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Current Account");
		} 
		else 
		{
			System.out.println("Insufficient funds in Current Account");
		}
	}
}

// Main class to run the banking application
public class BankAccountAbs 
{
	public static void main(String[] args)
	{
		// Create an instance of SavingsAccount
		SavingsAccount savingsAccount = new SavingsAccount();

		// Create an instance of CurrentAccount
		CurrentAccount currentAccount = new CurrentAccount();

		// Deposit money into the savings account
		savingsAccount.deposit(2000);

		// Withdraw money from the savings account
		savingsAccount.withdraw(500);

		// Deposit money into the current account
		currentAccount.deposit(3000);

		// Withdraw money from the current account
		currentAccount.withdraw(2000);

		// Print the balance of the savings account
		System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

		// Print the balance of the current account
		System.out.println("Current Account Balance: " + currentAccount.getBalance());
	}
}
/*
OUTPUT:
Deposited 2000.0 into Savings Account
Withdrawn 500.0 from Savings Account
Deposited 3000.0 into Current Account
Withdrawn 2000.0 from Current Account
Savings Account Balance: 1500.0
Current Account Balance: 1000.0
*/