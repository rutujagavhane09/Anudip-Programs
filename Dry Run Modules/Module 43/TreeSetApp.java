//Question: Write a Java program to find numbers less than 7 in a tree set.

package Lab.com;

import java.util.*;

// Main class to demonstrate TreeSet operations
public class TreeSetApp 
{
    public static void main(String[] args)
    {
        // Create a TreeSet to store Integer values
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // Create a Scanner object to read input from the user
        Scanner xyz = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = xyz.nextInt(); // Read the number of elements
        
        // Prompt the user to enter the elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            int num = xyz.nextInt(); // Read each element
            treeSet.add(num); // Add each element to the TreeSet
        }
        
        // Create a new TreeSet to store elements less than 7
        TreeSet<Integer> result = new TreeSet<>();
        for (Integer num : treeSet) 
        {
            if (num < 7) 
            {
                result.add(num); // Add elements less than 7 to the result set
            }
        }
        
        // Print the numbers in the TreeSet that are less than 7
        System.out.println("Numbers less than 7 in the TreeSet: " + result);
    }
}
/*
OUTPUT:
Enter the number of elements: 5
Enter the elements:
3
8
5
10
1
Numbers less than 7 in the TreeSet: [1, 3, 5]
*/