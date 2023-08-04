package com.scannerassignments;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter a number");
		
		int number = scanner.nextInt();
		int remainder=number%2;
		switch(remainder) {
		
		case 0:
		   System.out.println(" if the number is even");
		   break;
		case 1:
		   System.out.println("if the number is odd");
		   break;
	   }}

}
