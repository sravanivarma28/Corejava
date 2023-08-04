package com.collections.set;

import java.util.HashSet;
import java.util.Spliterator;

public class HashsetExample {
	public static void main(String[] args) {
		
		HashSet h= new HashSet();
		h.add("hlo");
		h.add(7);
		h.add("like");
		h.add(77);
		h.add(null);
		
		System.out.println(h);
		System.out.println("size="+h.size());
		System.out.println("clone="+h.clone());
		
			
			 Spliterator s=h.spliterator();
	          s.forEachRemaining(System.out::println);        
	}
	}