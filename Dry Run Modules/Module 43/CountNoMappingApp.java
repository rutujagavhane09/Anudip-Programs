//Question: Write a Java program to count the number of key-value (size) mappings in a map.

package Lab.com;

import java.util.*;

// Main class to count the number of key-value mappings in a map
public class CountNoMappingApp 
{
    public static void main(String[] args)
    {
        // Create a HashMap to store string keys and integer values
        Map<String, Integer> map = new HashMap<>();
        
        // Put key-value pairs into the map
        map.put("raviraj", 45);
        map.put("vijay", 2);
        map.put("rohit", 9);
        map.put("ram", 8);
        map.put("meher", 12);
        
        // Get the size of the map (number of key-value mappings)
        int size = map.size();
        
        // Print the number of key-value mappings in the map
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}

/*
OUTPUT:
Number of key-value mappings in the map: 5
*/