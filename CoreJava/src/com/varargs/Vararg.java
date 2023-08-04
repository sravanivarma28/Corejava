package com.varargs;

public class Vararg {
	public static void main(String[] args) {
	
		like(8,6,4);
		like(5,6,8,9);
	}
	static void like(int...m) {

		for(int c:m)
			System.out.println(c);
	}
}