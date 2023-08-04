package com.collections;

import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	Stack s=new Stack();
	
	s.push("yellow");
	s.push("black");
	s.push("green");
	s.push("white");
	s.push("black");
	
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s.peek());
	System.out.println(s.search("green"));
}
}
