package com.scannerassignments;

import java.util.Scanner;

public class EvenNumbersSum {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter starting numebe");
		int startingNumber= scanner.nextInt();
		
		System.out.println("Enter ending numebe");
		int endingNumber= scanner.nextInt();
		int number=startingNumber;
		int sum=0;
		while(number<=endingNumber) {
			if(number%2==0)
		          sum+=number;
			number++;
		}
		System.out.println("sum of the even numbers is = "+sum);
		
	}

}
