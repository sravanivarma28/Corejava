package com.arrays;
	public class ArrayExample {
		public static void main(String[] args) {
			int teacher[]= {4,6,8};
			System.out.println(teacher[0]);
			System.out.println(teacher[1]);
			System.out.println(teacher[2]);
			
			System.out.println("arr with for loop");

			for(int a=0;a<=teacher.length-1; a++) {
				System.out.println(teacher[a]);
	       }
			System.out.println("arr with for each");
			for( int teachername:teacher) {
			
			System.out.print(teachername);
		}	}}

