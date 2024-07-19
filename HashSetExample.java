package com.demo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.*; 

class HashSetExample 
{ 
    public static void main(String[] args) 
    { 
    	//Map m = new HashMap();
    	HashSet set = new HashSet();
    	set.add("Raviraj");
    	
    	HashMap<Integer, String> m=new HashMap();
    	m.put(2,"Raviraj");
    	m.put(10,"Yogeshwar");
    	m.put(4,"Khushwant");
    	m.put(6,"Dhanajay");
    	System.out.println(m.isEmpty());
    	m.remove("Raviraj");
    	m.get(6);
    	m.containsKey(10);
    	System.out.println(37%20);
    	
//    	Map n = new LinkedHashMap();
//    	Map o = new TreeMap();
    	
    }
}

//clear()
//Removes all of the mappings from this map.
//
//clone()
//Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
//
//get(Object key)
//Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
//
//isEmpty()
//Returns true if this map contains no key-value mappings.
//
//keySet()
//Returns a Set view of the keys contained in this map.
//
//put(K key, V value)
//Associates the specified value with the specified key in this map.
//
//remove(Object key)
//Removes the mapping for the specified key from this map if present.
//
//replace(K key, V value)
//Replaces the entry for the specified key only if it is currently mapped to some value.
//
//size()
//Returns the number of key-value mappings in this map.
//
//values()
//Returns a Collection view of the values contained in this map.