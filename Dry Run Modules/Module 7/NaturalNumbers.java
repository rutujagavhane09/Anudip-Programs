/*Question: Write a Java program to display the first 10 natural numbers.*/
package com.corejava.demo;

public class NaturalNumbers //declares a class named NaturalNumbers.
{
	public static void main(String args[]) //declares the main method
	{ 
		for(int i=1;i<11;i++) //starts a for loop. It initializes a variable i to 1, sets the loop condition as i<11, and increments i by 1 after each iteration.
		{ 
			System.out.println(i); //It prints the current value of i in each iteration of the loop.
		} 
	} 
}
/*OUTPUT:
1
2
3
4
5
6
7
8
9
10
*/