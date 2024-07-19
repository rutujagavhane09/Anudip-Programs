package com.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExcp 
{
    public static void main(String[] args) 
    {
        String filename = "example.txt";
        try 
        {
            readFile(filename);
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    public static void readFile(String filename) throws FileNotFoundException, IOException 
    {
        BufferedReader reader = null;
        try 
        {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        }
        finally 
        {
            if (reader != null) 
            {
                try
                {
                    reader.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }
    }
}
