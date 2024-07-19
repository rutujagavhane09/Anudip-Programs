package com.demo;

public class CreateStringFromCharArray 
{
    public static void main(String[] args) 
    {
        char[] charArray = {'R', 'a', 'v', 'i', 'r', 'a', 'j'};
        
        String str = new String(charArray);
        
        System.out.println("Created String: " + str);
    }
}

