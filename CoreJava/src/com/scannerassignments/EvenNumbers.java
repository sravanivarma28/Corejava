package com.scannerassignments;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter starting numebe");
		int startingNumber= scanner.nextInt();
		
		System.out.println("Enter ending numebe");
		int endingNumber= scanner.nextInt();
		int number=startingNumber;
		while(number<=endingNumber) {
			//if(number%2==0)
				//divisible by 7
		     if(number%7==0)
			System.out.print(number+",");
			number++;
		}
	}
}
