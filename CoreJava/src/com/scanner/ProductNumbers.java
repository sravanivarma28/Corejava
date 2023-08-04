package com.scanner;

import java.util.Scanner;

public class ProductNumbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter first number");
	int a=s.nextInt();
	System.out.println("enter second number");
	int b=s.nextInt();
	System.out.println(a+"X"+b+"="+a*b);
}
}
