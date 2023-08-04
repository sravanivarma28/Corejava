package com.numberpatterns;

public class DifferentPattern {
	public static void main(String[] args) {
		
		for(int a=1;a<=16;a+=5) {
			
		for(int b=1;b<=a;b+=5) {
			if(b==1) {
			
			System.out.print(b+" ");
		}else {
		System.out.print(b-1+" ");
		}}
		System.out.println();
	}}}