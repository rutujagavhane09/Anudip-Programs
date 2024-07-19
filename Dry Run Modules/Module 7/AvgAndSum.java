/*Question: Write a program in Java to input 5 numbers from the keyboard and find their sum and average.*/
package com.corejava.demo;
import java.util.*; //imports all classes from the java.util package
public class AvgAndSum //declares a class named AvgAndSum.
{
	public static void main(String args[]) //declares the main method
	{ 
		Scanner sc=new Scanner(System.in); //creates a new Scanner object named sc to read input from the standard input stream (System.in).
		System.out.print("Enter First Number : "); //prints the message "Enter First Number : "
		int no1=sc.nextInt(); // reads an integer input from the user using the nextInt() method
		System.out.print("Enter Second Number : "); 
		int no2=sc.nextInt(); 
		System.out.print("Enter Third Number : "); 
		int no3=sc.nextInt(); 
		System.out.print("Enter Fourth Number : "); 
		int no4=sc.nextInt(); 
		System.out.print("Enter Fifth Number : "); 
		int no5=sc.nextInt(); 
		System.out.println("Sum is "+no1+" + "+no2+" + "+no3+" + "+no4+" + "+no5+" = "+(no1+no2+no3+no4+no5)); // prints the sum of the five numbers entered by the user
		System.out.println("Average is "+(no1+no2+no3+no4+no5)/5); // prints the average of the five numbers entered by the user
	} 
}
/*OUTPUT:
Enter First Number : 10
Enter Second Number : 20
Enter Third Number : 30
Enter Fourth Number : 40
Enter Fifth Number : 50
Sum is 10 + 20 + 30 + 40 + 50 = 150
Average is 30
*/