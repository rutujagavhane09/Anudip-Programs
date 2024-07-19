package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) 
	{
		System.out.println("Ram");
	}
	
}
//class Employeez implements Comparable<Employeez>
//{
//	int id;
//	String name;
//	int age;
//	
//	public Employeez(int id, String name, int age) 
//	{
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
//
//	@Override
//	public int compareTo(Employeez o) 
//	{
//		if (age == o.age)
//		{
//			return 0;
//		}
//		else if (age > o.age)
//		{
//			return 1;
//		}
//		else 
//		{
//			return -1;
//		}
//	}	
//}
//
//public class ComparatorTest
//{
//	public static void main(String args[])
//	{
//		ArrayList<Employeez> obj = new ArrayList<Employeez>();
//		Employeez emp1=new Employeez(1,"Rohit",33);
//		Employeez emp2=new Employeez(2,"Raviraj",45);
//		Employeez emp3=new Employeez(3,"Vijay",25);
//		Employeez emp4=new Employeez(4,"Mohit",70);
//		
//		obj.add(emp1);
//		obj.add(emp2);
//		obj.add(emp3);
//		obj.add(emp4);
//		
//		Collections.sort(obj);
//		for(Employeez e: obj)
//		{
//			System.out.println(e.id+" "+e.name+" "+e.age);
//		}
//	}
//}