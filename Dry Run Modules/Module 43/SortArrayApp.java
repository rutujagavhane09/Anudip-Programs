//Question: Write a Java program to sort a given array list.

package Lab.com;

import java.util.*;

public class SortArrayApp 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList to store Integer elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        
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
            arrayList.add(num); // Add the element to the ArrayList
        }
        
        // Print the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + arrayList);
        
        // Uncomment the following block to use the first method (Collections.sort) for sorting
        /*
        Collections.sort(arrayList); // Sort the ArrayList using Collections.sort
        System.out.println("ArrayList after sorting: " + arrayList); // Print the sorted ArrayList
        */
        
        // Second method for sorting using bubble sort
        int size = arrayList.size(); // Get the size of the ArrayList
        for (int i = 0; i < size - 1; i++) 
        {
            for (int j = 0; j < size - i - 1; j++) 
            {
                if (arrayList.get(j) > arrayList.get(j + 1)) // Compare adjacent elements
                {
                    // Swap elements if they are in the wrong order
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        
        // Print the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + arrayList);
    }
}
/*
OUTPUT:
Enter the number of elements: 5
Enter the elements:
4
2
5
1
3
ArrayList before sorting: [4, 2, 5, 1, 3]
ArrayList after sorting: [1, 2, 3, 4, 5]
*/