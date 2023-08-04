package com.assignments;

public class QuestionThree {
	public static void main(String[] args) {
		int x = 5;
		int y = 2;
		int z = x++ + ++y*3-x--%2;
		System.out.println("z= "+z);
		System.out.println();
		
		System.out.println("another question");
		int a=6;
		int b=5;
		boolean result = a>b && b++<a--;
		System.out.printf("%b,%d,%d",result,a,b);
	}}