package com.iterativestatements;

public class DivisionalNumbers {
	public static void main(String[] args) {
		System.out.println("divisible by 3");
		for(int a=0;a<=100;a++) {
			if (a%3==0) 
			System.out.print(a+", ");
		}
		
			
			System.out.println("\ndivisible by 5");
			for(int a=0;a<=100;a++) {
				if (a%5==0) 
				System.out.print(a+", ");
			}
				
				System.out.println("\ndivisible by 3 & 5");
				for(int a=0;a<=100;a++) {
					if (a%3==0 && a%5==0) 
					System.out.print(a+", ");
				}
			}}
