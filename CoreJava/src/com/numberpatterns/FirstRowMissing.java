package com.numberpatterns;

public class FirstRowMissing {
	public static void main(String[] args) {
		
	
   for (int row=1;row<=3;row++) {
	for(int col=1;col<=3;col++) {
		if(row==1&&col==1) {
			System.out.print(" ");
		}else {
			System.out.print(row);
		}
	}
	System.out.println();
}
}}
