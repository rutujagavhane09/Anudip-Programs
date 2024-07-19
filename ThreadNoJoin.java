package com.threaddemo;

public class ThreadNoJoin extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " 1");
		try 
		{
			sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 2");
	}
	public static void main(String[] args) 
	{
		ThreadNoJoin tj1=new ThreadNoJoin();
		ThreadNoJoin tj2=new ThreadNoJoin();
		tj1.start();
		try 
		{
			tj1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		tj2.start();
	}
}
