package com.javaeightfeatures;

public class InterfaceExample {
	public static void main(String[] args) {
				
		Examples e= (n)->n*n*n;
		System.out.println(e.cubeValue(5));
	}}

	interface Examples{
		int cubeValue(int a);
		}


