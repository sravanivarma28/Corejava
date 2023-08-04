package com.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigablesetExample {

	public static void main(String[] args) {
		NavigableSet n=new TreeSet();
		for(int i=6;i<=16;i++) {
	
		n.add(i);
		}
		System.out.println(n);
		System.out.println("lower ="+n.lower(8));   //lower method
		
		System.out.println("< or =to ="+ n.floor(15));   //<= value
		
		System.out.println("> or = to ="+n.ceiling(18));   //>= value
		
		System.out.println("higher="+n.higher(20));
		
		System.out.println("poll first value ="+n.pollFirst());
		System.out.println("poll last value="+n.pollLast());
		
			 
		 }}
		 
        


