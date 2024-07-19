//Question: Write a Java program to iterate through all elements in a hash list.

package Lab.com;

import java.util.*;

// Main class to demonstrate iterating through a HashMap
public class EterateElementApp
{
    public static void main(String[] args) 
    {
        // Create a HashMap to store Integer keys and String values
        Map<Integer, String> hashList = new HashMap<>();
        
        // Create a Scanner object to read input from the user
        Scanner xyz = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = xyz.nextInt(); // Read the number of elements
        
        // Prompt the user to enter the key-value pairs
        System.out.println("Enter the key-value pairs:");
        for (int i = 0; i < n; i++) 
        {
            int key = xyz.nextInt(); // Read the key
            String value = xyz.next(); // Read the value
            hashList.put(key, value); // Add the key-value pair to the HashMap
        }
        
        // Print a message indicating the start of iteration through the HashMap
        System.out.println("Iterating through all elements in the hash list:");
        
        // Iterate through all entries in the HashMap
        for (Map.Entry<Integer, String> entry : hashList.entrySet())
        {
            int key = entry.getKey(); // Get the key from the current entry
            String value = entry.getValue(); // Get the value from the current entry
            // Print the key and value
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
/*
OUTPUT:
Enter the number of elements: 3
Enter the key-value pairs:
1 Apple
2 Banana
3 Cherry
Iterating through all elements in the hash list:
Key: 1, Value: Apple
Key: 2, Value: Banana
Key: 3, Value: Cherry
*/