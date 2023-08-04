package com.alphabetpatterns;

public class CharDiamond {
	 public static void main(String[] args) {
			
			for(int a=1;a<=5;a++) {
				char c='A';
				for(int b=1;b<=a;b++) {
					System.out.print(" ");
				}
				for(int b=a;b<=5;b++) {
			System.out.print(c+" ");
			c++;
		}
				System.out.println();
		}
		}}

