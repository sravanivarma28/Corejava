package com.scannerassignments;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter a number");

	int a=s.nextInt();
	if(a%2==0) {
	System.out.println(1);
	}else {
		System.out.println(0);
	}	
}
}
