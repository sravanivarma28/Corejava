package com.scanner;
import java.util.Scanner;

public class GreaterNumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("enter 3 numbers");
		if(a>b&&a>c) {
			System.out.println("greater"+a);
		}else if(b>a&&b>c) {
			System.out.println("greater"+b);
		}else {
		System.out.println("greater"+c);
		

}}}
