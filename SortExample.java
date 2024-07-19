package com.demo;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample 
{
	public static void main(String args[])
	{
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(12);
		marks.add(44);
		marks.add(0);
		marks.add(1);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);
	}
}
