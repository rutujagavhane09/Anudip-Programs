package com.corejava.demo;
import java.util.*;
public class Exercise 
{
	Scanner sc = new Scanner(System.in);
	
	void case1()
	{		
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
	
	void case2()
	{
		System.out.println("--- VOWELS ---");
		System.out.println("1. A");
		System.out.println("2. E");
		System.out.println("3. I");
		System.out.println("4. O");
		System.out.println("5. U");
			
		System.out.print("Choose Your Vowel : ");
		int choice=sc.nextInt();
			
		switch(choice)
		{
				case 1:
					System.out.println("\n\tYou Choose 'A'");
					break;
				case 2:
					System.out.println("\n\tYou Choose 'E'");
					break;
				case 3:
					System.out.println("\n\tYou Choose 'I'");
					break;
				case 4:
					System.out.println("\n\tYou Choose 'O'");
					break;
				case 5:
					System.out.println("\n\tYou Choose 'U'");
					break;
				default:
					System.out.println("\n\tInvalild Choice");
		}
	}
	
	void case3()
	{
		System.out.print("Enter Number : ");
		int no=sc.nextInt();
		if(no>0)
		{
			System.out.print(no+" is Positive");
		}
		else
		{
			System.out.print(no+" is Nigative");
		}
	}
	
	void case4()
	{
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
	
	void case5()
	{
		for(int i=1;i<11;i++)
		{
			System.out.print(i+"  ");
		}
	}
	
	void case6()
	{
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
	
	void case7()
	{
		System.out.print("Enter Number : ");
		int no=sc.nextInt();
		int a=1;
		while(a!=no+1)
		{
			System.out.print(a*a*a+"  ");
			a++;
		}
	}
	
	void case8()
	{
		int arr[]= {10,24,34,44,50};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of array is "+sum);
	}
	
	void case9()
	{
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Average of array is "+sum/arr.length);
	}
	
	public static void main(String args[])
	{
		Exercise obj= new Exercise();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n--- Welcome To Anudip Excersice Hub ---\n");
		System.out.println("1. Switch Case Monday to Saturday Program");
		System.out.println("2. Print Vowels using Switch Case");
		System.out.println("3. Positive or Nigative");
		System.out.println("4. Greatest Number among Three");
		System.out.println("5. Display the first 10 natural numbers");
		System.out.println("6. Sum and Average of 5 Numbers");
		System.out.println("7. Cube of up to a number");
		System.out.println("8. Sum values of an array");
		System.out.println("9. Calculate the average value of array elements.");
		System.out.print("Enter Your Choice : ");
		int choice=sc.nextInt();
		System.out.println();
		switch(choice)
		{
			case 1:
				System.out.println("Q. Switch Case Monday to Saturday Program");
				obj.case1();
				break;
			case 2:
				System.out.println("Q. Print Vowels using Switch Case");
				obj.case2();
				break;
			case 3:
				System.out.println("Q. Positive or Nigative");
				obj.case3();
				break;
			case 4:
				System.out.println("Q. Greatest Number among Three");
				obj.case4();
				break;
			case 5:
				System.out.println("Q. Display the first 10 natural numbers");
				obj.case5();
				break;
			case 6:
				System.out.println("Q. Sum and Average of 5 Numbers");
				obj.case6();
				break;
			case 7:
				System.out.println("Q. Cube of up to a number");
				obj.case7();
				break;
			case 8:
				System.out.println("Q. Write a java program to sum values of an array.");
				obj.case8();
				break;
			case 9:
				System.out.println("Q. Write a program to calculate the average value of array elements.");
				obj.case9();
				break;
			default:
				System.out.println("Invalild Choice");
		}
	}
}
//Q. Write a java program to sum values of an array.
//Q. Write a program to calculate the average value of array elements.

