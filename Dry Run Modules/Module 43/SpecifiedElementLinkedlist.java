//Question: Write a Java program to get the first and last occurrence of the specified elements in a linked list.

package Lab.com;

import java.util.*;

public class SpecifiedElementLinkedlist 
{
    public static void main(String[] args)
    {
        // Create a LinkedList to store Integer elements
        LinkedList<Integer> linkedList = new LinkedList<>();
        
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
            linkedList.add(num); // Add the element to the LinkedList
        }
        
        // Prompt the user to enter the element to search for
        System.out.print("Enter the element to search for: ");
        int elementToFind = xyz.nextInt(); // Read the element to search for
        
        // Find the first occurrence of the specified element
        int firstIndex = linkedList.indexOf(elementToFind);
        
        // Find the last occurrence of the specified element
        int lastIndex = linkedList.lastIndexOf(elementToFind);
        
        // Check if the element is found in the LinkedList
        if (firstIndex != -1) 
        {
            // If found, print the index of the first occurrence
            System.out.println("First occurrence of " + elementToFind + " at index: " + firstIndex);
        }
        else 
        {
            // If not found, print a message indicating that the element is not found
            System.out.println("Element " + elementToFind + " not found in the LinkedList.");
        }
        
        // Check if the element is found in the LinkedList
        if (lastIndex != -1) 
        {
            // If found, print the index of the last occurrence
            System.out.println("Last occurrence of " + elementToFind + " at index: " + lastIndex);
        }
        else 
        {
            // If not found, print a message indicating that the element is not found
            System.out.println("Element " + elementToFind + " not found in the LinkedList.");
        }
    }
}
/*
OUTPUT:
Enter the number of elements: 5
Enter the elements:
3
5
7
3
9
Enter the element to search for: 3
First occurrence of 3 at index: 0
Last occurrence of 3 at index: 3
*/