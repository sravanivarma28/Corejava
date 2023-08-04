package com.arrays;

	public class TwoDimensional {
		public static void main(String[] args) {
			short sravani[][]= {{3,5},{5,6,5},{7,7}};
			System.out.println(sravani[0][1]);
			System.out.println(sravani[2][1]);
			System.out.println(sravani[1][1]);
			System.out.println("foreach loop");

		for(short values[]:sravani) {
			for(short chinna:values) {
				System.out.println(chinna);
		}}}}
