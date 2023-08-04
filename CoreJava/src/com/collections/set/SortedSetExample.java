package com.collections.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
public static void main(String[] args) {
	SortedSet students = new TreeSet();
	
	//FIRST PREFERENCE CAPITAL LETTERS IN SORTED ORDER
	//ALL SMALL LETTERS
	
	students.add(" sravani ");
	students.add(" chinna ");
	students.add("anjali ");
	try {
	students.add(66);
	}
	catch(Exception e) {
		System.out.println("homogeneous datatype will support only one datatype");
	}
	System.out.println(students);
	NavigableSet nv =new TreeSet();
	nv.add(8);
	nv.add(14);
	nv.add(30);
	nv.add(20);
	System.out.println(nv.lower(8));
	System.out.println(nv.lower(14));
	System.out.println("lessthan or equal to = "+nv.floor(60));  //> 0r = to
	System.out.println("greaterthan or equal to + "+nv.ceiling(30));  //< or = to
	System.out.println(nv.higher(40));
	System.out.println(nv.pollFirst());
     System.out.println(nv);
	System.out.println(nv.pollLast());
	System.out.println(nv);
}
}
