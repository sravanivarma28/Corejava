package com.methods;

public class MethodExample {
	
	public static void main(String[] args) {
		one(2,4);
		int sum = MethodExample.addition(7,8);
		System.out.println("sum");
		System.out.println(MethodExample.addition(7,8));
		}
	
	//STATIC METHOD
	
	static void one(int a,int b) {
		System.out.println("sum ="+(a+b));
		
	}
	static int addition(int c,int d) {
		return c+d;
		
	}

}
