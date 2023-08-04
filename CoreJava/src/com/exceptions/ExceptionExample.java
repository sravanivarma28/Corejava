package com.exceptions;

public class ExceptionExample {
public static void main(String[] args) {
	ExceptionExample e=null;
   
	System.out.println("one ");
	System.out.println("two ");
	System.out.println("three");
	try {
		e.one();
	   }
		catch(Exception ne) {
			System.out.println("catch block");
		}
		System.out.println("program stop");
}
   String one() {
	   return "exception examples";
	   
   }}
