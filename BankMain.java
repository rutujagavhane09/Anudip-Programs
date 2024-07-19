package Account;

interface Account
{
	void deposit(double amount);
	void withdraw(double amount);
}
class SavingAccount
{
	private double balance;
	private double interestRate;
	public SavingAccount()
	{
		balance=0;
	}
	void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
	void withdraw(double amount) 
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
	double getBalance() 
    {
        return balance;
    }
}
class CurrentAccount implements Account
{
	private double balance;
	private double overdraftLimit;
	public CurrentAccount()
	{
		overdraftLimit = 500;
	}
	public void withdraw(double amount) 
    {
        if (amount <= overdraftLimit && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("Withdrawal limit exceeded or insufficient funds");
        }
    }
	public void deposit(double amount) 
	{
	    balance += amount;
	    System.out.println("Deposited: " + amount);
	}
	double getBalance() 
    {
        return balance;
    }
}
public class BankMain 
{
	public static void main(String[] args) 
    {
		SavingAccount savingsAccount = new SavingAccount();
		CurrentAccount checkingAccount = new CurrentAccount();

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
