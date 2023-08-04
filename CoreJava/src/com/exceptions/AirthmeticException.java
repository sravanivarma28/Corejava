package com.exceptions;

//EXCEPTIONS

public class AirthmeticException {
	public static void main(String[] args) {
		one();
		System.out.println("first method");
		}
	public static void one() {
		two();
		try {
			System.out.println("program start");
			System.out.println("statement 1 ");
			System.out.println(100/0);
			System.out.println("statement 2 ");
			System.out.println("statement 3");
			}
			catch(ArithmeticException ae) {
				System.out.println("catch handling exceptions");
			}}
	public static void two() {
		System.out.println("program end");
		
	}

}
