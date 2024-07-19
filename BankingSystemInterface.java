package com.demo;

interface Account 
{
	void deposit(double amount);
	void withdraw(double amount);
	void calculateInterest();
	double getBalance();
}

class SavingAccount implements Account 
{
	private double balance;
	private double interestRate;

	public SavingAccount(double initialBalance, double interestRate) 
	{
		this.balance = initialBalance;
		this.interestRate = interestRate;
	}

	@Override
 	public void deposit(double amount) 
	{
		balance += amount;
	}

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

	@Override
	public void calculateInterest() 
	{
		double interest = balance * interestRate;
		deposit(interest);
	}

	@Override
	public double getBalance() 
	{
		return balance;
	}	
}

class CurrenttAccount implements Account 
{
	private double balance;

	public CurrenttAccount(double initialBalance) 
	{
		this.balance = initialBalance;
	}

	@Override
	public void deposit(double amount) 
	{
		balance += amount;
	}

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

	@Override
	public void calculateInterest() 
	{
     // Current account typically doesn't earn interest
	}

	@Override
	public double getBalance() 
	{
		return balance;
	}

	public void issueOverdraft(double amount) 
	{
		balance -= amount;
		System.out.println("Overdraft issued: " + amount);
	}
}

public class BankingSystemInterface 
{
	public static void main(String[] args) 
	{
		SavingAccount savingsAccount = new SavingAccount(1000, 0.05);
		CurrenttAccount currentAccount = new CurrenttAccount(500);

		savingsAccount.deposit(200);
		savingsAccount.withdraw(50);

		currentAccount.deposit(300);
		currentAccount.withdraw(200);

		savingsAccount.calculateInterest();

		currentAccount.issueOverdraft(200);

		System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
		System.out.println("Current Account Balance: " + currentAccount.getBalance());
	}
}
