package com.starpatterns;

public class SquarePlus {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for (int col=1;col<=5;col++) {
					if(row==5/2+1||col==5/2+1) 
						System.out.print("* ");	
					else 
			System.out.print("  ");
					}
			System.out.println();
		}}}

	
	

