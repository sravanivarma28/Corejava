package com.numberpatterns;

public class MiddleNumber {
public static void main(String[] args) {
	for(int row=1;row<=3;row++) {
		for(int col=1;col<=3;col++) {
			if(row==2&&col==2) {
			System.out.print(" ");
			}else {
				System.out.print(col);
				//System.out.print(row);
			}
		}
		System.out.println();
	}
}
}
