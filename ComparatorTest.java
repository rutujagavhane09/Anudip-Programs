package com.demo;
import java.util.ArrayList;
import java.util.Collections;
/*Comparable and Comparator both are interfaces and can be used to sort collection elements.
 * there are many differences between Comparable and Comparator interfaces
 * Comparable provides a single sorting sequence. In other words, we can sort the 
 * collection on the basis of a single element such as id, name, and price.
 * The Comparator provides multiple sorting sequences. In other words, 
 * we can sort the collection on the basis of multiple elements such as id, name, and price etc.
 * Comparable provides compareTo() method to sort elements.
 * Comparator provides compare() method to sort elements.
 * 
 * 
 * Comparable is present in java.lang package.
 * A Comparator is present in the java.util package.
 * */

class Employeez implements Comparable<Employeez>
{
	int id;
	String name;
	int age;
	
	public Employeez(int id, String name, int age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employeez o) 
	{
		if (age == o.age)
		{
			return 0;
		}
		else if (age > o.age)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}	
}

public class ComparatorTest
{
	public static void main(String args[])
	{
		ArrayList<Employeez> obj = new ArrayList<Employeez>();
		Employeez emp1=new Employeez(1,"Rohit",33);
		Employeez emp2=new Employeez(2,"Raviraj",45);
		Employeez emp3=new Employeez(3,"Vijay",25);
		Employeez emp4=new Employeez(4,"Mohit",70);
		
		obj.add(emp1);
		obj.add(emp2);
		obj.add(emp3);
		obj.add(emp4);
		
		Collections.sort(obj);
		for(Employeez e: obj)
		{
			System.out.println(e.id+" "+e.name+" "+e.age);
		}
	}
}
