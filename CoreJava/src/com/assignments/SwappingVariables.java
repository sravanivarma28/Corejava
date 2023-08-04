package com.assignments;

public class SwappingVariables {
	public static void main(String[] args) {
		int a=15;
		int b=27;

		System.out.println("before swapping a,b = "+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("after swapping a,b = "+a+","+b);
	}
}
