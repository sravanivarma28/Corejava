package com.arrays;

	public class HighestValue {
		public static void main(String[] args) {
			int values[]= {10,20,30,40,90,10,50,60,10};
			int a=0;
			for(int b=0;b<values.length; b++) {
			
				if(values[b]>a){
				a=values[b];
				}
				}
			System.out.println(a);
		}	
}
