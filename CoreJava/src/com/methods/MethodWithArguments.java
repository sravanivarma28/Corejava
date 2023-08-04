package com.methods;

	public class MethodWithArguments {
		public static void main(String[] args) {
			
			MethodWithArguments.oneexample(7,8);
			 int sum= MethodWithArguments.add(7,8);
			 System.out.println(sum);
			 System.out.println( MethodWithArguments.add(7,8));
		}
	static void oneexample(int one,int two) {
		System.out.println("sum="+(one+two));
	}
	static int add(int a,int b) {
		return a+b;
	}}

