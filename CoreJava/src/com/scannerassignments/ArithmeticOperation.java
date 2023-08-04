package com.scannerassignments;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter 2nd number");
		int number2 = scanner.nextInt();
		
		System.out.println("Enter target operation");
		String operation = scanner.next();
		int result=0;
		
		switch(operation) {
		case "+":
			result =number1+number2;  
			break;
			
		case "-":
			result =number1+number2;  
			break;
			
		case "*":
			result =number1+number2;  
			break;
			
		case "%":
			result =number1+number2;  
			break;
			
		case "/":
			result =number1+number2;  
			break;
		default :
			System.out.println("Invalid operation");
			break;
		}
		System.out.println(result);
		
              }}