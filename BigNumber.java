package com.corejava.demo;

import java.util.*;

public class BigNumber 
{
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number : "); 
		int no1=sc.nextInt(); 
		System.out.print("Enter Second Number : "); 
		int no2=sc.nextInt(); 
		System.out.print("Enter Third Number : "); 
		int no3=sc.nextInt(); 
		if(no1>no2) 
		{ 
			if(no1>no3) 
			{ 
				System.out.println("First number "+no1+" is Greatest Number"); 
			} 
			else 
			{ 
				System.out.println("Third number "+no3+" is Greatest Number"); 
			} 
		} 
		else 
		{ 
			if(no2>no3) 
			{ 
				System.out.println("Second number "+no2+" is Greatest Number"); 
			} 
			else 
			{
				System.out.println("Third number "+no3+" is Greatest Number");
			}
		} 
	} 
}
