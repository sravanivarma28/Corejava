package com.scanner;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter name");
	String a=s.next();
	
	String b=" ";
	for(int i=0;i<a.length();i++) {
	b =	a.charAt(i)+b;
	}
		System.out.println(b);
	}
	
	
}

