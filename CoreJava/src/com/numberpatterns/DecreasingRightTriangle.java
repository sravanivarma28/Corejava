package com.numberpatterns;

public class DecreasingRightTriangle {
public static void main(String[] args) {
	for(int a=1;a<=4;a++) {
		for(int b=4;b>=a;b--) {
			//System.out.print(b);
			System.out.print(a);
		}
		System.out.println();
	}
}
}
