package com.starpatterns;

public class FirstAndFourCol{
	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for (int col=1;col<=4;col++) {
					if(col==1||col==4) 
						//if(row==1||row==3) {
						System.out.print("* ");	
					else 
				//System.out.print("");
					System.out.print(" ");
					}
			System.out.println();
		}}}
