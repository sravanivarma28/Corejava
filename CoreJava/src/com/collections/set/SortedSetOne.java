package com.collections.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOne {
	
	public static void main(String[] args) {
		SortedSet  s = new TreeSet();
		
		s.add(48);
		s.add(33);
		s.add(66);
		s.add(6);
	
		System.out.println(s);
		System.out.println("first element ="+s.first());  //retuens first element
		
		System.out.println("last element ="+s.last());  //retuens last element
		
		System.out.println("< than that value ="+s.headSet(22));   //retuens list of elements which are < this value
		
		System.out.println("> or = to that value ="+s.tailSet(15));   //retuens list of elements which are >= this value
		
		System.out.println("elemants b/w that value="+s.subSet(30, 40));  //retuens list of elements in b/w this value
		
		System.out.println("sorting order="+s.comparator());  //retuens null because of natural sorting order
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			System.out.println(i.hasNext());
		}}}
