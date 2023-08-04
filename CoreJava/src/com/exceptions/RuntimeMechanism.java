package com.exceptions;

public class RuntimeMechanism{
	
public static void main(String[] args) {
	one();
	System.out.println("program execution start");
	int a=9;
	int b=0;
	int result=0;
	try {
		result=a/b;
		}
		catch(ArithmeticException ae) {
			
//THIS METHOD PRINTSEXCEPTION INFORMATION NAME , DESCRIPTION
			//System.out.println(ae.toString());
			
	//THIS METHOD PRINTS ONLY DESCRIPTION
		//	System.out.println(ae.getMessage());
			
//THIS METHOD PRINTS ALL INFORMATION NAME , DESCRIPTION , STACK TRACE
	//NOT ERROR IT IS A PRINTING STATEMENT
              ae.printStackTrace();
              }

	System.out.println("output is ="+result);
	System.out.println("program execution stop");
	}

public static void one() {
	System.out.println("hello");
}}
