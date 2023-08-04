package com.scannerassignments;

import java.util.Scanner;

public class NumbersFor {
	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter starting numeber");
		int startingNumber= scanner.nextInt();
		
		System.out.println("Enter ending numeber");
		int endingNumber= scanner.nextInt();
		for(int i=startingNumber;i<=endingNumber;i++)
			//if(i%2==0)
			//if(i%7==0)
			System.out.print(i+",");

	}

}
