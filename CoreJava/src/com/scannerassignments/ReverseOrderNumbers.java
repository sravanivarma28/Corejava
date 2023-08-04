package com.scannerassignments;

import java.util.Scanner;

public class ReverseOrderNumbers {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter starting numebe");
		int startingNumber= scanner.nextInt();
		
		System.out.println("Enter ending numebe");
		int endingNumber= scanner.nextInt();
		
		int number=startingNumber;

		while(number>=endingNumber) {
			if(number%2==1)
		System.out.print(number+",");
		number--;
	}}

}
