package com.starpatterns;

public class CrossStar {
	public static void main(String[] args) {
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=a;b++) {
				if(a==b)
				System.out.print("* ");
		
			else
				System.out.print("  ");
		}
		System.out.println();
	}

}}
