package com.conditionalstatements;

	public class IfElseExample {
		public static void main(String args[]) {
			int a=20;
			int b=40;
			if(b<a) {//true
			System.out.println("if the condition is true it is executed");
		}else {//false
			System.out.println("if the condition is false enter to else");
		}
		//without curly braces
		if(a<b) 
		//int two=20;not possible
		System.out.println("if block");
		else {
			int three=22;
			System.out.println("else block");
		}		
}}
