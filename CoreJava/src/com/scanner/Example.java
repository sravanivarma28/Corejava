package com.scanner;

import java.util.Scanner;
//FLOATING NUMBERS SAME R DIFFERENT

public class Example{
	
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("floating number 1");
	double a=s.nextDouble();
	
	System.out.println("floating number 2");
	double b=s.nextDouble();
	
	if(a==b) {
		System.out.println("they are same up to three decimal places");

	}else {
		System.out.println("they are different");
	}
	
}
}
