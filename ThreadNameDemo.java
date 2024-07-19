package com.threaddemo;

class MyThread extends Thread
{
	@Override //(Method Overriding)
	public void run()
	{
		 System.out.println("Raviraj - This is my task!!!!");
	}
}
class MyThread2 extends Thread
{
	@Override //(Method Overriding)
	public void run()
	{
		 System.out.println("This is my task!!!!");
	}
}
public class ThreadNameDemo 
{
	public static void main(String args[])
	{
		MyThread th=new MyThread();
		th.start();
		th.setName("Raviraj"); //set name to thread, MyThread to Raviraj
		th.setPriority(1);
		String name=th.getName();
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(name);
		
		/*min = 1
		 *max = 10
		 *norm = 5
		 * */
		MyThread2 th2=new MyThread2();
		th2.setName("Radha");
		System.out.println(th2.getName());
		System.out.println(th2.getId());
	}
}

