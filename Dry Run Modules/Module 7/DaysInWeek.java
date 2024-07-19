/*Question: Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.*/
package com.corejava.demo;
import java.util.*; //imports all classes from the java.util package
public class DaysInWeek //declares a class named DaysInWeek.
{
	public static void main(String args[]) //eclares the main method
	{ 
		Scanner sc=new Scanner(System.in); //creates a new Scanner object named sc to read input from the standard input stream (System.in).
		System.out.print("Choose Your Day Number : "); //prints the message "Choose Your Day Number : "
		int no=sc.nextInt(); //reads an integer input from the user using the nextInt() method
		switch(no) //starts a switch statement based on the value of the variable no.
		{ 
			case 1: //If no is equal to 1, this case block executes.
				System.out.println("\n\tYou Choose Monday"); //prints the message "You Choose Monday"
				break; //breaks out of the switch statement.
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
			default: //If no does not match any of the specified case labels (i.e., it's not in the range 1-7), this default block executes
				System.out.println("\n\tInvalild Choice"); 
		} 
	}
}
/*OUTPUT:
Choose Your Day Number : 1

	You Choose Monday
	
Choose Your Day Number : 10

	Invalild Choice
*/