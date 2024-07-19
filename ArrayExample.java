package com.corejava.demo;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
			 
	       int[] b = new int[a.length];             //Declaring and instantiating another array of ints with same length
	 
	       for (int i = 0; i < a.length; i++)
	       {
	           //b[i] = a[i];
	           System.out.println(b[i]);
	       }
	}
}
