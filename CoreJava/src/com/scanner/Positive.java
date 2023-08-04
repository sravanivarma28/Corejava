package com.scanner;

	import java.util.Scanner;

	public class Positive {
		public static void main(String args[]) {

			Scanner pv =new Scanner(System.in);
			System.out.println("number");
			int a=pv.nextInt();
			if (a>0) {
				System.out.println("positive");
			}else if(a<0) {
				System.out.println("negative");
			}else {
				System.out.println("positive or negative");
				
			}
		}}