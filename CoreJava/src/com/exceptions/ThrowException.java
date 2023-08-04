package com.exceptions;

public class ThrowException {
	
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
		throw ae;
		}    
    System.out.println("output is ="+result);
   System.out.println("program execution stop");
}
 public static void one() {
    System.out.println("hello");
     }}
