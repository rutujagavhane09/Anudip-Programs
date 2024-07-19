package com.threaddemo;

import java.util.Iterator;

class ThreadOne extends Thread
{
	void show1() 
	{
		System.out.println("One");
	}
}
class ThreadTwo extends Thread
{
	void show2() 
	{
		System.out.println("Two");
	}
}

public class ThreadInJava 
{
	public static void main(String args[])
	{
		System.out.println("mainthread");
	}
}
