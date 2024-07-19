package com.demo;

abstract class BankAccount 
{
	protected double balance;

	abstract void deposit(double amount);
	abstract void withdraw(double amount);

	public double getBalance()
	{
		return balance;
	}	
}

class SavingsAccount extends BankAccount 
{
	@Override
	void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited " + amount + " into Savings Account");
	}

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

class CurrentAccount extends BankAccount 
{
	@Override
	void deposit(double amount) 
	{
		balance += amount;
		System.out.println("Deposited " + amount + " into Current Account");
	}
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

public class BankAccountAbs 
{
	public static void main(String[] args)
	{
		SavingsAccount savingsAccount = new SavingsAccount();
		CurrentAccount currentAccount = new CurrentAccount();

		savingsAccount.deposit(2000);
		savingsAccount.withdraw(500);

		currentAccount.deposit(3000);
		currentAccount.withdraw(2000);

		System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
		System.out.println("Current Account Balance: " + currentAccount.getBalance());
	}
}
