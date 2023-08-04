package com.scannerassignments;

import java.util.Scanner;

public class DivideNumbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("divided by 3");
	for(int a=1;a<100;a++) {
		if(a%3==0) ;
			System.out.print(a+",");
	}
		System.out.println("\n\ndivided by 5");
		for(int a=1;a<100;a++) {
			if(a%5==0) ;
				System.out.print(a+",");
     }
		System.out.println("\n\ndivided by 3 & 5");
		for(int a=1;a<100;a++) 
			if(a%3==0 && a%5==0) 
				System.out.print(a+",");
		}
              // System.out.println("\n");
}
