package com.exceptions;

public class FinallyBlockExample {
	public static void main(String[] args) {
	System.out.println("program execution start");
	int a=9;
	int b=0;
	int result=0;
	one();
	try {
		result=a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
        }
	finally {
	System.out.println("finally block");
	}
System.out.println("output is ="+result);
System.out.println("program execution stop");
}

public static void one() {
System.out.println("hello");

}}