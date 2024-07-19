package com.threaddemo;

public class MainThread
{
	public static void main(String[] args) 
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		t.setName("I am Main Thread");
		System.out.println(t.getName());
		System.out.println(Thread.MIN_PRIORITY);
	}
}
