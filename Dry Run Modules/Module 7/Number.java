/*Question: Write a Java program to get a number from the user and print whether it is positive or negative.*/
package com.corejava.demo;
import java.util.*; //imports all the classes in the java.util package, which includes the Scanner class
public class Number 
{
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);//This line creates a new Scanner object named sc to read input from the standard input stream (System.in). We're going to use this scanner object to read input from the user.
		System.out.print("Enter Number : "); //prints the message "Enter Number : "
		int no=sc.nextInt(); //reads an integer input from the user using the nextInt() method of the Scanner class and assigns it to the variable no.
		if(no>0) //It checks if the value stored in the variable no is greater than 0.
		{
			System.out.print(no+" is Positive");
		} 
		else //else block, which executes if the condition in the if statement is false
		{ 
			System.out.print (no+" is Nigative");
		} 
	} 
}

/*Output: 
Enter Number : 5
5 is Positive

Enter Number : -3
-3 is Negative*/