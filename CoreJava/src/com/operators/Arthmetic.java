package com.operators;

public class Arthmetic {
	public static void main(String[] args) {
		
		//STATIC METHOD
		
		int a=2;
		int b=5;
		add(a,b);
		sub(a,b);
		multiply(a,b);
		division(a,b);
		module(a,b);
		
	}
	static void add(int a,int b) {
    System.out.println("add = "+(a+b));
}
	static void sub(int a,int b) {
		 System.out.println("sub = "+(a-b));
		}
	static void multiply(int a,int b) {
		 System.out.println("multiply ="+(a*b));
		
	}
	static void division(int a,int b) {
		 System.out.println("division = "+(a/b));
		}
	static void module(int a,int b) {
		 System.out.println("module = "+(a%b));
		}
	}
