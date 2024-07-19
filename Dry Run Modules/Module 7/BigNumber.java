/*Question: Write a Java program that takes three numbers from the user and prints the greatest number.*/
package com.corejava.demo;

import java.util.*; //imports all classes from the java.util package.

public class BigNumber //declares a class named BigNumber.
{
	public static void main(String args[]) //declares the main method.
	{ 
		Scanner sc=new Scanner(System.in); //creates a new Scanner object named sc to read input from the standard input stream (System.in).
		System.out.print("Enter First Number : "); //prints the message "Enter First Number : "
		int no1=sc.nextInt(); // reads an integer input from the user using the nextInt() method.
		System.out.print("Enter Second Number : "); //prints the message "Enter Second Number : "
		int no2=sc.nextInt(); 
		System.out.print("Enter Third Number : "); //prints the message "Enter Third Number : "
		int no3=sc.nextInt(); 
		if(no1>no2) //if statement to check if no1 is greater than no2.
		{ 
			if(no1>no3) //if statement within the first if statement to check if no1 is greater than no3.
			{ 
				System.out.println("First number "+no1+" is Greatest Number"); 
			} 
			else //If no1 is not greater than no3, this line starts the else block
			{ 
				System.out.println("Third number "+no3+" is Greatest Number"); 
			} 
		} 
		else 
		{ 
			if(no2>no3) //if statement within the else block to check if no2 is greater than no3.
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

/*OUTPUT:
Enter First Number : 5
Enter Second Number : 8
Enter Third Number : 3
Second number 8 is Greatest Number

Enter First Number : 7
Enter Second Number : 7
Enter Third Number : 7
Third number 7 is Greatest Number
*/