package com.arrays;

	public class Alphabet {
		public static void main(String[] args) {
		char name[]	= {'p','u','p','p','y'};
		
		for(int row=name.length;row>=0;row--) {
			for (int col=0;col<row;col++){
				
			//if(row==1&&col==1) {
			System.out.print(" ");
	//} else
		System.out.print( name [col]+" ");
		}
	System.out.println();
	}}}

