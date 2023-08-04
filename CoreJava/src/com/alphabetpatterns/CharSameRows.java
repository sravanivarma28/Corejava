package com.alphabetpatterns;

public class CharSameRows {
	public static void main(String[] args) {
		char c='A';
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++)
				System.out.print(c+" ");
			System.out.println();
			c++;
		}
	}}
