package com.arraypractice;

public class SecondHighest {
	public static void main(String[] args) {
		
	int values[]= {10,20,30,40,90,10,50,60,10};
	int a=values.length-1;
	while(values[a]==values[values.length-1]) {
	a--;
		}
	System.out.println("second highest value = "+values[a]);
}}
