package com.scanner;

	import java.util.Scanner;

	public class NumberUser {
		public static void main(String args[]) {
			//create object
			Scanner Nu=new Scanner(System.in);
			System.out.println("Enter 3 numbers::");
			
			int a=Nu.nextInt();
			int b=Nu.nextInt();
            int c=Nu.nextInt();
		
			if(a>b&&a>c) {
				System.out.println("greater"+a);
			}else if(b>a&&b>c){
				System.out.println("greater"+b);
			}else {
				System.out.println("greater"+c);
			}if(a<b&&a<c) {
				System.out.println("smaller"+a);
			}else if(b<a&&b<c) {
				System.out.println("smaller"+b);
			}else {
				System.out.println("smaller"+c);
			}
}}