package com.threaddemo;

public class Account extends Thread
{
	static int balance=1000;
	public void run() 
	{
		synchronized (Account.class) //Thread Safe
		{		
			if(balance>800)
			{
				System.out.println(Thread.currentThread().getName()+" Your balance is "+balance+" Rs. you can withdrwa the amount");
				try 
				{
					sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				balance=200;
				System.out.println(Thread.currentThread().getName()+" After withdrawal your balance is "+balance+" Rs.");
			}
			else
			{
				System.out.println("Your balance is "+balance+" Rs. so you can't withdraw the amount");
			}
			// HOME WORK  Today - 29/03/2024
			// wait() and notify()
			// yield();
		}
	}
}
