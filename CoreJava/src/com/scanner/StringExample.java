package com.scanner;

import java.util.Scanner;

public class StringExample {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter name");
	String a=s.next();
	String b="";
	for(int c=0;c<a.length();c++) {
		b=a.charAt(c)+b;
	
		System.out.println(b);
	
	}
}
}
