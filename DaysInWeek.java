
package com.corejava.demo;
import java.util.*;
public class DaysInWeek 
{
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Choose Your Day Number : "); 
		int no=sc.nextInt(); 
		switch(no) 
		{ 
			case 1: 
				System.out.println("\n\tYou Choose Monday"); 
				break; 
			case 2: 
				System.out.println("\n\tYou Choose Tuesday"); 
				break; 
			case 3: 
				System.out.println("\n\tYou Choose Wednesday"); 
				break; 
			case 4: 
				System.out.println("\n\tYou Choose Thursday"); 
				break; 
			case 5: 
				System.out.println("\n\tYou Choose Friday"); 
				break; 
			case 6: 
				System.out.println("\n\tYou Choose Saturday"); 
				break; 
			case 7: 
				System.out.println("\n\tYou Choose Sunday"); 
				break; 
			default: 
				System.out.println("\n\tInvalild Choice"); 
		} 
	}
}
