package com.demo;

import java.util.*;  
public class HashMapEx
{  
	public static void main(String args[])
	{  
		HashMap<Integer,String> map=new HashMap();//Creating HashMap    
		map.put(1,"Mango");  //Put elements in Map  
		map.put(2,"Apple");    
		map.put(3,"Banana");   
		map.put(4,"Grapes");   
       
		System.out.println("Iterating Hashmap...");  
		for(Map.Entry m : map.entrySet())
		{    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  
		
		System.out.println(map.isEmpty());
		
//		map.clear();
//		System.out.println("Map:"+map); 
		
		Object k = map.clone();
		System.out.println(k);
		
		map.remove(3);
		System.out.println(map);
		
	}  
}  