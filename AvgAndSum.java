package com.corejava.demo;
import java.util.*;
public class AvgAndSum 
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
		System.out.print("Enter Fourth Number : "); 
		int no4=sc.nextInt(); 
		System.out.print("Enter Fifth Number : "); 
		int no5=sc.nextInt(); 
		System.out.println("Sum is "+no1+" + "+no2+" + "+no3+" + "+no4+" + "+no5+" = "+(no1+no2+no3+no4+no5)); 
		System.out.println("Average is "+(no1+no2+no3+no4+no5)/5); 
	} 
}
