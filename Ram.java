package com.demo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ram 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ram=0,count=0;
		while(ram!=5001)
		{
			ram++;
			count++;
			System.out.println("\t\t"+count+"  Ram");
			String Name = br.readLine();
		}
		System.out.println("\n\t\tJay Shree Ram\n\t\tEND");
	}
}

