package com.starpatterns;

public class HollowDecreasing {
	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for (int col=4;col>=row;col--) {
				if(row==2&&col==3) {
					System.out.print("  ");	
				}else {
			System.out.print(" *");
				}}
			System.out.println();
		}}}

