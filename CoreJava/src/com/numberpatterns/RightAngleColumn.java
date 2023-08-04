package com.numberpatterns;

public class RightAngleColumn {
	
	public static void main(String[] args) {
		for(int a=1;a<=4;a++) {
		for(int b=1;b<=a;b++) {
			if(a==3&&b==2) 
				System.out.print(" ");
			else 
			//System.out.print(b+" ");
			System.out.print(a+" ");
		}
		System.out.println();
	}


}}
