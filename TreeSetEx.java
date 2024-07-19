package com.demo;
import java.util.TreeSet;
import java.util.*;  
class TreeSetEx
{  
	public static void main(String args[])
	{  
		//Creating and adding elements  
		TreeSet<String> al=new TreeSet();  
		TreeSet<String> ae=new TreeSet(); 
		ae.add("Raj");
		ae.add("Rohit");
		ae.add("DJ");
		al.add("Ravi");  // add() method
		al.add("Vijay");  
		al.add("Ravi");  // We can add duplicate BUT not print in output
		al.add("Shani");  
		//al.add(null); // We cannot add Null value
		
		System.out.println("Elements of the TreeSet:");
        for (String element : al) 
        {
            System.out.println(element);
        }
		System.out.println(al);  
		
		Object obj=al.clone();	// clone() Method
		System.out.println(obj);
		
		//al.clear(); 	// clear() Method
		//System.out.println(al);
		
		
		System.out.println(al.contains("Ravi"));	//contains() method
		System.out.println(al.size());
		System.out.println(al.first());
		System.out.println(ae.last());
		System.out.println(al.higher("Shani"));	//returns the closest greatest element
		System.out.println(al.lower("Vijay")); 	//returns the closest least element
		
		System.out.println(ae);
		ae.pollFirst();		//retrieve and remove the lowest(first) element.
		System.out.println(ae);
		ae.pollLast();		//retrieve and remove the highest(last) element.
		System.out.println(ae);
		ae.clear(); 		// clear() Method
		System.out.println(ae);
		
	}  
}  
 