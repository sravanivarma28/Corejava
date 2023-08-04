package com.alphabetpatterns;

public class CharSameColumns {
	public static void main(String[] args) {
		char c='A';
		for(int a=1;a<=5;a++) {
			c='A';
			for(int b=1;b<=a;b++) {
				System.out.print(c+" ");
			c++;
		}
		System.out.println();
	}}}
