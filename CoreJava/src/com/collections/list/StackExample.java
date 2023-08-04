package com.collections.list;

import java.util.Comparator;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("red");
		s.push("black");
		s.push("white");
		s.push("green");
		System.out.println("contains = "+s.contains("red"));
		System.out.println("contains = "+s.contains("yellow"));
		System.out.println();
	
		System.out.println(s);
		System.out.println();

		//USING PEEK METHOD
		System.out.println("peek method::"+s.peek());
		System.out.println(s);
		System.out.println();
		
		//USING POP METHOD
		
		System.out.println("pop method::"+s.pop());
		System.out.println(s);
		System.out.println();
		
		//USING SEARCH METHOD
		System.out.println("search ::"+s.search("black"));
		System.out.println();
		
		//SEARCH INDEX OF ELEMENT
		System.out.println("index of ::"+ s.indexOf("sravani"));
		System.out.println();
	
		System.out.println("remove = "+s.removeAll(s));
		System.out.println();
		
		//IS EMPTY METHOD
		System.out.println("empty ::"+s.isEmpty());
		
		
	}

}
