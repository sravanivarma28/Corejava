package com.scannerassignments;

import java.util.Scanner;

public class AllEqual {
public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	System.out.println("first number");
	int a=s.nextInt();
	System.out.println("second number");
	int b=s.nextInt();
	System.out.println("third number");
	int c=s.nextInt();

if(a==b&&b==c) {
	System.out.println("All numbers are equal");
}else if(a==b||b==c||c==a) {
	System.out.println("Neither all are equal or different");
}else {
	System.out.println("All numbers are different");

}
}
}
