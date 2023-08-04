package com.scanner;
import java.util.Scanner;

public class TableMultiply {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter table number ");
	int b=s.nextInt();
	for(int a=1;a<10;a++) {
		System.out.println(b+"X"+a+"="+a*b);
	}
	
}
}
