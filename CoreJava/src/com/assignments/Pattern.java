package com.assignments;

public class Pattern {
	public static void main(String[] args) {
		
		for(int a=10;a<=20;a+=5) {
			
			for(int b=10;b<=a;b+=5) {
				if(b==15) {
				
				System.out.print(b++);
			}else {
			System.out.print(b+1+" ");
			}}
			System.out.println();
		}}}
