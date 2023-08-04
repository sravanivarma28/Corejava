package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList a= new ArrayList();
	
	a.add("red");
	a.add("blue");
	a.add("black");
	a.add("yellow");
	System.out.println("add some colours to string = "+a);
	System.out.println();
	
	//TO ONSERT AN ELEMENT 
	
	a.add(0,"pink");
	System.out.println("insert an element="+a);
	System.out.println();
	
	//UPDATE SPECIFIC VALUE
	
	a.set(1, "purple");
	System.out.println("update specific value ="+a);
	System.out.println();
	
	//SORT AN ELEMENTS IN ARRAYLIST ASSENDING ORDER
	
	Collections.sort(a);
	System.out.println("sorting order ="+a);
	System.out.println();
	
	//ARRAYLIST REVERSE
	
	System.out.println("before reverse ="+a);
	System.out.println();
	Collections.reverse(a);
	System.out.println("after reverse = "+a);
	System.out.println();
	
	//SHUFFLE ELEMENTS
	
	System.out.println("before shuffle = "+a);
	System.out.println();
	Collections.shuffle(a);
	System.out.println("after shuffle = "+a);
	System.out.println();
	
	//COPY ONE LIST TO ANOTHER LIST
	
	ArrayList al= new ArrayList();
	al.add(13);
	al.add(2);
	al.add(3);
	al.add(4);
	
		Collections.copy(a,al);
		System.out.println("After copy");
		System.out.println();
		System.out.println("a :"+a);
		System.out.println();
		System.out.println("al :"+al);
          }}
