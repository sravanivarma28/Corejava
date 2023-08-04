  package com.varargs;

	public class varargmethods {

		public static void main(String[] args) {
		names(5,6,7);
		names(33,8);
		names(7,8,9,10);
		names(30,40,60);
		}
		
		static void names(int c,int v,int... m) {
			System.out.println("writing"+c);
			System.out.println("two"+v);
			
			for(int a:m)
				System.out.println(a);
		}


}
