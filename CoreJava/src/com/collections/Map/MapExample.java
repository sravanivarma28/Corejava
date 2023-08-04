package com.collections.Map;
import java.util.SortedMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class MapExample {
	public static void main(String[] args) {
		SortedMap m= new TreeMap();
		m.put(3456,"sravani");
		m.put(6789,"vinay");
		m.put(456,"raji");
		m.put(213,"yatiksha");
		m.put(6798,"kavaitha");
		
		System.out.println(m);
		System.out.println();
		
		//convert map to set to get individual values
		
		Set s= m.entrySet();
		Iterator i= s.iterator();
		  int count=0;
		while(i.hasNext()) {
			count++;
			SortedMap.Entry values=(SortedMap.Entry)i.next();
			System.out.println(count+" . "+values.getKey()+ " , " +values.getValue());
			
		}}}
